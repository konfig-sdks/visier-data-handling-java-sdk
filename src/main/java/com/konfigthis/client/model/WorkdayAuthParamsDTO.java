/*
 * Visier Data and Job Handling APIs
 * Visier APIs for data and job handling
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * WorkdayAuthParamsDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkdayAuthParamsDTO {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_IMPLEMENTATION_NAME = "implementationName";
  @SerializedName(SERIALIZED_NAME_IMPLEMENTATION_NAME)
  private String implementationName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_INTEGRATION_SYSTEM_ID = "integrationSystemId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_SYSTEM_ID)
  private String integrationSystemId;

  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public WorkdayAuthParamsDTO() {
  }

  public WorkdayAuthParamsDTO userId(String userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    
    
    
    this.userId = userId;
  }


  public WorkdayAuthParamsDTO domainName(String domainName) {
    
    
    
    
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDomainName() {
    return domainName;
  }


  public void setDomainName(String domainName) {
    
    
    
    this.domainName = domainName;
  }


  public WorkdayAuthParamsDTO implementationName(String implementationName) {
    
    
    
    
    this.implementationName = implementationName;
    return this;
  }

   /**
   * Get implementationName
   * @return implementationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImplementationName() {
    return implementationName;
  }


  public void setImplementationName(String implementationName) {
    
    
    
    this.implementationName = implementationName;
  }


  public WorkdayAuthParamsDTO password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public WorkdayAuthParamsDTO integrationSystemId(String integrationSystemId) {
    
    
    
    
    this.integrationSystemId = integrationSystemId;
    return this;
  }

   /**
   * Get integrationSystemId
   * @return integrationSystemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIntegrationSystemId() {
    return integrationSystemId;
  }


  public void setIntegrationSystemId(String integrationSystemId) {
    
    
    
    this.integrationSystemId = integrationSystemId;
  }


  public WorkdayAuthParamsDTO apiKey(String apiKey) {
    
    
    
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    
    
    
    this.apiKey = apiKey;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the WorkdayAuthParamsDTO instance itself
   */
  public WorkdayAuthParamsDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkdayAuthParamsDTO workdayAuthParamsDTO = (WorkdayAuthParamsDTO) o;
    return Objects.equals(this.userId, workdayAuthParamsDTO.userId) &&
        Objects.equals(this.domainName, workdayAuthParamsDTO.domainName) &&
        Objects.equals(this.implementationName, workdayAuthParamsDTO.implementationName) &&
        Objects.equals(this.password, workdayAuthParamsDTO.password) &&
        Objects.equals(this.integrationSystemId, workdayAuthParamsDTO.integrationSystemId) &&
        Objects.equals(this.apiKey, workdayAuthParamsDTO.apiKey)&&
        Objects.equals(this.additionalProperties, workdayAuthParamsDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, domainName, implementationName, password, integrationSystemId, apiKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkdayAuthParamsDTO {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    implementationName: ").append(toIndentedString(implementationName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    integrationSystemId: ").append(toIndentedString(integrationSystemId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("userId");
    openapiFields.add("domainName");
    openapiFields.add("implementationName");
    openapiFields.add("password");
    openapiFields.add("integrationSystemId");
    openapiFields.add("apiKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkdayAuthParamsDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkdayAuthParamsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkdayAuthParamsDTO is not found in the empty JSON string", WorkdayAuthParamsDTO.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("domainName") != null && !jsonObj.get("domainName").isJsonNull()) && !jsonObj.get("domainName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domainName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domainName").toString()));
      }
      if ((jsonObj.get("implementationName") != null && !jsonObj.get("implementationName").isJsonNull()) && !jsonObj.get("implementationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `implementationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("implementationName").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("integrationSystemId") != null && !jsonObj.get("integrationSystemId").isJsonNull()) && !jsonObj.get("integrationSystemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrationSystemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrationSystemId").toString()));
      }
      if ((jsonObj.get("apiKey") != null && !jsonObj.get("apiKey").isJsonNull()) && !jsonObj.get("apiKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkdayAuthParamsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkdayAuthParamsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkdayAuthParamsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkdayAuthParamsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkdayAuthParamsDTO>() {
           @Override
           public void write(JsonWriter out, WorkdayAuthParamsDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkdayAuthParamsDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkdayAuthParamsDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkdayAuthParamsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkdayAuthParamsDTO
  * @throws IOException if the JSON string is invalid with respect to WorkdayAuthParamsDTO
  */
  public static WorkdayAuthParamsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkdayAuthParamsDTO.class);
  }

 /**
  * Convert an instance of WorkdayAuthParamsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

