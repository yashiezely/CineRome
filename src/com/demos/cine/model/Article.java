package com.demos.cine.model;

public class Article {
	private double prixHT;
	private String reference;
	private String designation;
	private int qteStock;

	
	public Article(double prixHT, String reference, String designation, int qteStock) {
		super();
		this.prixHT = prixHT;
		this.reference = reference;
		this.designation = designation;
		this.qteStock = qteStock;
	}


	public double getPrixHT() {
		return prixHT;
	}


	public String getReference() {
		return reference;
	}


	public String getDesignation() {
		return designation;
	}



	public int getQteStock() {
		return qteStock;
	}


	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public void incrementeStock (int qte){
		qteStock+=qte;
	}

	public void decrementeStock (int qte){
		qteStock-=qte;
	}

	@Override
	public String toString() {
		return "Article [prixHT=" + prixHT + ", reference=" + reference + ", designation=" + designation + ", qteStock="
				+ qteStock + "]";
	}

}
