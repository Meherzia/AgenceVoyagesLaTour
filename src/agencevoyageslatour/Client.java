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
public abstract class Client  extends Personne{
    private int numPasseport;
    private static int nbClients=0;//nombre declients

    public Client(int numPasseport, String nom, String prenom, String adresse, String telephone) {
        super(nom, prenom, adresse, telephone);
        this.numPasseport = numPasseport;
        nbClients++;
    }

    public int getNumPasseport() {
        return numPasseport;
    }

    public void setNumPasseport(int numPasseport) {
        this.numPasseport = numPasseport;
    }

    @Override
    public String toString() {
        return "Client{" + "numPasseport=" + numPasseport + '}';
    }

    @Override
    void ajouterPersonne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void modifierPersonne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
