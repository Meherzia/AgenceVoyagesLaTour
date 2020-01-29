/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencevoyageslatour;

/**
 *
 * @author rocky
 */
public class Vol {
    

  private int numVol;
  private int numSiege; //FK siege
  private String compagnie;
  private String villeDepart;
  private String villeArrive;
  private int pilote; // FK pilote
  private int client; // ?? ou copilote? 

    public int getNumVol() {
        return numVol;
    }
    public void setNumVol(int numVol) {
        this.numVol = numVol;
    }

    public int getNumSiege() {
        return numSiege;
    }
    public void setNumSiege(int numSiege) {
        this.numSiege = numSiege;
    }

    public String getCompagnie() {
        return compagnie;
    }
    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public String getVilleDepart() {
        return villeDepart;
    }
    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrive() {
        return villeArrive;
    }
    public void setVilleArrive(String villeArrive) {
        this.villeArrive = villeArrive;
    }

    public int getPilote() {
        return pilote;
    }
    public void setPilote(int pilote) {
        this.pilote = pilote;
    }

    public int getCopilote() {
        return copilote;
    }
    public void setCopilote(int copilote) {
        this.copilote = copilote;
    }



public String toString(){

}

public double prixVol(){

}

}
