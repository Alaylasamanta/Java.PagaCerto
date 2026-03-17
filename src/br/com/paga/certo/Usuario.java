package br.com.paga.certo;

public class Usuario {
    // Atributos
    public String nome;
    public double saldo;
    public String logradouro;
    public String numeroImovel;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public String cep;
    public String Celular;
    public String email;
    private String senha;
    private String cpf;



    // Construtor: usado para "nascer" o objeto
    public Usuario(String nome,String email,String senha,String cpf) {
        this.nome = nome;
        this.saldo = 0.0;
    }

    // Método que apenas retorna a saudação (a lógica de ler fica na Main)
    public String obterSaudacao() {
        return "Olá, " + this.nome;
    }

    // Método que adiciona saldo
    public void depositar(double valor) {
        this.saldo += valor;
    }
}
