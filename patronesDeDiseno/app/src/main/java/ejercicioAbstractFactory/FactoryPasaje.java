package abstractFactory.ejercicioAbstractFactory;

public class FactoryPasaje {

    public static Pasaje1 createPasaje(Pasajero pasajero, String numeroAsiento, String type){
        Pasaje1 pasaje;
        
        switch(type){
            case "standart":
                pasaje = new PasajeStandard();
                pasaje.setCostoPasaje("250 US");
                break;
            case "solidario":
                pasaje = new PasajeSolidario();
                pasaje.setCostoPasaje("200 US");
                pasajeSolidario(0.5, "Discapacidad", (PasajeSolidario) pasaje);
                break;
            case "infantil":
                pasaje = new PasajeInfantil();
                pasaje.setCostoPasaje("50 US");
                break;
            default:
                pasaje = new PasajeStandard();
        }

        pasaje.setAvion(new Avion("Boeing", "1.5 ton", "747", 120));
        pasaje.setCostoEspecial("45 US");
        pasaje.setOrigen(new Lugar("España", "Madrid", "Aeropueto Internacional de Madrid"));
        pasaje.setDestino(new Lugar("Bolivia", "La Paz", "Aeropuerto Internacional del Alto"));
        pasaje.setNumeroVuelo("680AB");
        pasaje.setNumeroAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);

        return pasaje;
    }

    public static void pasajeSolidario(double descuento, String motivo, PasajeSolidario pasaje) {
        pasaje.setDescuento(descuento);
        pasaje.setMotivoDeDescuento(motivo);
    }
}
