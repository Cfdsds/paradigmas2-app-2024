package com.example.demo;
import java.util.ArrayList;

public class Grupo {
    /*arraylist de celulas */
    private ArrayList<Celula> celulas = new ArrayList<>();

    public void agregarCelula(Celula celula) {
        celulas.add(celula);
    }

    public void eliminarCelula(Celula celula) {
        celulas.remove(celula);
    }

    public ArrayList<Celula> getCelulas() {
        return celulas;
    }

    public void setCelulas(ArrayList<Celula> celulas) {
        this.celulas = celulas;
    }

    public void crearGrupo(){
        // Create a CelulaGroup
        Grupo grupo = new Grupo();

        // Create some Celula objects
        Celula celula1 = new Celula(true);
    
        // Add the Celula objects to the group
        grupo.agregarCelula(celula1);
    
        // Now you have a group of connected Celula objects
    }
    void crear9Celulas(){
        Grupo grupo = new Grupo();
        for (int i = 0; i < 9; i++) {
            Celula celula = new Celula(true);
            grupo.agregarCelula(celula);
        }
    }

    void crear9CelulasVivas(){
        Grupo grupo = new Grupo();
        for (int i = 0; i < 9; i++) {
            Celula celula = new Celula(true);
            grupo.agregarCelula(celula);
        }
    }

}
