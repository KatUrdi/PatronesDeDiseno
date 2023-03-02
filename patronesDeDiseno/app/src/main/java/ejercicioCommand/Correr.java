package ejercicioCommand;

public class correr implements interfazComandos {
    private persona ty;

    public correr(persona ty) {
        this.ty = ty;
    }

    @Override
    public void execute() {
        this.ty.cover();
    }
}
