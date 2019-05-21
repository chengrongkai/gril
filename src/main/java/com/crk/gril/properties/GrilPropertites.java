package com.crk.gril.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "gril")
public class GrilPropertites {
    private String CupSize;
    private Integer Age;

    public String getCupSize() {
        return CupSize;
    }

    public void setCupSize(String cupSize) {
        CupSize = cupSize;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
