

import java.util.ArrayList;

import Empregado.Empregado;
import Empregado.EmpregadoBase;

public class MainEmpregado {
    public static void main(String[] args){
		Empregado empregado1 = new Empregado("Straus", "Michalsky", 11111, 1000, 0.1);
		EmpregadoBase empregado2 = new EmpregadoBase("Thiago", "Caproni", 22222, 1000, 0.1, 5000);
		Empregado empregado3 = new Empregado("Zezinho", "Seila", 11111, 1000, 0.1);
		EmpregadoBase empregado4 = new EmpregadoBase("Huguinho", "Donald", 22222, 1000, 0.1, 5000);
		
		
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();
		empregados.add(empregado1);
		empregados.add(empregado2);
		empregados.add(empregado3);
		empregados.add(empregado4);
		
		System.out.println(empregado3.lucro());
		System.out.println(empregado4.lucro());
		for(Empregado meuEmpregado: empregados){
			System.out.println(meuEmpregado);
		}

	/*	for(int i =0; i< empregados.size(); i++){
			System.out.println(empregados.get(i));
		}
	*/

    }
}
