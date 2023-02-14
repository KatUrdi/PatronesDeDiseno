package abstractFactory.ejercicioAbstractFactory;

public class Main {
    public static void main(String[] args) {
        String st = "standart";
        String so = "solidario";
        String in = "infantil";

        PasajeStandard st1 = (PasajeStandart) FactoryPasaje.createPasaje(new Pasajero("Fabiola Arroyo", "785296"), "F18", st);
        PasajeStandard st2 = (PasajeStandart) FactoryPasaje.createPasaje(new Pasajero("Claudia Arroyo", "102659"), "F19", st);

        PasajeSolidario so1 = (PasajeSolidario) FactoryPasaje.createPasaje(new Pasajero("Roque Olivez", "960036", "K2", so);
        PasajeSolidario so2 = (PasajeSolidario) FactoryPasaje.createPasaje(new Pasajero("Camila Rojas", "4890003", "K6", so);

        PasajeInfantil in1 = (PasajeInfantil) FactoryPasaje.createPasaje(new Pasajero("Andrea CLaure", "45980336", "L15", in);
        PasajeInfantil in2 = (PasajeInfantil) FactoryPasaje.createPasaje(new Pasajero("Mateo Claure", "666218", "L14", in);

        st1.show();
        st2.show();

        so1.show();
        so2.show();

        in1.show();
        in2.show();

    }
}
