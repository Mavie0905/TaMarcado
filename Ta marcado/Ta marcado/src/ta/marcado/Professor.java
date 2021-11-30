package ta.marcado;
public class Professor {
    //Dados pessoais
    private String nome;
    private String areaAtuacao;
    //Dados cadastrais
    private String matricula;
    private String senha;
    //Ações
    private boolean adicionarAtv;
    private boolean excluirAtv;
    private boolean mudarDataEntrega;
    private boolean modificarInscrição;
    
    
    public Professor(String nome, String areaAtuacao, String matricula, String senha){
        
    }
    
    public Professor(String nome){
        this.nome = nome;
    }
    
    
    //Métodos
    public void gerenciarAtividades (){
        //Aqui o professor poderá adicionar, excluir, modificar data ou descrição da atividade
    }
    public void negociarPrazo (){
        //Aqui será uma forma do aluno e do professor se comunicarem para modificar ou não o prazo de entrega da atividade
    }
}
