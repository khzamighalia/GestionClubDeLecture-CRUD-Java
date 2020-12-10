package com.biblioteque;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bibliotheque {
	private List<Bienfaiteur> Bienfaiteur;
	private List<Livre> Livre;
	private Bienfaiteur B1;
	private Livre L1;
	
	public Bibliotheque() {
		Bienfaiteur = new ArrayList<Bienfaiteur>();
		Livre = new ArrayList<Livre>();
	}
	
	public void AjouterBienfaiteur(Bienfaiteur bienfaiteur) {
		// TODO Auto-generated method stub
		Bienfaiteur.add(bienfaiteur);
		System.out.println("Le bienfaiteur a été ajouté avec success");
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
			System.out.println("pardon il n'exisit pas se bienfaiteur");
			return null;
		}
		else {
			return B1;
		}
	}
	
	public void SupprimerBienfaiteur(int id){
		
		if(RechercherBienfaiteur(id) != null) {
			B1 = RechercherBienfaiteur(id);
			Bienfaiteur.remove(B1);
			System.out.println("Le bienfaiteur a été supprimé avec success");
		}
	}
	
	public void ModifierBienfaiteur(String surnom, String mail, int carteFidelite, int id){
		if(RechercherBienfaiteur(id) != null) {
			B1 = RechercherBienfaiteur(id);
			B1.setSurnom(surnom);
			B1.setMail(mail);
			B1.setCarteFidelite(carteFidelite);
			System.out.println("Le bienfaiteur a été modifier avec success");
		}
	}
	
	public void AfficherBienfaiteur(int id){
		if(RechercherBienfaiteur(id) != null) {
			B1 = RechercherBienfaiteur(id);
			String type;
			if(B1.getCarteFidelite() >=3) {
				type="super-fidèle";
			}
			else {
				type="normal";
			}
			System.out.println("Surnom : "+B1.getSurnom()+", mail : "+B1.getMail()+", le nombre des livres offerts : "+B1.getCarteFidelite()+", type : "+type);
		}
	}
	
	public void AfficherBienfaiteurs() {
		int j=0;
		String type;
		System.out.println("\n\nList Bienfaiteurs");
		for(int i = 0;i<Bienfaiteur.size();i++) {	
			if(Bienfaiteur.get(i).getCarteFidelite() >=3) {
				type="super-fidèle";
				j++;
			}
			else {
				type="normal";
			}
			System.out.println("Surnom : " + Bienfaiteur.get(i).getSurnom() + ", mail : " +  Bienfaiteur.get(i).getMail() + ", le nombre des livres offerts : " + Bienfaiteur.get(i).getCarteFidelite() + ", type : " + type);
		}
		System.out.println("Le nombre total des bienfaiteurs est : " + Bienfaiteur.size());
		System.out.println("Le nombre total des bienfaiteurs super-fidèles est : " + j);
	}
	
	public void AjouterLivre(Livre livre) {
		// TODO Auto-generated method stub
		Livre.add(livre);
		System.out.println("Le livre a été ajouté avec success");
	}
	public Livre RechercherLivre(int id){
		boolean test = false;
		for(int i = 0;i<Livre.size();i++) {	
			if(Livre.get(i).getIdentifiant() == id) {
				L1 = Livre.get(i);
				test = true;
				break;
			}
		}
		if(test == false) {
			System.out.println("pardon il n'exisit pas se livre");
			return null;
		}
		else {
			return L1;
		}
	}
	
	public void SupprimerLivre(int id){
		
		if(RechercherLivre(id) != null) {
			L1 = RechercherLivre(id);
			Livre.remove(L1);
			System.out.println("Le livre a été supprimé avec success");
		}
	}
	
	public void ModifierLivre(String titre, String edition, int dateEdition, int id){
		if(RechercherLivre(id) != null) {
			L1 = RechercherLivre(id);
			L1.setTitre(titre);
			L1.setEdition(edition);
			L1.setDateEdition(dateEdition);
			System.out.println("Le livre a été modifier avec success");
		}
	}
	
	public void AfficherLivre(int id){
		if(RechercherBienfaiteur(id) != null) {
			L1 = RechercherLivre(id);
			System.out.println("titre : " + L1.getTitre() + ", edition : " +  L1.getEdition() + ", dateEdition : " + L1.getDateEdition());
		}
	}
	
	public void AfficherLivres() {
		for(int i = 0;i<Livre.size();i++) {	
			System.out.println("titre : " + Livre.get(i).getTitre() + ", edition : " +  Livre.get(i).getEdition() + ", dateEdition : " + Livre.get(i).getDateEdition());
		}
		System.out.println("Le nombre total des livres est : " + Livre.size());
	}
}
