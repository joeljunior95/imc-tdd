/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Joel
 */
public class Pessoa {

    private double peso;
    private double altura;
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(double peso, double altura, String nome, int idade, String sexo) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
        this.sexo = sexo;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }

    public double calculaIMC() {
        return peso/(altura*altura);
    }

    String checaIMC() {
        String msg;
        double imc = this.calculaIMC();
        if(imc < 18.5){
            msg = "Você está abaixo do peso recomendado.";
        } else if(imc >= 18.5 && imc < 25){
            msg = "Você está muito bem! Continue assim!";
        } else if(imc >= 25 && imc < 30){
            msg = "Você está acima do peso recomendado. Cuidado!";
        } else {
            msg = "Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
        }
        return msg;
    }

}
