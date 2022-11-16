
// import Banco.Corrente;
import Banco.Poupanca;

public class MainBanco {
    public static void main(String[] args) {
        Poupanca contaPoupanca = new Poupanca("Filipe", "Silva", 1321790863, 34546546, 1000000);
        System.out.println(contaPoupanca.saldo() + "\n");
        System.out.println(contaPoupanca.mes() + "\n");
        System.out.println(contaPoupanca.mes() + "\n");
        System.out.println(contaPoupanca.mes() + "\n");
        System.out.println(contaPoupanca.mes() + "\n");
    }
}
