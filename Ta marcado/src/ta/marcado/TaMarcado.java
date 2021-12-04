package ta.marcado;

import java.util.Scanner;
import java.util.Calendar;

public class TaMarcado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calendario calendario = new Calendario();

        System.out.println("[...] BEM-VINDO AO TÁ MARCADO [...] \n\n"
                + "(ESTE SOFTWATE VISA AJUDAR O GERENCIAMENTO DAS ATIVIDADES PELOS PROFESSORES E FACILITAR A VIDA DOS ALUNOS AO VERIFICAR SUAS OBRIGAÇÕES)\n");

        System.out.println("User Stories implementados:\n"
                + "US01: EDIÇÃO (apenas a inserção) DE ATIVIDADES NO CALENDÁRIO\n"
                + "US02: BUSCA DE ATIVIDADES\n"
                + "US08: LOGIN POR PAPEL ESCOLAR\n");

        System.out.println("[INÍCIO DO SOFTWARE]");

        System.out.print("Para começar, você é: \n"
                + "Digite 1 para: Aluno\n"
                + "Digite 2 para: Professor\n"
                + "Opção: ");
        int papel = Integer.parseInt(sc.nextLine());

        if (papel == 1) {
            System.out.print("Seu nome: ");
            Aluno aluno = new Aluno(sc.nextLine());
            aluno.menuAluno();
        } else if (papel == 2) {
            System.out.print("Seu nome: ");
            Professor professor = new Professor(sc.nextLine());

            //colocar este trecho na classe Professor
            for (int x = 1; true; x++) {

                System.out.print("Menu:\n"
                        + "Inserir atividade - 1\n"
                        + "Parar de inserir atividade - 0\n"
                        + "Opção: ");
                int opcao = Integer.parseInt(sc.next());

                if (opcao == 1) {
                    Atividade atv = new Atividade(Atividade.solicitaMateria(), Atividade.solicitaNomeAtv(), Atividade.solicitaDescricao(), Atividade.solicitaDataEntrega());
                    System.out.printf("Data de entrega definida para:  %tT | %tD\n\n", atv.getDataEntrega(), atv.getDataEntrega());
                } else if (opcao == 0) {
                    break;
                } else {
                    //Se opção selecionada for diferente de 0 e 1, solicite novamente
                    System.out.println("\nValor inválido. Tente Novamente\n");
                    x -= 1;
                }
            }
        }
        
        System.out.println("Fim da execução\n"
                + "Dados Finais:\n");
        for(int i = 0; i<Calendario.listaAtividade.size(); i++){
            System.out.println(Calendario.listaAtividade.get(i).getDados(i));
        }
    }
}
