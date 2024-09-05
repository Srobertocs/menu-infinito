/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuinfinito;

import javax.swing.JOptionPane;

/**
 *
 * @author SOUSA
 */
public class Teste {

    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {

        int opcao = 1;
        Pessoa pessoa = null;
        Paciente paciente = null;

        String menu = "SEJA BEM VINDO\n"
                + "ESCOLHA SUA OPCAO\n"
                + "1) Criar uma Pessoa (nome, salario e nascimento)\n"
                + "2) Exibir Pessoa\n"
                + "3) Destruir pessoa\n"
                + "4) Criar um Paciente (nome, peso, altura)\n"
                + "5) Exibir Paciente\n"
                + "6) Exibe o IMC do Paciente (Peso/altura^2)\n"
                + "7) Destruir Paciente\n"
                + "8) Exibe a idade que a pessoa fará esse ano\n"
                + "9) Sair";

        while (opcao != 9) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (opcao) {
                case 1:
                    pessoa = new Pessoa();
                    pessoa.nome = JOptionPane.showInputDialog("Digite o nome da pessoa.");
                    pessoa.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário."));
                    pessoa.nascimento = JOptionPane.showInputDialog("Digite sua data de nascimento.");
                    break;
                case 2:
                    if (pessoa == null){  
                        JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada");
                    }else {
                        JOptionPane.showMessageDialog(null, pessoa.toString(opcao));
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Cadastro de pessoa excluido");
                    pessoa = null;  
                    break;
                case 4:
                    paciente = new Paciente();
                    paciente.nome = JOptionPane.showInputDialog("Digite o nome do paciente.");
                    paciente.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura."));
                    paciente.peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso."));
                    break;
                case 5:
                    if (paciente == null){  
                        JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado");
                    }else {
                        JOptionPane.showMessageDialog(null, paciente.toString(opcao));
                    }
                    break;
                case 6:
                       if (paciente == null) {
                        JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado");
                    } else {
                        JOptionPane.showMessageDialog(null, paciente.toString(opcao));
                    }
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Cadastro de paciente excluido");
                    paciente = null; 
                    break;
                case 8:
                     if (pessoa == null) {
                        JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada");
                    } else {
                        JOptionPane.showMessageDialog(null, pessoa.toString(opcao));
                    }
                    break;
            }
        }
    }
}
