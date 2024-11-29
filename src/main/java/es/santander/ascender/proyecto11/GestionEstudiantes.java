package es.santander.ascender.proyecto11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class GestionEstudiantes implements IGestionEstudiantes {
    
    

    private HashMap <String, Integer> calificaciones = new HashMap<String, Integer>();
    private HashSet <String> estudiantes = new HashSet<>();

    public HashMap<String, Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(HashMap<String, Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public HashSet<String> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(HashSet<String> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public boolean agregarEstudiante(String nombre, int calificacion) {

        if(this.estudiantes.add(nombre)){
            this.calificaciones.put(nombre, calificacion);            
            return true;
        }else{
            return false ;
        }
    }

    @Override
    public Integer obtenerCalificacion(String nombre) throws NullPointerException  {
        Integer nota = calificaciones.get(nombre);
        return nota;
    }

    @Override
    public Map<String, Integer> obtenerEstudiantesYCalificaciones() {
        return getCalificaciones();
    }

    @Override
    public boolean existeEstudiante(String nombre) {
        return estudiantes.contains(nombre);
    }

    @Override
    public boolean eliminarEstudiante(String nombre) {
        return this.estudiantes.remove(nombre);
    }

    @Override
    public void agregarEstudiantes(Set<String> nuevosEstudiantes, Map<String, Integer> nuevasCalificaciones) {
        this.estudiantes.addAll(nuevosEstudiantes);
        for (String nombre : nuevasCalificaciones.keySet()) {
            if (!this.calificaciones.containsKey(nombre)){
                calificaciones.put(nombre, nuevasCalificaciones.get(nombre));
            }
        }
    }

}
