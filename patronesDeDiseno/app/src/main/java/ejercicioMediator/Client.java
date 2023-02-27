package ejercicioMediator;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Skype skype = new Skype();

        DEV dev1 = new DEV("Flavia Mendoza", "074", List.of("a", "b", "c"), skype);
        DEV dev2 = new DEV("Maya Rojas", "408", List.of("a", "b", "c"), skype);
        DEV dev3 = new DEV("MAteo Fernandez", "102", List.of("a", "b", "c"), skype);

        QA qa1 = new QA("Mauricio leons", "111", "empleado", skype);
        QA qa2 = new QA("Oscar Sanchez", "654", "jefe de ventas", skype);
        QA qa3 = new QA("Brenda Alvarado", "263", "gerente", skype);

        SM sm1 = new SM("Camila Fujiko", "954", "Python", skype);
        SM sm2 = new SM("Fabiola Cardenas", "478", "Java", skype);
        SM sm3 = new SM("Noelia Quiroga", "896", "Kotlin", skype);

        skype.addDEV(dev1).addDEV(dev2).addDEV(dev3).addQA(qa1).addQA(qa2).addQA(qa3).addSM(sm1).addSM(sm2).addSM(sm3);
        dev1.send("Hola como estas");
        qa1.send("Reunion a las 9");
        sm1.send("Nos vemos luego");
    }
}
