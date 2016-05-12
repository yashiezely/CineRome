package com.demos.cine.model;

public class LignePanier {

	Article a;
	int qteCommande;
	

	public LignePanier(Article a, int qteCommande) {
		this.a = a;
		this.qteCommande = qteCommande;
	}

	public Article getA() {
		return a;
	}

	public int getQteCommande() {
		return qteCommande;
	}

	
	
}
