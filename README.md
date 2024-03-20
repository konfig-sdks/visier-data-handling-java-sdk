<div align="center">

[![Visit Visier](./header.png)](https://visier.com)

# [Visier](https://visier.com)

Visier APIs for data and job handling

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Visier&serviceName=DataHandling&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>visier-data-handling-java-sdk</artifactId>
  <version>22222222.99201.1200</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:visier-data-handling-java-sdk:22222222.99201.1200"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/visier-data-handling-java-sdk-22222222.99201.1200.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierDataHandling;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataAndJobHandlingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierDataHandling client = new VisierDataHandling(configuration);
    List<Connector> connectors = Arrays.asList(); // A list of objects representing the data connectors to be assigned with credentials.
    try {
      AssignConnectorCredentialsResponseDTO result = client
              .dataAndJobHandling
              .assignConnectorCredential()
              .connectors(connectors)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#assignConnectorCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssignConnectorCredentialsResponseDTO> response = client
              .dataAndJobHandling
              .assignConnectorCredential()
              .connectors(connectors)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#assignConnectorCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://vanity.api.visier.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataAndJobHandlingApi* | [**assignConnectorCredential**](docs/DataAndJobHandlingApi.md#assignConnectorCredential) | **POST** /v1/op/data-connectors/assignCredentials | Assign connector credentials to data connectors
*DataAndJobHandlingApi* | [**cancelJobs**](docs/DataAndJobHandlingApi.md#cancelJobs) | **POST** /v1/op/jobs/cancel | Cancel a list of jobs
*DataAndJobHandlingApi* | [**createConnectorCredential**](docs/DataAndJobHandlingApi.md#createConnectorCredential) | **POST** /v1/op/data-connector-credentials | Create a connector credential
*DataAndJobHandlingApi* | [**dataConnectorCredentials**](docs/DataAndJobHandlingApi.md#dataConnectorCredentials) | **GET** /v1/op/data-connector-credentials | Retrieve a list of all data connector credentials
*DataAndJobHandlingApi* | [**dataConnectors**](docs/DataAndJobHandlingApi.md#dataConnectors) | **GET** /v1/op/data-connectors | Retrieve a list of all data connectors
*DataAndJobHandlingApi* | [**deleteConnectorCredential**](docs/DataAndJobHandlingApi.md#deleteConnectorCredential) | **DELETE** /v1/op/data-connector-credentials/:id | Delete a connector credential
*DataAndJobHandlingApi* | [**disableDV**](docs/DataAndJobHandlingApi.md#disableDV) | **PUT** /v1/op/data-versions/disable | Disable data versions for a list of analytic tenants
*DataAndJobHandlingApi* | [**dispatchingJobStatus**](docs/DataAndJobHandlingApi.md#dispatchingJobStatus) | **GET** /v1/op/jobs/dispatching-jobs/:jobId | Retrieve a dispatching job&#39;s status
*DataAndJobHandlingApi* | [**excludeDataUplaods**](docs/DataAndJobHandlingApi.md#excludeDataUplaods) | **PUT** /v1/op/data/uploads/exclude | Exclude data uploads
*DataAndJobHandlingApi* | [**extractionJobAndStatus**](docs/DataAndJobHandlingApi.md#extractionJobAndStatus) | **GET** /v1/op/jobs/dispatching-jobs/:jobId/extraction-jobs | Retrieve a dispatching job&#39;s extraction jobs with their statuses
*DataAndJobHandlingApi* | [**includeDataUploads**](docs/DataAndJobHandlingApi.md#includeDataUploads) | **PUT** /v1/op/data/uploads/include | Include data uploads
*DataAndJobHandlingApi* | [**jobIdStatus**](docs/DataAndJobHandlingApi.md#jobIdStatus) | **GET** /v1/op/job-status/jobs/:jobId | Retrieve a specific job&#39;s status
*DataAndJobHandlingApi* | [**jobStatus**](docs/DataAndJobHandlingApi.md#jobStatus) | **GET** /v1/op/job-status/jobs | Retrieve the statuses of all jobs
*DataAndJobHandlingApi* | [**latestEnabledDV**](docs/DataAndJobHandlingApi.md#latestEnabledDV) | **GET** /v1/op/data-versions | Retrieve the latest enabled data versions for all analytic tenants
*DataAndJobHandlingApi* | [**processingJobAndStatus**](docs/DataAndJobHandlingApi.md#processingJobAndStatus) | **GET** /v1/op/jobs/dispatching-jobs/:jobId/processing-jobs | Retrieve a dispatching job&#39;s processing jobs with their statuses
*DataAndJobHandlingApi* | [**processingJobStatus**](docs/DataAndJobHandlingApi.md#processingJobStatus) | **GET** /v1/op/jobs/processing-jobs/:receivingJobId | Retrieve processing job statuses by receiving job ID
*DataAndJobHandlingApi* | [**receivingJobAndStatus**](docs/DataAndJobHandlingApi.md#receivingJobAndStatus) | **GET** /v1/op/jobs/dispatching-jobs/:jobId/receiving-jobs | Retrieve a dispatching job&#39;s receiving jobs with their statuses
*DataAndJobHandlingApi* | [**receivingJobStatus**](docs/DataAndJobHandlingApi.md#receivingJobStatus) | **GET** /v1/op/jobs/receiving-jobs/:receivingJobId | Retrieve a receiving job&#39;s status
*DataAndJobHandlingApi* | [**retrieveDataUploads**](docs/DataAndJobHandlingApi.md#retrieveDataUploads) | **GET** /v1/op/data/uploads | Retrieve data uploads
*DataAndJobHandlingApi* | [**startExtraction**](docs/DataAndJobHandlingApi.md#startExtraction) | **POST** /v1/op/data/startExtractAndLoad | Trigger extraction jobs
*DataAndJobHandlingApi* | [**startLoad**](docs/DataAndJobHandlingApi.md#startLoad) | **POST** /v1/op/data/startload | Start the data load for an analytic tenant


## Documentation for Models

 - [AdpAuthParamsDTO](docs/AdpAuthParamsDTO.md)
 - [AssignConnectorCredentialRequest](docs/AssignConnectorCredentialRequest.md)
 - [AssignConnectorCredentialsByTenantResponseDTO](docs/AssignConnectorCredentialsByTenantResponseDTO.md)
 - [AssignConnectorCredentialsResponseDTO](docs/AssignConnectorCredentialsResponseDTO.md)
 - [AssignConnectorWithCredentialsResponseDTO](docs/AssignConnectorWithCredentialsResponseDTO.md)
 - [AssignedCredentialInfoResponseDTO](docs/AssignedCredentialInfoResponseDTO.md)
 - [BambooAuthParamsDTO](docs/BambooAuthParamsDTO.md)
 - [BasicS3AuthParamsDTO](docs/BasicS3AuthParamsDTO.md)
 - [BigQueryAuthParamsDTO](docs/BigQueryAuthParamsDTO.md)
 - [BigQueryServiceAccountParamsDTO](docs/BigQueryServiceAccountParamsDTO.md)
 - [CancelJobBatchFromJobIdDTO](docs/CancelJobBatchFromJobIdDTO.md)
 - [Connector](docs/Connector.md)
 - [ConnectorInfoResponseDTO](docs/ConnectorInfoResponseDTO.md)
 - [CopyS3AuthParamsDTO](docs/CopyS3AuthParamsDTO.md)
 - [CredentialCreationAPIResponseDTO](docs/CredentialCreationAPIResponseDTO.md)
 - [DataLoadRequest](docs/DataLoadRequest.md)
 - [DataLoadResponse](docs/DataLoadResponse.md)
 - [DataProviderAuthInformationDTO](docs/DataProviderAuthInformationDTO.md)
 - [DataProviderAuthParamsDTO](docs/DataProviderAuthParamsDTO.md)
 - [DataProviderBasicInformationDTO](docs/DataProviderBasicInformationDTO.md)
 - [DataProviderBasicMetadataDTO](docs/DataProviderBasicMetadataDTO.md)
 - [DataVersionAndDateDTO](docs/DataVersionAndDateDTO.md)
 - [DataVersionObject](docs/DataVersionObject.md)
 - [DayforceV2AuthParamsDTO](docs/DayforceV2AuthParamsDTO.md)
 - [DimensionsAuthParamsDTO](docs/DimensionsAuthParamsDTO.md)
 - [DisableDVModel](docs/DisableDVModel.md)
 - [DisableDVRequest](docs/DisableDVRequest.md)
 - [DisableDVResponse](docs/DisableDVResponse.md)
 - [DispatchingJobStatusResponse](docs/DispatchingJobStatusResponse.md)
 - [ExcludeDataUploadsRequest](docs/ExcludeDataUploadsRequest.md)
 - [ExtractionJob](docs/ExtractionJob.md)
 - [ExtractionJobAndStatusResponse](docs/ExtractionJobAndStatusResponse.md)
 - [ExtractorCredentialAPIDTO](docs/ExtractorCredentialAPIDTO.md)
 - [ExtractorCredentialsAPIDTO](docs/ExtractorCredentialsAPIDTO.md)
 - [FusionAuthParamsDTO](docs/FusionAuthParamsDTO.md)
 - [GongAuthParamsDTO](docs/GongAuthParamsDTO.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [GoogleSheetsAuthParamsDTO](docs/GoogleSheetsAuthParamsDTO.md)
 - [GoogleWorkspaceAuthParamsDTO](docs/GoogleWorkspaceAuthParamsDTO.md)
 - [GreenhouseAuthParamsDTO](docs/GreenhouseAuthParamsDTO.md)
 - [IcimsAuthParamsDTO](docs/IcimsAuthParamsDTO.md)
 - [ImportDefinitionAPIDTO](docs/ImportDefinitionAPIDTO.md)
 - [ImportDefinitionsAPIDTO](docs/ImportDefinitionsAPIDTO.md)
 - [IncludeDataUploadsRequest](docs/IncludeDataUploadsRequest.md)
 - [InternalS3AuthParamsDTO](docs/InternalS3AuthParamsDTO.md)
 - [JdbcAuthParamsDTO](docs/JdbcAuthParamsDTO.md)
 - [JiraAuthParamsDTO](docs/JiraAuthParamsDTO.md)
 - [JiraConnectParamsDTO](docs/JiraConnectParamsDTO.md)
 - [JobCancellationResultDTO](docs/JobCancellationResultDTO.md)
 - [JobCancellationResultsDTO](docs/JobCancellationResultsDTO.md)
 - [LeverAuthParamsDTO](docs/LeverAuthParamsDTO.md)
 - [MapValue](docs/MapValue.md)
 - [MedalliaAuthParamsDTO](docs/MedalliaAuthParamsDTO.md)
 - [Microsoft365AuthParamsDTO](docs/Microsoft365AuthParamsDTO.md)
 - [MultipleTenantDataVersionsDetailsDTO](docs/MultipleTenantDataVersionsDetailsDTO.md)
 - [MultipleTenantDataVersionsListDTO](docs/MultipleTenantDataVersionsListDTO.md)
 - [MySqlAuthParamsDTO](docs/MySqlAuthParamsDTO.md)
 - [NamelyAuthParamsDTO](docs/NamelyAuthParamsDTO.md)
 - [OracleDbAuthParamsDTO](docs/OracleDbAuthParamsDTO.md)
 - [ProcessingJob](docs/ProcessingJob.md)
 - [ProcessingJobAndStatusResponse](docs/ProcessingJobAndStatusResponse.md)
 - [ProcessingJobStatusResponse](docs/ProcessingJobStatusResponse.md)
 - [QualtricsAuthParamsDTO](docs/QualtricsAuthParamsDTO.md)
 - [ReceivingJob](docs/ReceivingJob.md)
 - [ReceivingJobAndStatusResponse](docs/ReceivingJobAndStatusResponse.md)
 - [ReceivingJobStatusResponse](docs/ReceivingJobStatusResponse.md)
 - [RedshiftAuthParamsDTO](docs/RedshiftAuthParamsDTO.md)
 - [Result](docs/Result.md)
 - [SalesforceAuthParamsDTO](docs/SalesforceAuthParamsDTO.md)
 - [SalesforceV2AuthParamsDTO](docs/SalesforceV2AuthParamsDTO.md)
 - [ServiceNowAuthParamsDTO](docs/ServiceNowAuthParamsDTO.md)
 - [SlackAuthParamsDTO](docs/SlackAuthParamsDTO.md)
 - [SnowflakeAuthParamsDTO](docs/SnowflakeAuthParamsDTO.md)
 - [SqlServerAuthParamsDTO](docs/SqlServerAuthParamsDTO.md)
 - [StartExtractionModel](docs/StartExtractionModel.md)
 - [StartExtractionRequest](docs/StartExtractionRequest.md)
 - [StartExtractionResponse](docs/StartExtractionResponse.md)
 - [Status](docs/Status.md)
 - [SubjectMissingAccessDTO](docs/SubjectMissingAccessDTO.md)
 - [SuccessFactorsAuthParamsDTO](docs/SuccessFactorsAuthParamsDTO.md)
 - [TenantAndCredential](docs/TenantAndCredential.md)
 - [TenantDataUploadStatusResponseDTO](docs/TenantDataUploadStatusResponseDTO.md)
 - [TenantDataUploadUpdateStatusResponseDTO](docs/TenantDataUploadUpdateStatusResponseDTO.md)
 - [TenantDataUploadsListResponseDTO](docs/TenantDataUploadsListResponseDTO.md)
 - [TenantDataUploadsResponseDTO](docs/TenantDataUploadsResponseDTO.md)
 - [TenantDataUploadsUpdateResponseDTO](docs/TenantDataUploadsUpdateResponseDTO.md)
 - [UltimateAuthParamsDTO](docs/UltimateAuthParamsDTO.md)
 - [UploadToExclude](docs/UploadToExclude.md)
 - [UploadToExcludeModel](docs/UploadToExcludeModel.md)
 - [UploadToInclude](docs/UploadToInclude.md)
 - [UploadToIncludeModel](docs/UploadToIncludeModel.md)
 - [WillowAuthParamsDTO](docs/WillowAuthParamsDTO.md)
 - [WorkdayAuthParamsDTO](docs/WorkdayAuthParamsDTO.md)
 - [WorkdayRaasAuthParamsDTO](docs/WorkdayRaasAuthParamsDTO.md)
 - [ZoomAuthParamsDTO](docs/ZoomAuthParamsDTO.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
