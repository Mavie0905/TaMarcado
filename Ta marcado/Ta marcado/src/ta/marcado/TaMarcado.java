package ta.marcado;

import java.util.Scanner;

public class TaMarcado {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bem-Vindo ao Tá Marcado \n\n"
                + "Este software visa ajudar o gerenciamento das atividades pelos professores e facilitar a vida dos alunos ao verificar suas obrigações\n");
        
        System.out.print("Para começar, você é: \n"
                + "1 - Aluno\n"
                + "2 - Professor\n"
                + "Sou: ");
        int papel = Integer.parseInt(sc.nextLine());
        
        if(papel == 1){
            System.out.print("Seu nome: ");
            Aluno aluno = new Aluno(sc.nextLine());
            aluno.menuAluno();
        }else if(papel == 2){
            System.out.print("Seu nome: ");
            Professor professor = new Professor(sc.nextLine());
        }
        
    }  
}
