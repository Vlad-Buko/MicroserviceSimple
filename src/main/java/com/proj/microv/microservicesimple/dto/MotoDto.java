package com.proj.microv.microservicesimple.dto;

import lombok.Data;

import java.time.LocalDate;

/**
 * Created by Vladislav Domaniewski
 */

@Data
public class MotoDto {
    private String name;
    private LocalDate yearCreation;
}
