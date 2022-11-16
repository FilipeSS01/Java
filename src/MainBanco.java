
import Banco.Corrente;
import Banco.Investimento;
import Banco.Poupanca;

public class MainBanco {
    public static void main(String[] args) {
        Poupanca contaPoupanca = new Poupanca("Filipe", "Silva", 1321790863, 34546546, 1000000);
        Investimento contaInvestimento = new Investimento("Filipe", "Silva", 1321790863, 34546546, 1000000);
        Corrente contaCorrente = new Corrente("Tyler", "Silva", 1321790863, 45646465, 5);
        System.out.println(contaPoupanca.saldo() + "\n");
        System.out.println(contaPoupanca.mes() + "\n");
        System.out.println(contaPoupanca.mes() + "\n");
        System.out.println(contaPoupanca.mes() + "\n");
        System.out.println("================================================\n");
        System.out.println(contaCorrente.saldo() + "\n");
        System.out.println(contaCorrente.mes() + "\n");
        System.out.println(contaCorrente.mes() + "\n");
        System.out.println(contaCorrente.mes() + "\n");
        System.out.println("================================================\n");
        System.out.println(contaInvestimento.saldo() + "\n");
        System.out.println(contaInvestimento.mes() + "\n");
        System.out.println(contaInvestimento.mes() + "\n");
        System.out.println(contaInvestimento.mes() + "\n");
        System.out.println(contaInvestimento.saque(1000000) + "\n");
    }
}
