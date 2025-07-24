package com.example.feedback;

import com.example.feedback.entity.Feedback;
import com.example.feedback.repo.FeedbackRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private FeedbackRepo feedbackRepo;

    @Test
    public void testSaveFeedback() throws Exception {
        // Arrange
        var f1 = new Feedback();
        f1.setId(1L);
        f1.setName("Deepika");
        f1.setEmail("deep@gmail.com");
        f1.setMessage("Hello world!");

        // Act + Assert
        mockMvc.perform(MockMvcRequestBuilders.post("/feedback")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(f1))
        )
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
