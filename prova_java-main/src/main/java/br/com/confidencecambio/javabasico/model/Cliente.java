package br.com.confidencecambio.javabasico.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Cliente {

@NotNull
@NotEmpty
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String semEspacos(String nome){
        return nome.trim();
        }
    public String primeiroNome(String nome){
        String[] array = nome.split(" ");
        String resultado = String.valueOf(array[0].charAt(0));
        return resultado;
    }

    public String ultimoNome(String nome){
        String[] array = nome.split(" ");
        String resultado = String.valueOf(array[0].charAt(0));
        if(array.length > 1)
            resultado += array[array.length - 1].charAt(1);
        return resultado;
    }

    public String letraMaiuscula(String nome){
        return nome.toUpperCase();
    }
    public String abreviacaoNomeDoMeio(String nome){
        String[] array = nome.split(" ");
        String resultado = String.valueOf(array[0].charAt(0));
        if(array.length > 1)
            resultado += array[array.length - 1].charAt(0);
        return resultado;
    }
}
