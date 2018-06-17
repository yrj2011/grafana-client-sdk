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
import cn.hashdata.grafana.model.GridPos;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Panel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-17T14:29:19.214Z")
public class Panel {
  @JsonProperty("content")
  private String content = null;

  @JsonProperty("gridPos")
  private GridPos gridPos = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("type")
  private String type = null;

  public Panel content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Panel gridPos(GridPos gridPos) {
    this.gridPos = gridPos;
    return this;
  }

   /**
   * Get gridPos
   * @return gridPos
  **/
  @ApiModelProperty(value = "")
  public GridPos getGridPos() {
    return gridPos;
  }

  public void setGridPos(GridPos gridPos) {
    this.gridPos = gridPos;
  }

  public Panel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Panel mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(value = "")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public Panel title(String title) {
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

  public Panel type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Panel panel = (Panel) o;
    return Objects.equals(this.content, panel.content) &&
        Objects.equals(this.gridPos, panel.gridPos) &&
        Objects.equals(this.id, panel.id) &&
        Objects.equals(this.mode, panel.mode) &&
        Objects.equals(this.title, panel.title) &&
        Objects.equals(this.type, panel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, gridPos, id, mode, title, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Panel {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    gridPos: ").append(toIndentedString(gridPos)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

