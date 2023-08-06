package com.example.demo.repository;

import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TestEntity;

@Repository
public interface TestRepo extends JpaRepository<TestEntity, Long>{

	

}
