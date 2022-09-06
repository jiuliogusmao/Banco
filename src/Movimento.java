
public class Movimento {
	//atritutos
	private String tipoMovimento;
	private float valor;
	
	//construtor
	public Movimento(String tipoMovimento, float valor) {
		super();
		this.tipoMovimento = tipoMovimento;
		this.valor = valor;
	}
	
	//getters e setters
	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Movimento [tipoMovimento=" + tipoMovimento + ", valor=" + valor + "]";
	}
	
	
}
