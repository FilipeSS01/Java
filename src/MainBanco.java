
import java.util.ArrayList;

import Banco.Conta;
import Banco.Corrente;
import Banco.Investimento;
import Banco.Poupanca;

public class MainBanco {
    public static void main(String[] args) {
        Poupanca contaPoupanca = new Poupanca("Filipe", "Silva", 1321790863, 34546546, 20000);
        Investimento contaInvestimento = new Investimento("Filipe", "Silva", 1321790863, 34546546, 20000);
        Corrente contaCorrente = new Corrente("Tyler", "Silva", 1321790863, 45646465, 20000);

        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(contaPoupanca);
        contas.add(contaCorrente);
        contas.add(contaInvestimento);

        System.out.println("================================================\n");
        for (Conta conta : contas) {
            System.out.println(conta.saldo() + "\n");
            System.out.println(conta.mes() + "\n");
            System.out.println(conta.mes() + "\n");
            System.out.println(conta.saque(10000) + "\n");
            System.out.println("================================================\n");
        }
    }
}
