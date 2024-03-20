

# ExtractionJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extractionJobId** | **String** | The ID of the extraction job. |  [optional] |
|**tenantCode** | **String** | The tenant code of the analytic tenant for the extraction job. |  [optional] |
|**status** | **String** | The current state of the job.  - Valid values: Pending, Running, Succeeded, Failed, Error, Cancelling, Cancelled, RolledBack, Rescheduling, Rescheduled. |  [optional] |
|**currentStage** | **String** | The current stage of the job. This is not returned if the stage is \&quot;Completed\&quot;.  - Valid values: Initialize, Retrieve Main Subject, Retrieve Secondary Subjects, Retrieve Custom Subjects, Process Records, Publish Artifacts, Publish Records, Completed. |  [optional] |



