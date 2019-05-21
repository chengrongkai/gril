package com.crk.gril.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler"})
public class Gril {

    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty
    private String cupSize;

//    @Min(value = 10,message = "未成年少女禁止入内")
    private Integer age;

    public Gril() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString(){
        return "id="+id+",cupSize="+cupSize+",age="+age;
    }


}
