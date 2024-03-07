package com.example.demo.controller;

import com.example.demo.model.Returns;
import com.example.demo.service.ReturnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ReturnsController {

    @Autowired
    private ReturnsService returnsService;


    @GetMapping("/returns/list")
    public String findAllReturns(Model model) {
        List<Returns> returnsList = returnsService.selectAll();
        model.addAttribute("returnsList", returnsList);
        return "returns/showPage";
    }
}
