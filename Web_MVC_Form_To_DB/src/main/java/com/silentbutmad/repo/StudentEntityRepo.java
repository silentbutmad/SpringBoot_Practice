package com.silentbutmad.repo;

import com.silentbutmad.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentEntityRepo extends JpaRepository<StudentEntity,String> {
}
