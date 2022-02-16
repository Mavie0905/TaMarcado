package ta.marcado;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private int numAtv;
    private int numDias;
    
    public static ArrayList<Pedido> listaPedidos = new ArrayList();

    public Pedido(int numAtv, int numDias) {
        this.numAtv = numAtv;
        this.numDias = numDias;
        
        Pedido.listaPedidos.add(this);
    }
    
    
    static Scanner sc = new Scanner(System.in);
    
    public String getDados(int posicao){
        String dados= "Número da atividade: " + this.getNumAtv()
                +"\nQuantidade soliticada de dias: " +  this.getNumDias()
                +"\n";
        
        return dados;
    }
    
    public static int solicitaNumAtividade() {
        System.out.print("Número da atividade: ");
        return Integer.parseInt(sc.nextLine());
    }
    
    public static int solicitaDias() {
        System.out.print("Quantos dias deseja? ");
        return Integer.parseInt(sc.nextLine());
    }

    public int getNumAtv() {
        return numAtv;
    }

    public void setNumAtv(int numAtv) {
        this.numAtv = numAtv;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    
    
}
