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
public class Avion {
    
      private String NumeroAvion;
    private String NomAvion;
    private int Annee;
    final int NbrePlaces = 40;
    private String StatutAvion;
    private static int nbAvion=0;//nombre d'avions

    public Avion(String NumeroAvion, String NomAvion, int Annee, String StatutAvion) {
        this.NumeroAvion = NumeroAvion;
        this.NomAvion = NomAvion;
        this.Annee = Annee;
        this.StatutAvion = StatutAvion;
        nbAvion++;
    }

  

    public String getNumeroAvion() {
        return NumeroAvion;
    }

    public void setNumeroAvion(String NumeroAvion) {
        this.NumeroAvion = NumeroAvion;
    }

    public String getNomAvion() {
        return NomAvion;
    }

    public void setNomAvion(String NomAvion) {
        this.NomAvion = NomAvion;
    }

    public int getAnnee() {
        return Annee;
    }

    public void setAnnee(int Annee) {
        this.Annee = Annee;
    }

    public String getStatutAvion() {
        return StatutAvion;
    }

    public void setStatutAvion(String StatutAvion) {
        this.StatutAvion = StatutAvion;
    }



    public int getNbAvion() {
        return nbAvion;
    }

    public void setNbAvion(int nbAvion) {
        this.nbAvion = nbAvion;
    }

    @Override
    public String toString() {
        return "Avion{" + "NumeroAvion=" + NumeroAvion + ", NomAvion=" + NomAvion + ", Annee=" + Annee + ", NbrePlaces=" + NbrePlaces + ", StatutAvion=" + StatutAvion  + ", nbAvion=" + nbAvion + '}';
    }

  

    public void AjouterAvion(Avion avion) {
   

    }
        
    public void AjouterAvion(String NumeroAvion, String NomAvion, int Annee, int StatutAvion, int nbAvion){
      
    }
   

    public static Avion findAvionByNum(String NumeroAvion) {
       
        
        return null;

    }
}
    
}
