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
public class ClasseDepense {
    private String idDep;
    private String dateDep;
    private String montantDep;
    private String motifDep;
    private String moisDep;

    public ClasseDepense(String idDep, String dateDep, String montantDep, String motifDep, String moisDep) {
        this.idDep = idDep;
        this.dateDep = dateDep;
        this.montantDep = montantDep;
        this.motifDep = motifDep;
        this.moisDep = moisDep;
    }

    public String getIdDep() {
        return idDep;
    }

    public void setIdDep(String idDep) {
        this.idDep = idDep;
    }

    public String getDateDep() {
        return dateDep;
    }

    public void setDateDep(String dateDep) {
        this.dateDep = dateDep;
    }

    public String getMontantDep() {
        return montantDep;
    }

    public void setMontantDep(String montantDep) {
        this.montantDep = montantDep;
    }

    public String getMotifDep() {
        return motifDep;
    }

    public void setMotifDep(String motifDep) {
        this.motifDep = motifDep;
    }

    public String getMoisDep() {
        return moisDep;
    }

    public void setMoisDep(String moisDep) {
        this.moisDep = moisDep;
    }
    
    

    
    
    
}
