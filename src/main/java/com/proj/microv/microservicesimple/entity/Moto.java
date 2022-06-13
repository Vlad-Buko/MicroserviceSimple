package com.proj.microv.microservicesimple.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Data
public class Moto {
    @Id
    private String id;
    private String name;
    private LocalDate yearConnection;
    private LocalDateTime createdAt;
}
