import java.util.ArrayList;
import java.util.List;

public class taskManager {
    List<String> tareas = new ArrayList<>();
    public boolean agregarTarea(String tarea){
        return tareas.add(tarea);
    }
    public String listarTareas(){
        return tareas.toString();
    }
    public String eliminarTarea(int indice){
        return tareas.remove(indice);
    }
}
