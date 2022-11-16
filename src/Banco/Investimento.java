package Banco;

public class Investimento extends Conta{
    public Investimento(String primeiroNome, String ultimoNome, int cpf, int conta, double saldo) {
        super(primeiroNome, ultimoNome, cpf, conta, saldo);
    }

    public String mes() {
        super.saldo = (super.saldo * 1.013) - 10;
        return super.saldo() + "\nRendimento: R$ " + df.format(super.saldo - (super.saldo / 1.013)) + "\nManutenção: R$ " + df.format(10);
    }

    public String saque(double value) {
        super.saldo = super.saldo - 25;
        return super.saque(value) + "\nValor da operação: R$ " + df.format(25);
    }

    public String deposito(double value) {
        return super.deposito(value);
    }

    public String saldo() {
        return super.saldo();
    }
}
