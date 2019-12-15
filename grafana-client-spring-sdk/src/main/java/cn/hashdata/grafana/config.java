package cn.hashdata.grafana;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @title  TODO 类名
 * @description TODO 类功能描述
 * @author yangrenjiang
 * @createDate 2019/12/15
 * @version 1.0
 * @since jdk1.8 
 */
@Configuration
public class config {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }
}
