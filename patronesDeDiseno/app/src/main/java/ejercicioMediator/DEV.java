package ejercicioMediator;

import java.util.List;

public class DEV extends Persona {
    public DEV(String nombre, String ci, List<String> certificaciones, ICanalDeComunicacion canalDeComunicacion) {
        super(nombre, ci, canalDeComunicacion);
        this.certificaciones = certificaciones;
        setTipo("dev");
    }

    private List<String> certificaciones;

    public List<String> getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(List<String> certificaciones) {
        this.certificaciones = certificaciones;
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("DEV "+getNombre()+" ("+getCi()+") recibio el mensaje: "+msg);
    }

    @Override
    public void send(String msg) {
        System.out.println("DEV "+getNombre()+" ("+getCi()+") envio un mensaje");
        this.getCanalDeComunicacion().send(msg,this);
    }
}
