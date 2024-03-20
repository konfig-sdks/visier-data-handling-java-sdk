

# CredentialCreationAPIResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The unique ID of the newly created credential. |  [optional] |
|**symbolName** | **String** | The symbol name of the newly created credential. |  [optional] |
|**objectName** | **String** | The object name of the newly created credential. |  [optional] |
|**missingConnectionProperties** | [**List&lt;SubjectMissingAccessDTO&gt;**](SubjectMissingAccessDTO.md) | The properties that the credential cannot access despite successful authentication.  This is only returned for authentications that do not grant access to all data. |  [optional] |



