package cn.hashdata.grafana.model;

import lombok.Data;

/**
 * @author yangrenjiang
 * @createDate 2019/12/15
 * @version 1.0
 * @since jdk1.8 
 */
@Data
public class Gauge {

    private String maxValue;
    private String minValue;
    private String show;
    private String thresholdLabels;
    private String thresholdMarkers;
}
