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
 * TenantDataUploadUpdateStatusResponseDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TenantDataUploadUpdateStatusResponseDTO {
  public static final String SERIALIZED_NAME_TENANT_CODE = "tenantCode";
  @SerializedName(SERIALIZED_NAME_TENANT_CODE)
  private String tenantCode;

  public static final String SERIALIZED_NAME_UPLOAD_TIME = "uploadTime";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TIME)
  private String uploadTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public TenantDataUploadUpdateStatusResponseDTO() {
  }

  public TenantDataUploadUpdateStatusResponseDTO tenantCode(String tenantCode) {
    
    
    
    
    this.tenantCode = tenantCode;
    return this;
  }

   /**
   * The analytic tenant that the exclusion operation was conducted for.
   * @return tenantCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The analytic tenant that the exclusion operation was conducted for.")

  public String getTenantCode() {
    return tenantCode;
  }


  public void setTenantCode(String tenantCode) {
    
    
    
    this.tenantCode = tenantCode;
  }


  public TenantDataUploadUpdateStatusResponseDTO uploadTime(String uploadTime) {
    
    
    
    
    this.uploadTime = uploadTime;
    return this;
  }

   /**
   * The upload time of the data upload
   * @return uploadTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The upload time of the data upload")

  public String getUploadTime() {
    return uploadTime;
  }


  public void setUploadTime(String uploadTime) {
    
    
    
    this.uploadTime = uploadTime;
  }


  public TenantDataUploadUpdateStatusResponseDTO status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The outcome of the exclusion operation.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The outcome of the exclusion operation.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public TenantDataUploadUpdateStatusResponseDTO message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * If applicable, the message explains why errors were encountered during the exclusion operation.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If applicable, the message explains why errors were encountered during the exclusion operation.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
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
   * @return the TenantDataUploadUpdateStatusResponseDTO instance itself
   */
  public TenantDataUploadUpdateStatusResponseDTO putAdditionalProperty(String key, Object value) {
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
    TenantDataUploadUpdateStatusResponseDTO tenantDataUploadUpdateStatusResponseDTO = (TenantDataUploadUpdateStatusResponseDTO) o;
    return Objects.equals(this.tenantCode, tenantDataUploadUpdateStatusResponseDTO.tenantCode) &&
        Objects.equals(this.uploadTime, tenantDataUploadUpdateStatusResponseDTO.uploadTime) &&
        Objects.equals(this.status, tenantDataUploadUpdateStatusResponseDTO.status) &&
        Objects.equals(this.message, tenantDataUploadUpdateStatusResponseDTO.message)&&
        Objects.equals(this.additionalProperties, tenantDataUploadUpdateStatusResponseDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantCode, uploadTime, status, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantDataUploadUpdateStatusResponseDTO {\n");
    sb.append("    tenantCode: ").append(toIndentedString(tenantCode)).append("\n");
    sb.append("    uploadTime: ").append(toIndentedString(uploadTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("tenantCode");
    openapiFields.add("uploadTime");
    openapiFields.add("status");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TenantDataUploadUpdateStatusResponseDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TenantDataUploadUpdateStatusResponseDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TenantDataUploadUpdateStatusResponseDTO is not found in the empty JSON string", TenantDataUploadUpdateStatusResponseDTO.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("tenantCode") != null && !jsonObj.get("tenantCode").isJsonNull()) && !jsonObj.get("tenantCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantCode").toString()));
      }
      if ((jsonObj.get("uploadTime") != null && !jsonObj.get("uploadTime").isJsonNull()) && !jsonObj.get("uploadTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uploadTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uploadTime").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TenantDataUploadUpdateStatusResponseDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TenantDataUploadUpdateStatusResponseDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TenantDataUploadUpdateStatusResponseDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TenantDataUploadUpdateStatusResponseDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TenantDataUploadUpdateStatusResponseDTO>() {
           @Override
           public void write(JsonWriter out, TenantDataUploadUpdateStatusResponseDTO value) throws IOException {
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
           public TenantDataUploadUpdateStatusResponseDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TenantDataUploadUpdateStatusResponseDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TenantDataUploadUpdateStatusResponseDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TenantDataUploadUpdateStatusResponseDTO
  * @throws IOException if the JSON string is invalid with respect to TenantDataUploadUpdateStatusResponseDTO
  */
  public static TenantDataUploadUpdateStatusResponseDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TenantDataUploadUpdateStatusResponseDTO.class);
  }

 /**
  * Convert an instance of TenantDataUploadUpdateStatusResponseDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

