package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.controller.ImcController;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ImcTest {
    @Test
    @Deprecated
    public void calculandoImc(){
        ImcController imc = new ImcController();
        float calculo = imc.calculoImc();
        assertEquals(27.681659698486328, calculo);
    }
}
