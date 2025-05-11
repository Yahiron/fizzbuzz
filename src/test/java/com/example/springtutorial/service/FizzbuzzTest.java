package com.example.springtutorial.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

public class FizzbuzzTest {

	@Test
	@Description("3と5の倍数以外を入力したときにその数字を返すこと")
	void test01() {
		FizzbuzzService target = new FizzbuzzService();
		String actionA = target.fizzbuzz(1);

		assertThat(actionA).isEqualTo("1");

		String actionB = target.fizzbuzz(2);

		assertThat(actionB).isEqualTo("2");

		String actionC = target.fizzbuzz(4);

		assertThat(actionC).isEqualTo("4");

	}

	@Test
	@Description("3の倍数を入力したときにfizzを返すこと")
	void test02() {
		FizzbuzzService target = new FizzbuzzService();
		String actionA = target.fizzbuzz(3);

		assertThat(actionA).isEqualTo("fizz");

		String actionB = target.fizzbuzz(6);

		assertThat(actionB).isEqualTo("fizz");

		String actionC = target.fizzbuzz(9);

		assertThat(actionC).isEqualTo("fizz");

	}

	@Test
	@Description("5の倍数を入力したときにbuzzを返すこと")
	void test03() {
		FizzbuzzService target = new FizzbuzzService();
		String actionA = target.fizzbuzz(5);

		assertThat(actionA).isEqualTo("buzz");

		String actionB = target.fizzbuzz(10);

		assertThat(actionB).isEqualTo("buzz");

		String actionC = target.fizzbuzz(20);

		assertThat(actionC).isEqualTo("buzz");
	}

	@Test
	@Description("15を入力したときにfizzbuzzを返すこと")
	void test04() {
		FizzbuzzService target = new FizzbuzzService();
		String action = target.fizzbuzz(15);

		assertThat(action).isEqualTo("fizzbuzz");
	}
}
