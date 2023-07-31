package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.model.ParametroImc;
import br.com.confidencecambio.javabasico.model.ResultadoImc;
import br.com.confidencecambio.javabasico.service.IImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static br.com.confidencecambio.javabasico.util.Constants.*;

@Controller
public class ImcController {

    @Autowired
    private IImcService imcService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String imcForm() {
        return PAGINA_IMC;
    }

    @RequestMapping(value = "/calcular", method = RequestMethod.GET)
    public String calcular(Model model, ParametroImc param) {
        ResultadoImc result = imcService.calcularImc(param);
        model.addAttribute(RESULTADO, result);
        return PAGINA_IMC;
    }

    @ModelAttribute(PARAMETRO)
    public ParametroImc create() {
        return new ParametroImc();
    }
}
