package ejercicioPrototype;

public class Main {
    public static void main(String[] args) {
        Celular prototypeA = new Celular("Samsung", "R10", "5 inches", 2, "256 GB", "Android 12",
         4, true, 3, "1 d 8 h", new Accesorios(false, true, false, true));
        prototypeA.setSim(new Sim("Entel", "78255899"));


        Celular prototypeB = (Celular) prototypeA.clone();
        Celular prototypeC = (Celular) prototypeA.clone();
        Celular prototypeD = (Celular) prototypeA.clone();
        Celular prototypeE = (Celular) prototypeA.clone();
        Celular prototypeF = (Celular) prototypeA.clone();

        prototypeB.setSim(new Sim("Tigo", "72845971"));
        prototypeC.setSim(new Sim("Tigo", "75111157"));
        prototypeD.setSim(new Sim("Viva", "75699844"));
        prototypeE.setSim(new Sim("Entel", "65248911"));
        prototypeF.setSim(new Sim("Tigo", "70148033"));

        prototypeA.show();
        prototypeB.show();
        prototypeC.show();
        prototypeD.show();
        prototypeE.show();
        prototypeF.show();
    }
}
