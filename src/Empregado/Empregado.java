package Empregado;
public class Empregado{
    protected String primeiroNome;
	protected String ultimoNome;
	protected int cpf;
	protected double vendaBruta;
	protected double percentualComissao;

	public Empregado (){
		this.primeiroNome = "";
		this.ultimoNome = "";
		this.cpf = 0;
		this.vendaBruta =  0;
		this.percentualComissao = 0;
	}
	
	public Empregado (String primeiroNome, String ultimoNome, int cpf, double vendaBruta, double percentualComissao){
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.cpf = cpf;
		this.vendaBruta =  vendaBruta;
		this.percentualComissao = percentualComissao;
	}
	
	public double lucro (){
		return this.vendaBruta * this.percentualComissao;
	}
	
	public String toString (){
		return super.toString()+" "+this.primeiroNome+" com o salario de "+this.lucro();
	}
}