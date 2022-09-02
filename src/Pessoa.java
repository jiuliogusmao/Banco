
public abstract class Pessoa implements ElementosDoBanco {
	
	//atributo
	
	protected String nome;

	
	
	//construtor
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	
	// getters e setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
