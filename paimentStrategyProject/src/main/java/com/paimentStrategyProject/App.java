package com.paimentStrategyProject;

import com.paimentStrategyProject.model.Article;
import com.paimentStrategyProject.strategy.CarteDeCreditStrategy;
import com.paimentStrategyProject.strategy.PaypalStrategy;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Article article1 = new Article("Livre : 'Tout savoir sur le pattern Strategy'", 25);
		Article article2 = new Article("Piano steinway & sons d274", 155690);

		article1.payer(new PaypalStrategy("idExemple", "passwordExemple"));

		// pay by credit card
		article2.payer(new CarteDeCreditStrategy("1234567890123456", "786", "12/15"));
	}
}
