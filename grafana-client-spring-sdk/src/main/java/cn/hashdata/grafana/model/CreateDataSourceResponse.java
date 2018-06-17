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
import cn.hashdata.grafana.model.DataSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreateDataSourceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-17T02:02:26.692Z")
public class CreateDataSourceResponse {
  @JsonProperty("datasource")
  private DataSource datasource = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("name")
  private String name = null;

  public CreateDataSourceResponse datasource(DataSource datasource) {
    this.datasource = datasource;
    return this;
  }

   /**
   * Get datasource
   * @return datasource
  **/
  @ApiModelProperty(value = "")
  public DataSource getDatasource() {
    return datasource;
  }

  public void setDatasource(DataSource datasource) {
    this.datasource = datasource;
  }

  public CreateDataSourceResponse id(Long id) {
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

  public CreateDataSourceResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CreateDataSourceResponse name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataSourceResponse createDataSourceResponse = (CreateDataSourceResponse) o;
    return Objects.equals(this.datasource, createDataSourceResponse.datasource) &&
        Objects.equals(this.id, createDataSourceResponse.id) &&
        Objects.equals(this.message, createDataSourceResponse.message) &&
        Objects.equals(this.name, createDataSourceResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasource, id, message, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataSourceResponse {\n");
    
    sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

