package Banco;

public class Corrente extends Conta {
    public Corrente(String primeiroNome, String ultimoNome, int cpf, int conta, double saldo){
        super(primeiroNome, ultimoNome, cpf, conta, saldo);
    }
    public String saque(double value){
        return super.saque(value);
    }
    public String deposito(double value){
        return super.deposito(value);
    }
    public String saldo(){
        return super.saldo();
    }
}
