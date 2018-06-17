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
import cn.hashdata.grafana.model.CurrentSelectedVariable;
import cn.hashdata.grafana.model.VariableOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * TemplateVariable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-17T02:02:26.692Z")
public class TemplateVariable {
  @JsonProperty("allFormat")
  private String allFormat = null;

  @JsonProperty("current")
  private CurrentSelectedVariable current = null;

  @JsonProperty("datasource")
  private String datasource = null;

  @JsonProperty("includeAll")
  private Boolean includeAll = null;

  @JsonProperty("multi")
  private Boolean multi = null;

  @JsonProperty("multiFormat")
  private String multiFormat = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("options")
  private List<VariableOption> options = null;

  @JsonProperty("query")
  private String query = null;

  @JsonProperty("refresh")
  private Boolean refresh = null;

  @JsonProperty("regex")
  private String regex = null;

  @JsonProperty("type")
  private String type = null;

  public TemplateVariable allFormat(String allFormat) {
    this.allFormat = allFormat;
    return this;
  }

   /**
   * Get allFormat
   * @return allFormat
  **/
  @ApiModelProperty(value = "")
  public String getAllFormat() {
    return allFormat;
  }

  public void setAllFormat(String allFormat) {
    this.allFormat = allFormat;
  }

  public TemplateVariable current(CurrentSelectedVariable current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(value = "")
  public CurrentSelectedVariable getCurrent() {
    return current;
  }

  public void setCurrent(CurrentSelectedVariable current) {
    this.current = current;
  }

  public TemplateVariable datasource(String datasource) {
    this.datasource = datasource;
    return this;
  }

   /**
   * Get datasource
   * @return datasource
  **/
  @ApiModelProperty(value = "")
  public String getDatasource() {
    return datasource;
  }

  public void setDatasource(String datasource) {
    this.datasource = datasource;
  }

  public TemplateVariable includeAll(Boolean includeAll) {
    this.includeAll = includeAll;
    return this;
  }

   /**
   * Get includeAll
   * @return includeAll
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeAll() {
    return includeAll;
  }

  public void setIncludeAll(Boolean includeAll) {
    this.includeAll = includeAll;
  }

  public TemplateVariable multi(Boolean multi) {
    this.multi = multi;
    return this;
  }

   /**
   * Get multi
   * @return multi
  **/
  @ApiModelProperty(value = "")
  public Boolean isMulti() {
    return multi;
  }

  public void setMulti(Boolean multi) {
    this.multi = multi;
  }

  public TemplateVariable multiFormat(String multiFormat) {
    this.multiFormat = multiFormat;
    return this;
  }

   /**
   * Get multiFormat
   * @return multiFormat
  **/
  @ApiModelProperty(value = "")
  public String getMultiFormat() {
    return multiFormat;
  }

  public void setMultiFormat(String multiFormat) {
    this.multiFormat = multiFormat;
  }

  public TemplateVariable name(String name) {
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

  public TemplateVariable options(List<VariableOption> options) {
    this.options = options;
    return this;
  }

  public TemplateVariable addOptionsItem(VariableOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public List<VariableOption> getOptions() {
    return options;
  }

  public void setOptions(List<VariableOption> options) {
    this.options = options;
  }

  public TemplateVariable query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public TemplateVariable refresh(Boolean refresh) {
    this.refresh = refresh;
    return this;
  }

   /**
   * Get refresh
   * @return refresh
  **/
  @ApiModelProperty(value = "")
  public Boolean isRefresh() {
    return refresh;
  }

  public void setRefresh(Boolean refresh) {
    this.refresh = refresh;
  }

  public TemplateVariable regex(String regex) {
    this.regex = regex;
    return this;
  }

   /**
   * Get regex
   * @return regex
  **/
  @ApiModelProperty(value = "")
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public TemplateVariable type(String type) {
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
    TemplateVariable templateVariable = (TemplateVariable) o;
    return Objects.equals(this.allFormat, templateVariable.allFormat) &&
        Objects.equals(this.current, templateVariable.current) &&
        Objects.equals(this.datasource, templateVariable.datasource) &&
        Objects.equals(this.includeAll, templateVariable.includeAll) &&
        Objects.equals(this.multi, templateVariable.multi) &&
        Objects.equals(this.multiFormat, templateVariable.multiFormat) &&
        Objects.equals(this.name, templateVariable.name) &&
        Objects.equals(this.options, templateVariable.options) &&
        Objects.equals(this.query, templateVariable.query) &&
        Objects.equals(this.refresh, templateVariable.refresh) &&
        Objects.equals(this.regex, templateVariable.regex) &&
        Objects.equals(this.type, templateVariable.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allFormat, current, datasource, includeAll, multi, multiFormat, name, options, query, refresh, regex, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateVariable {\n");
    
    sb.append("    allFormat: ").append(toIndentedString(allFormat)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
    sb.append("    includeAll: ").append(toIndentedString(includeAll)).append("\n");
    sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
    sb.append("    multiFormat: ").append(toIndentedString(multiFormat)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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
