package exercicio7.usuarioStub;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class UsuarioTeste {
	private UsuarioDAOImplStub userStub;
	private UsuarioDAO userDAO;
	@Before
	public void setUp(){
		userStub = new UsuarioDAOImplStub();
		userDAO = mock(UsuarioDAO.class);
		userStub.setUserDAO(userDAO);
	}
	@Test
	public void CenarioPerfeito(){
		Usuario user = new Usuario();
		user.setNome("Abner");
		user.setTelefone("(12) 99234 - 9876");
		when(userDAO.inserir(user)).thenReturn(user);
		Usuario userPorNome = userDAO.buscarPorNome("Abner");
		Assert.assertEquals("Abner", userPorNome.getNome());
	}
	@Test
	public void usuarioNaoExiste(){
		when(userDAO.buscarPorNome("Abner")).thenReturn(null);
		Usuario buscaUser = userDAO.buscarPorNome("Abner");
		Assert.assertEquals("", buscaUser.getNome());
	}
}
