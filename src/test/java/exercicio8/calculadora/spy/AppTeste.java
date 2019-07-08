package exercicio8.calculadora.spy;
import static org.mockito.Mockito.spy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class AppTeste {
	private CalculadoraApp app;
	private CalculadoraServer server;
	// Criando o Spy
	@Before
	public void setUp(){
		app = new CalculadoraApp();
		Calculadora calculadora = new Calculadora();
		server = spy(calculadora);
		app.setServer(server);
	}
	@Test
	public void testSomar(){
		Assert.assertEquals(app.somar(30 , 20), 50, 0);
	}
	/*
	public void testSubtrair(){
		Assert.assertEquals(app.subtrair(30, 20), 10, 0);
	}
	public void testMultiplicar(){
		Assert.assertEquals(app.multiplicar(30, 20), 600, 0);
	}
	public void testDividir(){
		Assert.assertEquals(app.dividir(60, 20), 3, 0);
	}
	*/
	class Calculadora implements CalculadoraServer{
		// Calculadora implementada
		public float somar(float x, float y){
			return x + y;
		}
		public float subtrair(float x, float y){
			throw new UnsupportedOperationException("Método não implementado!");
			// return x - y;
		}
		public float multiplicar(float x, float y) {
			throw new UnsupportedOperationException("Método não implementado!");
			// return x * y;
		}
		public float dividir(float x, float y) {
			throw new UnsupportedOperationException("Método não implementado!");
			/*
			try {
				return x / y;
			} catch (ArithmeticException e) {
				return 0;
			}
			*/
		}
	}
}
