

# ExtractionJobAndStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parentJobId** | **String** | The ID of the dispatching job that generated the extraction jobs. |  [optional] |
|**parentTenantCode** | **String** | The tenant that owns the dispatching job. This is usually the administrating tenant. |  [optional] |
|**limit** | **Integer** | The number of extraction jobs to return. The maximum number of jobs to return is 1000. |  [optional] |
|**start** | **Integer** | The index to start retrieving results from, also known as offset. The index begins at 0. |  [optional] |
|**extractionJobs** | [**List&lt;ExtractionJob&gt;**](ExtractionJob.md) | A list of extraction job information. |  [optional] |



