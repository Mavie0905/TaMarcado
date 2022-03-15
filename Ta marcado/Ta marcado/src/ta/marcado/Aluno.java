package ta.marcado;

import java.util.Scanner;

public class Aluno {

    Scanner sc = new Scanner(System.in);

    //Dados pessoais
    private String nome; //nome, idade e turma são dados do usuário que pode ser que a gente utilize mais para frente
    private int idade;
    private String turma;
    //Dados cadastrais
    private String mensagem;

    //Ações
    private boolean marcarAtvConcluida;
    private boolean solicitarModifPrazo;

    Professor professor = new Professor();
    
    public Aluno(String nome, int idade, String turma, String matricula, String senha) {

    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void menuAluno() {
        while (true) {
            System.out.println("Olá " + this.nome + ", o que deseja realizar? \n"
                    + "1 - Abrir o Calendário\n"
                    + "2 - Adicionar Post-It\n"
                    + "3 - Marcar atividades feitas\n"
                    + "0 - Encerrar programa");
            int opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                System.out.println("Calendário: \n");
                for (int i = 0; i < Calendario.listaAtividade.size(); i++) {
                    System.out.println(Calendario.listaAtividade.get(i).getDados(i));
                }
                System.out.println("Deseja pedir mais prazo para alguma atividade?\n"
                        + "Sim - 1\n"
                        + "Não - Presione qualquer tecla");
                int alternativa = Integer.parseInt(sc.nextLine());

                if (alternativa == 1) {
                    Pedido ped = new Pedido(Pedido.solicitaNumAtividade(), Pedido.solicitaDias());
                }
            } else if (opcao == 2) {
                Lembrete lemb = new Lembrete(Lembrete.solicitaDescricao());
            }else if (opcao == 3) {
                marcarAtividadesFeitas();
            } else {
                break;
            }
        }
    }
    
    public void marcarAtividadesFeitas() {
        System.out.println("O calendário será aberto.\n"
                + "Calendário: \n");
                for (int i = 0; i < Calendario.listaAtividade.size(); i++) {
                    System.out.println(Calendario.listaAtividade.get(i).getDados(i));
                }
        System.out.println("Escolha a atividade que deseja marcar como feita.\n"
                + "1 - Português, Seminário sobre o Trovadorismo\n"
                + "2 - Matemática, Lista de Equações de segundo grau");
        int numb = Integer.parseInt(sc.nextLine());
        System.out.println("A atividade foi marcada e mudou de cor.");
        
    }

    public void visualizarAtividades() {
        System.out.println("Essas são suas atividades.\nCalendário: \n");
        for (int i = 0; i < Calendario.listaAtividade.size(); i++) {
            System.out.println(Calendario.listaAtividade.get(i).getDados(i));
        }
    }

    public void negociarPrazo() {
        System.out.println("Escreva uma mensagem para seu professor.\n");
        setMensagem(sc.nextLine());
        System.out.println("Quando o professor responder sua mensagem você será comunicado.");
        System.out.println("Mensagens não lidas." + professor.getMensagem());
    }

    public void recuperarSenha() {
        //Aqui o aluno poderá tentar recuperar sua senha caso não consiga efetuar o login na plataforma
    }
    
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the turma
     */
    public String getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    public boolean isMarcarAtvConcluida() {
        return marcarAtvConcluida;
    }

    /**
     * @param marcarAtvConcluida the marcarAtvConcluida to set
     */
    public void setMarcarAtvConcluida(boolean marcarAtvConcluida) {
        this.marcarAtvConcluida = marcarAtvConcluida;
    }

    /**
     * @return the solicitarModifPrazo
     */
    public boolean isSolicitarModifPrazo() {
        return solicitarModifPrazo;
    }

    /**
     * @param solicitarModifPrazo the solicitarModifPrazo to set
     */
    public void setSolicitarModifPrazo(boolean solicitarModifPrazo) {
        this.solicitarModifPrazo = solicitarModifPrazo;
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
