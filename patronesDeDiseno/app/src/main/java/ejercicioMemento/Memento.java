package ejercicioMemento;

public class Memento {
    private BaseDeDatos baseDeDatos;
    private String alias;

    public Memento(BaseDeDatos baseDeDatos, String alias){
        this.baseDeDatos = baseDeDatos;
        this.alias = alias;
    }

    public BaseDeDatos getBaseDeDatos() {
        return baseDeDatos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    

    
}
