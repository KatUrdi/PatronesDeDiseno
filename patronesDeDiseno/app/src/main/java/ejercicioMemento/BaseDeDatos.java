package ejercicioMemento;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private List<Persona> personas;

    

    public BaseDatos(){
        personas = new ArrayList<>();
    }

    public BaseDatos addPersona(Persona persona){
        if(!personas.contains(persona)){
            personas.add(persona);
            System.out.println("Se añidio un anueva persona exitosamente");
        } else{
            persona.show();
            System.out.println("La persona ya fue añadida a la base de datos");
        }
        return this;
    }

    public void show(){
        System.out.println("**********************************************************************************************************");
        System.out.println("Cantidad de personas: "+personas.size());
        personas.stream().forEach(a -> a.show());
    }

    public List<Persona> getPersonas() {
        List<Persona> aux = new ArrayList<>();
        for(Persona p : personas){
            aux.add(p);
        }
        return aux;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
