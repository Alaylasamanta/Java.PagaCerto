package br.com.paga.certo;

public class Extrato {

    //Atributos
    public String tipo;
    public String data;
    public Double valor;


    //Construtor
    public Extrato(String tipo, String data, Double valor) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
    }
        public void exibirExtrato() {
            System.out.println("----------Seu Extrato----------");
            System.out.println("Pago no dia " + data + " | Boleto do tipo:" + tipo + " | Com valor de: R$ " + valor);
        }

}
