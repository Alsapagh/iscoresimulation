package com.iscore.poc;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.file.Files;


/**
 * @Author Alsapagh
 * @Date 5/26/2021
 */
@RestController
@RequestMapping("/api")
public class IscoreController {
    @PostMapping("/LiveRequest")
    public String gerSccore(String req) {
        System.out.println("The Request is : " + req);
        String content = null;
        File file = null;
        try {
            content = "{\n" +
                    "    \"ErrorResponse\": null,\n" +
                    "    \"Response\": {\n" +
                    "        \"ReportName\": \"iScoreConsumerCIR\",\n" +
                    "        \"ReportGenerationDate\": \"02-Jun-2021\",\n" +
                    "        \"CIRReferenceNo\": \"W-0000012849/02/06/2021\",\n" +
                    "        \"ModuleData\": [\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScorePdfIcon\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"ENTITYID\": \"00b7558f-66e4-4c9c-9c91-ecaec45d6326\",\n" +
                    "                    \"REQUESTID\": 1000004145,\n" +
                    "                    \"DISCLAIMERID\": 140001,\n" +
                    "                    \"CULTURE\": \"EN\"\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreDisclaimer\",\n" +
                    "                \"Content\": \"\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreSearchDetailsConsumer\",\n" +
                    "                \"Content\": [\n" +
                    "                    {\n" +
                    "                        \"NAME\": \"TEST1\",\n" +
                    "                        \"ID\": \"28811060200193\",\n" +
                    "                        \"DOB\": \"12-Dec-1987\",\n" +
                    "                        \"USER_ID\": \"mf000100010001ahq\",\n" +
                    "                        \"NATIONALITY\": \"054\",\n" +
                    "                        \"GENDER\": \"Male\",\n" +
                    "                        \"ID_TYPE\": \"Civil Affairs Authority - National ID\",\n" +
                    "                        \"TICKET_ID\": \"W-0000012849/02/06/2021\",\n" +
                    "                        \"CREATED_DATE\": \"02-Jun-2021\",\n" +
                    "                        \"NLHIDE\": null\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreInquiryHistoryConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"InquiryHistory\": [\n" +
                    "                                [\n" +
                    "                                    {\n" +
                    "                                        \"SUBSCRIBER_ID\": \"MF00010001\",\n" +
                    "                                        \"REASON\": \"2\",\n" +
                    "                                        \"LOAN_TYPE\": \"001\",\n" +
                    "                                        \"INQUIRY_DATE\": \"28-May-2021\",\n" +
                    "                                        \"CLIENT_CATEGORY\": \"MF00010001\"\n" +
                    "                                    },\n" +
                    "                                    {\n" +
                    "                                        \"SUBSCRIBER_ID\": \"MF00010001\",\n" +
                    "                                        \"REASON\": \"1\",\n" +
                    "                                        \"LOAN_TYPE\": \"001\",\n" +
                    "                                        \"INQUIRY_DATE\": \"28-May-2021\",\n" +
                    "                                        \"CLIENT_CATEGORY\": \"MF00010001\"\n" +
                    "                                    },\n" +
                    "                                    {\n" +
                    "                                        \"SUBSCRIBER_ID\": \"Iscore101\",\n" +
                    "                                        \"REASON\": \"1\",\n" +
                    "                                        \"LOAN_TYPE\": \"001\",\n" +
                    "                                        \"INQUIRY_DATE\": \"27-May-2021\",\n" +
                    "                                        \"CLIENT_CATEGORY\": \"Iscore101\"\n" +
                    "                                    },\n" +
                    "                                    {\n" +
                    "                                        \"SUBSCRIBER_ID\": \"MF00010001\",\n" +
                    "                                        \"REASON\": \"1\",\n" +
                    "                                        \"LOAN_TYPE\": \"001\",\n" +
                    "                                        \"INQUIRY_DATE\": \"27-May-2021\",\n" +
                    "                                        \"CLIENT_CATEGORY\": \"MF00010001\"\n" +
                    "                                    },\n" +
                    "                                    {\n" +
                    "                                        \"SUBSCRIBER_ID\": \"Iscore101\",\n" +
                    "                                        \"REASON\": \"1\",\n" +
                    "                                        \"LOAN_TYPE\": \"001\",\n" +
                    "                                        \"INQUIRY_DATE\": \"26-May-2021\",\n" +
                    "                                        \"CLIENT_CATEGORY\": \"Iscore101\"\n" +
                    "                                    },\n" +
                    "                                    {\n" +
                    "                                        \"SUBSCRIBER_ID\": \"MF00040001\",\n" +
                    "                                        \"REASON\": \"1\",\n" +
                    "                                        \"LOAN_TYPE\": \"001\",\n" +
                    "                                        \"INQUIRY_DATE\": \"23-Nov-2020\",\n" +
                    "                                        \"CLIENT_CATEGORY\": \"MF00040001\"\n" +
                    "                                    },\n" +
                    "                                    {\n" +
                    "                                        \"SUBSCRIBER_ID\": \"MF00040001\",\n" +
                    "                                        \"REASON\": \"1\",\n" +
                    "                                        \"LOAN_TYPE\": \"001\",\n" +
                    "                                        \"INQUIRY_DATE\": \"23-Nov-2020\",\n" +
                    "                                        \"CLIENT_CATEGORY\": \"MF00040001\"\n" +
                    "                                    },\n" +
                    "                                    {\n" +
                    "                                        \"SUBSCRIBER_ID\": \"MF00040001\",\n" +
                    "                                        \"REASON\": \"1\",\n" +
                    "                                        \"LOAN_TYPE\": \"001\",\n" +
                    "                                        \"INQUIRY_DATE\": \"23-Nov-2020\",\n" +
                    "                                        \"CLIENT_CATEGORY\": \"MF00040001\"\n" +
                    "                                    },\n" +
                    "                                    {\n" +
                    "                                        \"SUBSCRIBER_ID\": \"RC00290001\",\n" +
                    "                                        \"REASON\": \"1\",\n" +
                    "                                        \"LOAN_TYPE\": \"001\",\n" +
                    "                                        \"INQUIRY_DATE\": \"22-Nov-2020\",\n" +
                    "                                        \"CLIENT_CATEGORY\": \"RC00290001\"\n" +
                    "                                    }\n" +
                    "                                ]\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScorePerformingOverdueUtilGraphConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"PerfOverdueGraph\": [\n" +
                    "                                {\n" +
                    "                                    \"AccountType\": \"013\",\n" +
                    "                                    \"PerformingAccounts\": \"2\",\n" +
                    "                                    \"OverdueAccounts\": \"0\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"UtilizationGraph\": [\n" +
                    "                                {\n" +
                    "                                    \"AccountType\": \"013\",\n" +
                    "                                    \"UtilizedAmount\": \"24\",\n" +
                    "                                    \"UnUtilizedAmount\": \"-22\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreMaxNDPDGraphConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"MaxNDPDHistoryGraph\": [\n" +
                    "                                {\n" +
                    "                                    \"PeriodId\": \"Jun-19\",\n" +
                    "                                    \"MAX_NUM_DAYS_DUE\": \"0\",\n" +
                    "                                    \"REPORTED_DATE\": \"30-Jun-2019\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreAccountLinkageConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"AccountLinkage\": \"\"\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreWrittenOffFacilitiesConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"WrittenOffAccountDetails\": \"\"\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreLegalActionsConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"LegalActions\": \"\"\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreNegativeListConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"NegativeList\": \"\"\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreClosedFacilitiesConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"ClosedAccountDetails\": \"\"\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreCreditRegistryConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"CRData\": \"\"\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreIdentificationDetailsConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"IdentifierDetails\": [\n" +
                    "                                {\n" +
                    "                                    \"ID_TYPE\": \"003\",\n" +
                    "                                    \"ID_CODE\": \"28811060200193\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreAddressHistoryConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"AddressHistory\": \"\"\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreCreditProfileOverviewConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"CreditFacilities\": [\n" +
                    "                                {\n" +
                    "                                    \"Currency\": \"EGP\",\n" +
                    "                                    \"NoOfAccounts\": \"2\",\n" +
                    "                                    \"TotalApprovalAmt\": \"2\",\n" +
                    "                                    \"TotalMonthlyInstallmentAmt\": \"0\",\n" +
                    "                                    \"TotalBalanceAmount\": \"24\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"WrittenOffFacilities\": \"\"\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"DishonoredCheques\": \"\"\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"UnearnedInterest\": \"\"\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"SecurityIndicator\": [\n" +
                    "                                {\n" +
                    "                                    \"NoOfFullySecuredFacilities\": \"0\",\n" +
                    "                                    \"NoOfPartialSecuredFacilities\": \"0\",\n" +
                    "                                    \"NoOfNoSecuredFacilities\": \"2\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreProfileSectionConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"ProfileSummary\": [\n" +
                    "                                {\n" +
                    "                                    \"Gender\": \"001\",\n" +
                    "                                    \"DOB\": \"06-Nov-1988\",\n" +
                    "                                    \"MaritalStatus\": \"003\",\n" +
                    "                                    \"Citizenship\": \"054\",\n" +
                    "                                    \"Occupation\": \"\",\n" +
                    "                                    \"FullName\": \"  عمرو يوسف خميس يوسف\",\n" +
                    "                                    \"IDValue\": \"28811060200193\",\n" +
                    "                                    \"ContactValue\": \"0\",\n" +
                    "                                    \"FullAddress\": \"القاهرة القاهرة مصر\",\n" +
                    "                                    \"SCORE\": 0,\n" +
                    "                                    \"REASONCODE1\": \"  \",\n" +
                    "                                    \"REASONCODE2\": \"  \",\n" +
                    "                                    \"WORST_LA\": \"\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"ModuleId\": \"iScoreActiveFacilitiesConsumer\",\n" +
                    "                \"Content\": {\n" +
                    "                    \"DATA\": [\n" +
                    "                        {\n" +
                    "                            \"OpenAccountDetails\": [\n" +
                    "                                {\n" +
                    "                                    \"SANCTION_DATE\": \"22-Apr-2019\",\n" +
                    "                                    \"FACILITY_NATURE_INDICATOR\": \"002\",\n" +
                    "                                    \"CURRENCY\": \"EGP\",\n" +
                    "                                    \"CURRENCY_CODE\": \"EGP\",\n" +
                    "                                    \"SANCTION_AMT\": \"1\",\n" +
                    "                                    \"LOAN_TERM\": \"\",\n" +
                    "                                    \"AMT_OF_INSTALMENT\": \"\",\n" +
                    "                                    \"REPAYMENT_TYPE\": \"\",\n" +
                    "                                    \"CF_AMENDMENT_DATE\": \"\",\n" +
                    "                                    \"ACC_STATUS\": \"001\",\n" +
                    "                                    \"CF_SETTLEMENT_DATE\": \"\",\n" +
                    "                                    \"AMT_WRITTEN_OFF\": \"0\",\n" +
                    "                                    \"REASON_AMT_WRITTEN_OFF\": \"\",\n" +
                    "                                    \"AMOUNT_FORGIVEN\": \"0\",\n" +
                    "                                    \"REASON_AMT_FORGIVEN\": \"\",\n" +
                    "                                    \"DATE_ACC_CLOSE\": \"\",\n" +
                    "                                    \"SPECIAL_COMMENTS\": \"\",\n" +
                    "                                    \"FIRST_DISBURSE_DATE\": \"22-Apr-2019\",\n" +
                    "                                    \"SECURITY_INDICATOR\": \"003\",\n" +
                    "                                    \"LIABILITY_INDICATOR\": \"001\",\n" +
                    "                                    \"NO_OF_INSTALMENTS\": \"\",\n" +
                    "                                    \"LOAN_TYPE\": \"013\",\n" +
                    "                                    \"REPORTED_DATE\": \"30-Jun-2019\",\n" +
                    "                                    \"DPDHistory24Months\": [\n" +
                    "                                        {\n" +
                    "                                            \"MAX_NUM_DAYS_DUE\": \"0\",\n" +
                    "                                            \"OVER_DUE_AMT\": \"0\",\n" +
                    "                                            \"CURRENT_BAL\": \"12\",\n" +
                    "                                            \"PERIOD_ID\": \"201906\"\n" +
                    "                                        }\n" +
                    "                                    ],\n" +
                    "                                    \"LegalActions\": \"\",\n" +
                    "                                    \"DishonorCheque\": \"\",\n" +
                    "                                    \"DisputeRef\": \"\",\n" +
                    "                                    \"DAYS_DUE\": \"0\",\n" +
                    "                                    \"LAST_AMOUNT_PAID\": \"0\",\n" +
                    "                                    \"DATE_LATEST_PAY_RECEIVED\": \"\",\n" +
                    "                                    \"ASSET_CLASSIFICATION\": \"201\",\n" +
                    "                                    \"HIGHEST_CREDIT\": \"\",\n" +
                    "                                    \"CURRENT_BAL_SV\": \"12\",\n" +
                    "                                    \"OVER_DUE_AMT\": \"0\",\n" +
                    "                                    \"AMT_OF_UNEARNED_INT\": \"0\",\n" +
                    "                                    \"NO_OF_INSTALLMENTS_OVERDUE\": \"0\",\n" +
                    "                                    \"DATA_PRDR_ID\": \"IB43000001\",\n" +
                    "                                    \"BRANCH_ID\": \"\",\n" +
                    "                                    \"MAX_NUM_DAYS_DUE\": \"\",\n" +
                    "                                    \"DATE_REPORTED_NDPD\": \"\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"PDFStream\": null\n" +
                    "    },\n" +
                    "    \"IsNoHit\": false\n" +
                    "}";
        } catch (Exception e) {
            e.printStackTrace();
        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(content);
        return content;
    }
}
