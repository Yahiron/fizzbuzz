package com.example.springtutorial.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

public class FizzbuzzTest {
  
  @Test
  @Description("1を入力したときに1を出力すること")
  void test01() {
    FizzbuzzService target = new FizzbuzzService();
    String action = target.fizzbuzz(1);
    
    assertThat(action).isEqualTo("1");
  }

}
