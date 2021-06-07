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
                    "   \"ErrorResponse\": null,\n" +
                    "   \"Response\": {\n" +
                    "       \"ReportName\":\"Jmeter Consumer report\",\n" +
                    "       \"ReportGenerationDate\":\"26-Jan-2021\",\n" +
                    "       \"CIRReferenceNo\":\"W-0000043242/26/01/2021\",\n" +
                    "       \"ModuleData\": [\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScorePdfIcon\",\n" +
                    "               \"Content\": null\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreSearchDetailsConsumer\",\n" +
                    "               \"Content\": [\n" +
                    "                    {\n" +
                    "                       \"NAME\":\"MASHAN RITON PRV\",\n" +
                    "                       \"ID\":\"29304040240061\",\n" +
                    "                       \"DOB\":\"12-Dec-1982\",\n" +
                    "                       \"USER_ID\":\"jm900000099999fgt\",\n" +
                    "                       \"NATIONALITY\":\"054\",\n" +
                    "                       \"GENDER\":\"Female\",\n" +
                    "                       \"ID_TYPE\":\"Civil Affairs Authority - National ID\",\n" +
                    "                       \"TICKET_ID\":\"W-0000043242/26/01/2021\",\n" +
                    "                       \"CREATED_DATE\":\"25-Jan-2021\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreDisclaimer\",\n" +
                    "               \"Content\": [\n" +
                    "                    {\n" +
                    "                       \"DISCLAIMER_CONTENT\":\"This Information is for generic informational purposes only and is meant for consumer education and awareness about credit scores, credit history and credit reporting. The Information posted on the blog does not constitute credit advice and the user will need to consider the same and take independent informed decisions . No part of this Information may be quoted out of context, distorted ,distributed, published and/ or reproduced in any form and manner whatsoever.\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreSIRInquiryHistoryConsumer\",\n" +
                    "               \"Content\": [\n" +
                    "                    {\n" +
                    "                       \"INQUIRY_DATE\":\"25-Jan-2021\",\n" +
                    "                       \"SUBSCRIBER_ID\":\"JM90000009\",\n" +
                    "                       \"CREATED_DATE\":\"2021-01-25T16:47:47.811432\",\n" +
                    "                       \"CLIENT_NAME\":\"Jmeter Bank\",\n" +
                    "                       \"CLIENT_CATEGORY\":\"Banks\",\n" +
                    "                       \"REASON\":\"Signing a new deed\",\n" +
                    "                       \"LOAN_TYPE_ID\":\"001\",\n" +
                    "                       \"LOAN_TYPE\":\"Auto Loan\"\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                       \"INQUIRY_DATE\":\"25-Jan-2021\",\n" +
                    "                       \"SUBSCRIBER_ID\":\"ISCORE0001\",\n" +
                    "                       \"CREATED_DATE\":\"2021-01-25T16:47:00.545066\",\n" +
                    "                       \"CLIENT_NAME\":\"ISCORE INSTITUTION\",\n" +
                    "                       \"CLIENT_CATEGORY\":\"Banks\",\n" +
                    "                       \"REASON\":\"Signing a new deed\",\n" +
                    "                       \"LOAN_TYPE_ID\":\"013\",\n" +
                    "                       \"LOAN_TYPE\":\"Overdraft\"\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                       \"INQUIRY_DATE\":\"25-Jan-2021\",\n" +
                    "                       \"SUBSCRIBER_ID\":\"JM90000009\",\n" +
                    "                       \"CREATED_DATE\":\"2021-01-25T13:05:31.859534\",\n" +
                    "                       \"CLIENT_NAME\":\"Jmeter Bank\",\n" +
                    "                       \"CLIENT_CATEGORY\":\"Banks\",\n" +
                    "                       \"REASON\":\"Signing a new deed\",\n" +
                    "                       \"LOAN_TYPE_ID\":\"001\",\n" +
                    "                       \"LOAN_TYPE\":\"Auto Loan\"\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                       \"INQUIRY_DATE\":\"25-Jan-2021\",\n" +
                    "                       \"SUBSCRIBER_ID\":\"JM90000009\",\n" +
                    "                       \"CREATED_DATE\":\"2021-01-25T11:31:46.934906\",\n" +
                    "                       \"CLIENT_NAME\":\"Jmeter Bank\",\n" +
                    "                       \"CLIENT_CATEGORY\":\"Banks\",\n" +
                    "                       \"REASON\":\"Signing a new deed\",\n" +
                    "                       \"LOAN_TYPE_ID\":\"001\",\n" +
                    "                       \"LOAN_TYPE\":\"Auto Loan\"\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                       \"INQUIRY_DATE\":\"25-Jan-2021\",\n" +
                    "                       \"SUBSCRIBER_ID\":\"ISCORE0001\",\n" +
                    "                       \"CREATED_DATE\":\"2021-01-25T11:30:50.08121\",\n" +
                    "                       \"CLIENT_NAME\":\"ISCORE INSTITUTION\",\n" +
                    "                       \"CLIENT_CATEGORY\":\"Banks\",\n" +
                    "                       \"REASON\":\"Signing a new deed\",\n" +
                    "                       \"LOAN_TYPE_ID\":\"012\",\n" +
                    "                       \"LOAN_TYPE\":\"Loan against Salary\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreIdentificationDetailsConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"IdentifierDetails\": [\n" +
                    "                                {\n" +
                    "                                   \"ID_TYPE\":\"003\",\n" +
                    "                                   \"ID_CODE\":\"29304040240061\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"ID_TYPE\":\"031\",\n" +
                    "                                   \"ID_CODE\":\"120450129679\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreNegativeListConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"NegativeList\": [\n" +
                    "                                {\n" +
                    "                                   \"BankName\":\"7700\",\n" +
                    "                                   \"BranchName\":\"7700:0102\",\n" +
                    "                                   \"ApprovalDate\":\"06-Jun-2011\",\n" +
                    "                                   \"FacilityType\":\"002\",\n" +
                    "                                   \"Limit\":\"2502\",\n" +
                    "                                   \"Balance\":\"999999\",\n" +
                    "                                   \"CustomerType\":\"001\",\n" +
                    "                                   \"MainAction\":\"05\",\n" +
                    "                                   \"SubAction\":\"05:03\",\n" +
                    "                                   \"LastPaymentDate\":\"15-Jul-2020\",\n" +
                    "                                   \"REPORTED_DATE\":\"15-Jul-2020\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScorePerformingOverdueUtilGraphConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"PerfOverdueGraph\": [\n" +
                    "                                {\n" +
                    "                                   \"AccountType\":\"001\",\n" +
                    "                                   \"PerformingAccounts\":\"0\",\n" +
                    "                                   \"OverdueAccounts\":\"1\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"AccountType\":\"008\",\n" +
                    "                                   \"PerformingAccounts\":\"0\",\n" +
                    "                                   \"OverdueAccounts\":\"2\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                           \"UtilizationGraph\": []\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreProfileSectionConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"ProfileSummary\": [\n" +
                    "                                {\n" +
                    "                                   \"Gender\":\"002\",\n" +
                    "                                   \"DOB\":\"04-Apr-1993\",\n" +
                    "                                   \"MaritalStatus\":\"001\",\n" +
                    "                                   \"Citizenship\":\"054\",\n" +
                    "                                   \"Occupation\":\"002\",\n" +
                    "                                   \"FullName\":\"SYLVIA MARTIN MARTIN\",\n" +
                    "                                   \"IDValue\":\"29304040240061\",\n" +
                    "                                   \"ContactValue\":\"MARTIN@GGMAIL.COM\",\n" +
                    "                                   \"FullAddress\":\"M BLOCKS,COTAGE APPT الإسكندرية مصر\",\n" +
                    "                                   \"SCORE\":\"\",\n" +
                    "                                   \"REASONCODE1\":\"\",\n" +
                    "                                   \"REASONCODE2\":\"\",\n" +
                    "                                   \"WORST_LA\":\"\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreAddressHistoryConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"AddressHistory\": [\n" +
                    "                                {\n" +
                    "                                   \"Address\":\"M BLOCKS,COTAGE APPT الإسكندرية مصر\",\n" +
                    "                                   \"Type\":\"001\",\n" +
                    "                                   \"ReportingDate\":\"15-Jul-2020\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"Address\":\"RR FLATS RUBI BUILDERS,SILVER SCREEING أسيوط مصر\",\n" +
                    "                                   \"Type\":\"001\",\n" +
                    "                                   \"ReportingDate\":\"02-Feb-2020\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreMaxNDPDGraphConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"MaxNDPDHistoryGraph\": [\n" +
                    "                                {\n" +
                    "                                   \"PeriodId\":\"Oct-20\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"370\",\n" +
                    "                                   \"REPORTED_DATE\":\"10-Oct-2020\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"PeriodId\":\"Sep-20\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"0\",\n" +
                    "                                   \"REPORTED_DATE\":\"20-Sep-2020\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"PeriodId\":\"Jul-20\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"0\",\n" +
                    "                                   \"REPORTED_DATE\":\"20-Jul-2020\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"PeriodId\":\"Aug-19\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"94\",\n" +
                    "                                   \"REPORTED_DATE\":\"20 - Aug - 2019\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"PeriodId\":\"Jul - 19\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"60\",\n" +
                    "                                   \"REPORTED_DATE\":\"20 - Jul - 2019\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"PeriodId\":\"Jun - 19\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"100\",\n" +
                    "                                   \"REPORTED_DATE\":\"20 - Jun - 2019\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"PeriodId\":\"May - 19\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"60\",\n" +
                    "                                   \"REPORTED_DATE\":\"20 - May - 2019\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"PeriodId\":\"Apr - 19\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"60\",\n" +
                    "                                   \"REPORTED_DATE\":\"20 - Apr - 2019\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"PeriodId\":\"Mar - 19\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"0\",\n" +
                    "                                   \"REPORTED_DATE\":\"20 - Mar - 2019\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreCreditProfileOverviewConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"CreditFacilities\": [\n" +
                    "                                {\n" +
                    "                                   \"Currency\":\"EGP\",\n" +
                    "                                   \"NoOfAccounts\":\"3\",\n" +
                    "                                   \"TotalApprovalAmt\":\"1300000\",\n" +
                    "                                   \"TotalMonthlyInstallmentAmt\":\"28000\",\n" +
                    "                                   \"TotalBalanceAmount\":\"740000\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                           \"WrittenOffFacilities\": [\n" +
                    "                                {\n" +
                    "                                   \"Currency\":\"EGP\",\n" +
                    "                                   \"NoOfWrittenOffAccounts\":\"1\",\n" +
                    "                                   \"TotalApprovalAmt\":\"400000\",\n" +
                    "                                   \"TotalWrittenOffAmt\":\"10000\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                           \"DishonoredCheques\": [\n" +
                    "                                {\n" +
                    "                                   \"Currency\":\"EGP\",\n" +
                    "                                   \"NoOfCheques\":\"1\",\n" +
                    "                                   \"TotalDisohonorAmt\":\"50000\",\n" +
                    "                                   \"LastChequeDisHonoredDate\":\"10 - Nov - 2018\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                           \"UnearnedInterest\": []\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                           \"SecurityIndicator\": [\n" +
                    "                                {\n" +
                    "                                   \"NoOfFullySecuredFacilities\":\"2\",\n" +
                    "                                   \"NoOfPartialSecuredFacilities\":\"1\",\n" +
                    "                                   \"NoOfNoSecuredFacilities\":\"0\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreLegalActionsConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"LegalActions\": [\n" +
                    "                                {\n" +
                    "                                   \"LegalActionDetails\": [\n" +
                    "                                        {\n" +
                    "                                           \"BankName\":\"7700\",\n" +
                    "                                           \"Branch\":\"7700: 0102\",\n" +
                    "                                           \"ApprovalDate\":\"06 - Jun - 2020\",\n" +
                    "                                           \"Balance\":\"63938\",\n" +
                    "                                           \"MainAction\":\"0001\",\n" +
                    "                                           \"SubAction\":\"0001: 0001\",\n" +
                    "                                           \"MainActionCode\":\"0001\",\n" +
                    "                                           \"SubActionCode\":\"0001: 0001\",\n" +
                    "                                           \"LEGAL_STATEMENT_date\":\"05 - Apr - 2019\",\n" +
                    "                                           \"ReportingDate\":\"07 - Jul - 2020\",\n" +
                    "                                           \"LASeverityID\":\"1\"\n" +
                    "                                        }\n" +
                    "                                    ]\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreSIRClosedFacilitiesConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"ClosedAccountDetails\": [\n" +
                    "                                {\n" +
                    "                                   \"SANCTION_DATE\":\"06 - Jun - 2017\",\n" +
                    "                                   \"FACILITY_NATURE_INDICATOR\":\"002\",\n" +
                    "                                   \"CURRENCY\":\"EGP\",\n" +
                    "                                   \"CURRENCY_CODE\":\"EGP\",\n" +
                    "                                   \"SANCTION_AMT\":\"400000\",\n" +
                    "                                   \"LOAN_TERM\":\"20\",\n" +
                    "                                   \"AMT_OF_INSTALMENT\":\"10000\",\n" +
                    "                                   \"REPAYMENT_TYPE\":\"001\",\n" +
                    "                                   \"CF_AMENDMENT_DATE\":\"\",\n" +
                    "                                   \"ACC_STATUS\":\"003\",\n" +
                    "                                   \"CF_SETTLEMENT_DATE\":\"\",\n" +
                    "                                   \"AMT_WRITTEN_OFF\":\"\",\n" +
                    "                                   \"REASON_AMT_WRITTEN_OFF\":\"\",\n" +
                    "                                   \"AMOUNT_FORGIVEN\":\"\",\n" +
                    "                                   \"REASON_AMT_FORGIVEN\":\"\",\n" +
                    "                                   \"DATE_ACC_CLOSE\":\"11 - Sep - 2020\",\n" +
                    "                                   \"SPECIAL_COMMENTS\":\"\",\n" +
                    "                                   \"FIRST_DISBURSE_DATE\":\"10 - Jun - 2017\",\n" +
                    "                                   \"SECURITY_INDICATOR\":\"001\",\n" +
                    "                                   \"LIABILITY_INDICATOR\":\"001\",\n" +
                    "                                   \"NO_OF_INSTALMENTS\":\"\",\n" +
                    "                                   \"LOAN_TYPE\":\"008\",\n" +
                    "                                   \"REPORTED_DATE\":\"20 - Sep - 2020\",\n" +
                    "                                   \"DPDHistory24Months\": [\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"0\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"0\",\n" +
                    "                                           \"CURRENT_BAL\":\"0\",\n" +
                    "                                           \"PERIOD_ID\":\"202009\"\n" +
                    "                                        }\n" +
                    "                                    ],\n" +
                    "                                   \"LegalActions\": [],\n" +
                    "                                   \"DishonorCheque\": [],\n" +
                    "                                   \"DisputeRef\": [],\n" +
                    "                                   \"DAYS_DUE\":\"0\",\n" +
                    "                                   \"LAST_AMOUNT_PAID\":\"40000\",\n" +
                    "                                   \"DATE_LATEST_PAY_RECEIVED\":\"14 - Nov - 2018\",\n" +
                    "                                   \"ASSET_CLASSIFICATION\":\"101\",\n" +
                    "                                   \"HIGHEST_CREDIT\":\"\",\n" +
                    "                                   \"CURRENT_BAL_SV\":\"0\",\n" +
                    "                                   \"OVER_DUE_AMT\":\"0\",\n" +
                    "                                   \"AMT_OF_UNEARNED_INT\":\"0\",\n" +
                    "                                   \"NO_OF_INSTALLMENTS_OVERDUE\":\"\",\n" +
                    "                                   \"DATA_PRDR_NAME\":\"CB13000001\",\n" +
                    "                                   \"BRANCH_NAME\":\"9999\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"0\",\n" +
                    "                                   \"DATE_REPORTED_NDPD\":\"11 - Sep - 2020\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreSIRWrittenOffFacilitiesConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"WrittenOffAccountDetails\": [\n" +
                    "                                {\n" +
                    "                                   \"SANCTION_DATE\":\"06 - Jun - 2017\",\n" +
                    "                                   \"FACILITY_NATURE_INDICATOR\":\"002\",\n" +
                    "                                   \"CURRENCY\":\"EGP\",\n" +
                    "                                   \"CURRENCY_CODE\":\"EGP\",\n" +
                    "                                   \"SANCTION_AMT\":\"400000\",\n" +
                    "                                   \"LOAN_TERM\":\"20\",\n" +
                    "                                   \"AMT_OF_INSTALMENT\":\"10000\",\n" +
                    "                                   \"REPAYMENT_TYPE\":\"001\",\n" +
                    "                                   \"CF_AMENDMENT_DATE\":\"\",\n" +
                    "                                   \"ACC_STATUS\":\"005\",\n" +
                    "                                   \"CF_SETTLEMENT_DATE\":\"10 - Aug - 2019\",\n" +
                    "                                   \"AMT_WRITTEN_OFF\":\"10000\",\n" +
                    "                                   \"REASON_AMT_WRITTEN_OFF\":\"001\",\n" +
                    "                                   \"AMOUNT_FORGIVEN\":\"10000\",\n" +
                    "                                   \"REASON_AMT_FORGIVEN\":\"001\",\n" +
                    "                                   \"DATE_ACC_CLOSE\":\"\",\n" +
                    "                                   \"SPECIAL_COMMENTS\":\"\",\n" +
                    "                                   \"FIRST_DISBURSE_DATE\":\"10 - Jun - 2017\",\n" +
                    "                                   \"SECURITY_INDICATOR\":\"001\",\n" +
                    "                                   \"LIABILITY_INDICATOR\":\"001\",\n" +
                    "                                   \"NO_OF_INSTALMENTS\":\"\",\n" +
                    "                                   \"LOAN_TYPE\":\"008\",\n" +
                    "                                   \"REPORTED_DATE\":\"20 - Aug - 2019\",\n" +
                    "                                   \"DPDHistory24Months\": [\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"60\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"20000\",\n" +
                    "                                           \"CURRENT_BAL\":\"230000\",\n" +
                    "                                           \"PERIOD_ID\":\"201907\"\n" +
                    "                                        },\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"60\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"20000\",\n" +
                    "                                           \"CURRENT_BAL\":\"230000\",\n" +
                    "                                           \"PERIOD_ID\":\"201905\"\n" +
                    "                                        },\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"60\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"20000\",\n" +
                    "                                           \"CURRENT_BAL\":\"230000\",\n" +
                    "                                           \"PERIOD_ID\":\"201906\"\n" +
                    "                                        },\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"94\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"20000\",\n" +
                    "                                           \"CURRENT_BAL\":\"0\",\n" +
                    "                                           \"PERIOD_ID\":\"201908\"\n" +
                    "                                        },\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"60\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"20000\",\n" +
                    "                                           \"CURRENT_BAL\":\"230000\",\n" +
                    "                                           \"PERIOD_ID\":\"201904\"\n" +
                    "                                        }\n" +
                    "                                    ],\n" +
                    "                                   \"LegalActions\": [],\n" +
                    "                                   \"DishonorCheque\": [],\n" +
                    "                                   \"DisputeRef\": [],\n" +
                    "                                   \"DAYS_DUE\":\"94\",\n" +
                    "                                   \"LAST_AMOUNT_PAID\":\"40000\",\n" +
                    "                                   \"DATE_LATEST_PAY_RECEIVED\":\"14 - Nov - 2018\",\n" +
                    "                                   \"ASSET_CLASSIFICATION\":\"103\",\n" +
                    "                                   \"HIGHEST_CREDIT\":\"\",\n" +
                    "                                   \"CURRENT_BAL_SV\":\"0\",\n" +
                    "                                   \"OVER_DUE_AMT\":\"20000\",\n" +
                    "                                   \"AMT_OF_UNEARNED_INT\":\"0\",\n" +
                    "                                   \"NO_OF_INSTALLMENTS_OVERDUE\":\"2\",\n" +
                    "                                   \"DATA_PRDR_NAME\":\"CB13000001\",\n" +
                    "                                   \"BRANCH_NAME\":\"9999\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"94\",\n" +
                    "                                   \"DATE_REPORTED_NDPD\":\"20 - Aug - 2019\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreCreditRegistryConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"CRData\": []\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "               \"ModuleId\":\"iScoreSIRActiveFacilitiesConsumer\",\n" +
                    "               \"Content\": {\n" +
                    "                   \"DATA\": [\n" +
                    "                        {\n" +
                    "                           \"OpenAccountDetails\": [\n" +
                    "                                {\n" +
                    "                                   \"SANCTION_DATE\":\"06 - Jun - 2017\",\n" +
                    "                                   \"FACILITY_NATURE_INDICATOR\":\"002\",\n" +
                    "                                   \"CURRENCY\":\"EGP\",\n" +
                    "                                   \"CURRENCY_CODE\":\"EGP\",\n" +
                    "                                   \"SANCTION_AMT\":\"400000\",\n" +
                    "                                   \"LOAN_TERM\":\"20\",\n" +
                    "                                   \"AMT_OF_INSTALMENT\":\"10000\",\n" +
                    "                                   \"REPAYMENT_TYPE\":\"001\",\n" +
                    "                                   \"CF_AMENDMENT_DATE\":\"\",\n" +
                    "                                   \"ACC_STATUS\":\"001\",\n" +
                    "                                   \"CF_SETTLEMENT_DATE\":\"\",\n" +
                    "                                   \"AMT_WRITTEN_OFF\":\"\",\n" +
                    "                                   \"REASON_AMT_WRITTEN_OFF\":\"\",\n" +
                    "                                   \"AMOUNT_FORGIVEN\":\"\",\n" +
                    "                                   \"REASON_AMT_FORGIVEN\":\"\",\n" +
                    "                                   \"DATE_ACC_CLOSE\":\"\",\n" +
                    "                                   \"SPECIAL_COMMENTS\":\"\",\n" +
                    "                                   \"FIRST_DISBURSE_DATE\":\"10 - Jun - 2017\",\n" +
                    "                                   \"SECURITY_INDICATOR\":\"001\",\n" +
                    "                                   \"LIABILITY_INDICATOR\":\"001\",\n" +
                    "                                   \"NO_OF_INSTALMENTS\":\"\",\n" +
                    "                                   \"LOAN_TYPE\":\"008\",\n" +
                    "                                   \"REPORTED_DATE\":\"10 - Oct - 2020\",\n" +
                    "                                   \"DPDHistory24Months\": [\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"370\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"2000\",\n" +
                    "                                           \"CURRENT_BAL\":\"270000\",\n" +
                    "                                           \"PERIOD_ID\":\"202010\"\n" +
                    "                                        }\n" +
                    "                                    ],\n" +
                    "                                   \"LegalActions\": [\n" +
                    "                                        {\n" +
                    "                                           \"First_Legal_Action_Date\":\"08 - Aug - 2020\",\n" +
                    "                                           \"MainAction\":\"0011\",\n" +
                    "                                           \"SubAction\":\"0011: 0002\",\n" +
                    "                                           \"LEGAL_STATEMENT_date\":\"08 - Aug - 2020\"\n" +
                    "                                        }\n" +
                    "                                    ],\n" +
                    "                                   \"DishonorCheque\": [],\n" +
                    "                                   \"DisputeRef\": [],\n" +
                    "                                   \"DAYS_DUE\":\"370\",\n" +
                    "                                   \"LAST_AMOUNT_PAID\":\"10000\",\n" +
                    "                                   \"DATE_LATEST_PAY_RECEIVED\":\"14 - Jul - 2018\",\n" +
                    "                                   \"ASSET_CLASSIFICATION\":\"104\",\n" +
                    "                                   \"HIGHEST_CREDIT\":\"\",\n" +
                    "                                   \"CURRENT_BAL_SV\":\"270000\",\n" +
                    "                                   \"OVER_DUE_AMT\":\"2000\",\n" +
                    "                                   \"AMT_OF_UNEARNED_INT\":\"0\",\n" +
                    "                                   \"NO_OF_INSTALLMENTS_OVERDUE\":\"8\",\n" +
                    "                                   \"DATA_PRDR_NAME\":\"CB13000001\",\n" +
                    "                                   \"BRANCH_NAME\":\"9999\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"370\",\n" +
                    "                                   \"DATE_REPORTED_NDPD\":\"10 - Oct - 2020\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"SANCTION_DATE\":\"05 - Dec - 2016\",\n" +
                    "                                   \"FACILITY_NATURE_INDICATOR\":\"002\",\n" +
                    "                                   \"CURRENCY\":\"EGP\",\n" +
                    "                                   \"CURRENCY_CODE\":\"EGP\",\n" +
                    "                                   \"SANCTION_AMT\":\"500000\",\n" +
                    "                                   \"LOAN_TERM\":\"60\",\n" +
                    "                                   \"AMT_OF_INSTALMENT\":\"8000\",\n" +
                    "                                   \"REPAYMENT_TYPE\":\"001\",\n" +
                    "                                   \"CF_AMENDMENT_DATE\":\"\",\n" +
                    "                                   \"ACC_STATUS\":\"001\",\n" +
                    "                                   \"CF_SETTLEMENT_DATE\":\"\",\n" +
                    "                                   \"AMT_WRITTEN_OFF\":\"\",\n" +
                    "                                   \"REASON_AMT_WRITTEN_OFF\":\"\",\n" +
                    "                                   \"AMOUNT_FORGIVEN\":\"\",\n" +
                    "                                   \"REASON_AMT_FORGIVEN\":\"\",\n" +
                    "                                   \"DATE_ACC_CLOSE\":\"\",\n" +
                    "                                   \"SPECIAL_COMMENTS\":\"001\",\n" +
                    "                                   \"FIRST_DISBURSE_DATE\":\"10 - Dec - 2016\",\n" +
                    "                                   \"SECURITY_INDICATOR\":\"002\",\n" +
                    "                                   \"LIABILITY_INDICATOR\":\"001\",\n" +
                    "                                   \"NO_OF_INSTALMENTS\":\"\",\n" +
                    "                                   \"LOAN_TYPE\":\"001\",\n" +
                    "                                   \"REPORTED_DATE\":\"20 - Jun - 2019\",\n" +
                    "                                   \"DPDHistory24Months\": [\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"30\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"1000\",\n" +
                    "                                           \"CURRENT_BAL\":\"200000\",\n" +
                    "                                           \"PERIOD_ID\":\"201904\"\n" +
                    "                                        },\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"100\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"6000\",\n" +
                    "                                           \"CURRENT_BAL\":\"200000\",\n" +
                    "                                           \"PERIOD_ID\":\"201906\"\n" +
                    "                                        },\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"0\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"0\",\n" +
                    "                                           \"CURRENT_BAL\":\"200000\",\n" +
                    "                                           \"PERIOD_ID\":\"201903\"\n" +
                    "                                        },\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"60\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"3000\",\n" +
                    "                                           \"CURRENT_BAL\":\"200000\",\n" +
                    "                                           \"PERIOD_ID\":\"201905\"\n" +
                    "                                        }\n" +
                    "                                    ],\n" +
                    "                                   \"LegalActions\": [],\n" +
                    "                                   \"DishonorCheque\": [\n" +
                    "                                        {\n" +
                    "                                           \"ChequeNumber\":\"8757848383\",\n" +
                    "                                           \"Currency\":\"EGP\",\n" +
                    "                                           \"Amount\":\"50000\",\n" +
                    "                                           \"DateDishonored\":\"10 - Nov - 2018\",\n" +
                    "                                           \"ReasonForDishonor\":\"001\",\n" +
                    "                                           \"ReportingDate\":\"20 - Mar - 2019\"\n" +
                    "                                        }\n" +
                    "                                    ],\n" +
                    "                                   \"DisputeRef\": [],\n" +
                    "                                   \"DAYS_DUE\":\"100\",\n" +
                    "                                   \"LAST_AMOUNT_PAID\":\"8000\",\n" +
                    "                                   \"DATE_LATEST_PAY_RECEIVED\":\"01 - May - 2018\",\n" +
                    "                                   \"ASSET_CLASSIFICATION\":\"203\",\n" +
                    "                                   \"HIGHEST_CREDIT\":\"\",\n" +
                    "                                   \"CURRENT_BAL_SV\":\"200000\",\n" +
                    "                                   \"OVER_DUE_AMT\":\"6000\",\n" +
                    "                                   \"AMT_OF_UNEARNED_INT\":\"0\",\n" +
                    "                                   \"NO_OF_INSTALLMENTS_OVERDUE\":\"1\",\n" +
                    "                                   \"DATA_PRDR_NAME\":\"CB13000001\",\n" +
                    "                                   \"BRANCH_NAME\":\"9999\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"100\",\n" +
                    "                                   \"DATE_REPORTED_NDPD\":\"20 - Jun - 2019\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                   \"SANCTION_DATE\":\"06 - Jun - 2017\",\n" +
                    "                                   \"FACILITY_NATURE_INDICATOR\":\"002\",\n" +
                    "                                   \"CURRENCY\":\"EGP\",\n" +
                    "                                   \"CURRENCY_CODE\":\"EGP\",\n" +
                    "                                   \"SANCTION_AMT\":\"400000\",\n" +
                    "                                   \"LOAN_TERM\":\"20\",\n" +
                    "                                   \"AMT_OF_INSTALMENT\":\"10000\",\n" +
                    "                                   \"REPAYMENT_TYPE\":\"001\",\n" +
                    "                                   \"CF_AMENDMENT_DATE\":\"\",\n" +
                    "                                   \"ACC_STATUS\":\"001\",\n" +
                    "                                   \"CF_SETTLEMENT_DATE\":\"\",\n" +
                    "                                   \"AMT_WRITTEN_OFF\":\"\",\n" +
                    "                                   \"REASON_AMT_WRITTEN_OFF\":\"\",\n" +
                    "                                   \"AMOUNT_FORGIVEN\":\"\",\n" +
                    "                                   \"REASON_AMT_FORGIVEN\":\"\",\n" +
                    "                                   \"DATE_ACC_CLOSE\":\"\",\n" +
                    "                                   \"SPECIAL_COMMENTS\":\"\",\n" +
                    "                                   \"FIRST_DISBURSE_DATE\":\"10 - Jun - 2017\",\n" +
                    "                                   \"SECURITY_INDICATOR\":\"001\",\n" +
                    "                                   \"LIABILITY_INDICATOR\":\"001\",\n" +
                    "                                   \"NO_OF_INSTALMENTS\":\"\",\n" +
                    "                                   \"LOAN_TYPE\":\"008\",\n" +
                    "                                   \"REPORTED_DATE\":\"10 - Oct - 2020\",\n" +
                    "                                   \"DPDHistory24Months\": [\n" +
                    "                                        {\n" +
                    "                                           \"MAX_NUM_DAYS_DUE\":\"370\",\n" +
                    "                                           \"OVER_DUE_AMT\":\"2000\",\n" +
                    "                                           \"CURRENT_BAL\":\"270000\",\n" +
                    "                                           \"PERIOD_ID\":\"202010\"\n" +
                    "                                        }\n" +
                    "                                    ],\n" +
                    "                                   \"LegalActions\": [\n" +
                    "                                        {\n" +
                    "                                           \"First_Legal_Action_Date\":\"08 - Aug - 2020\",\n" +
                    "                                           \"MainAction\":\"0011\",\n" +
                    "                                           \"SubAction\":\"0011: 0002\",\n" +
                    "                                           \"LEGAL_STATEMENT_date\":\"08 - Aug - 2020\"\n" +
                    "                                        }\n" +
                    "                                    ],\n" +
                    "                                   \"DishonorCheque\": [],\n" +
                    "                                   \"DisputeRef\": [],\n" +
                    "                                   \"DAYS_DUE\":\"370\",\n" +
                    "                                   \"LAST_AMOUNT_PAID\":\"10000\",\n" +
                    "                                   \"DATE_LATEST_PAY_RECEIVED\":\"14 - Jul - 2018\",\n" +
                    "                                   \"ASSET_CLASSIFICATION\":\"104\",\n" +
                    "                                   \"HIGHEST_CREDIT\":\"\",\n" +
                    "                                   \"CURRENT_BAL_SV\":\"270000\",\n" +
                    "                                   \"OVER_DUE_AMT\":\"2000\",\n" +
                    "                                   \"AMT_OF_UNEARNED_INT\":\"0\",\n" +
                    "                                   \"NO_OF_INSTALLMENTS_OVERDUE\":\"8\",\n" +
                    "                                   \"DATA_PRDR_NAME\":\"CB13000001\",\n" +
                    "                                   \"BRANCH_NAME\":\"9999\",\n" +
                    "                                   \"MAX_NUM_DAYS_DUE\":\"370\",\n" +
                    "                                   \"DATE_REPORTED_NDPD\":\"10 - Oct - 2020\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            }\n" +
                    "        ],\n" +
                    "       \"PDFStream\": null\n" +
                    "    },\n" +
                    "   \"IsNoHit\": false\n" +
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
