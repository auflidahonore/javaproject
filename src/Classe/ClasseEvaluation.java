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
public class ClasseEvaluation {
    private String numEvalu;
    private String dateEvalu;
    private String dateRech1;
    private String dateRech2;
    private String totalPaiem;
    private String totalDep;
    private String soldefCaisse;

    public ClasseEvaluation(String numEvalu, String dateEvalu, String dateRech1, String dateRech2, String totalPaiem, String totalDep, String soldefCaisse) {
        this.numEvalu = numEvalu;
        this.dateEvalu = dateEvalu;
        this.dateRech1 = dateRech1;
        this.dateRech2 = dateRech2;
        this.totalPaiem = totalPaiem;
        this.totalDep = totalDep;
        this.soldefCaisse = soldefCaisse;
    }

    public String getNumEvalu() {
        return numEvalu;
    }

    public void setNumEvalu(String numEvalu) {
        this.numEvalu = numEvalu;
    }

    public String getDateEvalu() {
        return dateEvalu;
    }

    public void setDateEvalu(String dateEvalu) {
        this.dateEvalu = dateEvalu;
    }

    public String getDateRech1() {
        return dateRech1;
    }

    public void setDateRech1(String dateRech1) {
        this.dateRech1 = dateRech1;
    }

    public String getDateRech2() {
        return dateRech2;
    }

    public void setDateRech2(String dateRech2) {
        this.dateRech2 = dateRech2;
    }

    public String getTotalPaiem() {
        return totalPaiem;
    }

    public void setTotalPaiem(String totalPaiem) {
        this.totalPaiem = totalPaiem;
    }

    public String getTotalDep() {
        return totalDep;
    }

    public void setTotalDep(String totalDep) {
        this.totalDep = totalDep;
    }

    public String getSoldefCaisse() {
        return soldefCaisse;
    }

    public void setSoldefCaisse(String soldefCaisse) {
        this.soldefCaisse = soldefCaisse;
    }
    
    
    
}
