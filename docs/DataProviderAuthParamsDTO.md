

# DataProviderAuthParamsDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantDomainName** | **String** |  |  [optional] |
|**provider** | [**ProviderEnum**](#ProviderEnum) | The data provider associated with the credential.  - Valid values: UKG, Dimensions, Workday, Redshift, BasicS3, CopyS3, SqlServer, Snowflake |  [optional] |
|**bambooAuthParams** | [**BambooAuthParamsDTO**](BambooAuthParamsDTO.md) |  |  [optional] |
|**greenhouseAuthParams** | [**GreenhouseAuthParamsDTO**](GreenhouseAuthParamsDTO.md) |  |  [optional] |
|**googleSheetsAuthParams** | [**GoogleSheetsAuthParamsDTO**](GoogleSheetsAuthParamsDTO.md) |  |  [optional] |
|**jiraAuthParams** | [**JiraAuthParamsDTO**](JiraAuthParamsDTO.md) |  |  [optional] |
|**leverAuthParams** | [**LeverAuthParamsDTO**](LeverAuthParamsDTO.md) |  |  [optional] |
|**namelyAuthParams** | [**NamelyAuthParamsDTO**](NamelyAuthParamsDTO.md) |  |  [optional] |
|**qualtricsAuthParams** | [**QualtricsAuthParamsDTO**](QualtricsAuthParamsDTO.md) |  |  [optional] |
|**salesforceAuthParams** | [**SalesforceAuthParamsDTO**](SalesforceAuthParamsDTO.md) |  |  [optional] |
|**ultimateAuthParams** | [**UltimateAuthParamsDTO**](UltimateAuthParamsDTO.md) |  |  [optional] |
|**workdayAuthParams** | [**WorkdayAuthParamsDTO**](WorkdayAuthParamsDTO.md) |  |  [optional] |
|**icimsAuthParams** | [**IcimsAuthParamsDTO**](IcimsAuthParamsDTO.md) |  |  [optional] |
|**serviceNowAuthParams** | [**ServiceNowAuthParamsDTO**](ServiceNowAuthParamsDTO.md) |  |  [optional] |
|**jdbcAuthParams** | [**JdbcAuthParamsDTO**](JdbcAuthParamsDTO.md) |  |  [optional] |
|**s3AuthParams** | [**BasicS3AuthParamsDTO**](BasicS3AuthParamsDTO.md) |  |  [optional] |
|**internalS3AuthParams** | [**InternalS3AuthParamsDTO**](InternalS3AuthParamsDTO.md) |  |  [optional] |
|**copyS3AuthParams** | [**CopyS3AuthParamsDTO**](CopyS3AuthParamsDTO.md) |  |  [optional] |
|**redshiftAuthParams** | [**RedshiftAuthParamsDTO**](RedshiftAuthParamsDTO.md) |  |  [optional] |
|**snowflakeAuthParams** | [**SnowflakeAuthParamsDTO**](SnowflakeAuthParamsDTO.md) |  |  [optional] |
|**bigQueryAuthParams** | [**BigQueryAuthParamsDTO**](BigQueryAuthParamsDTO.md) |  |  [optional] |
|**sqlServerAuthParams** | [**SqlServerAuthParamsDTO**](SqlServerAuthParamsDTO.md) |  |  [optional] |
|**dimensionsAuthParams** | [**DimensionsAuthParamsDTO**](DimensionsAuthParamsDTO.md) |  |  [optional] |
|**willowAuthParams** | [**WillowAuthParamsDTO**](WillowAuthParamsDTO.md) |  |  [optional] |
|**emptyAuthParams** | **Object** |  |  [optional] |
|**successFactorsAuthParams** | [**SuccessFactorsAuthParamsDTO**](SuccessFactorsAuthParamsDTO.md) |  |  [optional] |
|**fusionAuthParams** | [**FusionAuthParamsDTO**](FusionAuthParamsDTO.md) |  |  [optional] |
|**adpAuthParams** | [**AdpAuthParamsDTO**](AdpAuthParamsDTO.md) |  |  [optional] |
|**medalliaAuthParams** | [**MedalliaAuthParamsDTO**](MedalliaAuthParamsDTO.md) |  |  [optional] |
|**salesforceV2AuthParams** | [**SalesforceV2AuthParamsDTO**](SalesforceV2AuthParamsDTO.md) |  |  [optional] |
|**gongAuthParams** | [**GongAuthParamsDTO**](GongAuthParamsDTO.md) |  |  [optional] |
|**zoomAuthParams** | [**ZoomAuthParamsDTO**](ZoomAuthParamsDTO.md) |  |  [optional] |
|**dayforceV2AuthParams** | [**DayforceV2AuthParamsDTO**](DayforceV2AuthParamsDTO.md) |  |  [optional] |
|**slackAuthParams** | [**SlackAuthParamsDTO**](SlackAuthParamsDTO.md) |  |  [optional] |
|**mySqlAuthParams** | [**MySqlAuthParamsDTO**](MySqlAuthParamsDTO.md) |  |  [optional] |
|**workdayRaasAuthParams** | [**WorkdayRaasAuthParamsDTO**](WorkdayRaasAuthParamsDTO.md) |  |  [optional] |
|**ms365AuthParams** | [**Microsoft365AuthParamsDTO**](Microsoft365AuthParamsDTO.md) |  |  [optional] |
|**googleWorkspaceAuthParams** | [**GoogleWorkspaceAuthParamsDTO**](GoogleWorkspaceAuthParamsDTO.md) |  |  [optional] |
|**oracleDbAuthParams** | [**OracleDbAuthParamsDTO**](OracleDbAuthParamsDTO.md) |  |  [optional] |
|**hasUpdates** | **Boolean** |  |  [optional] |
|**authContext** | [**AuthContextEnum**](#AuthContextEnum) |  |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| BAMBOO | &quot;Bamboo&quot; |
| GOOGLESHEETS | &quot;GoogleSheets&quot; |
| GREENHOUSE | &quot;Greenhouse&quot; |
| JIRA | &quot;Jira&quot; |
| LEVER | &quot;Lever&quot; |
| NAMELY | &quot;Namely&quot; |
| QUALTRICS | &quot;Qualtrics&quot; |
| SALESFORCE | &quot;Salesforce&quot; |
| UKG | &quot;UKG&quot; |
| WORKDAY | &quot;Workday&quot; |
| ICIMS | &quot;Icims&quot; |
| SERVICENOW | &quot;ServiceNow&quot; |
| JDBC | &quot;Jdbc&quot; |
| BASICS3 | &quot;BasicS3&quot; |
| INTERNALS3 | &quot;InternalS3&quot; |
| COPYS3 | &quot;CopyS3&quot; |
| REDSHIFT | &quot;Redshift&quot; |
| SNOWFLAKE | &quot;Snowflake&quot; |
| BIGQUERY | &quot;BigQuery&quot; |
| SQLSERVER | &quot;SqlServer&quot; |
| DIMENSIONS | &quot;Dimensions&quot; |
| ICIMSPARTNERPROVIDERREDSHIFT | &quot;IcimsPartnerProviderRedshift&quot; |
| WILLOW | &quot;Willow&quot; |
| SUCCESSFACTORS | &quot;SuccessFactors&quot; |
| ICIMSV2 | &quot;IcimsV2&quot; |
| ADP | &quot;ADP&quot; |
| WORKDAYV2 | &quot;WorkdayV2&quot; |
| SERVICENOWV2 | &quot;ServiceNowV2&quot; |
| MEDALLIA | &quot;Medallia&quot; |
| FUSION | &quot;Fusion&quot; |
| SALESFORCEV2 | &quot;SalesforceV2&quot; |
| GONG | &quot;Gong&quot; |
| ZOOM | &quot;Zoom&quot; |
| GOOGLECALENDAR | &quot;GoogleCalendar&quot; |
| UKGV2 | &quot;UKGV2&quot; |
| DAYFORCEV2 | &quot;DayforceV2&quot; |
| GOOGLEACTIVITYREPORT | &quot;GoogleActivityReport&quot; |
| SLACK | &quot;Slack&quot; |
| MYSQL | &quot;MySql&quot; |
| WORKDAYRAAS | &quot;WorkdayRaas&quot; |
| MICROSOFT365 | &quot;Microsoft365&quot; |
| GOOGLEWORKSPACE | &quot;GoogleWorkspace&quot; |
| ORACLEDB | &quot;OracleDb&quot; |
| SMARTRECRUITERS | &quot;SmartRecruiters&quot; |



## Enum: AuthContextEnum

| Name | Value |
|---- | -----|
| DEFAULTDATAEXTRACTION | &quot;DefaultDataExtraction&quot; |
| WORKPLACEDYNAMICSDATAEXTRACTION | &quot;WorkplaceDynamicsDataExtraction&quot; |
| NOTIFICATION | &quot;Notification&quot; |



