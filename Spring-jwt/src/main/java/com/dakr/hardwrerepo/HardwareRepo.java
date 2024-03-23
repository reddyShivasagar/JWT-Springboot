package com.dakr.hardwrerepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.model.Hardware;

@Repository
public interface HardwareRepo extends JpaRepository<Hardware, Integer>{

}
