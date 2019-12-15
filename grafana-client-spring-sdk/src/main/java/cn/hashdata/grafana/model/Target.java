package cn.hashdata.grafana.model;

import lombok.Data;

/**
 * @author yangrenjiang
 * @createDate 2019/12/15
 * @version 1.0
 * @since jdk1.8 
 */
@Data
public class Target {
   private String expr;
   private String format;
   private String intervalFactor;
   private String refId;
}
