/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author MARCELLINA
 */
public class ClasseCommander {
    private String idCom;
    private String NomCli;
    private String PrenCli;
    private String dateCom;
    private String nomAct;
    private String titreAct;
    private String typeAct;
    private String dateAct;
    private String dateFinAct;
    private String dureAct;
    private String prixCom;

    public ClasseCommander(String idCom, String NomCli, String PrenCli, String dateCom, String nomAct, String titreAct, String typeAct, String dateAct, String dateFinAct, String dureAct, String prixCom) {
        this.idCom = idCom;
        this.NomCli = NomCli;
        this.PrenCli = PrenCli;
        this.dateCom = dateCom;
        this.nomAct = nomAct;
        this.titreAct = titreAct;
        this.typeAct = typeAct;
        this.dateAct = dateAct;
        this.dateFinAct = dateFinAct;
        this.dureAct = dureAct;
        this.prixCom = prixCom;
    }

    public String getIdCom() {
        return idCom;
    }

    public void setIdCom(String idCom) {
        this.idCom = idCom;
    }

    public String getNomCli() {
        return NomCli;
    }

    public void setNomCli(String NomCli) {
        this.NomCli = NomCli;
    }

    public String getPrenCli() {
        return PrenCli;
    }

    public void setPrenCli(String PrenCli) {
        this.PrenCli = PrenCli;
    }

    public String getDateCom() {
        return dateCom;
    }

    public void setDateCom(String dateCom) {
        this.dateCom = dateCom;
    }

    public String getNomAct() {
        return nomAct;
    }

    public void setNomAct(String nomAct) {
        this.nomAct = nomAct;
    }

    public String getTitreAct() {
        return titreAct;
    }

    public void setTitreAct(String titreAct) {
        this.titreAct = titreAct;
    }

    public String getTypeAct() {
        return typeAct;
    }

    public void setTypeAct(String typeAct) {
        this.typeAct = typeAct;
    }

    public String getDateAct() {
        return dateAct;
    }

    public void setDateAct(String dateAct) {
        this.dateAct = dateAct;
    }

    public String getDateFinAct() {
        return dateFinAct;
    }

    public void setDateFinAct(String dateFinAct) {
        this.dateFinAct = dateFinAct;
    }
    
    

    public String getDureAct() {
        return dureAct;
    }

    public void setDureAct(String dureAct) {
        this.dureAct = dureAct;
    }

    public String getPrixCom() {
        return prixCom;
    }

    public void setPrixCom(String prixCom) {
        this.prixCom = prixCom;
    }
    
    
    

    
    

}