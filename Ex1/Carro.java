public class Carro {
    private String cor;
    private String fabricante;
    private String modelo;
    private String placa;
    int integridade = 10; //0 = destruído, 10 = 100% íntegro
    float preço_total;
    float preço_aluguel;
    int dias_aluguel;
    boolean registro_detran;

    public void locadoraDeCarros(Carro carro){
    };
    public void revendedoraDeCarros(Carro carro){
    };
    public void oficinaMecanica(Carro carro){
    };
    public boolean verifRegistroDetran(){
    };
}
