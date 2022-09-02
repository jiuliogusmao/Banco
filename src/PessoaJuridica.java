// pessoa juridica = {cnpj, nome, cidade, estado}
public class PessoaJuridica extends Pessoa implements ElementosDoBanco{
	//atributos
	private String cnpj;
	private String cidade;
	private String estado;
	
	//construtor
	public PessoaJuridica(String nome, String cnpj, String cidade, String estado) {
		super(nome);
		this.cnpj = cnpj;
		this.cidade = cidade;
		this.estado = estado;
	}
	//getters e setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
	@Override
	public String getElementosInfos() {
		// TODO Auto-generated method stub
		return "PessoaJuridica [cnpj=" + cnpj + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
	
	
	
	
}
