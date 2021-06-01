package com.example.hoangduymanh.service;

import com.example.hoangduymanh.entity.CandidateEntity;

import java.util.List;

public interface Service {
    CandidateEntity Add(CandidateEntity entity);
    List<CandidateEntity> getAll();
    CandidateEntity GetEntityById(int id);
CandidateEntity editEntity(CandidateEntity candidateEntity);
CandidateEntity deleteEntity(int id);
}
