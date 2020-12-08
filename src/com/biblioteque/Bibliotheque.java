package com.biblioteque;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	private List<Bienfaiteur> Bienfaiteur = new ArrayList<Bienfaiteur>();
	private List<Livre> Livre = new ArrayList<Livre>();
	private Bienfaiteur B1;
	
	public void AjouterBienfaiteur(Bienfaiteur e) {
		// TODO Auto-generated method stub
		Bienfaiteur.add(e);
		System.out.println("Le bienfaiteur a été ajouté avec success");
	}
	
	public void SupprimerBienfaiteur(int id){
		
		if(RechercherBienfaiteur(id) == null) {
			System.out.println("pardon il n'exisit pas se bienfaiteur");
		}
		else {
			B1 = RechercherBienfaiteur(id);
			Bienfaiteur.remove(B1);
			System.out.println("Le bienfaiteur a été supprimé avec success");
		}
	}
	
	public void ModifierBienfaiteur(String surnom, String mail, int carteFidelite, int id){
		if(RechercherBienfaiteur(id) == null) {
			System.out.println("pardon il n'exisit pas se bienfaiteur");
		}
		else {
			B1 = RechercherBienfaiteur(id);
			B1.setSurnom(surnom);
			B1.setMail(mail);
			B1.setCarteFidelite(carteFidelite);
			System.out.println("Le bienfaiteur a été modifier avec success");
		}
		
	}
	
	public Bienfaiteur RechercherBienfaiteur(int id){
		boolean test = false;
		for(int i = 0;i<Bienfaiteur.size();i++) {	
			if(Bienfaiteur.get(i).getIdentifiant() == id) {
				B1 = Bienfaiteur.get(i);
				test = true;
				break;
			}
		}
		if(test == false) {
			return null;
		}
		else {
			return B1;
		}
	}
	
}
