/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencevoyageslatour;

/**
 *
 * @author meheriza & rickie lea
 */
public abstract class Personne {//classe abstraite non instanciable

    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private static int nbPersonnes=0;//nombre de personnes

    public Personne(String nom, String prenom, String adresse, String telephone) {//constructeur de Personne
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        nbPersonnes++;
    }
//On utilise les getters et setters car les attributs sont private 
    //on n'a pas ajouter des setters pour nom et prenom car on veut qu'il restent non modifiables
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static int getNbPersonnes() {
        return nbPersonnes;
    }

    public static void setNbPersonnes(int nbPersonnes) {
        Personne.nbPersonnes = nbPersonnes;
    }
//Fournir les caracteristiques d'une Personne sous forme d'un objet de la classe String
    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone=" + telephone + '}';
    }
// deuxmethode abstraites a implementer dans les sous classes Pilote et Client
abstract void ajouterPersonne();
abstract void modifierPersonne();
}
