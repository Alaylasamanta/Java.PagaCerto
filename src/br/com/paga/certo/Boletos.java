package br.com.paga.certo;

public class Boletos {
    public String nomeConta;
    public double valorConta;

    public Boletos(String nomeConta, double valorConta) {
        this.nomeConta = nomeConta;
        this.valorConta = valorConta;
    }

    // O método recebe o objeto Usuario para poder ler o saldo e subtrair
    public void pagamentoBoleto(Usuario u) {
        System.out.println("--- Processando Pagamento ---");

        if (u.saldo >= this.valorConta) {
            u.saldo -= this.valorConta;
            System.out.println("Sucesso! A conta " + this.nomeConta + " foi paga.");

            // Criando o registro no extrato
            Extrato registro = new Extrato(this.nomeConta, "10/03/2026", this.valorConta);
            System.out.println("Transação registrada com sucesso!");
            registro.exibirExtrato(); // Chama o método do extrato
        } else {
            System.out.println("Saldo insuficiente para pagar " + this.nomeConta);
            System.out.println("Faltam: R$ " + (this.valorConta - u.saldo));
        }
        System.out.println("Saldo final de " + u.nome + ": R$ " + u.saldo);
    }
}