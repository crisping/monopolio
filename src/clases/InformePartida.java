/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Stalin
 */
public class InformePartida {
    
    private String alias;
    private String id;
    private String tiempo;
    private String dinero;
    private String nroPropiedades;

    public InformePartida(String alias, String id, String tiempo, String dinero, String nroPropiedades) {
        this.alias = alias;
        this.id = id;
        this.tiempo = tiempo;
        this.dinero = dinero;
        this.nroPropiedades = nroPropiedades;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getDinero() {
        return dinero;
    }

    public void setDinero(String dinero) {
        this.dinero = dinero;
    }

    public String getNroPropiedades() {
        return nroPropiedades;
    }

    public void setNroPropiedades(String nroPropiedades) {
        this.nroPropiedades = nroPropiedades;
    }
    
    
    
}
