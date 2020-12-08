package com.biblioteque;

import java.util.Date;

public class Livre {
	private int identifiant;
	private String titre, edition;
	private Date dateEdition;
	public static int id = 0;
	public Livre(String titre, String edition, Date dateEdition) {
		id++;
		this.identifiant = id;
		this.titre = titre;
		this.edition = edition;
		this.dateEdition = dateEdition;
	}
}
