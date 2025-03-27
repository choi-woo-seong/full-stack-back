package com.my.backend.repository;


import com.my.backend.entity.TimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<TimeEntity,Long> {
}
