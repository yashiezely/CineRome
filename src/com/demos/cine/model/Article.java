package com.demos.cine.model;

public class Article {
	private double prixHT;
	private String reference;
	private String designation;
	private int qteStock;
	private String type;

	
	public Article(String reference, String designation,double prixHT,int qteStock) {
		super();
		this.prixHT = prixHT;
		this.reference = reference;
		this.designation = designation;
		this.qteStock = qteStock;
	}



	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
