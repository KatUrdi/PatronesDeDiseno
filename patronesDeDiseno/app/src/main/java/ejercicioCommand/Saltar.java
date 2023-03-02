package ejerciciocCommand;

public class saltar implements interfazComandos {
    private persona ty;

    public saltar(persona ty) {
        this.ty = ty;
    }

    @Override
    public void execute() {
        this.ty.cover();
    }
}
