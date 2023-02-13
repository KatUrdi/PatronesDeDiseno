package factoryMethod.ejercicioFactoryMethod;

public class PasajeSolidarioConcreteCreator extends PasajeCreator{

    private PasajeSolidario pasaje = new PasajeSolidario();

    @Override
    public Pasaje1 createPasaje(Pasajero pasajero, String numeroAsiento) {
        pasaje.setAvion(new Avion("Boeing", "1.5 ton", "747", 120));
        pasaje.setCostoEspecial("120 US");
        pasaje.setOrigen(new Lugar("España", "Madrid", "Aeropueto Internacional de Madrid"));
        pasaje.setDestino(new Lugar("Bolivia", "La Paz", "Aeropuerto Internacional del Alto"));
        pasaje.setNumeroVuelo("680AB");
        pasaje.setNumeroAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);
        pasajeSolidario(0.5, "Discapacidad");
        return pasaje;
    }

    public void pasajeSolidario(double descuento, String motivo) {
        pasaje.setDescuento(descuento);
        pasaje.setMotivoDeDescuento(motivo);
    }

    
    
}
