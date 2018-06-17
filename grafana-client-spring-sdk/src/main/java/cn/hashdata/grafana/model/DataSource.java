/*
 * Grafana
 * Grafana Restful API.
 *
 * OpenAPI spec version: v1.0
 * Contact: wang@hashdata.cn
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cn.hashdata.grafana.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DataSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-17T14:29:19.214Z")
public class DataSource {
  @JsonProperty("access")
  private String access = null;

  @JsonProperty("basicAuth")
  private Boolean basicAuth = null;

  @JsonProperty("basicAuthPassword")
  private String basicAuthPassword = null;

  @JsonProperty("basicAuthUser")
  private String basicAuthUser = null;

  @JsonProperty("database")
  private String database = null;

  @JsonProperty("default")
  private Boolean _default = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("jsonData")
  private Object jsonData = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("orgId")
  private Long orgId = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("readOnly")
  private Boolean readOnly = null;

  @JsonProperty("secureJsonFields")
  private Map<String, Boolean> secureJsonFields = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("typeLogoUrl")
  private String typeLogoUrl = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("user")
  private String user = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("withCredentials")
  private Boolean withCredentials = null;

  public DataSource access(String access) {
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @ApiModelProperty(value = "")
  public String getAccess() {
    return access;
  }

  public void setAccess(String access) {
    this.access = access;
  }

  public DataSource basicAuth(Boolean basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @ApiModelProperty(value = "")
  public Boolean isBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(Boolean basicAuth) {
    this.basicAuth = basicAuth;
  }

  public DataSource basicAuthPassword(String basicAuthPassword) {
    this.basicAuthPassword = basicAuthPassword;
    return this;
  }

   /**
   * Get basicAuthPassword
   * @return basicAuthPassword
  **/
  @ApiModelProperty(value = "")
  public String getBasicAuthPassword() {
    return basicAuthPassword;
  }

  public void setBasicAuthPassword(String basicAuthPassword) {
    this.basicAuthPassword = basicAuthPassword;
  }

  public DataSource basicAuthUser(String basicAuthUser) {
    this.basicAuthUser = basicAuthUser;
    return this;
  }

   /**
   * Get basicAuthUser
   * @return basicAuthUser
  **/
  @ApiModelProperty(value = "")
  public String getBasicAuthUser() {
    return basicAuthUser;
  }

  public void setBasicAuthUser(String basicAuthUser) {
    this.basicAuthUser = basicAuthUser;
  }

  public DataSource database(String database) {
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @ApiModelProperty(value = "")
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public DataSource _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(value = "")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public DataSource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DataSource jsonData(Object jsonData) {
    this.jsonData = jsonData;
    return this;
  }

   /**
   * Get jsonData
   * @return jsonData
  **/
  @ApiModelProperty(value = "")
  public Object getJsonData() {
    return jsonData;
  }

  public void setJsonData(Object jsonData) {
    this.jsonData = jsonData;
  }

  public DataSource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataSource orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @ApiModelProperty(value = "")
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public DataSource password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DataSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public DataSource secureJsonFields(Map<String, Boolean> secureJsonFields) {
    this.secureJsonFields = secureJsonFields;
    return this;
  }

  public DataSource putSecureJsonFieldsItem(String key, Boolean secureJsonFieldsItem) {
    if (this.secureJsonFields == null) {
      this.secureJsonFields = new HashMap<>();
    }
    this.secureJsonFields.put(key, secureJsonFieldsItem);
    return this;
  }

   /**
   * Get secureJsonFields
   * @return secureJsonFields
  **/
  @ApiModelProperty(value = "")
  public Map<String, Boolean> getSecureJsonFields() {
    return secureJsonFields;
  }

  public void setSecureJsonFields(Map<String, Boolean> secureJsonFields) {
    this.secureJsonFields = secureJsonFields;
  }

  public DataSource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataSource typeLogoUrl(String typeLogoUrl) {
    this.typeLogoUrl = typeLogoUrl;
    return this;
  }

   /**
   * Get typeLogoUrl
   * @return typeLogoUrl
  **/
  @ApiModelProperty(value = "")
  public String getTypeLogoUrl() {
    return typeLogoUrl;
  }

  public void setTypeLogoUrl(String typeLogoUrl) {
    this.typeLogoUrl = typeLogoUrl;
  }

  public DataSource url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DataSource user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public DataSource version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public DataSource withCredentials(Boolean withCredentials) {
    this.withCredentials = withCredentials;
    return this;
  }

   /**
   * Get withCredentials
   * @return withCredentials
  **/
  @ApiModelProperty(value = "")
  public Boolean isWithCredentials() {
    return withCredentials;
  }

  public void setWithCredentials(Boolean withCredentials) {
    this.withCredentials = withCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSource dataSource = (DataSource) o;
    return Objects.equals(this.access, dataSource.access) &&
        Objects.equals(this.basicAuth, dataSource.basicAuth) &&
        Objects.equals(this.basicAuthPassword, dataSource.basicAuthPassword) &&
        Objects.equals(this.basicAuthUser, dataSource.basicAuthUser) &&
        Objects.equals(this.database, dataSource.database) &&
        Objects.equals(this._default, dataSource._default) &&
        Objects.equals(this.id, dataSource.id) &&
        Objects.equals(this.jsonData, dataSource.jsonData) &&
        Objects.equals(this.name, dataSource.name) &&
        Objects.equals(this.orgId, dataSource.orgId) &&
        Objects.equals(this.password, dataSource.password) &&
        Objects.equals(this.readOnly, dataSource.readOnly) &&
        Objects.equals(this.secureJsonFields, dataSource.secureJsonFields) &&
        Objects.equals(this.type, dataSource.type) &&
        Objects.equals(this.typeLogoUrl, dataSource.typeLogoUrl) &&
        Objects.equals(this.url, dataSource.url) &&
        Objects.equals(this.user, dataSource.user) &&
        Objects.equals(this.version, dataSource.version) &&
        Objects.equals(this.withCredentials, dataSource.withCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, basicAuth, basicAuthPassword, basicAuthUser, database, _default, id, jsonData, name, orgId, password, readOnly, secureJsonFields, type, typeLogoUrl, url, user, version, withCredentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSource {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    basicAuthPassword: ").append(toIndentedString(basicAuthPassword)).append("\n");
    sb.append("    basicAuthUser: ").append(toIndentedString(basicAuthUser)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jsonData: ").append(toIndentedString(jsonData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secureJsonFields: ").append(toIndentedString(secureJsonFields)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeLogoUrl: ").append(toIndentedString(typeLogoUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    withCredentials: ").append(toIndentedString(withCredentials)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

