package Banco;

public class Poupanca extends Conta {

    public Poupanca(String primeiroNome, String ultimoNome, int cpf, int conta, double saldo) {
        super(primeiroNome, ultimoNome, cpf, conta, saldo);
    }

    public String mes() {
        super.saldo = super.saldo * 1.007;
        return super.mes() + "\nRendimento: R$ " + df.format(super.saldo - (super.saldo / 1.007));
    }

    public String saque(double value) {
        return super.saque(value);
    }

    public String deposito(double value) {
        return super.deposito(value);
    }

    public String saldo() {
        return super.saldo();
    }
}
