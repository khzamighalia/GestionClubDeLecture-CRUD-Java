package com.biblioteque;

public class Bienfaiteur extends Personne {
	private String surnom;
	public static int id = 0;
	
	public Bienfaiteur(String surnom, String mail, int carteFidelite) {
		super(mail,carteFidelite,++id);
		this.surnom = surnom;
	}


	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}
}
