package com.paimentStrategyProject.model;

import com.paimentStrategyProject.strategy.IPaiementStrategy;

public class Article {
	
	

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String nom;
	private int prix;

	public Article(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {
		return this.nom;
	}

	public int getPrix() {
		return this.prix;
	}

	public void payer(IPaiementStrategy methode) {
	
		int montant = this.getPrix();
		methode.payer(montant);
	}

}
