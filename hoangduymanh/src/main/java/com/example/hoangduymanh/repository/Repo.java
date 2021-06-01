package com.example.hoangduymanh.repository;

import com.example.hoangduymanh.entity.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<CandidateEntity,Integer> {

}
