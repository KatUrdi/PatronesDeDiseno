package ejercicioPrototype;

public class Accesorios {
    private boolean audifonos;
    private boolean cargador;
    private boolean estuche;

    public Accesorios(boolean audifonos, boolean cargador, boolean estuche){
        this.audifonos = audifonos;
        this.cargador=cargador;
        this.estuche=estuche;
    }

    public boolean isAudifonos() {
        return audifonos;
    }
    public void setAudifonos(boolean audifonos) {
        this.audifonos = audifonos;
    }
    public boolean isCargador() {
        return cargador;
    }
    public void setCargador(boolean cargador) {
        this.cargador = cargador;
    }
    public boolean isEstuche() {
        return estuche;
    }
    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }
 
    public void show(){
        System.out.println("Audifonos: "+(audifonos ? "Si":"No"));
        System.out.println("Cargador: "+(cargador ? "Si":"No"));
        System.out.println("Estuche: "+(estuche ? "Si":"No"));
    
    }
    
}
