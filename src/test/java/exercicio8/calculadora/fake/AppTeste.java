package exercicio8.calculadora.fake;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
public class AppTeste {
	private CalculadoraApp calculadoraFake;
	private CalculadoraServer server;
	@Before
	public void setUp(){
		calculadoraFake = new CalculadoraApp();
		server = mock(CalculadoraApp.class);
		calculadoraFake.setServer(server);
	}
	@Test
	public void testaSoma(){
		float resposta = 50;
		when(calculadoraFake.somar(30, 20)).thenReturn(resposta);
	}
	@Test
	public void testaSubtracao(){
		float resposta = 10;
		when(calculadoraFake.somar(30, 20)).thenReturn(resposta);
	}
	@Test
	public void testaMultiplicacao(){
		float resposta = 60;
		when(calculadoraFake.somar(30, 20)).thenReturn(resposta);
	}
	@Test
	public void testaDivisao(){
		float resposta = 3;
		when(calculadoraFake.somar(60, 20)).thenReturn(resposta);
	}
}
