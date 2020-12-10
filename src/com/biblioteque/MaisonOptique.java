package com.biblioteque;

import java.util.ArrayList;
import java.util.List;

public class MaisonOptique {
	private List<Bienfaiteur> listBienfaiteur;
	private List<Livre> listLivre;
	private List<Lecteur> listLecteur;
	private Bienfaiteur B1;
	private Livre L1;
	private Lecteur L2;
	
	public MaisonOptique() {
		listBienfaiteur = new ArrayList<Bienfaiteur>();
		listLivre = new ArrayList<Livre>();
		listLecteur = new ArrayList<Lecteur>();
	}
	
	// les methodes des Bienfaiteur
	
	public void AjouterBienfaiteur(Bienfaiteur bienfaiteur) {
		// TODO Auto-generated method stub
		listBienfaiteur.add(bienfaiteur);
		System.out.println("Le bienfaiteur a été ajouté avec success"+ "\n\n");
	}
	
	public Bienfaiteur RechercherBienfaiteur(int id){
		boolean test = false;
		for(int i = 0;i<listBienfaiteur.size();i++) {	
			if(listBienfaiteur.get(i).getIdentifiant() == id) {
				B1 = listBienfaiteur.get(i);
				test = true;
				break;
			}
		}
		if(test == false) {
			System.out.println("pardon il n'exisit pas se bienfaiteur"+ "\n\n");
			return null;
		}
		else {
			return B1;
		}
	}
	
	public void SupprimerBienfaiteur(int id){
		
		if(RechercherBienfaiteur(id) != null) {
			B1 = RechercherBienfaiteur(id);
			listBienfaiteur.remove(B1);
			System.out.println("Le bienfaiteur a été supprimé avec success"+ "\n\n");
		}
	}
	
	public void ModifierBienfaiteur(String surnom, String mail, int carteFidelite, int id){
		if(RechercherBienfaiteur(id) != null) {
			B1 = RechercherBienfaiteur(id);
			B1.setSurnom(surnom);
			B1.setMail(mail);
			B1.setCarteFidelite(carteFidelite);
			System.out.println("Le bienfaiteur a été modifier avec success"+ "\n\n");
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
			System.out.println("Surnom : "+B1.getSurnom()+", mail : "+B1.getMail()+", le nombre des livres offerts : "+B1.getCarteFidelite()+", type : "+type+ "\n\n");
		}
	}
	
	public void AfficherBienfaiteurs() {
		int j=0;
		String type;
		System.out.println("\n\nList Bienfaiteurs");
		for(int i = 0;i<listBienfaiteur.size();i++) {	
			if(listBienfaiteur.get(i).getCarteFidelite() >=3) {
				type="super-fidèle";
				j++;
			}
			else {
				type="normal";
			}
			System.out.println("Surnom : " + listBienfaiteur.get(i).getSurnom() + ", mail : " +  listBienfaiteur.get(i).getMail() + ", le nombre des livres offerts : " + listBienfaiteur.get(i).getCarteFidelite() + ", type : " + type);
		}
		System.out.println("Le nombre total des bienfaiteurs est : " + listBienfaiteur.size());
		System.out.println("Le nombre total des bienfaiteurs super-fidèles est : " + j + "\n\n");
	}
	
	
	// les methodes des Livre
	
	public void AjouterLivre(Livre livre) {
		// TODO Auto-generated method stub
		listLivre.add(livre);
		System.out.println("Le livre a été ajouté avec success"+ "\n\n");
	}
	public Livre RechercherLivre(int id){
		boolean test = false;
		for(int i = 0;i<listLivre.size();i++) {	
			if(listLivre.get(i).getIdentifiant() == id) {
				L1 = listLivre.get(i);
				test = true;
				break;
			}
		}
		if(test == false) {
			System.out.println("pardon il n'exisit pas se livre"+ "\n\n");
			return null;
		}
		else {
			return L1;
		}
	}
	
	public void SupprimerLivre(int id){
		
		if(RechercherLivre(id) != null) {
			L1 = RechercherLivre(id);
			listLivre.remove(L1);
			System.out.println("Le livre a été supprimé avec success"+ "\n\n");
		}
	}
	
	public void ModifierLivre(String titre, String edition, int dateEdition, int id){
		if(RechercherLivre(id) != null) {
			L1 = RechercherLivre(id);
			L1.setTitre(titre);
			L1.setEdition(edition);
			L1.setDateEdition(dateEdition);
			System.out.println("Le livre a été modifier avec success"+ "\n\n");
		}
	}
	
	public void AfficherLivre(int id){
		if(RechercherBienfaiteur(id) != null) {
			L1 = RechercherLivre(id);
			System.out.println("titre : " + L1.getTitre() + ", edition : " +  L1.getEdition() + ", dateEdition : " + L1.getDateEdition()+ "\n\n");
		}
	}
	
	public void AfficherLivres() {
		for(int i = 0;i<listLivre.size();i++) {	
			System.out.println("titre : " + listLivre.get(i).getTitre() + ", edition : " +  listLivre.get(i).getEdition() + ", dateEdition : " + listLivre.get(i).getDateEdition());
		}
		System.out.println("Le nombre total des livres est : " + listLivre.size()+ "\n\n");
	}
	
	
	// les methodes des Lecteur
	
		public void AjouterLecteur(Lecteur lecteur) {
			// TODO Auto-generated method stub
			listLecteur.add(lecteur);
			System.out.println("Le lecteur a été ajouté avec success"+ "\n\n");
		}
		public Lecteur RechercherLecteur(int id){
			boolean test = false;
			for(int i = 0;i<listLecteur.size();i++) {	
				if(listLecteur.get(i).getIdentifiant() == id) {
					L2 = listLecteur.get(i);
					test = true;
					break;
				}
			}
			if(test == false) {
				System.out.println("pardon il n'exisit pas se lecteur"+ "\n\n");
				return null;
			}
			else {
				return L2;
			}
		}
		
		public void SupprimerLecteur(int id){
			
			if(RechercherLecteur(id) != null) {
				L2 = RechercherLecteur(id);
				listLecteur.remove(L2);
				System.out.println("Le lecteur a été supprimé avec success"+ "\n\n");
			}
		}
		
		public void ModifierLecteur(String nom, String prenom, int num_tele, String mail, int carteFidelite, int id){
			if(RechercherLecteur(id) != null) {
				L2 = RechercherLecteur(id);
				L2.setNom(nom);
				L2.setPrenom(prenom);
				L2.setNum_tele(num_tele);
				L2.setMail(mail);
				L2.setCarteFidelite(carteFidelite);
				System.out.println("Le livre a été modifier avec success"+ "\n\n");
			}
		}
		
		public void AfficherLecteur(int id){
			if(RechercherLecteur(id) != null) {
				L2 = RechercherLecteur(id);
				String type;
				if(L2.getCarteFidelite() >=3) {
					type="fidèle";
				}
				else {
					type="normal";
				}
				System.out.println("nom : " + L2.getNom()+ ", prenom : " +  L2.getPrenom() + ", num_tele : " + L2.getNum_tele() +", mail : "+L2.getMail()+", le nombre des livres offerts : "+L2.getCarteFidelite()+", type : "+type+ "\n\n");
			}
		}
		
		public void Afficherlecteurs() {
			int j=0;
			String type;
			System.out.println("\n\nList Lecteurs");
			for(int i = 0;i<listLecteur.size();i++) {	
				if(listLecteur.get(i).getCarteFidelite() >=3) {
					type="fidèle";
					j++;
				}
				else {
					type="normal";
				}
				System.out.println("nom : " + listLecteur.get(i).getNom()+ ", prenom : " +  listLecteur.get(i).getPrenom() + ", num_tele : " + listLecteur.get(i).getNum_tele() +", mail : "+listLecteur.get(i).getMail()+", le nombre des livres offerts : "+listLecteur.get(i).getCarteFidelite()+", type : "+type);
			}
			System.out.println("Le nombre total des lecteurs est : " + listLecteur.size());
			System.out.println("Le nombre total des Lecteurs fidèles est : " + j+ "\n\n");
		}
	
}
