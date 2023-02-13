package factoryMethod.ejercicioFactoryMethod;

public class Main {
    public static void main(String[] args) {
        PasajeStandard st1 = (PasajeStandard) new PasajeStandartConcreteCreator().createPasaje(new Pasajero("Josue Nazaret", "251200"), "A1");
        PasajeStandard st2 = (PasajeStandard) new PasajeStandartConcreteCreator().createPasaje(new Pasajero("Alba Nazaret", "861200"), "A2");

        PasajeSolidario so1 = (PasajeSolidario) new PasajeSolidarioConcreteCreator().createPasaje(new Pasajero("Jose Luis Roncha", "126232"), "F3");
        PasajeSolidario so2 = (PasajeSolidario) new PasajeSolidarioConcreteCreator().createPasaje(new Pasajero("Luis Miguel Roncha", "126227"), "J3");

        PasajeInfantil in1 = (PasajeInfantil) new PasajeInfantilConcreteCreator().createPasaje(new Pasajero("Roberto Sanjinez", "1237824"), "H2");
        PasajeInfantil in2 = (PasajeInfantil) new PasajeInfantilConcreteCreator().createPasaje(new Pasajero("Aquiles Illanes", "122134784"), "G5");

        st1.show();
        st2.show();

        so1.show();
        so2.show();

        i1.show();
        i2.show();

    }
}
