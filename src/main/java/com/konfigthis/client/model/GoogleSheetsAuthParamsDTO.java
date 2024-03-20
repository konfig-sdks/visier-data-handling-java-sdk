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
 * GoogleSheetsAuthParamsDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GoogleSheetsAuthParamsDTO {
  public static final String SERIALIZED_NAME_AUTH_CODE = "authCode";
  @SerializedName(SERIALIZED_NAME_AUTH_CODE)
  private String authCode;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private String _configuration;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "clientSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public GoogleSheetsAuthParamsDTO() {
  }

  public GoogleSheetsAuthParamsDTO authCode(String authCode) {
    
    
    
    
    this.authCode = authCode;
    return this;
  }

   /**
   * Get authCode
   * @return authCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthCode() {
    return authCode;
  }


  public void setAuthCode(String authCode) {
    
    
    
    this.authCode = authCode;
  }


  public GoogleSheetsAuthParamsDTO _configuration(String _configuration) {
    
    
    
    
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(String _configuration) {
    
    
    
    this._configuration = _configuration;
  }


  public GoogleSheetsAuthParamsDTO clientId(String clientId) {
    
    
    
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    
    
    
    this.clientId = clientId;
  }


  public GoogleSheetsAuthParamsDTO clientSecret(String clientSecret) {
    
    
    
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    
    
    
    this.clientSecret = clientSecret;
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
   * @return the GoogleSheetsAuthParamsDTO instance itself
   */
  public GoogleSheetsAuthParamsDTO putAdditionalProperty(String key, Object value) {
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
    GoogleSheetsAuthParamsDTO googleSheetsAuthParamsDTO = (GoogleSheetsAuthParamsDTO) o;
    return Objects.equals(this.authCode, googleSheetsAuthParamsDTO.authCode) &&
        Objects.equals(this._configuration, googleSheetsAuthParamsDTO._configuration) &&
        Objects.equals(this.clientId, googleSheetsAuthParamsDTO.clientId) &&
        Objects.equals(this.clientSecret, googleSheetsAuthParamsDTO.clientSecret)&&
        Objects.equals(this.additionalProperties, googleSheetsAuthParamsDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authCode, _configuration, clientId, clientSecret, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleSheetsAuthParamsDTO {\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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
    openapiFields.add("authCode");
    openapiFields.add("configuration");
    openapiFields.add("clientId");
    openapiFields.add("clientSecret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoogleSheetsAuthParamsDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoogleSheetsAuthParamsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleSheetsAuthParamsDTO is not found in the empty JSON string", GoogleSheetsAuthParamsDTO.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("authCode") != null && !jsonObj.get("authCode").isJsonNull()) && !jsonObj.get("authCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authCode").toString()));
      }
      if ((jsonObj.get("configuration") != null && !jsonObj.get("configuration").isJsonNull()) && !jsonObj.get("configuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuration").toString()));
      }
      if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull()) && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      if ((jsonObj.get("clientSecret") != null && !jsonObj.get("clientSecret").isJsonNull()) && !jsonObj.get("clientSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientSecret").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleSheetsAuthParamsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleSheetsAuthParamsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleSheetsAuthParamsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleSheetsAuthParamsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleSheetsAuthParamsDTO>() {
           @Override
           public void write(JsonWriter out, GoogleSheetsAuthParamsDTO value) throws IOException {
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
           public GoogleSheetsAuthParamsDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoogleSheetsAuthParamsDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoogleSheetsAuthParamsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoogleSheetsAuthParamsDTO
  * @throws IOException if the JSON string is invalid with respect to GoogleSheetsAuthParamsDTO
  */
  public static GoogleSheetsAuthParamsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleSheetsAuthParamsDTO.class);
  }

 /**
  * Convert an instance of GoogleSheetsAuthParamsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

