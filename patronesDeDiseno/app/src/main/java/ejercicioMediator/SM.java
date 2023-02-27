package ejercicioMediator;

public class SM extends Persona{
    public SM(String nombre, String ci, String lenguaje, ICanalDeComunicacion canalDeComunicacion) {
        super(nombre, ci, canalComunicacion);
        this.lenguaje = lenguaje;
        setTipo("sm");
    }

    private String lenguaje;

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("SM "+getNombre()+" ("+getCi()+") recibio el mensaje: "+msg);
    }

    @Override
    public void send(String msg) {
        System.out.println("SM "+getNombre()+" ("+getCi()+")envio un mensaje");
        this.getCanalDeComunicacion().send(msg,this);
    }
    
}
