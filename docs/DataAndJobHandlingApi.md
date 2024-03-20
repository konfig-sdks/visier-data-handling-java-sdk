# DataAndJobHandlingApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignConnectorCredential**](DataAndJobHandlingApi.md#assignConnectorCredential) | **POST** /v1/op/data-connectors/assignCredentials | Assign connector credentials to data connectors |
| [**cancelJobs**](DataAndJobHandlingApi.md#cancelJobs) | **POST** /v1/op/jobs/cancel | Cancel a list of jobs |
| [**createConnectorCredential**](DataAndJobHandlingApi.md#createConnectorCredential) | **POST** /v1/op/data-connector-credentials | Create a connector credential |
| [**dataConnectorCredentials**](DataAndJobHandlingApi.md#dataConnectorCredentials) | **GET** /v1/op/data-connector-credentials | Retrieve a list of all data connector credentials |
| [**dataConnectors**](DataAndJobHandlingApi.md#dataConnectors) | **GET** /v1/op/data-connectors | Retrieve a list of all data connectors |
| [**deleteConnectorCredential**](DataAndJobHandlingApi.md#deleteConnectorCredential) | **DELETE** /v1/op/data-connector-credentials/:id | Delete a connector credential |
| [**disableDV**](DataAndJobHandlingApi.md#disableDV) | **PUT** /v1/op/data-versions/disable | Disable data versions for a list of analytic tenants |
| [**dispatchingJobStatus**](DataAndJobHandlingApi.md#dispatchingJobStatus) | **GET** /v1/op/jobs/dispatching-jobs/:jobId | Retrieve a dispatching job&#39;s status |
| [**excludeDataUplaods**](DataAndJobHandlingApi.md#excludeDataUplaods) | **PUT** /v1/op/data/uploads/exclude | Exclude data uploads |
| [**extractionJobAndStatus**](DataAndJobHandlingApi.md#extractionJobAndStatus) | **GET** /v1/op/jobs/dispatching-jobs/:jobId/extraction-jobs | Retrieve a dispatching job&#39;s extraction jobs with their statuses |
| [**includeDataUploads**](DataAndJobHandlingApi.md#includeDataUploads) | **PUT** /v1/op/data/uploads/include | Include data uploads |
| [**jobIdStatus**](DataAndJobHandlingApi.md#jobIdStatus) | **GET** /v1/op/job-status/jobs/:jobId | Retrieve a specific job&#39;s status |
| [**jobStatus**](DataAndJobHandlingApi.md#jobStatus) | **GET** /v1/op/job-status/jobs | Retrieve the statuses of all jobs |
| [**latestEnabledDV**](DataAndJobHandlingApi.md#latestEnabledDV) | **GET** /v1/op/data-versions | Retrieve the latest enabled data versions for all analytic tenants |
| [**processingJobAndStatus**](DataAndJobHandlingApi.md#processingJobAndStatus) | **GET** /v1/op/jobs/dispatching-jobs/:jobId/processing-jobs | Retrieve a dispatching job&#39;s processing jobs with their statuses |
| [**processingJobStatus**](DataAndJobHandlingApi.md#processingJobStatus) | **GET** /v1/op/jobs/processing-jobs/:receivingJobId | Retrieve processing job statuses by receiving job ID |
| [**receivingJobAndStatus**](DataAndJobHandlingApi.md#receivingJobAndStatus) | **GET** /v1/op/jobs/dispatching-jobs/:jobId/receiving-jobs | Retrieve a dispatching job&#39;s receiving jobs with their statuses |
| [**receivingJobStatus**](DataAndJobHandlingApi.md#receivingJobStatus) | **GET** /v1/op/jobs/receiving-jobs/:receivingJobId | Retrieve a receiving job&#39;s status |
| [**retrieveDataUploads**](DataAndJobHandlingApi.md#retrieveDataUploads) | **GET** /v1/op/data/uploads | Retrieve data uploads |
| [**startExtraction**](DataAndJobHandlingApi.md#startExtraction) | **POST** /v1/op/data/startExtractAndLoad | Trigger extraction jobs |
| [**startLoad**](DataAndJobHandlingApi.md#startLoad) | **POST** /v1/op/data/startload | Start the data load for an analytic tenant |


<a name="assignConnectorCredential"></a>
# **assignConnectorCredential**
> AssignConnectorCredentialsResponseDTO assignConnectorCredential(assignConnectorCredentialRequest).execute();

Assign connector credentials to data connectors

This API allows you to assign a connector credential to a data connector.

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assignConnectorCredentialRequest** | [**AssignConnectorCredentialRequest**](AssignConnectorCredentialRequest.md)|  | |

### Return type

[**AssignConnectorCredentialsResponseDTO**](AssignConnectorCredentialsResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="cancelJobs"></a>
# **cancelJobs**
> JobCancellationResultsDTO cancelJobs(cancelJobBatchFromJobIdDTO).execute();

Cancel a list of jobs

Use this API to cancel a list of processing jobs, upload jobs, receiving jobs, and extraction jobs.   Note: Receiving jobs with the Running status cannot be cancelled.

### Example
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
    List<String> jobIds = Arrays.asList(); // A list of jobs to cancel. The maximum number of jobs that can be cancelled is 500.
    try {
      JobCancellationResultsDTO result = client
              .dataAndJobHandling
              .cancelJobs()
              .jobIds(jobIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobCancellationResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#cancelJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobCancellationResultsDTO> response = client
              .dataAndJobHandling
              .cancelJobs()
              .jobIds(jobIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#cancelJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cancelJobBatchFromJobIdDTO** | [**CancelJobBatchFromJobIdDTO**](CancelJobBatchFromJobIdDTO.md)|  | |

### Return type

[**JobCancellationResultsDTO**](JobCancellationResultsDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="createConnectorCredential"></a>
# **createConnectorCredential**
> CredentialCreationAPIResponseDTO createConnectorCredential(dataProviderAuthInformationDTO).tenantCode(tenantCode).execute();

Create a connector credential

Use this API to create connector credentials for a specified tenant. Connector credentials allow Visier to  retrieve data from your source systems through an integration user in the source system.

### Example
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
    DataProviderAuthParamsDTO dataProviderAuthParams = new DataProviderAuthParamsDTO(); // The authentication information for the credential.
    DataProviderBasicInformationDTO dataProviderBasicInformation = new DataProviderBasicInformationDTO(); // The display name and description for the credential.
    DataProviderBasicMetadataDTO dataProviderMetadata = new DataProviderBasicMetadataDTO();
    String tenantCode = "tenantCode_example"; // The tenant code of a specific analytic tenant that you want to create the credential for.
    try {
      CredentialCreationAPIResponseDTO result = client
              .dataAndJobHandling
              .createConnectorCredential()
              .dataProviderAuthParams(dataProviderAuthParams)
              .dataProviderBasicInformation(dataProviderBasicInformation)
              .dataProviderMetadata(dataProviderMetadata)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getSymbolName());
      System.out.println(result.getObjectName());
      System.out.println(result.getMissingConnectionProperties());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#createConnectorCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CredentialCreationAPIResponseDTO> response = client
              .dataAndJobHandling
              .createConnectorCredential()
              .dataProviderAuthParams(dataProviderAuthParams)
              .dataProviderBasicInformation(dataProviderBasicInformation)
              .dataProviderMetadata(dataProviderMetadata)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#createConnectorCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dataProviderAuthInformationDTO** | [**DataProviderAuthInformationDTO**](DataProviderAuthInformationDTO.md)|  | |
| **tenantCode** | **String**| The tenant code of a specific analytic tenant that you want to create the credential for. | [optional] |

### Return type

[**CredentialCreationAPIResponseDTO**](CredentialCreationAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="dataConnectorCredentials"></a>
# **dataConnectorCredentials**
> ExtractorCredentialsAPIDTO dataConnectorCredentials().tenantCode(tenantCode).limit(limit).start(start).execute();

Retrieve a list of all data connector credentials

Use this API to retrieve a list of the connector credentials in a specified tenant. Connector credentials allow  Visier to retrieve data from your source systems through an integration user in the source system.

### Example
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
    String tenantCode = "tenantCode_example"; // The tenant code of a specific analytic tenant that you want to retrieve for.
    Integer limit = 56; // The limit to retrieve.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    try {
      ExtractorCredentialsAPIDTO result = client
              .dataAndJobHandling
              .dataConnectorCredentials()
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getConnectorCredentials());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#dataConnectorCredentials");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExtractorCredentialsAPIDTO> response = client
              .dataAndJobHandling
              .dataConnectorCredentials()
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#dataConnectorCredentials");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| The tenant code of a specific analytic tenant that you want to retrieve for. | [optional] |
| **limit** | **Integer**| The limit to retrieve. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |

### Return type

[**ExtractorCredentialsAPIDTO**](ExtractorCredentialsAPIDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="dataConnectors"></a>
# **dataConnectors**
> ImportDefinitionsAPIDTO dataConnectors().tenantCode(tenantCode).limit(limit).start(start).execute();

Retrieve a list of all data connectors

Use this API to retrieve a list of the data connectors in a specified tenant. Data connectors are an alternative  to generating flat files and transferring them to Visier via SFTP.

### Example
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
    String tenantCode = "tenantCode_example"; // The tenant code of a specific analytic tenant that you want to retrieve for.
    Integer limit = 56; // The limit to retrieve.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    try {
      ImportDefinitionsAPIDTO result = client
              .dataAndJobHandling
              .dataConnectors()
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getDataConnectors());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#dataConnectors");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImportDefinitionsAPIDTO> response = client
              .dataAndJobHandling
              .dataConnectors()
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#dataConnectors");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| The tenant code of a specific analytic tenant that you want to retrieve for. | [optional] |
| **limit** | **Integer**| The limit to retrieve. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |

### Return type

[**ImportDefinitionsAPIDTO**](ImportDefinitionsAPIDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="deleteConnectorCredential"></a>
# **deleteConnectorCredential**
> String deleteConnectorCredential().id(id).tenantCode(tenantCode).execute();

Delete a connector credential

Use this API to delete connector credentials from your tenants. Credentials that are no longer valid  should be deleted.

### Example
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
    String id = "id_example"; // The credentialId of the credential you want to delete.
    String tenantCode = "tenantCode_example"; // The tenant code of the analytic tenant in which the credential you're deleting.
    try {
      String result = client
              .dataAndJobHandling
              .deleteConnectorCredential()
              .id(id)
              .tenantCode(tenantCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#deleteConnectorCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .dataAndJobHandling
              .deleteConnectorCredential()
              .id(id)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#deleteConnectorCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The credentialId of the credential you want to delete. | [optional] |
| **tenantCode** | **String**| The tenant code of the analytic tenant in which the credential you&#39;re deleting. | [optional] |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="disableDV"></a>
# **disableDV**
> DisableDVResponse disableDV(disableDVRequest).execute();

Disable data versions for a list of analytic tenants

If you discover that a data version is not what is expected after running metric value validation on a data load,  you may want to disable the data version for that processing job.   Use this API to disable the latest enabled data versions for affected analytic tenants or to disable a particular  data version for each analytic tenant.   Note: Disabling an older data version may not have an effect on the state of the solution.

### Example
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
    DisableDVModel model = new DisableDVModel(); // A form body key that contains a collection of key-value pairs.
    try {
      DisableDVResponse result = client
              .dataAndJobHandling
              .disableDV()
              .model(model)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalFailures());
      System.out.println(result.getTotalSuccess());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#disableDV");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DisableDVResponse> response = client
              .dataAndJobHandling
              .disableDV()
              .model(model)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#disableDV");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **disableDVRequest** | [**DisableDVRequest**](DisableDVRequest.md)|  | |

### Return type

[**DisableDVResponse**](DisableDVResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="dispatchingJobStatus"></a>
# **dispatchingJobStatus**
> DispatchingJobStatusResponse dispatchingJobStatus().jobId(jobId).execute();

Retrieve a dispatching job&#39;s status

Use this API to retrieve the status of a dispatching job, including its job ID and the number of jobs it generated.

### Example
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
    String jobId = "jobId_example"; // The ID of the job you want to retrieve.
    try {
      DispatchingJobStatusResponse result = client
              .dataAndJobHandling
              .dispatchingJobStatus()
              .jobId(jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
      System.out.println(result.getTenantCode());
      System.out.println(result.getStatus());
      System.out.println(result.getTotalJobsDispatched());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#dispatchingJobStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DispatchingJobStatusResponse> response = client
              .dataAndJobHandling
              .dispatchingJobStatus()
              .jobId(jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#dispatchingJobStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The ID of the job you want to retrieve. | [optional] |

### Return type

[**DispatchingJobStatusResponse**](DispatchingJobStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="excludeDataUplaods"></a>
# **excludeDataUplaods**
> TenantDataUploadsUpdateResponseDTO excludeDataUplaods(excludeDataUploadsRequest).execute();

Exclude data uploads

Use this API to exclude either a specified list of data uploads or all data uploads for each analytic tenant.

### Example
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
    UploadToExcludeModel model = new UploadToExcludeModel(); // A form body key that contains a collection of key-value pairs.
    try {
      TenantDataUploadsUpdateResponseDTO result = client
              .dataAndJobHandling
              .excludeDataUplaods()
              .model(model)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalFailures());
      System.out.println(result.getTotalSuccess());
      System.out.println(result.getUploads());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#excludeDataUplaods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantDataUploadsUpdateResponseDTO> response = client
              .dataAndJobHandling
              .excludeDataUplaods()
              .model(model)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#excludeDataUplaods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **excludeDataUploadsRequest** | [**ExcludeDataUploadsRequest**](ExcludeDataUploadsRequest.md)|  | |

### Return type

[**TenantDataUploadsUpdateResponseDTO**](TenantDataUploadsUpdateResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="extractionJobAndStatus"></a>
# **extractionJobAndStatus**
> ExtractionJobAndStatusResponse extractionJobAndStatus().dispatchingJobId(dispatchingJobId).tenantCode(tenantCode).limit(limit).start(start).jobId(jobId).execute();

Retrieve a dispatching job&#39;s extraction jobs with their statuses

Use this API to retrieve the statuses of extraction jobs associated with a dispatching job. The dispatching job  is a \&quot;parent\&quot; to extraction jobs, which retrieve data from your source systems through data connectors.

### Example
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
    String dispatchingJobId = "dispatchingJobId_example"; // The ID of the dispatching job that generated the extraction jobs.
    String tenantCode = "tenantCode_example"; // The tenant code of a specific analytic tenant that you want to retrieve the extraction job status for.  Use this if you are only interested in the results for one analytic tenant.
    Integer limit = 56; // The limit of extraction job statuses to retrieve.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    String jobId = "jobId_example"; // The ID of the dispatching job you want to retrieve.
    try {
      ExtractionJobAndStatusResponse result = client
              .dataAndJobHandling
              .extractionJobAndStatus()
              .dispatchingJobId(dispatchingJobId)
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .jobId(jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getParentJobId());
      System.out.println(result.getParentTenantCode());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
      System.out.println(result.getExtractionJobs());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#extractionJobAndStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExtractionJobAndStatusResponse> response = client
              .dataAndJobHandling
              .extractionJobAndStatus()
              .dispatchingJobId(dispatchingJobId)
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .jobId(jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#extractionJobAndStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dispatchingJobId** | **String**| The ID of the dispatching job that generated the extraction jobs. | [optional] |
| **tenantCode** | **String**| The tenant code of a specific analytic tenant that you want to retrieve the extraction job status for.  Use this if you are only interested in the results for one analytic tenant. | [optional] |
| **limit** | **Integer**| The limit of extraction job statuses to retrieve. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |
| **jobId** | **String**| The ID of the dispatching job you want to retrieve. | [optional] |

### Return type

[**ExtractionJobAndStatusResponse**](ExtractionJobAndStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="includeDataUploads"></a>
# **includeDataUploads**
> TenantDataUploadsUpdateResponseDTO includeDataUploads(includeDataUploadsRequest).execute();

Include data uploads

Use this API to include either the specified list of data uploads or all data uploads for each analytic tenant.

### Example
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
    UploadToIncludeModel model = new UploadToIncludeModel(); // A form body key that contains a collection of key-value pairs.
    try {
      TenantDataUploadsUpdateResponseDTO result = client
              .dataAndJobHandling
              .includeDataUploads()
              .model(model)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalFailures());
      System.out.println(result.getTotalSuccess());
      System.out.println(result.getUploads());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#includeDataUploads");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantDataUploadsUpdateResponseDTO> response = client
              .dataAndJobHandling
              .includeDataUploads()
              .model(model)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#includeDataUploads");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeDataUploadsRequest** | [**IncludeDataUploadsRequest**](IncludeDataUploadsRequest.md)|  | |

### Return type

[**TenantDataUploadsUpdateResponseDTO**](TenantDataUploadsUpdateResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="jobIdStatus"></a>
# **jobIdStatus**
> ReceivingJobStatusResponse jobIdStatus().jobId(jobId).execute();

Retrieve a specific job&#39;s status

Use this API to retrieve the list of statuses for a specific job with id &#x60;jobId&#x60;.

### Example
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
    String jobId = "jobId_example"; // The unique ID of the job to retrieve the status for.
    try {
      ReceivingJobStatusResponse result = client
              .dataAndJobHandling
              .jobIdStatus()
              .jobId(jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
      System.out.println(result.getStatus());
      System.out.println(result.getParentJobId());
      System.out.println(result.getParentTenantCode());
      System.out.println(result.getReceivingJobs());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#jobIdStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReceivingJobStatusResponse> response = client
              .dataAndJobHandling
              .jobIdStatus()
              .jobId(jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#jobIdStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The unique ID of the job to retrieve the status for. | [optional] |

### Return type

[**ReceivingJobStatusResponse**](ReceivingJobStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="jobStatus"></a>
# **jobStatus**
> ReceivingJobStatusResponse jobStatus().startTime(startTime).endTime(endTime).status(status).execute();

Retrieve the statuses of all jobs

Use this API to retrieve the list of statuses for all jobs.

### Example
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
    String startTime = "startTime_example"; // The start time from which to retrieve job statuses.
    String endTime = "endTime_example"; // The end time from which to retrieve job statuses.
    String status = "status_example"; // The specific status to restrict the list of job to.
    try {
      ReceivingJobStatusResponse result = client
              .dataAndJobHandling
              .jobStatus()
              .startTime(startTime)
              .endTime(endTime)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
      System.out.println(result.getStatus());
      System.out.println(result.getParentJobId());
      System.out.println(result.getParentTenantCode());
      System.out.println(result.getReceivingJobs());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#jobStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReceivingJobStatusResponse> response = client
              .dataAndJobHandling
              .jobStatus()
              .startTime(startTime)
              .endTime(endTime)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#jobStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | **String**| The start time from which to retrieve job statuses. | [optional] |
| **endTime** | **String**| The end time from which to retrieve job statuses. | [optional] |
| **status** | **String**| The specific status to restrict the list of job to. | [optional] |

### Return type

[**ReceivingJobStatusResponse**](ReceivingJobStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="latestEnabledDV"></a>
# **latestEnabledDV**
> MultipleTenantDataVersionsListDTO latestEnabledDV().tenantCode(tenantCode).limit(limit).start(start).numberOfVersions(numberOfVersions).execute();

Retrieve the latest enabled data versions for all analytic tenants

If you discover any inconsistencies after running metric value validation, you may want to find the data versions  causing inconsistencies so you can later disable them.   Use this API to retrieve up to five (5) of the latest enabled data versions for all your analytic tenants or a  single specified analytic tenant.

### Example
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
    String tenantCode = "tenantCode_example"; // The tenant code of a specific analytic tenant that you want to retrieve data versions for.  Use this if you are only interested in the results for one analytic tenant.
    Integer limit = 56; // The limit of analytic tenants to retrieve data versions for.  This parameter is not used if the tenantCode parameter is specified.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    Integer numberOfVersions = 56; // The number of latest enabled data versions to retrieve. The maximum value is 5.
    try {
      MultipleTenantDataVersionsListDTO result = client
              .dataAndJobHandling
              .latestEnabledDV()
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .numberOfVersions(numberOfVersions)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#latestEnabledDV");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MultipleTenantDataVersionsListDTO> response = client
              .dataAndJobHandling
              .latestEnabledDV()
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .numberOfVersions(numberOfVersions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#latestEnabledDV");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| The tenant code of a specific analytic tenant that you want to retrieve data versions for.  Use this if you are only interested in the results for one analytic tenant. | [optional] |
| **limit** | **Integer**| The limit of analytic tenants to retrieve data versions for.  This parameter is not used if the tenantCode parameter is specified. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |
| **numberOfVersions** | **Integer**| The number of latest enabled data versions to retrieve. The maximum value is 5. | [optional] |

### Return type

[**MultipleTenantDataVersionsListDTO**](MultipleTenantDataVersionsListDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="processingJobAndStatus"></a>
# **processingJobAndStatus**
> ProcessingJobAndStatusResponse processingJobAndStatus().dispatchingJobId(dispatchingJobId).tenantCode(tenantCode).limit(limit).start(start).jobId(jobId).execute();

Retrieve a dispatching job&#39;s processing jobs with their statuses

Use this API to retrieve the statuses of processing jobs associated with a dispatching job. The dispatching job  is a \&quot;parent\&quot; to extraction jobs, which in turn generate processing jobs and receiving jobs.

### Example
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
    String dispatchingJobId = "dispatchingJobId_example"; // The ID of the dispatching job that generated the extraction jobs.
    String tenantCode = "tenantCode_example"; // The tenant code of a specific analytic tenant that you want to retrieve the extraction job status for.  Use this if you are only interested in the results for one analytic tenant.
    Integer limit = 56; // The limit of extraction job statuses to retrieve.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    String jobId = "jobId_example"; // The ID of the dispatching job you want to retrieve.
    try {
      ProcessingJobAndStatusResponse result = client
              .dataAndJobHandling
              .processingJobAndStatus()
              .dispatchingJobId(dispatchingJobId)
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .jobId(jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getParentJobId());
      System.out.println(result.getParentTenantCode());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
      System.out.println(result.getProcessingJobs());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#processingJobAndStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProcessingJobAndStatusResponse> response = client
              .dataAndJobHandling
              .processingJobAndStatus()
              .dispatchingJobId(dispatchingJobId)
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .jobId(jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#processingJobAndStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dispatchingJobId** | **String**| The ID of the dispatching job that generated the extraction jobs. | [optional] |
| **tenantCode** | **String**| The tenant code of a specific analytic tenant that you want to retrieve the extraction job status for.  Use this if you are only interested in the results for one analytic tenant. | [optional] |
| **limit** | **Integer**| The limit of extraction job statuses to retrieve. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |
| **jobId** | **String**| The ID of the dispatching job you want to retrieve. | [optional] |

### Return type

[**ProcessingJobAndStatusResponse**](ProcessingJobAndStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="processingJobStatus"></a>
# **processingJobStatus**
> ProcessingJobStatusResponse processingJobStatus().tenantCode(tenantCode).limit(limit).start(start).receivingJobId(receivingJobId).execute();

Retrieve processing job statuses by receiving job ID

Use this API to retrieve a list of statuses for all processing jobs associated with the given receiving job ID.  Processing jobs deal with an individual analytic tenant&#39;s data load. A processing job is either triggered through  the UI or is one of many processing jobs spawned from a receiving job. When a processing job is triggered as part  of a set from an receiving job, it is associated to the receiving job through a Parent ID.

### Example
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
    String tenantCode = "tenantCode_example"; // The tenant code of the tenant you want to retrieve the processing jobs for.  Use this if you are only interested in the results for one analytic tenant.
    Integer limit = 56; // The limit of processing jobs to retrieve per page.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    String receivingJobId = "receivingJobId_example"; // The receiving job ID
    try {
      ProcessingJobStatusResponse result = client
              .dataAndJobHandling
              .processingJobStatus()
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .receivingJobId(receivingJobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getParentJobId());
      System.out.println(result.getParentTenantCode());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
      System.out.println(result.getProcessingJobs());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#processingJobStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProcessingJobStatusResponse> response = client
              .dataAndJobHandling
              .processingJobStatus()
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .receivingJobId(receivingJobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#processingJobStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| The tenant code of the tenant you want to retrieve the processing jobs for.  Use this if you are only interested in the results for one analytic tenant. | [optional] |
| **limit** | **Integer**| The limit of processing jobs to retrieve per page. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |
| **receivingJobId** | **String**| The receiving job ID | [optional] |

### Return type

[**ProcessingJobStatusResponse**](ProcessingJobStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="receivingJobAndStatus"></a>
# **receivingJobAndStatus**
> ReceivingJobAndStatusResponse receivingJobAndStatus().dispatchingJobId(dispatchingJobId).tenantCode(tenantCode).limit(limit).start(start).jobId(jobId).execute();

Retrieve a dispatching job&#39;s receiving jobs with their statuses

Use this API to retrieve the statuses of receiving jobs associated with a dispatching job. The dispatching job  is a \&quot;parent\&quot; to extraction jobs, which in turn generate processing jobs and receiving jobs.

### Example
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
    String dispatchingJobId = "dispatchingJobId_example"; // The ID of the dispatching job that generated the extraction jobs.
    String tenantCode = "tenantCode_example"; // The tenant code of a specific analytic tenant that you want to retrieve the extraction job status for.  Use this if you are only interested in the results for one analytic tenant.
    Integer limit = 56; // The limit of extraction job statuses to retrieve.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    String jobId = "jobId_example"; // The ID of the dispatching job you want to retrieve.
    try {
      ReceivingJobAndStatusResponse result = client
              .dataAndJobHandling
              .receivingJobAndStatus()
              .dispatchingJobId(dispatchingJobId)
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .jobId(jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getParentJobId());
      System.out.println(result.getParentTenantCode());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
      System.out.println(result.getReceivingJobs());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#receivingJobAndStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReceivingJobAndStatusResponse> response = client
              .dataAndJobHandling
              .receivingJobAndStatus()
              .dispatchingJobId(dispatchingJobId)
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .jobId(jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#receivingJobAndStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dispatchingJobId** | **String**| The ID of the dispatching job that generated the extraction jobs. | [optional] |
| **tenantCode** | **String**| The tenant code of a specific analytic tenant that you want to retrieve the extraction job status for.  Use this if you are only interested in the results for one analytic tenant. | [optional] |
| **limit** | **Integer**| The limit of extraction job statuses to retrieve. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |
| **jobId** | **String**| The ID of the dispatching job you want to retrieve. | [optional] |

### Return type

[**ReceivingJobAndStatusResponse**](ReceivingJobAndStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="receivingJobStatus"></a>
# **receivingJobStatus**
> ReceivingJobStatusResponse receivingJobStatus().jobs(jobs).tenantCode(tenantCode).start(start).limit(limit).receivingJobId(receivingJobId).execute();

Retrieve a receiving job&#39;s status

After sending data to Visier, you may want to know the status of the receiving job and the associated tenant  receiving jobs. A receiving job validates the transferred data and adds the transferred data to Visier&#39;s data  store.   Use this API to retrieve the receiving job status and summary of analytic tenant receiving jobs.

### Example
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
    Boolean jobs = true; // If \"true\", returns the status of receiving jobs spawned by the receiving job specified by jobId.
    String tenantCode = "tenantCode_example"; // The tenant code of the tenant you want to retrieve the receiving jobs for. Use this if you are only interested  in the results for one analytic tenant.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    Integer limit = 56; // The number of job statuses to return per page.
    String receivingJobId = "receivingJobId_example"; // The jobId provided after sending data to Visier.
    try {
      ReceivingJobStatusResponse result = client
              .dataAndJobHandling
              .receivingJobStatus()
              .jobs(jobs)
              .tenantCode(tenantCode)
              .start(start)
              .limit(limit)
              .receivingJobId(receivingJobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
      System.out.println(result.getStatus());
      System.out.println(result.getParentJobId());
      System.out.println(result.getParentTenantCode());
      System.out.println(result.getReceivingJobs());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#receivingJobStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReceivingJobStatusResponse> response = client
              .dataAndJobHandling
              .receivingJobStatus()
              .jobs(jobs)
              .tenantCode(tenantCode)
              .start(start)
              .limit(limit)
              .receivingJobId(receivingJobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#receivingJobStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobs** | **Boolean**| If \&quot;true\&quot;, returns the status of receiving jobs spawned by the receiving job specified by jobId. | [optional] |
| **tenantCode** | **String**| The tenant code of the tenant you want to retrieve the receiving jobs for. Use this if you are only interested  in the results for one analytic tenant. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |
| **limit** | **Integer**| The number of job statuses to return per page. | [optional] |
| **receivingJobId** | **String**| The jobId provided after sending data to Visier. | [optional] |

### Return type

[**ReceivingJobStatusResponse**](ReceivingJobStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="retrieveDataUploads"></a>
# **retrieveDataUploads**
> TenantDataUploadsListResponseDTO retrieveDataUploads().uploadJobId(uploadJobId).tenantCode(tenantCode).limit(limit).start(start).numberOfDataUploads(numberOfDataUploads).execute();

Retrieve data uploads

Use this API to retrieve the data uploads and whether they&#39;re included in one of:  - A list of analytic tenants managed by you.  - A single specified analytic tenant.  - An upload job.

### Example
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
    String uploadJobId = "uploadJobId_example"; // The job ID of an upload job. Use this if you are interested in the data uploads for a specific upload job.
    Integer tenantCode = 56; // The tenant code of a specific analytic tenant that you want to retrieve the data uploads for.
    Integer limit = 56; // The limit of analytic tenants to retrieve data uploads for. This parameter is not used if the tenantCode parameter is specified.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    Integer numberOfDataUploads = 56; // The maximum number of latest enabled data uploads to retrieve for each analytic tenant. The maximum value is 5.
    try {
      TenantDataUploadsListResponseDTO result = client
              .dataAndJobHandling
              .retrieveDataUploads()
              .uploadJobId(uploadJobId)
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .numberOfDataUploads(numberOfDataUploads)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#retrieveDataUploads");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantDataUploadsListResponseDTO> response = client
              .dataAndJobHandling
              .retrieveDataUploads()
              .uploadJobId(uploadJobId)
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .numberOfDataUploads(numberOfDataUploads)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#retrieveDataUploads");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadJobId** | **String**| The job ID of an upload job. Use this if you are interested in the data uploads for a specific upload job. | [optional] |
| **tenantCode** | **Integer**| The tenant code of a specific analytic tenant that you want to retrieve the data uploads for. | [optional] |
| **limit** | **Integer**| The limit of analytic tenants to retrieve data uploads for. This parameter is not used if the tenantCode parameter is specified. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |
| **numberOfDataUploads** | **Integer**| The maximum number of latest enabled data uploads to retrieve for each analytic tenant. The maximum value is 5. | [optional] |

### Return type

[**TenantDataUploadsListResponseDTO**](TenantDataUploadsListResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="startExtraction"></a>
# **startExtraction**
> StartExtractionResponse startExtraction(startExtractionRequest).execute();

Trigger extraction jobs

Use this API to generate extraction jobs for a list of analytic tenants or for the administrating tenant.  This API creates a dispatching job that generates one extraction job per tenant. The extraction jobs retrieve  data from your source systems through data connectors. The dispatching job is the \&quot;parent\&quot; of the extraction  jobs and its job ID is returned in the response.

### Example
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
    StartExtractionModel model = new StartExtractionModel(); // A form body key that contains a collection of key-value pairs.
    try {
      StartExtractionResponse result = client
              .dataAndJobHandling
              .startExtraction()
              .model(model)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#startExtraction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StartExtractionResponse> response = client
              .dataAndJobHandling
              .startExtraction()
              .model(model)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#startExtraction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startExtractionRequest** | [**StartExtractionRequest**](StartExtractionRequest.md)|  | |

### Return type

[**StartExtractionResponse**](StartExtractionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="startLoad"></a>
# **startLoad**
> DataLoadResponse startLoad(dataLoadRequest).execute();

Start the data load for an analytic tenant

This API starts the data load process for all analytic tenants included in the specified data files uploaded  to the Visier SFTP server. On success, you receive a job ID that can be filtered and searched for within the  Jobs room in Visier. This job ID is associated with the receiving job, and related to all processing jobs that  spawn for each analytic tenant.   With the job ID, you can also call the next two APIs to retrieve the status of the receiving job and the status  list of all related processing jobs.   **Prerequisite:** You must first obtain Visier&#39;s public encryption key and upload the source data files to Visier&#39;s  SFTP server. Files must have a .zip.gpg extension, meaning the files are encrypted using the PGP protocol and compressed.   Visier provides SFTP server credentials and instructions. You can find the encryption key at https://www.visier.com/pgp/visier.public.pgp.asc.  After downloading the file, open the file in a text editor or by dragging it into your browser.   **Note:**   - To see the full status of all analytic tenant data loads, navigate to the Jobs room in a project.   - For performance and efficiency, Visier requires that the uncompressed batch file size is below 5 GB and that no     more than 5000 tenants are included in a batch.

### Example
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
    Map<String, MapValue> model = new HashMap(); // A form body key that contains a collection of key-value pairs.   **Note:** The only supported key value is `files` and the value is a comma-separated list of file names.  Example:  `\\\"files\\\": \\\"/path/to/file1.zip.gpg,/path/to/another/file.zip.gpg\\\"`
    try {
      DataLoadResponse result = client
              .dataAndJobHandling
              .startLoad()
              .model(model)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#startLoad");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataLoadResponse> response = client
              .dataAndJobHandling
              .startLoad()
              .model(model)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAndJobHandlingApi#startLoad");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dataLoadRequest** | [**DataLoadRequest**](DataLoadRequest.md)|  | |

### Return type

[**DataLoadResponse**](DataLoadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

