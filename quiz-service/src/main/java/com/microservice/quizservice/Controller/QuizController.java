package com.microservice.quizservice.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.microservice.quizservice.FeignClient.QuizInterface;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizInterface quizInterface;

    private static final Logger LOGGER = LoggerFactory.getLogger(QuizController.class);

    @GetMapping("get_quiz")
    public List<String> getQuiz() {
        LOGGER.info("GET QUIZ");
        List<String> qn = new ArrayList();
        qn = quizInterface.getQuestion();
        return qn;
    }
}
