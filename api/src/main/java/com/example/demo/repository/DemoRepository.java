package com.example.demo.repository;

import com.example.demo.domain.Grafikon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


@Repository
public interface DemoRepository extends JpaRepository<Grafikon,Long> {
}
