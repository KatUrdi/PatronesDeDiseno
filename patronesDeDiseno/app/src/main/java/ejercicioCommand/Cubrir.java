package ejercicioCommand;

public class cubrir implements interfazComandos {
    private persona ty;

    public cubrir(persona ty) {
        this.ty = ty;
    }

    @Override
    public void execute() {
        this.ty.cover();
    }
}
