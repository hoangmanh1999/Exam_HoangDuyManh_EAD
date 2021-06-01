package com.example.hoangduymanh.service;

import com.example.hoangduymanh.entity.CandidateEntity;
import com.example.hoangduymanh.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicelmp implements com.example.hoangduymanh.service.Service {
    @Autowired
    Repo repo;

    @Override
    public CandidateEntity Add(CandidateEntity entity) {
       CandidateEntity e=repo.save(entity);

        return e;
    }

    @Override
    public List<CandidateEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public CandidateEntity GetEntityById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public CandidateEntity editEntity(CandidateEntity candidateEntity) {
        CandidateEntity e=repo.save(candidateEntity);
        return e;
    }

    @Override
    public CandidateEntity deleteEntity(int id) {
        CandidateEntity e=repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid user Id:" + id));
        repo.delete(e);
        return e;
    }


}
