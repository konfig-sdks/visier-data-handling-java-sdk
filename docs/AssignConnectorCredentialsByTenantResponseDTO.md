

# AssignConnectorCredentialsByTenantResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantCode** | **String** | The unique identifier associated with the tenant. |  [optional] |
|**connectors** | [**List&lt;AssignConnectorWithCredentialsResponseDTO&gt;**](AssignConnectorWithCredentialsResponseDTO.md) | A list of objects representing the assigned credentials and connectors. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The state of the credential assignment. Valid values are Succeed or Failed. |  [optional] |
|**message** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SUCCEED | &quot;Succeed&quot; |
| FAILED | &quot;Failed&quot; |



