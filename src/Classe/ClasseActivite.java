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
public class ClasseActivite {
    private String idAct;
    private String nomAct;
    private String titreAct;
    private String typeAct;
    private String dateAct;
    private String dureAct;

    public ClasseActivite(String idAct, String nomAct, String titreAct, String typeAct, String dateAct, String dureAct) {
        this.idAct = idAct;
        this.nomAct = nomAct;
        this.titreAct = titreAct;
        this.typeAct = typeAct;
        this.dateAct = dateAct;
        this.dureAct = dureAct;
    }

    public String getIdAct() {
        return idAct;
    }

    public void setIdAct(String idAct) {
        this.idAct = idAct;
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

    public String getDureAct() {
        return dureAct;
    }

    public void setDureAct(String dureAct) {
        this.dureAct = dureAct;
    }
    
}
