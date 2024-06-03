package com.microservice.questionservice.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("QUIZ-SERVICE")
public interface QuestionInterface {

}
