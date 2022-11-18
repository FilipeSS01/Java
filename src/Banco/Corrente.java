package Banco;

public class Corrente extends Conta {
    public Corrente(String primeiroNome, String ultimoNome, int cpf, int conta, double saldo) {
        super(primeiroNome, ultimoNome, cpf, conta, saldo);
    }

    public String mes() {
        super.saldo = super.saldo - 5;
        return super.mes() + "\nManutenção: R$ " + df.format(5);
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
