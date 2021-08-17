package com.example.test5.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test5.bean.Emp;

public interface EmpService extends JpaRepository<Emp, Long> {

}
