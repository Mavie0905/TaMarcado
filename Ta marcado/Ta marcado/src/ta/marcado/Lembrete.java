package ta.marcado;

import java.util.ArrayList;
import java.util.Scanner;

public class Lembrete {
    String descricao;

    public static ArrayList<Lembrete> listaLembretes = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    
    public Lembrete(String descricao){
        this.descricao = descricao;
        
        Lembrete.listaLembretes.add(this);
    }
    
    public static String solicitaDescricao(){
        System.out.print("Descrição do lembrete: ");
        return sc.nextLine();
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
