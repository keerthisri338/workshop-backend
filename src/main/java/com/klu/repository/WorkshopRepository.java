package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.entity.Workshop;

public interface WorkshopRepository extends JpaRepository<Workshop, Long> {}