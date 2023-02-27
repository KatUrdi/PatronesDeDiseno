package ejercicioMediator;

public class QA extends Persona{

    private String grado;

    public QA(String nombre, String ci, String grado, ICanalDeComunicacion canalDeComunicacion) {
        super(nombre, ci, canalDeComunicacion);
        this.grado=grado;
        setTipo("qa");
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("QA "+getNombre()+" ("+getCi()+") recibio el mensaje: "+msg);
    }

    @Override
    public void send(String msg) {
        System.out.println("QA "+getNombre()+" ("+getCi()+") envio un mensaje");
        this.getCanalDeComunicacion().send(msg,this);
    }

    
    
}
