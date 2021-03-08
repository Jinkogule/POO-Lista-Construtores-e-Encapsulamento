public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mes_escrito;
    int dias_no_ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public Data(String mes_escrito, int dia, int ano){
        this.mes_escrito = mes_escrito;
        this.dia = dia;
        this.ano = ano;
    }
    public Data(int dias_no_ano, int ano){
        this.dias_no_ano = dias_no_ano;
        this.ano = ano;
    }

    public String getData1(){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
    public String getData2(){
        return this.mes_escrito+" "+this.dia+", "+this.ano;
    }
    public String getData3(){
        return this.dias_no_ano+" "+this.ano;
    }
}
