package com.biblioteque;

public class Lecteur extends Personne {
	private String nom, prenom;
	private int num_tele;
	public static int id = 0;
	public Lecteur(String nom, String prenom, String mail, int num_tele, int carteFidelite) {
		super(mail, carteFidelite, ++id);
		this.nom = nom;
		this.prenom = prenom;
		this.num_tele = num_tele;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNum_tele() {
		return num_tele;
	}
	public void setNum_tele(int num_tele) {
		this.num_tele = num_tele;
	}
	
}
