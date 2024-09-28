package Gestao_Funcionario;

import java.util.Scanner;

public class GestaoFuncionarios {

    private int indice = 0;
    private Funcionario[] funcionarios = new Funcionario[50];

    public void criar(String... str) {
        Funcionario novoFuncionario = new Funcionario(String.valueOf(indice), str[0], str[1], str[2], str[3], str[4], str[5]);
        funcionarios[indice] = novoFuncionario;
        indice++;
        System.out.println("Funcionário criado com sucesso!\n");
    }

    public void atualizar(long id, String... str) {
        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario func = funcionarios[i];
            if (func != null && func.getId() == id) {
                func.setNome(str[0]);
                func.setAdmissao(str[1]);
                func.setDemissao(str[2]);
                func.setSalario(str[3]);
                func.setHorario(str[4]);
                System.out.println("Cadastro do funcionário atualizado.\n");
                return;
            }
        }
        System.err.println("Funcionário não encontrado.\n");
    }

    public void excluir(long id) {
        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario func = funcionarios[i];
            if (func != null && func.getId() == id) {
                funcionarios[i] = null;
                System.out.println("Funcionário excluído com sucesso.\n");
                return;
            }
        }
        System.err.println("Funcionário não encontrado.\n");
    }

    public void exibir(long id) {
        System.out.println("\nDados do funcionário com ID " + id + ":");
        for (Funcionario func : funcionarios) {
            if (func != null && func.getId() == id) {
                System.out.println(func);
                return;
            }
        }
        System.err.println("Funcionário não encontrado.\n");
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu - Gestão de Funcionários");
            System.out.println("(C)riar   -   (E)xibir   -   (R)emover   -   (A)tualizar   -   (S)air");
            System.out.print("Digite a opção desejada: ");
            String opcao = scanner.nextLine().toUpperCase();

            switch (opcao.charAt(0)) {
                case 'C':
                    System.out.println("CRIAR FUNCIONÁRIO");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Data de admissão (dd/MM/yyyy): ");
                    String admissao = scanner.nextLine();
                    System.out.print("Data de demissão (dd/MM/yyyy): ");
                    String demissao = scanner.nextLine();
                    System.out.print("Salário: ");
                    String salario = scanner.nextLine();
                    System.out.print("Horário: ");
                    String horario = scanner.nextLine();
                    criar(nome, admissao, demissao, salario, horario);
                    break;

                case 'E':
                    System.out.print("Informe o ID para exibir o funcionário: ");
                    long id = Long.parseLong(scanner.nextLine());
                    exibir(id);
                    break;

                case 'R':
                    System.out.print("Informe o ID para remover o funcionário: ");
                    id = Long.parseLong(scanner.nextLine());
                    excluir(id);
                    break;

                case 'A':
                    System.out.print("Informe o ID para atualizar o funcionário: ");
                    id = Long.parseLong(scanner.nextLine());
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Data de admissão (dd/MM/yyyy): ");
                    admissao = scanner.nextLine();
                    System.out.print("Data de demissão (dd/MM/yyyy): ");
                    demissao = scanner.nextLine();
                    System.out.print("Salário: ");
                    salario = scanner.nextLine();
                    System.out.print("Horário: ");
                    horario = scanner.nextLine();
                    atualizar(id, nome, admissao, demissao, salario, horario);
                    break;

                case 'S':
                    System.out.println("Saindo do sistema.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
