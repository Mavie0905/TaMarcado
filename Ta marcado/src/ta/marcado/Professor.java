package ta.marcado;

import java.util.Scanner;

public class Professor{
    //Dados pessoais
    private String nome;
    private String areaAtuacao;
    //Dados cadastrais
    private String mensagem;
    /*Ações
    private boolean adicionarAtv;
    private boolean excluirAtv;
    private boolean mudarDataEntrega;
    private boolean modificarInscrição;*/

    Professor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Professor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public Professor(String nome, String areaAtuacao, String matricula, String senha){
        
    }
    
    public Professor (String nome) {
        this.nome = nome;
    }
    
    Aluno aluno = new Aluno();
    
    //Métodos
    public void menuProfessor() {
        while (true) {
            System.out.println("Menu:\n"
                    + "Gerenciar atividade - 1\n"
                    + "Inserir links - 2\n"
                    + "Sair do programa - 0\n"
                    + "Opção: ");
            int opcao = Integer.parseInt(sc.nextLine());
            
            if (opcao == 1) {
                gerenciarAtividades();
            } else if (opcao == 2) {
                inserirLinks();
            } else if (opcao == 0) {
                break;
            } else {
                //Se opção selecionada for diferente de 0 e 1, solicite novamente
                System.out.println("\nValor inválido. Tente Novamente\n");
            }
        }
    }
    public void inserirLinks() {
        System.out.println("O calendário será aberto.");
        Calendario.criarSimulacaoDeAtividades();
        System.out.println("Cole aqui o link que deseja inserir: ");
        String link = sc.nextLine();
        System.out.println("Link inserido no calendário:\n\n" + link);
    }
    public void gerenciarAtividades (){    //INCOMPLETO
        //Aqui o professor poderá adicionar, excluir, modificar data ou descrição da atividade
        while (true) {
            System.out.println("Menu:\n"
                    + "Inserir - 1"
                    + "Excluir - 2"
                    + "Modificar data - 3"
                    + "Modificar descrição - 4"
                    + "Sair - 0");
            int resp = Integer.parseInt(sc.nextLine());
            if (resp == 1) {
                Atividade atv = new Atividade(Atividade.solicitaMateria(), Atividade.solicitaNomeAtv(), Atividade.solicitaDescricao(), Atividade.solicitaDataEntrega());
                System.out.printf("Data de entrega definida para:  %tT | %tD\n\n", atv.getDataEntrega(), atv.getDataEntrega());
                System.out.println("Atividade inserida.");
            }else if (resp == 2) {
                System.out.println("Atividade excluida.");
            }else if (resp == 3) {
                System.out.println("Data modificada.");
            }else if (resp == 4) {
                System.out.println("Descrição modificada.");
            }else {
                break;
            }
        }
        //Inserir:
        Atividade atv = new Atividade(Atividade.solicitaMateria(), Atividade.solicitaNomeAtv(), Atividade.solicitaDescricao(), Atividade.solicitaDataEntrega());
        System.out.printf("Data de entrega definida para:  %tT | %tD\n\n", atv.getDataEntrega(), atv.getDataEntrega());
        //Excluir:
        
        //Modificar data:
        
        //Modificar descrição:
        
    }
    public void negociarPrazo (){
        //Aqui será uma forma do aluno e do professor se comunicarem para modificar ou não o prazo de entrega da atividade
        System.out.println("Você tem uma nova mensagem.\n" + aluno.getMensagem());
        System.out.println("Responda aqui a esta mensagem: ");
        setMensagem(sc.nextLine());
        
    }
}
