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
import com.konfigthis.client.model.ExtractorCredentialAPIDTO;
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
 * ExtractorCredentialsAPIDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExtractorCredentialsAPIDTO {
  public static final String SERIALIZED_NAME_CONNECTOR_CREDENTIALS = "connectorCredentials";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_CREDENTIALS)
  private List<ExtractorCredentialAPIDTO> connectorCredentials = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public ExtractorCredentialsAPIDTO() {
  }

  public ExtractorCredentialsAPIDTO connectorCredentials(List<ExtractorCredentialAPIDTO> connectorCredentials) {
    
    
    
    
    this.connectorCredentials = connectorCredentials;
    return this;
  }

  public ExtractorCredentialsAPIDTO addConnectorCredentialsItem(ExtractorCredentialAPIDTO connectorCredentialsItem) {
    if (this.connectorCredentials == null) {
      this.connectorCredentials = new ArrayList<>();
    }
    this.connectorCredentials.add(connectorCredentialsItem);
    return this;
  }

   /**
   * A list of objects representing all the available connector credentials in Production.
   * @return connectorCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of objects representing all the available connector credentials in Production.")

  public List<ExtractorCredentialAPIDTO> getConnectorCredentials() {
    return connectorCredentials;
  }


  public void setConnectorCredentials(List<ExtractorCredentialAPIDTO> connectorCredentials) {
    
    
    
    this.connectorCredentials = connectorCredentials;
  }


  public ExtractorCredentialsAPIDTO limit(Integer limit) {
    
    
    
    
    this.limit = limit;
    return this;
  }

   /**
   * The number of connector credentials to return. The maximum number of data connector credentials to return is 1000.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of connector credentials to return. The maximum number of data connector credentials to return is 1000.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    
    
    
    this.limit = limit;
  }


  public ExtractorCredentialsAPIDTO start(Integer start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * The index to start retrieving values from, also known as offset. The index begins at 0.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index to start retrieving values from, also known as offset. The index begins at 0.")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    
    
    
    this.start = start;
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
   * @return the ExtractorCredentialsAPIDTO instance itself
   */
  public ExtractorCredentialsAPIDTO putAdditionalProperty(String key, Object value) {
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
    ExtractorCredentialsAPIDTO extractorCredentialsAPIDTO = (ExtractorCredentialsAPIDTO) o;
    return Objects.equals(this.connectorCredentials, extractorCredentialsAPIDTO.connectorCredentials) &&
        Objects.equals(this.limit, extractorCredentialsAPIDTO.limit) &&
        Objects.equals(this.start, extractorCredentialsAPIDTO.start)&&
        Objects.equals(this.additionalProperties, extractorCredentialsAPIDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorCredentials, limit, start, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractorCredentialsAPIDTO {\n");
    sb.append("    connectorCredentials: ").append(toIndentedString(connectorCredentials)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
    openapiFields.add("connectorCredentials");
    openapiFields.add("limit");
    openapiFields.add("start");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExtractorCredentialsAPIDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExtractorCredentialsAPIDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtractorCredentialsAPIDTO is not found in the empty JSON string", ExtractorCredentialsAPIDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("connectorCredentials") != null && !jsonObj.get("connectorCredentials").isJsonNull()) {
        JsonArray jsonArrayconnectorCredentials = jsonObj.getAsJsonArray("connectorCredentials");
        if (jsonArrayconnectorCredentials != null) {
          // ensure the json data is an array
          if (!jsonObj.get("connectorCredentials").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `connectorCredentials` to be an array in the JSON string but got `%s`", jsonObj.get("connectorCredentials").toString()));
          }

          // validate the optional field `connectorCredentials` (array)
          for (int i = 0; i < jsonArrayconnectorCredentials.size(); i++) {
            ExtractorCredentialAPIDTO.validateJsonObject(jsonArrayconnectorCredentials.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtractorCredentialsAPIDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtractorCredentialsAPIDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtractorCredentialsAPIDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtractorCredentialsAPIDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtractorCredentialsAPIDTO>() {
           @Override
           public void write(JsonWriter out, ExtractorCredentialsAPIDTO value) throws IOException {
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
           public ExtractorCredentialsAPIDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExtractorCredentialsAPIDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExtractorCredentialsAPIDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExtractorCredentialsAPIDTO
  * @throws IOException if the JSON string is invalid with respect to ExtractorCredentialsAPIDTO
  */
  public static ExtractorCredentialsAPIDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtractorCredentialsAPIDTO.class);
  }

 /**
  * Convert an instance of ExtractorCredentialsAPIDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

