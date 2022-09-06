
public class ContaEspecial extends Conta implements ElementosDoBanco{
	
	//atributo
	private float limite;
	
	//construtor da superclasse e classe
	public ContaEspecial(int numero, String dataAbertura, boolean status, String senha, float saldo, float limite, Pessoa titular) {
		super(numero, dataAbertura, status, senha, saldo, titular);
		this.limite = limite;
		
		// TODO Auto-generated constructor stub
	}
	
	//getters e setters (modificadores de acesso)
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//metodos e funcoes
	public void atualizaTaxa() {
        this.saldo = this.saldo - 30f;
        movimentos.add(new Movimento("Taxa", 30));
    }
	
	public void relatorio() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.numero);
        System.out.println("Tipo: Conta Especial");
        System.out.println("Limite: " + this.limite);
        System.out.println("Abertura: " + this.dataAbertura);
        System.out.println("Status: " + (this.status) != null ? "Status: Ativa" : "Inativa");
        System.out.println("Titular: " + this.titular);
        System.out.println("Movimentos: ");
        for (Movimento m : movimentos) {
            System.out.println((movimentos.indexOf(m) + 1) + "         "
                    + m.getTipoMovimento() + "     " + m.getValor());
        }
        System.out.println("Saldo: " + this.saldo);
        System.out.println("----------------------------");
        System.out.println("----------------------------");

    }

    public String getElementosInfo() {
        return "ContaEspecial{"+ " limite=" + limite + ", numero=" + numero + ", dataAbertura=" + dataAbertura
                + ", status=" + status + ", senha=" + senha + ", saldo=" + saldo
                + ", titular=" + titular + "Movimentos= " + movimentos +'}';

    }
}
