package com.example;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class FizzbuzzRestApiApplicationTests {

    public static final String ENDPOINT = "/fizzBuzz";

    @Autowired
    private MockMvc mvc;

    @Test
    public void testFizzBuzzCallWithCorrectParameters() throws Exception {
        mvc.perform(get(ENDPOINT).param("start", "1").param("finish", "20"))
            .andExpect(status().isOk())
            .andExpect(content().string("1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz"));
    }

    @Test
    public void testFizzBuzzCallWithMalformedParameters() throws Exception {
        mvc.perform(get(ENDPOINT).param("start", "1").param("finish", "somethingNotANumber"))
            .andExpect(status().isBadRequest())
            .andExpect(content().string("please make sure all parameters are integer values"));
    }

    @Test
    public void testFizzBuzzCallWithInsufficientParameters() throws Exception {
        mvc.perform(get(ENDPOINT))
            .andExpect(status().isBadRequest())
            .andExpect(content().string("please make sure all parameters are present"));
    }

    @Test
    public void testFizzBuzzCallWithNoParameters() throws Exception {
        mvc.perform(get(ENDPOINT))
            .andExpect(status().isBadRequest())
            .andExpect(content().string("please make sure all parameters are present"));
    }


}
