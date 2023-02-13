package factoryMethod.ejercicioFactoryMethod;

public class PasajeStandartConcreteCreator extends PasajeCreator{

    @Override
    public Pasaje1 createPasaje(Pasajero pasajero, String numeroAsiento) {
        PasajeStandard pasaje = new PasajeStandart();
        pasaje.setAvion(new Avion("Boeing", "1.5 ton", "747", 120));
        pasaje.setCostoEspecial("45 US");
        pasaje.setOrigen(new Lugar("España", "Madrid", "Aeropueto Internacional de Madrid"));
        pasaje.setDestino(new Lugar("Bolivia", "La Paz", "Aeropuerto Internacional del Alto"));
        pasaje.setNumeroVuelo("680AB");
        pasaje.setNumeroAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);
        return pasaje;
    }

    
    
}
