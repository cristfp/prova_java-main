package br.com.confidencecambio.javabasico.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.confidencecambio.javabasico.model.ParametroImc;
import br.com.confidencecambio.javabasico.model.ResultadoImc;
import br.com.confidencecambio.javabasico.service.ICalculadoraService;
import br.com.confidencecambio.javabasico.service.IImcService;

@Service
public class ImcService implements IImcService {

    @Autowired
    private ICalculadoraService calculadora;

    @Override
    public ResultadoImc calcularImc(ParametroImc param) {
        Double alturaAoQuadrado = calculadora.multiplicar(param.getAltura(), param.getAltura());
        Double imc = calculadora.dividir(param.getPeso(), alturaAoQuadrado);

        ResultadoImc result = new ResultadoImc();
        result.setImc(imc);

        return result;
    }

}