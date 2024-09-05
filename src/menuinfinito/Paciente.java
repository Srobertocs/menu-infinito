/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuinfinito;

/**
 *
 * @author SOUSA
 */
public class Paciente {

    String nome;
    double peso;
    double altura;

    public double CalculaImc() {
        double imc = this.peso / Math.pow(this.altura, 2);
        return imc;
    }

    public String toString(int opcao) {

        String texto = "";
        if (opcao == 5) {
            texto = "DADOS CADASTRADOS"
                    + "\nNome do paciente: " + this.nome
                    + "\nAltura: " + this.altura + " Mt"
                    + "\nPeso: " + this.peso + " Kg";

        } else if (opcao == 6) {
            double imc = this.CalculaImc();

            String imcformatado = String.format("%.2f", imc);

            texto = "IMC DO PACIENTE"
                    + "\nO paciente " + this.nome + " possui um IMC de " + imcformatado;
        }
        return texto;
    }
}
