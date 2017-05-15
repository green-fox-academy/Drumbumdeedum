package com.greenfox.dszalay.resttest.controller;

import com.greenfox.dszalay.resttest.GuardianApplication;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardianApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void TestWithString() throws Exception {
    mockMvc.perform(get("/groot")
        .param("message", "Are you really groot?"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.received", is("Are you really groot?")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void TestGrootWithNoParameter() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void TestWithValidDoubles() throws Exception {
    mockMvc.perform(get("/yondu")
        .param("distance", "100.0")
        .param("time", "10.0"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.distance", is(100.0)))
        .andExpect(jsonPath("$.time", is(10.0)))
        .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void TestArrowWithNoParameter() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.error", is("Missing distance or time parameter!")));
  }

  @Test
  public void TestCargoStatus() throws Exception {
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.caliber25", is(0)))
        .andExpect(jsonPath("$.caliber30", is(0)))
        .andExpect(jsonPath("$.caliber50", is(0)))
        .andExpect(jsonPath("$.shipstatus", is("empty")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void TestRocketCargoEmpty() throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".25")
        .param("amount", "0"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.received", is(".25")))
        .andExpect(jsonPath("$.amount", is(0)))
        .andExpect(jsonPath("$.shipstatus", is("empty")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void TestRocketCargoLoaded() throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".25")
        .param("amount", "5000"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.received", is(".25")))
        .andExpect(jsonPath("$.amount", is(5000)))
        .andExpect(jsonPath("$.shipstatus", is("40%")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void TestRocketCargoFull() throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".25")
        .param("amount", "12500"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.received", is(".25")))
        .andExpect(jsonPath("$.amount", is(12500)))
        .andExpect(jsonPath("$.shipstatus", is("full")))
        .andExpect(jsonPath("$.ready", is(true)));
  }

  @Test
  public void TestRocketCargoOverloaded() throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".25")
        .param("amount", "13000"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.received", is(".25")))
        .andExpect(jsonPath("$.amount", is(13000)))
        .andExpect(jsonPath("$.shipstatus", is("overloaded")))
        .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void TestRocketWithMissingParameters() throws Exception {
    mockMvc.perform(get("/rocket/fill"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.error", is("Please enter caliber and amount parameters!")));
  }

  @Test public void TestDraxListApple() throws Exception {
    mockMvc.perform(get("/drax/addfood")
        .param("name", "apple")
        .param("amount", "10")
        .param("calories", "10"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.foodList[0].name", is("apple")))
        .andExpect(jsonPath("$.foodList[0].amount", is(10)))
        .andExpect(jsonPath("$.foodList[0].calories", is(10)));
  }

  @Test public void TestDraxRemoveIndexTwo() throws Exception {
    mockMvc.perform(get("/drax/addfood")
        .param("name", "apple")
        .param("amount", "10")
        .param("calories", "10"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.foodList[0].name", is("apple")))
        .andExpect(jsonPath("$.foodList[0].amount", is(10)))
        .andExpect(jsonPath("$.foodList[0].calories", is(10)))
        .andExpect(jsonPath("$.foodList.length()",is(1)));
    mockMvc.perform(get("/drax/addfood")
        .param("name", "pizza")
        .param("amount", "10")
        .param("calories", "4000"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.foodList[1].name", is("pizza")))
        .andExpect(jsonPath("$.foodList[1].amount", is(10)))
        .andExpect(jsonPath("$.foodList[1].calories", is(4000)))
        .andExpect(jsonPath("$.foodList.length()",is(2)));
    /*mockMvc.perform(get("drax/remove")
        .param("index", "1"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.foodList.length()",is(1)));*/
  }

  @Test public void TestDraxIncreaseAmount() throws Exception {
    mockMvc.perform(get("/drax/addfood")
        .param("name", "apple")
        .param("amount", "10")
        .param("calories", "10"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.foodList[0].name", is("apple")))
        .andExpect(jsonPath("$.foodList[0].amount", is(10)))
        .andExpect(jsonPath("$.foodList[0].calories", is(10)));
    /*mockMvc.perform(get("/drax/increaseamount")
        .param("index", "20"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.foodList[0].name", is("apple")))
        .andExpect(jsonPath("$.foodList[0].amount", is(20)))
        .andExpect(jsonPath("$.foodList[0].calories", is(10)));*/
  }
}
