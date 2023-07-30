package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.modelo.Imc;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImcController {

    @RequestMapping("/imc")
    public float calculoImc(){
        Imc imc = new Imc(80.0F,1.70F);
        float imcCalculado;
        imcCalculado=(imc.getPeso())/(imc.getAltura()*imc.getAltura());
        return imcCalculado;
    }
}
