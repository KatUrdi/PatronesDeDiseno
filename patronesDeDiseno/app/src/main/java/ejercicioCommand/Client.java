package ejercicioCommand;

public class client{
    public static void main(String[] args) {
        persona gundam = new persona("Scorpion");

        golpear hit = new golpear(gundam);
        cubrir cover = new cubrir(gundam);
        saltar jump = new saltar(gundam);
        correr run = new correr(gundam);
        curar curarse = new curar(gundam);

        level tokyo = new level("el gundam corre");
        tokyo.addCommand(run);

        level grieta = new level("el gundam se cura");
        grieta.addCommand(cover).addCommand(curarse);

        level laciudad = new level("el gundam ataca");
        laciudad.addCommand(jump).addCommand(run).addCommand(hit);

        level jefefinal = new level("el gundam contraataca");
        jefefinal.addCommand(run).addCommand(jump).addCommand(run).addCommand(jump).addCommand(cover).addCommand(hit).addCommand(curarse).addCommand(run);

        tokyo.run(1);
        grieta.run(2);
        laciudad.run(3);
        jefefinal.run(4);
    }
}
