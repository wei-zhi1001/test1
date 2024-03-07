package com.example.demo.service;

import com.example.demo.model.Returns;

import com.example.demo.model.ReturnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnsService {

    @Autowired
    private ReturnsRepository returnsRepo;

    public List<Returns> selectAll(){
        return returnsRepo.findAll();
    }

}
