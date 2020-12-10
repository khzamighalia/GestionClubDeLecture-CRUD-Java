package com.biblioteque;

public class Livre {
	private int identifiant, dateEdition;
	private String titre, edition;
	public static int id = 0;
	
	public Livre(String titre, String edition, int dateEdition) {
		this.identifiant = ++id;
		this.titre = titre;
		this.edition = edition;
		this.dateEdition = dateEdition;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public int getDateEdition() {
		return dateEdition;
	}

	public void setDateEdition(int dateEdition) {
		this.dateEdition = dateEdition;
	}

	public int getIdentifiant() {
		return identifiant;
	}
	
}
