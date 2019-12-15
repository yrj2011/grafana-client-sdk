package cn.hashdata.grafana.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author yangrenjiang
 * @createDate 2019/12/15
 * @version 1.0
 * @since jdk1.8 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class MappingType {

   private String name;
   private String value;
}
