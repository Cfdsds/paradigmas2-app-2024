package com.example.demo;
import java.util.ArrayList;

public class Celula {
    // Atributos
    private boolean viva;

    // Métodos
    public Celula(boolean viva) {
        this.viva = viva;
    }

    public boolean isViva() {
        return viva;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }

    public void nacer() {
        viva = true;
    }

    public void morir() {
        viva = false;
    }

    // Method to vivos living neighbors (you'll need to implement the logic to determine neighbors)
    public int contarVecinosVivos(ArrayList<Celula> allCells, int ancho, int alto, int indice) {
        int vivos = 0;
        int x = indice % ancho;
        int y = indice / ancho;
    
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue; // Skip the cell itself
    
                int vecinoX = x + i;
                int vecinoY = y + j;
    
                // Check if neighbor is within grid bounds
                if (vecinoX >= 0 && vecinoX < ancho && vecinoY >= 0 && vecinoY < alto) {
                    int neighborIndex = vecinoY * ancho + vecinoX;
                    if (allCells.get(neighborIndex).isViva()) {
                        vivos++;
                    }
                }
            }
        }
        return vivos;
    }

    public void updateState(ArrayList<Celula> allCells) {
        int livingNeighbors = contarVecinosVivos(allCells);

        if (!this.viva && livingNeighbors == 3) {
            this.nacer(); // Birth: Dead cell with 3 living neighbors comes to life
        } else if (this.viva && (livingNeighbors < 2 || livingNeighbors > 3)) {
            this.morir(); // Death: Living cell dies due to underpopulation or overpopulation
        } 
        // Implicitly: Living cell with 2 or 3 neighbors remains alive
    }

    

    
}
