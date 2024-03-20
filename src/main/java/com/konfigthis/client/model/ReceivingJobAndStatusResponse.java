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
import com.konfigthis.client.model.ReceivingJob;
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
 * ReceivingJobAndStatusResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReceivingJobAndStatusResponse {
  public static final String SERIALIZED_NAME_PARENT_JOB_ID = "parentJobId";
  @SerializedName(SERIALIZED_NAME_PARENT_JOB_ID)
  private String parentJobId;

  public static final String SERIALIZED_NAME_PARENT_TENANT_CODE = "parentTenantCode";
  @SerializedName(SERIALIZED_NAME_PARENT_TENANT_CODE)
  private String parentTenantCode;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_RECEIVING_JOBS = "receivingJobs";
  @SerializedName(SERIALIZED_NAME_RECEIVING_JOBS)
  private List<ReceivingJob> receivingJobs = null;

  public ReceivingJobAndStatusResponse() {
  }

  public ReceivingJobAndStatusResponse parentJobId(String parentJobId) {
    
    
    
    
    this.parentJobId = parentJobId;
    return this;
  }

   /**
   * The ID of the dispatching job that generated the extraction jobs.
   * @return parentJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the dispatching job that generated the extraction jobs.")

  public String getParentJobId() {
    return parentJobId;
  }


  public void setParentJobId(String parentJobId) {
    
    
    
    this.parentJobId = parentJobId;
  }


  public ReceivingJobAndStatusResponse parentTenantCode(String parentTenantCode) {
    
    
    
    
    this.parentTenantCode = parentTenantCode;
    return this;
  }

   /**
   * The tenant that owns the dispatching job. This is usually the administrating tenant.
   * @return parentTenantCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant that owns the dispatching job. This is usually the administrating tenant.")

  public String getParentTenantCode() {
    return parentTenantCode;
  }


  public void setParentTenantCode(String parentTenantCode) {
    
    
    
    this.parentTenantCode = parentTenantCode;
  }


  public ReceivingJobAndStatusResponse limit(Integer limit) {
    
    
    
    
    this.limit = limit;
    return this;
  }

   /**
   * The number of receiving jobs to return. The maximum number of jobs to return is 1000.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of receiving jobs to return. The maximum number of jobs to return is 1000.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    
    
    
    this.limit = limit;
  }


  public ReceivingJobAndStatusResponse start(Integer start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * The index to start retrieving results from, also known as offset. The index begins at 0.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index to start retrieving results from, also known as offset. The index begins at 0.")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    
    
    
    this.start = start;
  }


  public ReceivingJobAndStatusResponse receivingJobs(List<ReceivingJob> receivingJobs) {
    
    
    
    
    this.receivingJobs = receivingJobs;
    return this;
  }

  public ReceivingJobAndStatusResponse addReceivingJobsItem(ReceivingJob receivingJobsItem) {
    if (this.receivingJobs == null) {
      this.receivingJobs = new ArrayList<>();
    }
    this.receivingJobs.add(receivingJobsItem);
    return this;
  }

   /**
   * A list of receiving job information.
   * @return receivingJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of receiving job information.")

  public List<ReceivingJob> getReceivingJobs() {
    return receivingJobs;
  }


  public void setReceivingJobs(List<ReceivingJob> receivingJobs) {
    
    
    
    this.receivingJobs = receivingJobs;
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
   * @return the ReceivingJobAndStatusResponse instance itself
   */
  public ReceivingJobAndStatusResponse putAdditionalProperty(String key, Object value) {
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
    ReceivingJobAndStatusResponse receivingJobAndStatusResponse = (ReceivingJobAndStatusResponse) o;
    return Objects.equals(this.parentJobId, receivingJobAndStatusResponse.parentJobId) &&
        Objects.equals(this.parentTenantCode, receivingJobAndStatusResponse.parentTenantCode) &&
        Objects.equals(this.limit, receivingJobAndStatusResponse.limit) &&
        Objects.equals(this.start, receivingJobAndStatusResponse.start) &&
        Objects.equals(this.receivingJobs, receivingJobAndStatusResponse.receivingJobs)&&
        Objects.equals(this.additionalProperties, receivingJobAndStatusResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentJobId, parentTenantCode, limit, start, receivingJobs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivingJobAndStatusResponse {\n");
    sb.append("    parentJobId: ").append(toIndentedString(parentJobId)).append("\n");
    sb.append("    parentTenantCode: ").append(toIndentedString(parentTenantCode)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    receivingJobs: ").append(toIndentedString(receivingJobs)).append("\n");
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
    openapiFields.add("parentJobId");
    openapiFields.add("parentTenantCode");
    openapiFields.add("limit");
    openapiFields.add("start");
    openapiFields.add("receivingJobs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReceivingJobAndStatusResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReceivingJobAndStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReceivingJobAndStatusResponse is not found in the empty JSON string", ReceivingJobAndStatusResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("parentJobId") != null && !jsonObj.get("parentJobId").isJsonNull()) && !jsonObj.get("parentJobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentJobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentJobId").toString()));
      }
      if ((jsonObj.get("parentTenantCode") != null && !jsonObj.get("parentTenantCode").isJsonNull()) && !jsonObj.get("parentTenantCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentTenantCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentTenantCode").toString()));
      }
      if (jsonObj.get("receivingJobs") != null && !jsonObj.get("receivingJobs").isJsonNull()) {
        JsonArray jsonArrayreceivingJobs = jsonObj.getAsJsonArray("receivingJobs");
        if (jsonArrayreceivingJobs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("receivingJobs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `receivingJobs` to be an array in the JSON string but got `%s`", jsonObj.get("receivingJobs").toString()));
          }

          // validate the optional field `receivingJobs` (array)
          for (int i = 0; i < jsonArrayreceivingJobs.size(); i++) {
            ReceivingJob.validateJsonObject(jsonArrayreceivingJobs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReceivingJobAndStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReceivingJobAndStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReceivingJobAndStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReceivingJobAndStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReceivingJobAndStatusResponse>() {
           @Override
           public void write(JsonWriter out, ReceivingJobAndStatusResponse value) throws IOException {
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
           public ReceivingJobAndStatusResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReceivingJobAndStatusResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReceivingJobAndStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReceivingJobAndStatusResponse
  * @throws IOException if the JSON string is invalid with respect to ReceivingJobAndStatusResponse
  */
  public static ReceivingJobAndStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceivingJobAndStatusResponse.class);
  }

 /**
  * Convert an instance of ReceivingJobAndStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

