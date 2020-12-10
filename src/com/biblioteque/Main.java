package com.biblioteque;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
		MaisonOptique maisonOptique = new MaisonOptique();
		int choix1 = 0, choix2 = 0, id, dateEdition, num_tele, carteFidelite;
		String titre, edition, nom, prenom, surnom, mail;
		do {
			System.out.println("*** - Gestion Livre taper 1");
			System.out.println("*** - Gestion Lecteur taper 2");
			System.out.println("*** - Gestion Bienfaiteur taper 3");
			System.out.println("*** - Pour quitter le programme taper 0");
			choix1 = in.nextInt();
			do {
				switch(choix1) {
					case 1: System.out.println("** - Ajouter un Livre taper 1");
					        System.out.println("** - Supprimer un Livre taper 2");
					        System.out.println("** - Modifier un Livre taper 3");
					        System.out.println("** - Afficher list des Livres taper 4");
					        System.out.println("** - Rechercher un Livre taper 5");
					        System.out.println("** - Pour retourner au programme principal taper 0");
					        break;
					case 2: System.out.println("** - Ajouter un Lecteur taper 1");
					        System.out.println("** - Supprimer un Lecteur taper 2");
					        System.out.println("** - Modifier un Lecteur taper 3");
					        System.out.println("** - Afficher list des Lecteurs taper 4");
					        System.out.println("** - Rechercher un Lecteur taper 5");
					        System.out.println("** - Pour retourner au programme principal taper 0");
					        break;
					case 3: System.out.println("** - Ajouter un Bienfaiteur taper 1");
					        System.out.println("** - Supprimer un Bienfaiteur taper 2");
					        System.out.println("** - Modifier un Bienfaiteur taper 3");
					        System.out.println("** - Afficher list des Bienfaiteurs taper 4");
					        System.out.println("** - Rechercher un Bienfaiteur taper 5");
					        System.out.println("** - Pour retourner au programme principal taper 0");
					        break;
					case 0: System.out.println("** - Fin de programme");
			        		break;
			        default: System.out.println("** - Votre choix est invalide");
			        		break;
				}
			    choix2 = in.nextInt();
			    
			    
			    if(choix1 == 1) {
			    	switch(choix2){
				    	case 0: 
				    		in.notifyAll();
							break;
						case 1: 
							System.out.println("Entrer le titre de livre :");
							in.nextLine();
							titre = in.nextLine();
							System.out.println("Entrer l'édition de livre :");
							edition = in.nextLine();
							System.out.println("Entrer la date d’édition de livre :");
							dateEdition = in.nextInt();
							Livre livre = new Livre(titre, edition, dateEdition);
							maisonOptique.AjouterLivre(livre);
							break;
						case 2: 
							System.out.println("Enter id de livre");
							id = in.nextInt();
							maisonOptique.SupprimerLivre(id);
							break;
						case 3:
							System.out.println("Entrer l'id de livre :");
							id = in.nextInt();
							if(maisonOptique.RechercherLivre(id) != null) {
								System.out.println("Entrer le titre de livre :");
								in.nextLine();
								titre = in.nextLine();
								System.out.println("Entrer l'édition de livre :");
								edition = in.nextLine();
								System.out.println("Entrer la date d’édition de livre :");
								dateEdition = in.nextInt();
								maisonOptique.ModifierLivre(titre, edition, dateEdition, id);
							}
							break;
						case 4: 
							maisonOptique.AfficherLivres();
							break;
						case 5: 
							System.out.println("Entrer l'id de livre :");
							id = in.nextInt();
							maisonOptique.AfficherLivre(id);
							break;
						default : System.out.println("** - Votre choix est invalide"); break;
					}
			    }
			    else if(choix1 == 2) {
			    	switch(choix2){
						case 0: 
							System.out.println("\n\n");
							break;
						case 1: 
							System.out.println("Entrer le nom de lecteur :");
							in.nextLine();
							nom = in.nextLine();
							System.out.println("Entrer le prenom de lecteur :");
							prenom = in.nextLine();
							System.out.println("Entrer le mail de lecteur :");
							mail = in.nextLine();
							System.out.println("Entrer le numéro téléphone de lecteur :");
							num_tele = in.nextInt();
							System.out.println("Entrez le nombre de livres que ce lecteur a lu :");
							carteFidelite = in.nextInt();
							Lecteur lecteur= new Lecteur(nom, prenom, mail, num_tele, carteFidelite);
							maisonOptique.AjouterLecteur(lecteur);
							break;
						case 2: 
							System.out.println("Enter id de lecteur");
							id = in.nextInt();
							maisonOptique.SupprimerLecteur(id);
							break;
						case 3:
							System.out.println("Entrer l'id de lecteur :");
							id = in.nextInt();
							if(maisonOptique.RechercherLecteur(id) != null) {
								System.out.println("Entrer le nom de lecteur :");
								in.nextLine();
								nom = in.nextLine();
								System.out.println("Entrer le prenom de lecteur :");
								prenom = in.nextLine();
								System.out.println("Entrer le mail de lecteur :");
								mail = in.nextLine();
								System.out.println("Entrer le numéro téléphone de lecteur :");
								num_tele = in.nextInt();
								System.out.println("Entrez le nombre de livres que ce lecteur a lu :");
								carteFidelite = in.nextInt();
								maisonOptique.ModifierLecteur(nom, prenom, num_tele, mail, carteFidelite, id);
							}
							break;
						case 4: 
							maisonOptique.Afficherlecteurs();
							break;
						case 5: 
							System.out.println("Entrer l'id de lecteur :");
							id = in.nextInt();
							maisonOptique.AfficherLecteur(id);
							break;
						default : System.out.println("** - Votre choix est invalide"); break;
					}
			    }
			    
			    
			    else if(choix1 == 3) {
			    	switch(choix2){
						case 0: 
							System.out.println("\n\n");
							break;
						case 1: 
							System.out.println("Entrer le surnom de Bienfaiteur :");
							in.nextLine();
							surnom = in.nextLine();
							System.out.println("Entrer le mail de Bienfaiteur :");
							mail = in.nextLine();
							System.out.println("Entrez le nombre de livres que ce Bienfaiteur a déposé :");
							carteFidelite = in.nextInt();
							Bienfaiteur bienfaiteur = new Bienfaiteur(surnom, mail, carteFidelite);
							maisonOptique.AjouterBienfaiteur(bienfaiteur);
							break;
						case 2: 
							System.out.println("Enter id de Bienfaiteur");
							id = in.nextInt();
							maisonOptique.SupprimerBienfaiteur(id);
							break;
						case 3:
							System.out.println("Entrer l'id de Bienfaiteur :");
							id = in.nextInt();
							if(maisonOptique.RechercherBienfaiteur(id) != null) {
								System.out.println("Entrer le surnom de Bienfaiteur :");
								in.nextLine();
								surnom = in.nextLine();
								System.out.println("Entrer le mail de Bienfaiteur :");
								mail = in.nextLine();
								System.out.println("Entrez le nombre de livres que ce Bienfaiteur a déposé :");
								carteFidelite = in.nextInt();
								maisonOptique.ModifierBienfaiteur(surnom, mail, carteFidelite, id);
							}
							break;
						case 4: 
							maisonOptique.AfficherBienfaiteurs();
							break;
						case 5: 
							System.out.println("Entrer l'id de Bienfaiteur :");
							id = in.nextInt();
							maisonOptique.AfficherBienfaiteur(id);
							break;
						default : System.out.println("** - Votre choix est invalide"); break;
					}
			    }
			}while(choix2 != 0);
		}while(choix1 != 0);
	}
}
