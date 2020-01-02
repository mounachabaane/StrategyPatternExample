package com.paimentStrategyProject.strategy;

public class CarteDeCreditStrategy implements PaiementStrategy {

	private String numeroCarte;
	private String cryptogramme;
	private String dateExpiration;

	public CarteDeCreditStrategy(String num, String crypto, String date) {
		this.numeroCarte = num;
		this.cryptogramme = crypto;
		this.dateExpiration = date;
	}

	public void payer(int montant) {
		System.out.println(montant + "€ payés par carte de crédit.");

	}

}
