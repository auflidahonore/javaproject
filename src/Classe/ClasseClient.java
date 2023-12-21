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
public class ClasseClient {
    private String idClient;
    private String nomClient;
    private String prenClient;
    private String adrClient;
    private String telClient;

    public ClasseClient(String idClient, String nomClient, String prenClient, String adrClient, String telClient) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.prenClient = prenClient;
        this.adrClient = adrClient;
        this.telClient = telClient;
    }
     public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenClient() {
        return prenClient;
    }

    public void setPrenClient(String prenClient) {
        this.prenClient = prenClient;
    }

    public String getAdrClient() {
        return adrClient;
    }

    public void setAdrClient(String adrClient) {
        this.adrClient = adrClient;
    }

    public String getTelClient() {
        return telClient;
    }

    public void setTelClient(String telClient) {
        this.telClient = telClient;
    }
    
}

