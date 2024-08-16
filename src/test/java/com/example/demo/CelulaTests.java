package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CelulaTests {
    @Test
    public void testCelulaViva() {
        Celula celula = new Celula(true);
        assert celula.isViva();
    }

    @Test
    public void testCelulaMuerta() {
        Celula celula = new Celula(false);
        assert !celula.isViva();
    }
}
