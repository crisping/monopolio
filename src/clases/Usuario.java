package clases;

/**
 *
 * @author Stalin
 */
public class Usuario {
    
    private String alias;
    private String clave;

    public Usuario(String alias, String clave) {
        this.alias = alias;
        this.clave = clave;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
