package ta.marcado;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;

public class Atividade {

    private String materia;
    private String nomeAtv;
    private String descricao;
    private Calendar dataPostagem;
    private Calendar dataEntrega;
    

    static Scanner sc = new Scanner(System.in);
    

    public Atividade(String materia, String nomeAtv, String descricao, Calendar dataEntrega) {
        this.materia = materia;
        this.nomeAtv = nomeAtv;
        this.descricao = descricao;
        Calendar agora = Calendar.getInstance();
        //System.out.printf("%tT | %tD\n\n", agora, agora);
        this.dataPostagem = agora;
        this.dataEntrega = dataEntrega;
        
        this.adicionaAtvNaLista();
    }
    
    public String getDados(int posicao){
        String dados= "Nome da atividade nº" + posicao + ": " + this.getNomeAtv()
                +"\nDescrição: " +  this.getDescricao()
                +"\nMatéria: " + this.getMateria()
                +"\nData de entrega: " + this.getDataEntrega().getTime()
                +"\nData de postagem no calendário: " + this.getDataPostagem().getTime()
                +"\n";
        
        return dados;
    }
    
    public void adicionaAtvNaLista(){
        Calendario.listaAtividade.add(this);
    }

    public static String solicitaMateria() {
        System.out.print("Nome da matéria: ");
        return sc.nextLine();
    }

    public static String solicitaNomeAtv() {
        System.out.print("Nome da atividade: ");
        return sc.nextLine();
    }

    public static String solicitaDescricao() {
        System.out.print("Descrição da atividade: ");
        return sc.nextLine();
    }
    
    public static Calendar solicitaDataEntrega() {
        System.out.print("Data de entrega (no formato DD/MM/AAAA): ");
        Calendar dataEntrega = Calendar.getInstance();
        try {

            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            String data = sc.nextLine();
            dataEntrega = Calendar.getInstance();
            dataEntrega.setTime(formatoData.parse(data));

        } catch (Exception e) {
            
        }
        return dataEntrega;
    }
    
    public static Calendar simulaDataEntrega(String a) {
        Calendar dataEntrega = Calendar.getInstance();
        try {

            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            String data = a;
            dataEntrega = Calendar.getInstance();
            dataEntrega.setTime(formatoData.parse(data));

        } catch (Exception e) {
            
        }
        return dataEntrega;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the nomeAtv
     */
    public String getNomeAtv() {
        return nomeAtv;
    }

    /**
     * @param nomeAtv the nomeAtv to set
     */
    public void setNomeAtv(String nomeAtv) {
        this.nomeAtv = nomeAtv;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataPostagem
     */
    public Calendar getDataPostagem() {
        return dataPostagem;
    }

    /**
     * @param dataPostagem the dataPostagem to set
     */
    public void setDataPostagem(Calendar dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    /**
     * @return the dataEntrega
     */
    public Calendar getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(Calendar dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
    

}
