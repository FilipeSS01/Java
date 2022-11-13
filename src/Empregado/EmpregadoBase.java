package Empregado;
public class EmpregadoBase extends Empregado {
	private double salarioBase;
	
	public EmpregadoBase (String primeiroNome, String ultimoNome, int cpf, double vendaBruta, double percentualComissao, double salarioBase){
		super(primeiroNome,  ultimoNome,cpf, vendaBruta, percentualComissao);
		this.salarioBase = salarioBase;
	}
	
	public double lucro (){
		return this.salarioBase + super.lucro();
	}

}