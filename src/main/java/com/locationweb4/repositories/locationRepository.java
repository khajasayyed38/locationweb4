package com.locationweb4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locationweb4.entity.location;

public interface locationRepository extends JpaRepository<location, Long> {

}
