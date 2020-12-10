package com.biblioteque;

public class Personne {
	private int identifiant, carteFidelite;
	private String mail;
	public Personne(String mail, int carteFidelite,int id) {
		this.identifiant = id;
		this.carteFidelite = carteFidelite;
		this.mail = mail;
	}

	public int getCarteFidelite() {
		return carteFidelite;
	}

	public void setCarteFidelite(int carteFidelite) {
		this.carteFidelite = carteFidelite;
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
