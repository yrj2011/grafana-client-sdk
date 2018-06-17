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

/**
 * UpdateFolderCommand
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-17T02:02:26.692Z")
public class UpdateFolderCommand {
  @JsonProperty("overwrite")
  private Boolean overwrite = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("version")
  private Integer version = null;

  public UpdateFolderCommand overwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

   /**
   * Get overwrite
   * @return overwrite
  **/
  @ApiModelProperty(value = "")
  public Boolean isOverwrite() {
    return overwrite;
  }

  public void setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
  }

  public UpdateFolderCommand title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UpdateFolderCommand uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(value = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public UpdateFolderCommand version(Integer version) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFolderCommand updateFolderCommand = (UpdateFolderCommand) o;
    return Objects.equals(this.overwrite, updateFolderCommand.overwrite) &&
        Objects.equals(this.title, updateFolderCommand.title) &&
        Objects.equals(this.uid, updateFolderCommand.uid) &&
        Objects.equals(this.version, updateFolderCommand.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overwrite, title, uid, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFolderCommand {\n");
    
    sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

