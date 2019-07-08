package exercicio8.calculadora.fake;
public class CalculadoraApp implements CalculadoraServer{
	private CalculadoraServer server;
	public void setServer(CalculadoraServer server){
		this.server = server;
	}
	public float somar(float x, float y){
		return server.somar(x, y);
	}
	public float subtrair(float x, float y){
		return server.subtrair(x, y);
	}
	public float multiplicar(float x, float y){
		return server.multiplicar(x, y);
	}
	public float dividir(float x, float y){
		return server.dividir(x, y);
	}
}
