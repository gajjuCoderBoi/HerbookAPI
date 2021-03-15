package com.cognizant.herobookapi.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class HeroControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void allHerosWithGalvanizeTagTest() throws Exception {

        RequestBuilder rq = get("/hero/list")
                            .queryParam("visitortag", "galvanize")
                            .accept(MediaType.APPLICATION_JSON);

        mockMvc.perform(rq)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Superman"))
                .andExpect(jsonPath("$[1].name").value("Batman"))
                .andDo(print())
        ;

    }

    @Test
    public void allHerosWithNonGalvanizeTagTest() throws Exception {

        RequestBuilder rq = get("/hero/list")
                .queryParam("visitortag", "cognizant")
                .accept(MediaType.APPLICATION_JSON);

        mockMvc.perform(rq)
                .andExpect(status().isUnauthorized())
                .andExpect(jsonPath("$", hasSize(0)))
                .andDo(print())
        ;

    }


}
