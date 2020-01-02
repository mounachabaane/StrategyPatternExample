package com.paimentStrategyProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.paimentStrategyProject.model.Article;
import com.paimentStrategyProject.strategy.CarteDeCreditStrategy;

class StrategyTest {
	Article article1 = new Article("Livre : 'Today Is My Day'", 81);

	@Test
	void pay_with_Credit_Carte_Strategy() {
		article1.payer(new CarteDeCreditStrategy("1234567890123456", "312", "2020-01-02"));

		//assertEquals("81€ payés par carte de crédit.", new CarteDeCreditStrategy("1234567890123456", "312", "2020-01-02"));

	}

}
