package com.example.feedback.service;

import com.example.feedback.entity.Feedback;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FeedbackServiceTest {

    @Autowired
    private FeedbackService feedbackService;

    @Test
    public void testsaveFedback_validData() {

        Feedback feedback = new Feedback();
        feedback.setName("test");
        feedback.setEmail("test@gmail.com");
        feedback.setMessage("This is a test message.");
        Feedback result= feedbackService.saveFeedback(feedback);
        assertThat(result).isNotNull();
        assertThat(result.getId()).isNotNull();
        assertThat(result.getName()).isEqualTo("test");
    }

    @Test
    public void testsaveFedback_EmailContainsGmail() {
        Feedback feedback = new Feedback();
        feedback.setEmail("deepika@gmail.com");
        assertTrue(feedback.getEmail().endsWith("@gmail.com"), "Email must end with @gmail.com");
    }
    @Test
    public void testsaveFedback_EmailDonotContainGmail() {
        Feedback feedback = new Feedback();
        feedback.setEmail("deepika@yahoo.com");
        assertFalse(feedback.getEmail().endsWith("@gmail.com"), "Email must end with @gmail.com");
    }

}
