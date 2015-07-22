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
public class PartidaGuardada {
    
    private String id;
    private String aliasJ1;
    private String aliasJ2;
    private String aliasJ3;
    private String aliasJ4;
    private boolean partidaActiva;

    public PartidaGuardada(){
        id = "";
        aliasJ1 = "";
        aliasJ2 = "";
        aliasJ3 = "";
        aliasJ4 = "";
        partidaActiva = false;
    }
    
    public PartidaGuardada(String id, String alias, String aliasJ2, String aliasJ3, String aliasJ4, boolean partidaActiva) {
        this.id = id;
        this.aliasJ1 = alias;
        this.aliasJ2 = aliasJ2;
        if(aliasJ3!=null)
            this.aliasJ3 = aliasJ3;
        else
            this.aliasJ3="";
        
        if(aliasJ4!=null)
            this.aliasJ4 = aliasJ4;
        else
            this.aliasJ4="";
        
        this.partidaActiva = partidaActiva;
        
    }

    public boolean isPartidaActiva() {
        return partidaActiva;
    }

    public void setPartidaActiva(boolean partidaActiva) {
        this.partidaActiva = partidaActiva;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return aliasJ1;
    }

    public void setAlias(String alias) {
        this.aliasJ1 = alias;
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
    
    
    
    
}
