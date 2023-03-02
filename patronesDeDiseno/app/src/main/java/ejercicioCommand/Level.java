package ejercicioCommand;

import java.util.ArrayList;
import java.util.List;
public class level{
    private List<interfazComandos> cmd = new ArrayList<>();
    private String acc;

    public level(String accion) {
        this.acc = accion;
    }

    public level addCommand(interfazComandos ty){
        cmd.add(ty);
        return this;
    }

    public void run(int level){
        System.out.println(" ");
        System.out.println("NIVEL "+level);
        System.out.println("ACCION DESBLOQUEADA: "+ acc);
        for (interfazComandos cmd: cmd) {
            cmd.execute();
        }
        cmd.clear();
    }
}
