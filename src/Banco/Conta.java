package Banco;

import java.text.DecimalFormat;

public class Conta {
    protected String primeiroNome;
    protected String ultimoNome;
    protected int cpf;
    protected int conta;
    protected double saldo;
    DecimalFormat df = new DecimalFormat("####.##");

    public Conta() {
        this.setPrimeiroNome("");
        this.setUltimoNome("");
        this.setCpf(0);
        this.setConta(0);
        this.setSaldo(0);
    }

    public Conta(String primeiroNome, String ultimoNome, int cpf, int conta, double saldo) {
        this.setPrimeiroNome(primeiroNome);
        this.setUltimoNome(ultimoNome);
        this.setCpf(cpf);
        this.setConta(conta);
        this.setSaldo(saldo);
    }

    public String mes() {
        return "Conta: " + this.getConta() + "\nTitular: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nSaldo: R$ "
                + df.format(this.getSaldo());
    }

    public String saque(double value) {
        this.setSaldo(this.getSaldo() - value);
        return "Conta: " + this.getConta() + "\nTitular: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nValor retirado: R$ " + value
                + "\nSaldo: R$ " + df.format(this.getSaldo());
    }

    public String deposito(double value) {
        this.setSaldo(this.getSaldo() + value);
        return "Conta: " + this.getConta() + "\nTitular: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nValor depositado: R$ " + value
                + "\nSaldo: R$ " + df.format(this.getSaldo());
    }

    public String saldo() {
        return "Conta: " + this.getConta() + "\nTitular: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nSaldo: R$ "
                + df.format(this.getSaldo());
    }

    protected String getNome() {
        return this.getPrimeiroNome() + " " + this.getUltimoNome();
    }

    protected String getPrimeiroNome() {
        return this.primeiroNome;
    }

    protected void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    protected String getUltimoNome() {
        return this.ultimoNome;
    }

    protected void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    protected int getCpf() {
        return this.cpf;
    }

    protected void setCpf(int cpf) {
        this.cpf = cpf;
    }

    protected int getConta() {
        return this.conta;
    }

    protected void setConta(int conta) {
        this.conta = conta;
    }

    protected double getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
