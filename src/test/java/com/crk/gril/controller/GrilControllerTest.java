package com.crk.gril.controller;

import com.crk.gril.respository.GrilRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GrilControllerTest {
    //private GrilRespository grilRespository;
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void grilList() throws Exception{
       mockMvc.perform(MockMvcRequestBuilders.get("/grils")).andExpect(MockMvcResultMatchers.status().isOk());
    }
}