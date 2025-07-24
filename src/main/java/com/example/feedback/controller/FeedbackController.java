package com.example.feedback.controller;
import com.example.feedback.entity.Feedback;
import com.example.feedback.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

//    @Autowired
//    private FeedbackRepo feedbackRepo;

    @Autowired
    private FeedbackService feedbackService;

    public FeedbackController(){
        super();
    }
//    public  FeedbackController(FeedbackRepo feedbackRepo){
//        this.feedbackRepo = feedbackRepo;
//    }

    @GetMapping
    public List<Feedback> getAllFeedback() {
        System.out.println("Inside GetController");
        return feedbackService.findAllFeedback();
        //return (List<Feedback>) feedbackRepo.findAll();
    }

    //create new feedback
    @PostMapping
    public Feedback createNewFeedback(@RequestBody Feedback feedback) {
        System.out.println("Inside PostController");
        return feedbackService.saveFeedback(feedback);
//        return feedbackRepo.save(feedback);
}
}
