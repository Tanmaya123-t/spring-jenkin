package com.nt.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @JsonProperty("Name")
    private String sName;
    @JsonProperty("RollNumber")
    private int sRollNo;
    @JsonProperty("City")
    private String city;
}
