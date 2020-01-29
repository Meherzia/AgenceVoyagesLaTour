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
public abstract class Pilote extends Personne{
    private String numero;
    private String poste;
    private static int nbPilotes=0;//nombre de pilotes

    public Pilote(String numero, String poste, String nom, String prenom, String adresse, String telephone) {
        super(nom, prenom, adresse, telephone);
        this.numero = numero;
        this.poste = poste;
        nbPilotes++;
    }

    public String getNumero() {
        return numero;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    @Override
    public String toString() {
        return "Pilote{" + "numero=" + numero + ", poste=" + poste + '}';
    }

    @Override
    void ajouterPersonne() {
    Pilote p=new Pilote(String numero, String poste, String nom, String prenom, String adresse, String telephone);
    
    }

    @Override
    void modifierPersonne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}       

