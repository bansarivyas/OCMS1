package util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import web.stepdef.BaseClass;

public class APICaller extends BaseClass {

	// private WebDriver driver = null;
	//
	// // WebDriver initialization
	// public APICaller(WebDriver driver) {
	// this.driver = driver;
	// }

	public String getActivityDetails(String activity_id) throws IOException {
		String body = ConstantsAPI.API_BODY1 + activity_id + ConstantsAPI.API_BODY2;
		URL url = new URL(ConstantsAPI.URL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type", ConstantsAPI.CONTENT_TYPE);
		conn.setRequestProperty("User-Agent", ConstantsAPI.USER_AGENT);
		conn.setRequestProperty("APPID", ConstantsAPI.APP_ID);
		conn.setRequestProperty("APPSIGNATURE", ConstantsAPI.APP_SIGNATURE);
		try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
			dos.writeBytes(body);
		}
		System.out.println("Response code: " + conn.getResponseCode());
		// Read Response from API
		String strResponse = "";
		try (BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
			String line;
			while ((line = bf.readLine()) != null) {
				strResponse += line;
				System.out.println(line);
				System.out.println("Response: " + strResponse);
			}
		}
		JSONObject jsonResponse;
		try {
			jsonResponse = new JSONObject(strResponse);
			System.out.println("JSON Response: " + jsonResponse);
			
			JSONObject objectData = jsonResponse.getJSONObject("apix");
			JSONObject objectSteps = objectData.getJSONObject("partner");
			String partnerName = objectSteps.getString("partnername");
			System.out.println("partnerName: " + partnerName);
			ConstantsAPI.PARTNER_NAME = partnerName;
			
			JSONObject objData = jsonResponse.getJSONObject("data");
			System.out.println("objData: " + objData);
			String strActivityUrl = objData.getString("activity_url");
			System.out.println("strActivityUrl: " + strActivityUrl);
			ConstantsAPI.ACTIVITY_URL = strActivityUrl;
			JSONObject objSteps = objData.getJSONObject("steps");
			System.out.println("objSteps: " + objSteps);
			ConstantsAPI.ACTIVITY_STEPS = objSteps;
			JSONArray arrEvaluation = objSteps.getJSONArray("evaluation");
			System.out.println("arrEvaluation: " + arrEvaluation);
//			Set<Integer> uniqueEvaluationAssessmentId = new HashSet<>();
//			Set<Integer> QuestionBankIdsEvaluation = new HashSet<>();
			Set<Integer> AnswerIdsEvaluation = new HashSet<>();
//			Set<Integer> MapQuestionIdsEvaluation = new HashSet<>();
			for (int i = 0; i < arrEvaluation.length(); i++) {
				JSONObject objEval = arrEvaluation.getJSONObject(i);
				// System.out.println("objEval:[" + i + "]" + objEval);
				// for(String keyEval : objEval.keySet()){
				// JSONObject objKeyEval = (JSONObject) objEval.get(keyEval);
				// System.out.println(keyEval + ":" + objKeyEval);
				// int assessmentId = objEval.getInt("assessment_id");
				// int questionBankId = objEval.getInt("question_bank_id");
				int mapQuestionUUId = objEval.getInt("map_question_id");
				int dataElementId = objEval.getInt("data-elementid");
	            String questionType = objEval.getString("question_type_id");

				// System.out.println("assessment_id" + assessmentId);
				// System.out.println("question_bank_id" + questionBankId);
				// if (!uniqueEvaluationAssessmentId.contains(assessmentId)) {
				// uniqueEvaluationAssessmentId.add(assessmentId);
				// }
				// QuestionBankIdsEvaluation.add(questionBankId);
				HashMap<Integer, Integer> answerOptions = new HashMap<>();
				HashMap<Integer, Integer> singleSelectAnswerOptions = new HashMap<>();
				HashMap<Integer, Integer> multiSelectAnswerOptions = new HashMap<>();
				
				JSONArray answerOptionsArray = objEval.getJSONArray("answerOptions");
				
				 if (questionType.equals("Single Select")) {
		                if (!ConstantsAPI.SINGLE_SELECT_EVAL_HASH_MAP.containsKey(dataElementId)) {
		                	ConstantsAPI.SINGLE_SELECT_EVAL_HASH_MAP.put(dataElementId, singleSelectAnswerOptions);
		                }
		                HashMap<Integer, Integer> answerOptionsIdMap = ConstantsAPI.SINGLE_SELECT_EVAL_HASH_MAP.get(dataElementId);
		                for (int j = 0; j < answerOptionsArray.length(); j++) {
		                    JSONObject answerOption = answerOptionsArray.getJSONObject(j);
		                    int answerOptionId = answerOption.getInt("id");
		                    answerOptionsIdMap.put(j, answerOptionId);
		                }
		            } else if (questionType.equals("Multiple Select")) {
		                if (!ConstantsAPI.MULTI_SELECT_EVAL_HASH_MAP.containsKey(dataElementId)) {
		                	ConstantsAPI.MULTI_SELECT_EVAL_HASH_MAP.put(dataElementId, multiSelectAnswerOptions);
		                }
		                HashMap<Integer, Integer> answerOptionsIdMap = ConstantsAPI.MULTI_SELECT_EVAL_HASH_MAP.get(dataElementId);
		                for (int j = 0; j < answerOptionsArray.length(); j++) {
		                    JSONObject answerOption = answerOptionsArray.getJSONObject(j);
		                    int answerOptionId = answerOption.getInt("id");
		                    answerOptionsIdMap.put(j, answerOptionId);
		                }
		            } else if (questionType.equals("Long Text")) {
//		                if (answerOptionsArray.length() == 0) {
		                    ConstantsAPI.LONG_TEXT_EVAL_ID.add(dataElementId);
//		                }
		            } else if (questionType.equals("Number")) {
//		                if (answerOptionsArray.length() == 0) {
		                    ConstantsAPI.NUMBER_EVAL_ID.add(dataElementId);
//		                }
		            } else if (questionType.equals("Rating Group")) {
		                JSONArray rowsArray = objEval.getJSONArray("rows");
		                
		                HashMap<Integer, Integer> innerMap = new HashMap<>();
		                for (int j = 0; j < rowsArray.length(); j++) {
		                    JSONObject row = rowsArray.getJSONObject(j);
		                    int index = row.getInt("id");
		                    innerMap.put(j, index);
		                }
		                ConstantsAPI.RATING_GROUP_EVAL_HASH_MAP.put(dataElementId, innerMap);
		            }
		        
				JSONArray arrAnsOptions = objEval.getJSONArray("answerOptions");
				for (int j = 0; j < arrAnsOptions.length(); j++) {
					JSONObject objAns = arrAnsOptions.getJSONObject(j);
					// int correctAns = objAns.getInt("correct_answer");
					int ansId = objAns.getInt("id");
					AnswerIdsEvaluation.add(ansId);
					answerOptions.put(j, ansId);
				}
				System.out.println("Evaluation Question Map ID : " + answerOptions);
				ConstantsAPI.EVAL_ANSWER_OPTIONS.putAll(answerOptions);
				HashMap<Integer, HashMap<Integer, Integer>> hash_map = new HashMap<Integer, HashMap<Integer, Integer>>();
				hash_map.put(mapQuestionUUId, answerOptions);
				System.out.println("Evaluation Question Map : Answers = " + hash_map);
				ConstantsAPI.EVAL_HASH_MAP.putAll(hash_map);
				// }
			}
			JSONArray arrInContent = objSteps.getJSONArray("content");
			System.out.println("in-content: " + arrInContent);
			for (int i = 0; i < arrInContent.length(); i++) {
				JSONObject objEval1 = arrInContent.getJSONObject(i);
				System.out.println("objEval:[" + i + "]" + objEval1);
				// int assessmentId = objEval1.getInt("assessment_id");
				// int questionBankId = objEval1.getInt("question_bank_id");
				String mapQuestionId1 = objEval1.getString("map_question_uuid");
				HashMap<Integer, Integer> answerOptions1 = new HashMap<>();
				JSONArray arrAnsOptions = objEval1.getJSONArray("answerOptions");
				for (int j = 0; j < arrAnsOptions.length(); j++) {
					JSONObject objAns = arrAnsOptions.getJSONObject(j);
					// int correctAns = objAns.getInt("correct_answer");
					int ansId = objAns.getInt("id");
					answerOptions1.put(j, ansId);
					// if (correctAns == 1) {
					// answerOptions1.put(j, ansId);
					// }
					// else {
					// answerOptions1.put(j, ansId);
					// }

					// System.out.println("correctAns:" + correctAns);
					// System.out.println("ansId:" + ansId);
				}

				// if (answerOptions1.isEmpty()) {
				// answerOptions1.put(0, arrAnsOptions.getJSONObject(0).getInt("id"));
				// }
				System.out.println("Answer IDs of In-content : " + answerOptions1);
				ConstantsAPI.INCONTENT_ANSWER_OPTIONS.putAll(answerOptions1);
				HashMap<String, HashMap<Integer, Integer>> hash_map1 = new HashMap<String, HashMap<Integer, Integer>>();
				hash_map1.put(mapQuestionId1, answerOptions1);
				System.out.println("In-content Question Map : Answers = " + hash_map1);
				ConstantsAPI.INCONTENT_MAP.putAll(hash_map1);
			}
			JSONArray arrPreTest = objSteps.getJSONArray("pretest");
			System.out.println("pretest: " + arrPreTest);
			for (int i = 0; i < arrPreTest.length(); i++) {
				JSONObject objEval1 = arrPreTest.getJSONObject(i);
				System.out.println("objEval:[" + i + "]" + objEval1);
				// int assessmentId = objEval1.getInt("assessment_id");
				// int questionBankId = objEval1.getInt("question_bank_id");
				int mapQuestionId1 = objEval1.getInt("map_question_id");
				// System.out.println("assessment_id:" + assessmentId);
				// System.out.println("question_bank_id:" + questionBankId);
				HashMap<Integer, Integer> answerOptions1 = new HashMap<>();
				JSONArray arrAnsOptions = objEval1.getJSONArray("answerOptions");
				for (int j = 0; j < arrAnsOptions.length(); j++) {
					JSONObject objAns = arrAnsOptions.getJSONObject(j);
					// int correctAns = objAns.getInt("correct_answer");
					int ansId = objAns.getInt("id");
					answerOptions1.put(j, ansId);
					// if (correctAns == 1) {
					// answerOptions1.put(j, ansId);
					// }
					// else {
					// answerOptions1.put(j, ansId);
					// }

					// System.out.println("correctAns:" + correctAns);
					// System.out.println("ansId:" + ansId);
				}

				// if (answerOptions1.isEmpty()) {
				// answerOptions1.put(0, arrAnsOptions.getJSONObject(0).getInt("id"));
				// }
				System.out.println("Answer IDs of PreTest : " + answerOptions1);
				ConstantsAPI.PRETEST_ANSWER_OPTIONS.putAll(answerOptions1);
				HashMap<Integer, HashMap<Integer, Integer>> hash_map2 = new HashMap<Integer, HashMap<Integer, Integer>>();
				hash_map2.put(mapQuestionId1, answerOptions1);
				System.out.println("PreTest Questions Map : Answers = " + hash_map2);
				ConstantsAPI.PRETEST_MAP.putAll(hash_map2);
			}
			JSONArray arrPostTest = objSteps.getJSONArray("posttest");
			System.out.println("posttest: " + arrPostTest);
			for (int i = 0; i < arrPostTest.length(); i++) {
				JSONObject objEval1 = arrPostTest.getJSONObject(i);
				System.out.println("objEval:[" + i + "]" + objEval1);
				// int assessmentId = objEval1.getInt("assessment_id");
				// int questionBankId = objEval1.getInt("question_bank_id");
				int mapQuestionId1 = objEval1.getInt("map_question_id");
				// System.out.println("assessment_id:" + assessmentId);
				// System.out.println("question_bank_id:" + questionBankId);
				HashMap<Integer, Integer> answerOptions1 = new HashMap<>();
				JSONArray arrAnsOptions = objEval1.getJSONArray("answerOptions");
				for (int j = 0; j < arrAnsOptions.length(); j++) {
					JSONObject objAns = arrAnsOptions.getJSONObject(j);
					// int correctAns = objAns.getInt("correct_answer");
					int ansId = objAns.getInt("id");
					answerOptions1.put(j, ansId);
					// if (correctAns == 1) {
					// answerOptions1.put(j, ansId);
					// }
					// else {
					// answerOptions1.put(j, ansId);
					// }
					// System.out.println("correctAns:" + correctAns);
					// System.out.println("ansId:" + ansId);
				}

				// if (answerOptions1.isEmpty()) {
				// answerOptions1.put(0, arrAnsOptions.getJSONObject(0).getInt("id"));
				// }
				System.out.println("Answer IDs of PostTest : " + answerOptions1);
				ConstantsAPI.POSTTEST_ANSWER_OPTIONS.putAll(answerOptions1);
				HashMap<Integer, HashMap<Integer, Integer>> hash_map2 = new HashMap<Integer, HashMap<Integer, Integer>>();
				hash_map2.put(mapQuestionId1, answerOptions1);
				System.out.println("PostTest Questions Map : Answers = " + hash_map2);
				ConstantsAPI.POSTTEST_MAP.putAll(hash_map2);
			}
		} catch (JSONException e) {
			System.out.println("Error " + e.toString());
		}
		return ConstantsAPI.ACTIVITY_STEPS + "#####" + ConstantsAPI.ACTIVITY_URL;
		// In case we need model in future
		/*
		 * try { Gson g = new Gson(); ActivityDetails activityDetails =
		 * g.fromJson(strResponse, ActivityDetails.class);
		 * System.out.println("ActivityDetails: " + activityDetails); } catch (Exception
		 * e) { System.out.println("Gson Error " + e.toString()); }
		 */
	}

}
