package com.biblioteque;

public class Bienfaiteur  {
	private int identifiant, carteFidelite;
	private String surnom, mail;
	public static int id = 0;
	
	public Bienfaiteur(String surnom, String mail, int carteFidelite) {
		id++;
		this.identifiant = id;
		this.carteFidelite = carteFidelite;
		this.surnom = surnom;
		this.mail = mail;
	}

	public int getCarteFidelite() {
		return carteFidelite;
	}

	public void setCarteFidelite(int carteFidelite) {
		this.carteFidelite = carteFidelite;
	}

	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getIdentifiant() {
		return identifiant;
	}
	
	
}
