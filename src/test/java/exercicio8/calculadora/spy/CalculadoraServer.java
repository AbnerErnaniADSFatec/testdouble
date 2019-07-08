package exercicio8.calculadora.spy;
public interface CalculadoraServer {
	// Criando um servidor modelo para as operações
	public float somar(float x, float y);
	public float subtrair(float x, float y);
	public float multiplicar(float x, float y);
	public float dividir(float x, float y);
}
