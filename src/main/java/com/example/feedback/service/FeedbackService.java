package com.example.feedback.service;

import com.example.feedback.entity.Feedback;
import com.example.feedback.repo.FeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepo feedbackRepo;

    public List<Feedback> findAllFeedback() {
        return (List<Feedback>) feedbackRepo.findAll();
    }

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepo.save(feedback);
    }
}
