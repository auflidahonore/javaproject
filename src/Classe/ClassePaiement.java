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
public class ClassePaiement {
    private String numPaiem;
    private String numCom;
    private String nomCli;
    private String prenCli;
    private String nomAct;
    private String typeAct;
    private String dureAct;
    private String dateCom;
    private String datePaiem;
    private String modePaiem;
    private String montantPayer;
    private String moisPayer;

    public ClassePaiement(String numPaiem, String numCom, String nomCli, String prenCli, String nomAct, String typeAct, String dureAct, String dateCom, String datePaiem, String modePaiem, String montantPayer, String moisPayer) {
        this.numPaiem = numPaiem;
        this.numCom = numCom;
        this.nomCli = nomCli;
        this.prenCli = prenCli;
        this.nomAct = nomAct;
        this.typeAct = typeAct;
        this.dureAct = dureAct;
        this.dateCom = dateCom;
        this.datePaiem = datePaiem;
        this.modePaiem = modePaiem;
        this.montantPayer = montantPayer;
        this.moisPayer = moisPayer;
    }

    public String getNumPaiem() {
        return numPaiem;
    }

    public void setNumPaiem(String numPaiem) {
        this.numPaiem = numPaiem;
    }

    public String getNumCom() {
        return numCom;
    }

    public void setNumCom(String numCom) {
        this.numCom = numCom;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getPrenCli() {
        return prenCli;
    }

    public void setPrenCli(String prenCli) {
        this.prenCli = prenCli;
    }

    public String getNomAct() {
        return nomAct;
    }

    public void setNomAct(String nomAct) {
        this.nomAct = nomAct;
    }

    public String getTypeAct() {
        return typeAct;
    }

    public void setTypeAct(String typeAct) {
        this.typeAct = typeAct;
    }

    public String getDureAct() {
        return dureAct;
    }

    public void setDureAct(String dureAct) {
        this.dureAct = dureAct;
    }

    public String getDateCom() {
        return dateCom;
    }

    public void setDateCom(String dateAct) {
        this.dateCom = dateAct;
    }

    public String getDatePaiem() {
        return datePaiem;
    }

    public void setDatePaiem(String datePaiem) {
        this.datePaiem = datePaiem;
    }

    public String getModePaiem() {
        return modePaiem;
    }

    public void setModePaiem(String modePaiem) {
        this.modePaiem = modePaiem;
    }

    public String getMontantPayer() {
        return montantPayer;
    }

    public void setMontantPayer(String montantPayer) {
        this.montantPayer = montantPayer;
    }

    public String getMoisPayer() {
        return moisPayer;
    }

    public void setMoisPayer(String moisPayer) {
        this.moisPayer = moisPayer;
    }
    
}
