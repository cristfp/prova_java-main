package br.com.confidencecambio.javabasico.service.impl;


import br.com.confidencecambio.javabasico.model.ParametroCalculadora;
import br.com.confidencecambio.javabasico.model.ResultadoCalculadora;
import br.com.confidencecambio.javabasico.service.ICalculadoraService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static br.com.confidencecambio.javabasico.util.Constants.*;

@Service
public class CalculadoraService implements ICalculadoraService {

    @Override
    public Double somar(Double valor1, Double valor2) {
        ParametroCalculadora parametro = this.create(SUM, valor1, valor2);
        return this.calcular(parametro);
    }

    @Override
    public Double subtrair(Double valor1, Double valor2) {
        ParametroCalculadora parametro = this.create(SUBTRACT, valor1, valor2);
        return this.calcular(parametro);
    }

    @Override
    public Double multiplicar(Double valor1, Double valor2) {
        ParametroCalculadora parametro = this.create(MULTIPLY, valor1, valor2);
        return this.calcular(parametro);
    }

    @Override
    public Double dividir(Double valor1, Double valor2) {
        ParametroCalculadora parametro = this.create(DIVIDE, valor1, valor2);
        return this.calcular(parametro);
    }

    private ParametroCalculadora create(String type, Double valor1, Double valor2) {
        ParametroCalculadora parametro = new ParametroCalculadora();

        parametro.setType(type);
        parametro.setFirstValue(valor1);
        parametro.setSecondValue(valor2);

        return parametro;
    }

    private Double calcular(ParametroCalculadora parametroCalculadora) {
        RestTemplate template = new RestTemplate();

        ResultadoCalculadora resultado = template.postForObject(URL_CALCULADORA, parametroCalculadora,
                ResultadoCalculadora.class);

        return resultado.getResult();
    }
}