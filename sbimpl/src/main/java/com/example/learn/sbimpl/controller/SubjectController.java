package com.example.learn.sbimpl.controller;

import com.example.learn.sbimpl.bean.Subject;
import com.example.learn.sbimpl.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    public SubjectService subjectService;
    @GetMapping("/subjects")
    public List<Subject> getAllSubject(){
        return subjectService.getAllSubject();
    }

    @PostMapping("/students")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

    @PutMapping("/students/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject){
        subjectService.updateSubject(id, subject);
    }

    @DeleteMapping("students/{id}")
    public void deleteSubject(@PathVariable String id){
        subjectService.deleteSubject(id);
    }
}
