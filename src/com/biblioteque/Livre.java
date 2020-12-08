package com.biblioteque;

import java.util.Date;

public class Livre {
	private int identifiant;
	private String titre, edition;
	private Date dateEdition;
	public static int id = 0;
	
	public Livre(String titre, String edition, Date dateEdition) {
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

	public Date getDateEdition() {
		return dateEdition;
	}

	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}

	public int getIdentifiant() {
		return identifiant;
	}
	
}
