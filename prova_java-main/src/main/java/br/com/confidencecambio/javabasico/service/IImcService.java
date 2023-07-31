package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.model.ParametroImc;
import br.com.confidencecambio.javabasico.model.ResultadoImc;

public interface IImcService {
    public ResultadoImc calcularImc(ParametroImc param);
}
