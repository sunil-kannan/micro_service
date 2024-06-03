package com.microservice.questionservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLClientInfoException;
import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    Environment environment;

    @GetMapping("get_question")
    public List<String> getQuestion() {
        System.out.println("PORT =====>" + environment.getProperty("local.server.port"));
        List<String> question = new ArrayList<>();
        question.add("Who is India prime minister");
        question.add("What is India National flower");
        question.add("What is a national game of India");
        return question;
    }
}
