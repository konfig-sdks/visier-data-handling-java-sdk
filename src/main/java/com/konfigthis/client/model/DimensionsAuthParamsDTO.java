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
 * DimensionsAuthParamsDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DimensionsAuthParamsDTO {
  public static final String SERIALIZED_NAME_APP_KEY = "appKey";
  @SerializedName(SERIALIZED_NAME_APP_KEY)
  private String appKey;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "clientSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_VANITY_URL = "vanityUrl";
  @SerializedName(SERIALIZED_NAME_VANITY_URL)
  private String vanityUrl;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public DimensionsAuthParamsDTO() {
  }

  public DimensionsAuthParamsDTO appKey(String appKey) {
    
    
    
    
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppKey() {
    return appKey;
  }


  public void setAppKey(String appKey) {
    
    
    
    this.appKey = appKey;
  }


  public DimensionsAuthParamsDTO clientId(String clientId) {
    
    
    
    
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


  public DimensionsAuthParamsDTO clientSecret(String clientSecret) {
    
    
    
    
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


  public DimensionsAuthParamsDTO vanityUrl(String vanityUrl) {
    
    
    
    
    this.vanityUrl = vanityUrl;
    return this;
  }

   /**
   * Get vanityUrl
   * @return vanityUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVanityUrl() {
    return vanityUrl;
  }


  public void setVanityUrl(String vanityUrl) {
    
    
    
    this.vanityUrl = vanityUrl;
  }


  public DimensionsAuthParamsDTO username(String username) {
    
    
    
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    
    
    
    this.username = username;
  }


  public DimensionsAuthParamsDTO password(String password) {
    
    
    
    
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
   * @return the DimensionsAuthParamsDTO instance itself
   */
  public DimensionsAuthParamsDTO putAdditionalProperty(String key, Object value) {
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
    DimensionsAuthParamsDTO dimensionsAuthParamsDTO = (DimensionsAuthParamsDTO) o;
    return Objects.equals(this.appKey, dimensionsAuthParamsDTO.appKey) &&
        Objects.equals(this.clientId, dimensionsAuthParamsDTO.clientId) &&
        Objects.equals(this.clientSecret, dimensionsAuthParamsDTO.clientSecret) &&
        Objects.equals(this.vanityUrl, dimensionsAuthParamsDTO.vanityUrl) &&
        Objects.equals(this.username, dimensionsAuthParamsDTO.username) &&
        Objects.equals(this.password, dimensionsAuthParamsDTO.password)&&
        Objects.equals(this.additionalProperties, dimensionsAuthParamsDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, clientId, clientSecret, vanityUrl, username, password, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DimensionsAuthParamsDTO {\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    vanityUrl: ").append(toIndentedString(vanityUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("appKey");
    openapiFields.add("clientId");
    openapiFields.add("clientSecret");
    openapiFields.add("vanityUrl");
    openapiFields.add("username");
    openapiFields.add("password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DimensionsAuthParamsDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DimensionsAuthParamsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DimensionsAuthParamsDTO is not found in the empty JSON string", DimensionsAuthParamsDTO.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("appKey") != null && !jsonObj.get("appKey").isJsonNull()) && !jsonObj.get("appKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appKey").toString()));
      }
      if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull()) && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      if ((jsonObj.get("clientSecret") != null && !jsonObj.get("clientSecret").isJsonNull()) && !jsonObj.get("clientSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientSecret").toString()));
      }
      if ((jsonObj.get("vanityUrl") != null && !jsonObj.get("vanityUrl").isJsonNull()) && !jsonObj.get("vanityUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vanityUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vanityUrl").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DimensionsAuthParamsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DimensionsAuthParamsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DimensionsAuthParamsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DimensionsAuthParamsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DimensionsAuthParamsDTO>() {
           @Override
           public void write(JsonWriter out, DimensionsAuthParamsDTO value) throws IOException {
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
           public DimensionsAuthParamsDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DimensionsAuthParamsDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DimensionsAuthParamsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DimensionsAuthParamsDTO
  * @throws IOException if the JSON string is invalid with respect to DimensionsAuthParamsDTO
  */
  public static DimensionsAuthParamsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DimensionsAuthParamsDTO.class);
  }

 /**
  * Convert an instance of DimensionsAuthParamsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

