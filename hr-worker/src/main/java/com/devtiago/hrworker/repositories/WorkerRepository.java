package com.devtiago.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtiago.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
