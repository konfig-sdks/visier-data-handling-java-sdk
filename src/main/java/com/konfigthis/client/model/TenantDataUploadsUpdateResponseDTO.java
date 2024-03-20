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
import com.konfigthis.client.model.TenantDataUploadUpdateStatusResponseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * TenantDataUploadsUpdateResponseDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TenantDataUploadsUpdateResponseDTO {
  public static final String SERIALIZED_NAME_TOTAL_FAILURES = "totalFailures";
  @SerializedName(SERIALIZED_NAME_TOTAL_FAILURES)
  private Integer totalFailures;

  public static final String SERIALIZED_NAME_TOTAL_SUCCESS = "totalSuccess";
  @SerializedName(SERIALIZED_NAME_TOTAL_SUCCESS)
  private Integer totalSuccess;

  public static final String SERIALIZED_NAME_UPLOADS = "uploads";
  @SerializedName(SERIALIZED_NAME_UPLOADS)
  private List<TenantDataUploadUpdateStatusResponseDTO> uploads = null;

  public TenantDataUploadsUpdateResponseDTO() {
  }

  public TenantDataUploadsUpdateResponseDTO totalFailures(Integer totalFailures) {
    
    
    
    
    this.totalFailures = totalFailures;
    return this;
  }

   /**
   * The number of data uploads that failed during the exclusion operation.
   * @return totalFailures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of data uploads that failed during the exclusion operation.")

  public Integer getTotalFailures() {
    return totalFailures;
  }


  public void setTotalFailures(Integer totalFailures) {
    
    
    
    this.totalFailures = totalFailures;
  }


  public TenantDataUploadsUpdateResponseDTO totalSuccess(Integer totalSuccess) {
    
    
    
    
    this.totalSuccess = totalSuccess;
    return this;
  }

   /**
   * The number of data uploads that were excluded successfully.
   * @return totalSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of data uploads that were excluded successfully.")

  public Integer getTotalSuccess() {
    return totalSuccess;
  }


  public void setTotalSuccess(Integer totalSuccess) {
    
    
    
    this.totalSuccess = totalSuccess;
  }


  public TenantDataUploadsUpdateResponseDTO uploads(List<TenantDataUploadUpdateStatusResponseDTO> uploads) {
    
    
    
    
    this.uploads = uploads;
    return this;
  }

  public TenantDataUploadsUpdateResponseDTO addUploadsItem(TenantDataUploadUpdateStatusResponseDTO uploadsItem) {
    if (this.uploads == null) {
      this.uploads = new ArrayList<>();
    }
    this.uploads.add(uploadsItem);
    return this;
  }

   /**
   * A list of objects representing the results of the data upload exclusion.
   * @return uploads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of objects representing the results of the data upload exclusion.")

  public List<TenantDataUploadUpdateStatusResponseDTO> getUploads() {
    return uploads;
  }


  public void setUploads(List<TenantDataUploadUpdateStatusResponseDTO> uploads) {
    
    
    
    this.uploads = uploads;
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
   * @return the TenantDataUploadsUpdateResponseDTO instance itself
   */
  public TenantDataUploadsUpdateResponseDTO putAdditionalProperty(String key, Object value) {
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
    TenantDataUploadsUpdateResponseDTO tenantDataUploadsUpdateResponseDTO = (TenantDataUploadsUpdateResponseDTO) o;
    return Objects.equals(this.totalFailures, tenantDataUploadsUpdateResponseDTO.totalFailures) &&
        Objects.equals(this.totalSuccess, tenantDataUploadsUpdateResponseDTO.totalSuccess) &&
        Objects.equals(this.uploads, tenantDataUploadsUpdateResponseDTO.uploads)&&
        Objects.equals(this.additionalProperties, tenantDataUploadsUpdateResponseDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalFailures, totalSuccess, uploads, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantDataUploadsUpdateResponseDTO {\n");
    sb.append("    totalFailures: ").append(toIndentedString(totalFailures)).append("\n");
    sb.append("    totalSuccess: ").append(toIndentedString(totalSuccess)).append("\n");
    sb.append("    uploads: ").append(toIndentedString(uploads)).append("\n");
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
    openapiFields.add("totalFailures");
    openapiFields.add("totalSuccess");
    openapiFields.add("uploads");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TenantDataUploadsUpdateResponseDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TenantDataUploadsUpdateResponseDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TenantDataUploadsUpdateResponseDTO is not found in the empty JSON string", TenantDataUploadsUpdateResponseDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("uploads") != null && !jsonObj.get("uploads").isJsonNull()) {
        JsonArray jsonArrayuploads = jsonObj.getAsJsonArray("uploads");
        if (jsonArrayuploads != null) {
          // ensure the json data is an array
          if (!jsonObj.get("uploads").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `uploads` to be an array in the JSON string but got `%s`", jsonObj.get("uploads").toString()));
          }

          // validate the optional field `uploads` (array)
          for (int i = 0; i < jsonArrayuploads.size(); i++) {
            TenantDataUploadUpdateStatusResponseDTO.validateJsonObject(jsonArrayuploads.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TenantDataUploadsUpdateResponseDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TenantDataUploadsUpdateResponseDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TenantDataUploadsUpdateResponseDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TenantDataUploadsUpdateResponseDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TenantDataUploadsUpdateResponseDTO>() {
           @Override
           public void write(JsonWriter out, TenantDataUploadsUpdateResponseDTO value) throws IOException {
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
           public TenantDataUploadsUpdateResponseDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TenantDataUploadsUpdateResponseDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TenantDataUploadsUpdateResponseDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TenantDataUploadsUpdateResponseDTO
  * @throws IOException if the JSON string is invalid with respect to TenantDataUploadsUpdateResponseDTO
  */
  public static TenantDataUploadsUpdateResponseDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TenantDataUploadsUpdateResponseDTO.class);
  }

 /**
  * Convert an instance of TenantDataUploadsUpdateResponseDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

