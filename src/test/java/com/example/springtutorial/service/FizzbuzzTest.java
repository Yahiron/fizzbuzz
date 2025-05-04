package com.example.springtutorial.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

public class FizzbuzzTest {
  
  @Test
  @Description("1を入力したときに1を返すこと")
  void test01() {
    FizzbuzzService target = new FizzbuzzService();
    String action = target.fizzbuzz(1);
    
    assertThat(action).isEqualTo("1");
  }

  @Test
  @Description("2を入力したときに2を返すこと")
  void test02() {
    FizzbuzzService target = new FizzbuzzService();
    String action = target.fizzbuzz(2);
    
    assertThat(action).isEqualTo("2");
  } 

  @Test
  @Description("3を入力したときにfizzを返すこと")
  void test03() {
    FizzbuzzService target = new FizzbuzzService();
    String action = target.fizzbuzz(3);
    
    assertThat(action).isEqualTo("fizz");
  } 
  
}
