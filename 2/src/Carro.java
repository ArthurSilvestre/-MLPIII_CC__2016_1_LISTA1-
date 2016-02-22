public class Carro {
	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;

	//Contrutor
	public Carro(String cor, String modelo, int velocidadeAtual, int velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	//Metodos
	public void ligar(){
		System.out.println("Ligou");
	}
	
	public void acelerar(int velocidadeAceleracao){
		this.velocidadeAtual += velocidadeAceleracao;
		if (this.velocidadeAtual > this.velocidadeMaxima){
			System.out.println("Velocidade atual ultrapassou a velocidade máxima. [Velocidade Atual: " + this.velocidadeAtual + ", Velocidade máxima: " + this.velocidadeMaxima + "]");
		}
	}

	//toString
	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", modelo=" + modelo + ", velocidadeAtual=" + velocidadeAtual + ", velocidadeMaxima=" + velocidadeMaxima + "]";
	}

	//Get's And Set's
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}