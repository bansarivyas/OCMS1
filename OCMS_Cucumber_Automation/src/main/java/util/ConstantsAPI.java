package util;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;

public class ConstantsAPI {
	
	// Base URL
	public static final String BASE_URL_CCO = "https://oc-website-cea-dev.herokuapp.com/";
	public static final String BASE_URL_PROCE = "https://dev.proce.com/";
	public static final String BASE_URL_PCE = "https://dev-cea.practicingclinicians.com/";
	
	
	// HEADERS
	public static final String URL = "https://omni-channel-api-cea-dev.herokuapp.com/automationTest/activitydetails";
	public static final String APP_ID = "f0c0d5febde258d145d1e1604126233e";
	public static final String APP_SIGNATURE = "f0c0d5febde258d145d1e1604126233ef0c0d5febde258d145d1e1604126233e";
	public static final String API_BODY1 = "{\"parameters\":{\"activity_id\":\"";
	public static final String API_BODY2 = "\"},\"apiInfo\":{\"devicetype\":\"mobile\"}}";
	public static final String CONTENT_TYPE = "application/json";
	public static final String USER_AGENT = "PostmanRuntime/7.29.0";
	
	// Excel
	public static String ACTIVITY_EXCEL_PATH = "./src/test/resources/data/";
	public static String EXCEL_NAME = "activity_id.xlsx";
	
	// Data
	public static String ACTIVITY_URL;
	public static String ACTIVITY_ID;
	public static JSONObject ACTIVITY_STEPS;
	public static String PARTNER_NAME;

    public static final HashMap<Integer, Integer> EVAL_ANSWER_OPTIONS = new HashMap<>();
    public static final HashMap<Integer, HashMap<Integer, Integer>> EVAL_HASH_MAP = new HashMap<>();
    public static final HashMap<Integer, Integer> INCONTENT_ANSWER_OPTIONS = new HashMap<>();
    public static final HashMap<String, HashMap<Integer, Integer>> INCONTENT_MAP = new HashMap<>();
    public static final HashMap<Integer, Integer> PRETEST_ANSWER_OPTIONS = new HashMap<>();
    public static final HashMap<Integer, HashMap<Integer, Integer>> PRETEST_MAP = new HashMap<>();
    public static final HashMap<Integer, Integer> POSTTEST_ANSWER_OPTIONS = new HashMap<>();
    public static final HashMap<Integer, HashMap<Integer, Integer>> POSTTEST_MAP = new HashMap<>();
    
    public static final HashMap<Integer, HashMap<Integer, Integer>> SINGLE_SELECT_EVAL_HASH_MAP = new HashMap<>();
    public static final HashMap<Integer, HashMap<Integer, Integer>> MULTI_SELECT_EVAL_HASH_MAP = new HashMap<>();
    public static final HashMap<Integer, HashMap<Integer, Integer>> RATING_GROUP_EVAL_HASH_MAP = new HashMap<>();
    public static final ArrayList<Integer> LONG_TEXT_EVAL_ID = new ArrayList<Integer>();
    public static final ArrayList<Integer> NUMBER_EVAL_ID = new ArrayList<Integer>();

}
