

# StartExtractionModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenants** | **List&lt;String&gt;** | A list of analytic tenants to dispatch extraction jobs for. One extraction job is dispatched per tenant. |  [optional] |
|**allTenants** | **Boolean** | If \&quot;true\&quot;, one extraction job is dispatched for each accessible analytic tenant. |  [optional] |
|**overrideLastExtractionTimestamp** | **String** | The time from which to extract data. |  [optional] |
|**publishDataLoadArtifacts** | **Boolean** | If \&quot;true\&quot;, the generated data load artifacts are published to Production immediately. |  [optional] |
|**runProcessingJob** | **Boolean** | If \&quot;true\&quot;, a processing job is spawned after a dispatched extraction job runs successfully. |  [optional] |
|**dataCategoryId** | **String** | The unique identifier of the data category on which to trigger the extraction job. |  [optional] |
|**disableArtifactGeneration** | **Boolean** | If \&quot;true\&quot;, the job does not generate data load artifacts. If unspecified, the default is \&quot;false\&quot;. |  [optional] |



