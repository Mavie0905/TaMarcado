package ta.marcado;

import java.util.ArrayList;

public class Calendario {
    public static ArrayList<Atividade> listaAtividade = new ArrayList();
    
    public Calendario(){
        
    }
public static void criarSimulacaoDeAtividades(){
    Atividade atv1 = new Atividade("Português", "Seminário sobre o Trovadorismo",
            "Os alunos deverão apresentar os trabalhos desenvolvidos", Atividade.simulaDataEntrega("03/05/2022"));
    Atividade atv2 = new Atividade("Matemática", "Lista de Equações de segundo grau",
            "A lista foi enviada no grupo de turma e vale 10 pontos", Atividade.simulaDataEntrega("04/05/2022"));
}
    
            
}
