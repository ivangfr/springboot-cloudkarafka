package com.mycompany.producercloudstream.rest.dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class CreateAlertDto {

    @Min(1)
    @Max(5)
    private Integer level;

    @NotBlank
    private String message;

}
