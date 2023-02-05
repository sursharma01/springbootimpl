package com.example.learn.sbimpl.service;

import com.example.learn.sbimpl.bean.Subject;
import com.example.learn.sbimpl.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    public SubjectRepository subjectRepository;
    public List<Subject> getAllSubject(){
        List<Subject> list = new ArrayList<>();
        subjectRepository.findAll().forEach(list::add);
        return list;
    }

    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void updateSubject(String id, Subject subject) {
        subjectRepository.save(subject);
    }

    public void deleteSubject(String id) {
        subjectRepository.deleteById(id);
    }
}
