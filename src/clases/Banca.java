/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author christian
 */
public class Banca {
    
    private int[] numeroCasillas;
    
    private int jugador1;
    private int jugador2;
    private int jugador3;
    private int jugador4;
    
    private int dineroJugador1;
    private int dineroJugador2;
    private int dineroJugador3;
    private int dineroJugador4;
    
    private int propiedades; //28
    private int casa; //32
    private int hotel; //12

    public Banca() {
        
        jugador1 = 1;
        jugador2 = 2;
        jugador3 = 3;
        jugador4 = 4;
        
        dineroJugador1 = 15000;
        dineroJugador2 = 15000;
        dineroJugador3 = 15000;
        dineroJugador4 = 15000;
        
        propiedades = 28;
        casa = 32;
        hotel = 12;
        
        numeroCasillas = new int[40];
    } 

    public Banca(int jugador1, int jugador2, int jugador3, int jugador4, int dineroJugador1, int dineroJugador3, int propiedades, int casa, int hotel, int[] numeroCasillas) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador3 = jugador3;
        this.jugador4 = jugador4;
        this.dineroJugador1 = dineroJugador1;
        this.dineroJugador3 = dineroJugador3;
        this.propiedades = propiedades;
        this.casa = casa;
        this.hotel = hotel;
        this.numeroCasillas = numeroCasillas;
    }
    
    

    /**
     * @return the jugador1
     */
    public int getJugador1() {
        return jugador1;
    }

    /**
     * @param jugador1 the jugador1 to set
     */
    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    /**
     * @return the jugador2
     */
    public int getJugador2() {
        return jugador2;
    }

    /**
     * @param jugador2 the jugador2 to set
     */
    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    /**
     * @return the jugador3
     */
    public int getJugador3() {
        return jugador3;
    }

    /**
     * @param jugador3 the jugador3 to set
     */
    public void setJugador3(int jugador3) {
        this.jugador3 = jugador3;
    }

    /**
     * @return the jugador4
     */
    public int getJugador4() {
        return jugador4;
    }

    /**
     * @param jugador4 the jugador4 to set
     */
    public void setJugador4(int jugador4) {
        this.jugador4 = jugador4;
    }

    /**
     * @return the dineroJugador1
     */
    public int getDineroJugador1() {
        return dineroJugador1;
    }

    /**
     * @param dineroJugador1 the dineroJugador1 to set
     */
    public void setDineroJugador1(int dineroJugador1) {
        this.dineroJugador1 = dineroJugador1;
    }

    /**
     * @return the dineroJugador2
     */
    public int getDineroJugador2() {
        return dineroJugador2;
    }

    /**
     * @param dineroJugador2 the dineroJugador2 to set
     */
    public void setDineroJugador2(int dineroJugador2) {
        this.dineroJugador2 = dineroJugador2;
    }

    /**
     * @return the dineroJugador3
     */
    public int getDineroJugador3() {
        return dineroJugador3;
    }

    /**
     * @param dineroJugador3 the dineroJugador3 to set
     */
    public void setDineroJugador3(int dineroJugador3) {
        this.dineroJugador3 = dineroJugador3;
    }

    /**
     * @return the dineroJugador4
     */
    public int getDineroJugador4() {
        return dineroJugador4;
    }

    /**
     * @param dineroJugador4 the dineroJugador4 to set
     */
    public void setDineroJugador4(int dineroJugador4) {
        this.dineroJugador4 = dineroJugador4;
    }

    /**
     * @return the propiedades
     */
    public int getPropiedades() {
        return propiedades;
    }

    /**
     * @param propiedades the propiedades to set
     */
    public void setPropiedades(int propiedades) {
        this.propiedades = propiedades;
    }

    /**
     * @return the casa
     */
    public int getCasa() {
        return casa;
    }

    /**
     * @param casa the casa to set
     */
    public void setCasa(int casa) {
        this.casa = casa;
    }

    /**
     * @return the hotel
     */
    public int getHotel() {
        return hotel;
    }

    /**
     * @param hotel the hotel to set
     */
    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    public int[] getNumeroCasillas() {
        return numeroCasillas;
    }

    public void setNumeroCasillas(int[] numeroCasillas) {
        this.numeroCasillas = numeroCasillas;
    }
    
    
    
}
