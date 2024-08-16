package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GrupoTests {
    @Test
    public void testCrearGrupo() {
        Grupo grupo = new Grupo();
        assert grupo != null;
    }

    @Test
    public void testAgregarCelula() {
        Grupo grupo = new Grupo();
        Celula celula = new Celula(true);
        grupo.agregarCelula(celula);
        assert grupo.getCelulas().contains(celula);
    }

    @Test
    public void testEliminarCelula() {
        Grupo grupo = new Grupo();
        Celula celula = new Celula(true);
        grupo.agregarCelula(celula);
        grupo.eliminarCelula(celula);
        assert !grupo.getCelulas().contains(celula);
    }

    @Test
    public void crear9CelulasVivas(){
        Grupo grupo = new Grupo();
        for (int i = 0; i < 9; i++) {
            Celula celula = new Celula(true);
            grupo.agregarCelula(celula);
        }
        assert grupo.getCelulas().size() == 9;
    }
        
}