package factoryMethod.ejercicioFactoryMethod;

public class PasajeStandartConcreteCreator extends CreatorPasaje{

    @Override
    public Pasaje1 createPasaje(Pasajero pasajero, String numeroAsiento) {
        PasajeStandard pasaje = new PasajeStandard();
        pasaje.setAvion(new Avion("MOPAR", "1 ton", "AK-45", 100));
        pasaje.setCostoPasaje("100 US");
        pasaje.setOrigen(new Lugar("Japon", "Tokyo", "Aeropueto Internacional de Tokyo"));
        pasaje.setDestino(new Lugar("Irlanda", "Dublin", "Aeropuerto Internacional de Dublin"));
        pasaje.setNumeroVuelo("123AJ");
        pasaje.setNumeroAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);
        return pasaje;
    }

    
    
}
