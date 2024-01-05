#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@eCaseFeature
Feature: Testing eCase  flow

  @eCaseInContent
  Scenario Outline: Testing eCase in-content questions
    Given Login to the "<URL>" and enter "<Username>" and "<Password>" and successfully logged in
    Then I click on "<TabName>" Tab
    And I search for the "<ActivityName>" and open it
    And I click on Begin Activity
    And I Answer the Pre-Test Questions "<QPre1>" "<AnsPre1>" "<QPre2>" "<AnsPre2>" "<QPre3>" "<AnsPre3>" and click on Next button
    And I Answer the Post-Test Questions "<QPost1>" "<AnsPost1>" "<QPost2>" "<AnsPost2>" "<QPost3>" "<AnsPost3>" and click on Next button

    Examples: 
      | URL                                   | Username                | Password    | TabName    | ActivityName                                  | QPre1                                                                                                                                                                              | AnsPre1                                               | QPre2                                                                                                                                                                                               | AnsPre2                                              | QPre3                                                                                                                                                                                                                                                                                  | AnsPre3                   | QPost1                                                                                                                                                                             | AnsPost1                                              | QPost2                                                                                                                                                                                              | AnsPost2                                             | QPost3                                                                                                                                                                                                                                                                                 | AnsPost3                  |
      | https://uat.clinicaloptions.com/login | testra+11@mailinator.com | Shivani@123 | Activities | Hepatitis C Management in Special Populations | Which of the following regimens is recommended by guidance from the AASLD/IDSA for the treatment of genotypes 1-6 HCV in patients with severe renal impairment (eGFR < 30 mL/min)? | B. Glecaprevir/pibrentasvir or sofosbuvir/velpatasvir | Which of the following regimens are recommended by guidance from the AASLD/IDSA for the treatment of a 14-year-old treatment-naive patient with genotype 4 HCV infection and compensated cirrhosis? | B. Glecaprevir/pibrentasvir or ledipasvir/sofosbuvir | According to HCV treatment recommendations from the European Association for the Study of the Liver (EASL), which of the following HCV regimens can be safely coadministered with atazanavir/ritonavir plus emtricitabine/tenofovir alafenamide in a patient with HCV/HIV coinfection? | C. Sofosbuvir/velpatasvir | Which of the following regimens is recommended by guidance from the AASLD/IDSA for the treatment of genotypes 1-6 HCV in patients with severe renal impairment (eGFR < 30 mL/min)? | B. Glecaprevir/pibrentasvir or sofosbuvir/velpatasvir | Which of the following regimens are recommended by guidance from the AASLD/IDSA for the treatment of a 14-year-old treatment-naive patient with genotype 4 HCV infection and compensated cirrhosis? | B. Glecaprevir/pibrentasvir or ledipasvir/sofosbuvir | According to HCV treatment recommendations from the European Association for the Study of the Liver (EASL), which of the following HCV regimens can be safely coadministered with atazanavir/ritonavir plus emtricitabine/tenofovir alafenamide in a patient with HCV/HIV coinfection? | C. Sofosbuvir/velpatasvir |
