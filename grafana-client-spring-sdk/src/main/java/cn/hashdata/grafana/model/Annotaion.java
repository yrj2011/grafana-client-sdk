package cn.hashdata.grafana.model;

import lombok.Data;

/**
 * @author yangrenjiang
 * @createDate 2019/12/15
 * @version 1.0
 * @since jdk1.8 
 */
@Data
public class Annotaion {
    private String builtIn;
    private String datasource;
    private String enable;
    private String hide;
    private String iconColor;
    private String name;
    private String type;
}
