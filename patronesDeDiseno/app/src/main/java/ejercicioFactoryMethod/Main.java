package factoryMethod.ejercicioFactoryMethod;

public class Main {
    public static void main(String[] args) {
        PasajeStandart st1 = (PasajeStandart new PasajeStandartConcreteCreator().createPasaje(new Pasajero("Fabiola Arroyo", "785296"), "F18");
        PasajeStandart st2 = (PasajeStandart new PasajeStandartConcreteCreator().createPasaje(new Pasajero("Claudia Arroyo", "102659"), "F19");

        PasajeSolidario so1 = (PasajeSolidario) new PasajeSolidarioConcreteCreator().createPasaje(new Pasajero("Roque Olivez", "960036", "K2");
        PasajeSolidario so2 = (PasajeSolidario) new PasajeSolidarioConcreteCreator().createPasaje(new Pasajero("Camila Rojas", "4890003", "K6");

        PasajeInfantil in1 = (PasajeInfantil) new PasajeInfantilConcreteCreator().createPasaje(new Pasajero("Andrea CLaure", "45980336", "L15");
        PasajeInfantil in2 = (PasajeInfantil) new PasajeInfantilConcreteCreator().createPasaje(new Pasajero("Mateo Claure", "666218", "L14");

        st1.show();
        st2.show();

        so1.show();
        so2.show();

        in1.show();
        in2.show();

    }
}
