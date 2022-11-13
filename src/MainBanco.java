import Banco.Corrente;

public class MainBanco {
    public static void main(String[] args) {
        Corrente contaCorrente = new Corrente("Filipe", "Silva", 1321790863, 34546546, 10000);
        System.out.println(contaCorrente.saldo() + "\n");
        System.out.println(contaCorrente.deposito(8000) + "\n");
        System.out.println(contaCorrente.saque(10));
    }
}
