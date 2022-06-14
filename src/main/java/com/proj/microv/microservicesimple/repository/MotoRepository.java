package com.proj.microv.microservicesimple.repository;

import com.proj.microv.microservicesimple.entity.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Vladislav Domaniewski
 */

public interface MotoRepository extends JpaRepository <Moto, String> {
}
