package ta.marcado;

import java.util.Scanner;

public class Aluno{
    
    Scanner sc = new Scanner(System.in);
    
    //Dados pessoais
    private String nome; //nome, idade e turma são dados do usuário que pode ser que a gente utilize mais para frente
    private int idade;
    private String turma;
    //Dados cadastrais
    private String matricula;
    private String senha;
    //Ações
    private boolean marcarAtvConcluida;
    private boolean solicitarModifPrazo;
    
    
    public Aluno(String nome, int idade, String turma, String matricula, String senha){
        
    }
    
    public Aluno(String nome){
        this.nome = nome;        
    }
    
    
    public void menuAluno(){
        System.out.println("Olá " + this.nome + ", o que deseja realizar? \n"
                + "1 - Abrir o Calendário\n"
                + "2 - Abrir Perfil");
        int opcao = Integer.parseInt(sc.nextLine());
        
        if(opcao == 1){
            //Chamar o método responsável por abrir o calendário
        }else if(opcao == 2){
            //Chamar o método responsável por abrir o perfil do usuário
        }
    }
    
    
    public void visualizarAtividades (){
        //Obs: realizar um if para verificar se o login foi efetuado para proceder o método
    }
    public void marcarAtividadesFeitas(){
        //Aqui o aluno poderá marcar alguma atividade como feita e sua coloração mudará
    }

    /**
     *
     */
    public void negociarPrazo (){
        //Um método sobreposto de Professores
        //Aqui será uma forma do aluno e do professor se comunicarem para modificar ou não o prazo de entrega da atividade
    }
    public void recuperarSenha (){
        //Aqui o aluno poderá tentar recuperar sua senha caso não consiga efetuar o login na plataforma
    }

    /**
     * @return the nome
     */
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

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the marcarAtvConcluida
     */
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
    
    
    
}
