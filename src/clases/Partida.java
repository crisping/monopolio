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
public class Partida {
    private String id;
    private String aliasJ1;
    private String aliasJ2;
    private String aliasJ3;
    private String aliasJ4;
    private String dineroJ1;
    private String dineroJ2;
    private String dineroJ3;
    private String dineroJ4;
    private String casillaJ1;
    private String casillaJ2;
    private String casillaJ3;
    private String casillaJ4;
    private String tiempo;
    private String  turno;
    private String impuestoLujo;
    private String impuestoCapital;
    private String turnosCarcel;
    private String fianza;
    private String dineroPorVuelta;
    private String tiempoMaximo;
    private String cantiadJugadores;

    public Partida(String id, String aliasJ1, String aliasJ2, String aliasJ3, String aliasJ4, String dineroJ1, String dineroJ2, String dineroJ3, String dineroJ4, String casillaJ1, String casillaJ2, String casillaJ3, String casillaJ4, String tiempo, String turno, String impuestoLujo, String impuestoCapital, String turnosCarcel, String fianza, String dineroPorVuelta, String tiempoMaximo, String cantiadJugadores) {
        this.id = id;
        this.aliasJ1 = aliasJ1;
        this.aliasJ2 = aliasJ2;
        this.aliasJ3 = aliasJ3;
        this.aliasJ4 = aliasJ4;
        this.dineroJ1 = dineroJ1;
        this.dineroJ2 = dineroJ2;
        this.dineroJ3 = dineroJ3;
        this.dineroJ4 = dineroJ4;
        this.casillaJ1 = casillaJ1;
        this.casillaJ2 = casillaJ2;
        this.casillaJ3 = casillaJ3;
        this.casillaJ4 = casillaJ4;
        this.tiempo = tiempo;
        this.turno = turno;
        this.impuestoLujo = impuestoLujo;
        this.impuestoCapital = impuestoCapital;
        this.turnosCarcel = turnosCarcel;
        this.fianza = fianza;
        this.dineroPorVuelta = dineroPorVuelta;
        this.tiempoMaximo = tiempoMaximo;
        this.cantiadJugadores = cantiadJugadores;
    }
    
    public Partida(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAliasJ1() {
        return aliasJ1;
    }

    public void setAliasJ1(String aliasJ1) {
        this.aliasJ1 = aliasJ1;
    }

    public String getAliasJ2() {
        return aliasJ2;
    }

    public void setAliasJ2(String aliasJ2) {
        this.aliasJ2 = aliasJ2;
    }

    public String getAliasJ3() {
        return aliasJ3;
    }

    public void setAliasJ3(String aliasJ3) {
        this.aliasJ3 = aliasJ3;
    }

    public String getAliasJ4() {
        return aliasJ4;
    }

    public void setAliasJ4(String aliasJ4) {
        this.aliasJ4 = aliasJ4;
    }

    public String getDineroJ1() {
        return dineroJ1;
    }

    public void setDineroJ1(String dineroJ1) {
        this.dineroJ1 = dineroJ1;
    }

    public String getDineroJ2() {
        return dineroJ2;
    }

    public void setDineroJ2(String dineroJ2) {
        this.dineroJ2 = dineroJ2;
    }

    public String getDineroJ3() {
        return dineroJ3;
    }

    public void setDineroJ3(String dineroJ3) {
        this.dineroJ3 = dineroJ3;
    }

    public String getDineroJ4() {
        return dineroJ4;
    }

    public void setDineroJ4(String dineroJ4) {
        this.dineroJ4 = dineroJ4;
    }

    public String getCasillaJ1() {
        return casillaJ1;
    }

    public void setCasillaJ1(String casillaJ1) {
        this.casillaJ1 = casillaJ1;
    }

    public String getCasillaJ2() {
        return casillaJ2;
    }

    public void setCasillaJ2(String casillaJ2) {
        this.casillaJ2 = casillaJ2;
    }

    public String getCasillaJ3() {
        return casillaJ3;
    }

    public void setCasillaJ3(String casillaJ3) {
        this.casillaJ3 = casillaJ3;
    }

    public String getCasillaJ4() {
        return casillaJ4;
    }

    public void setCasillaJ4(String casillaJ4) {
        this.casillaJ4 = casillaJ4;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getImpuestoLujo() {
        return impuestoLujo;
    }

    public void setImpuestoLujo(String impuestoLujo) {
        this.impuestoLujo = impuestoLujo;
    }

    public String getImpuestoCapital() {
        return impuestoCapital;
    }

    public void setImpuestoCapital(String impuestoCapital) {
        this.impuestoCapital = impuestoCapital;
    }

    public String getTurnosCarcel() {
        return turnosCarcel;
    }

    public void setTurnosCarcel(String turnosCarcel) {
        this.turnosCarcel = turnosCarcel;
    }

    public String getFianza() {
        return fianza;
    }

    public void setFianza(String fianza) {
        this.fianza = fianza;
    }

    public String getDineroPorVuelta() {
        return dineroPorVuelta;
    }

    public void setDineroPorVuelta(String dineroPorVuelta) {
        this.dineroPorVuelta = dineroPorVuelta;
    }

    public String getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(String tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public String getCantiadJugadores() {
        return cantiadJugadores;
    }

    public void setCantiadJugadores(String cantiadJugadores) {
        this.cantiadJugadores = cantiadJugadores;
    }
    
    
    
    
}
