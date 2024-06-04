package Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        // Cadastrar 3 funcionários
        for (int i = 1; i <= 3; i++) {
            System.out.println("Cadastro do Funcionário " + i + ":");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Setor: ");
            String setor = scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Função: ");
            String funcao = scanner.nextLine();

            Funcionario funcionario = new Funcionario(nome, idade, telefone, setor, cargo, funcao);
            funcionarios.add(funcionario);

            System.out.println();
        }

        // Exibir os funcionários cadastrados
        System.out.println("Funcionários Cadastrados:");
        for (Funcionario func : funcionarios) {
            System.out.println("Nome: " + func.getNome());
            System.out.println("Idade: " + func.getIdade());
            System.out.println("Telefone: " + func.getTelefone());
            System.out.println("Setor: " + func.getSetor());
            System.out.println("Cargo: " + func.getCargo());
            System.out.println("Função: " + func.getFuncao());
            System.out.println();
        }

        scanner.close();
    }
}
