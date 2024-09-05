/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuinfinito;

import java.time.LocalDate;

/**
 *
 * @author SOUSA
 */
public class Pessoa {

    String nome;
    double salario;
    String nascimento;

    public int CalculaIdade() {
        int anonasc;
        int anoatual;
        int idade;
        LocalDate dataatual = LocalDate.now();

        anonasc = Integer.parseInt(nascimento.substring(6, 10));
        anoatual = dataatual.getYear();

        idade = anoatual - anonasc;

        return idade;
    }

    public String toString(int opcao) {

        String texto = "";

        if (opcao == 2) {
            texto = "DADOS CADASTRADOS"
                    + "\nNome: " + this.nome
                    + "\nSalário: " + this.salario
                    + "\nNascimento: " + this.nascimento;

        } else if (opcao == 8) {
            int idade = this.CalculaIdade();

            texto = "\nDe acordo com o ano de nascimento essa pessoa fará " + idade + " anos";
        }

        return texto;
    }
}
