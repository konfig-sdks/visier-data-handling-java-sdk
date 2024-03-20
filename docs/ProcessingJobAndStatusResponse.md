

# ProcessingJobAndStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parentJobId** | **String** | The ID of the dispatching job that generated the extraction jobs. |  [optional] |
|**parentTenantCode** | **String** | The tenant that owns the dispatching job. This is usually the administrating tenant. |  [optional] |
|**limit** | **Integer** | The number of processing jobs to return. The maximum number of jobs to return is 1000. |  [optional] |
|**start** | **Integer** | The index to start retrieving results from, also known as offset. The index begins at 0. |  [optional] |
|**processingJobs** | [**List&lt;ProcessingJob&gt;**](ProcessingJob.md) | A list of processing job information. |  [optional] |



