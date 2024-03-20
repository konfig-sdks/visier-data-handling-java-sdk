

# JobCancellationResultDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantCode** | **String** | The analytic tenant whose job the cancel operation was conducted for. |  [optional] |
|**jobId** | **String** | The job ID of the job that the cancel operation was conducted for. |  [optional] |
|**jobType** | **String** | The job type associated with the job ID. |  [optional] |
|**parentJobId** | **String** | If applicable, the job ID of the job that spawned the given job. |  [optional] |
|**cancelStatus** | [**CancelStatusEnum**](#CancelStatusEnum) | The status of the cancellation. |  [optional] |
|**jobStatus** | **String** | The job status after the cancel operation. If successful, the status is either Cancelled or Cancelling. |  [optional] |
|**message** | **String** | If applicable, the message explains what errors occurred while cancelling the jobs. |  [optional] |



## Enum: CancelStatusEnum

| Name | Value |
|---- | -----|
| FAILED | &quot;CANCEL_FAILED&quot; |
| SUCCEEDED | &quot;CANCEL_SUCCEEDED&quot; |



