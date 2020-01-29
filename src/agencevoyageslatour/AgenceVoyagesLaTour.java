/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencevoyageslatour;
import java.util.Scanner;
/**
 *
 * @author meheriza & rickie lea
 */
public class AgenceVoyagesLaTour {
static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choix = 0;
        while (true) {
            System.out.println("======= Menu =========");
            System.out.println("1 - Ajouter avion");
            System.out.println("2 - Ajouter un pilote ");
            System.out.println("3 - Modifier les informations de pilote");
            System.out.println("4 - Ajouter un vol");
            System.out.println("5 - Modifier un vol");
            System.out.println("6 - Annuler un vol");
            System.out.println("7 - Afficher tous les vols");
            System.out.println("8 - Afficher les vols annulés");
            System.out.println("9 - Ajouter une reservation");
            System.out.println("10 - Ajouter un siège assigné à un avion");
            System.out.println("11 - Modifier une réservation");
            System.out.println("12 – Annuler une réservation");
            System.out.println("13 – Afficher les reservations");
            System.out.println("14 – Ajouter une facture");
            System.out.println("15- Rechercher une facture par numéro de facture");
            System.out.println("16 - Afficher toutes les factures");
            System.out.println("17 – Ajouter une assurance");
            System.out.println("18 – Quitter");
            System.out.println("Votre choix:");
            choix = sc.nextInt();
            sc.nextLine();

            while (choix < 1 || choix > 11) {
                System.out.print("Choix incorrect. ");
                System.out.println("Votre choix:");
                choix = sc.nextInt();
                sc.nextLine();
            }

            switch (choix) {
                case 1:
                    AjouterAvion();
                    break;
                case 2:
                    AjouterPersonne();
                    break;
                case 3:
                    ModifierPersonne();
                    break;
                case 4:
                    AjouterVol();
                    break;
                case 5:
                    ModifierVol();
                    break;
                case 6:
                    AnnulerVol();
                    break;
                case 7:
                    AfficherVols();
                    break;
                case 8:
                    AfficherVolsAnnulés();
                    break;
                case 9:
                    AjouterReservation();
                    break;
                case 10:
                    Ajouter Siege
                    ();
                    break;
                case 11:
                    ModifierResservation();
                    break;
                case 12:
                    AnnulerResservation();
                    break;
                case 13:
                    AfficherResservation();
                    break;
                case 14:
                    AjouterFacture();
                    break;
                case 15:
                    RechercherFacture();
                    break;
                case 16:
                    AfficherFactures();
                    break;
                case 17:
                    AjouterAssurance();
                    break;
                case 18:
                    Quitter();
                    break;

            }

        }
        
  }
}