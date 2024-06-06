package com.example.member03.repository;

import com.example.member03.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News,Integer> {
}
