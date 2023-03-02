package ejercicioCommand;

public class golpear implements interfazComandos {
    private persona ty;

    public golpear(persona ty) {
        this.ty = ty;
    }

    @Override
    public void execute() {
        this.ty.cover();
    }
}
