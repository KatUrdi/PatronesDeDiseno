package ejercicioCommand;

public class curar implements interfazComandos {
    private persona ty;

    public  curar(persona ty) {
        this.ty = ty;
    }

    @Override
    public void execute() {
        this.ty.cover();
    }
}
