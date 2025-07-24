package com.example.feedback;

import com.example.feedback.controller.FeedbackController;
import com.example.feedback.entity.Feedback;
import com.example.feedback.repo.FeedbackRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FeedbackApplicationTests {

	@Autowired
	private FeedbackController feedbackController;

	@Autowired
	private FeedbackRepo feedbackRepo;

	@Test
	void contextLoads() throws Exception{
		assertThat(feedbackController).isNotNull();
	}

	@Test
	public void getAllFeedback() throws Exception{
		assertThat(feedbackController.getAllFeedback()).isNotNull();
		System.out.println("Inside Test Class");
		List<Feedback> listofFeedback= feedbackRepo.findAll();
		listofFeedback.forEach( (n) -> { System.out.println(n); } );
	}

}
