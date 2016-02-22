public class Fatura {
	private String numero;
	private String descricao;
	private int quantidadeItem;
	private double valorItem;

	//Contrutor
	public Fatura(String numero, String descricao, int quantidadeItem, double valorItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeItem = quantidadeItem;
		this.valorItem = valorItem;
	}

	//Metodos
	public double getValorFatura(){
		double valorFatura = (valorItem > 0 ? valorItem : 0) * quantidadeItem; 
		return valorFatura > 0 ? valorFatura : 0 ;
	}
	
	//toString
	@Override
	public String toString() {
		return "Fatura [numero=" + numero + ", descricao=" + descricao + ", quantidadeItem=" + quantidadeItem + ", valorItem=" + valorItem + "]";
	}

	//Get's and Set's
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeItem() {
		return quantidadeItem;
	}
	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	public double getValorItem() {
		return valorItem;
	}
	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}
}