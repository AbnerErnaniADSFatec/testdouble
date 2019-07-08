package exercicio7.usuarioStub;
import java.util.List;
public class UsuarioDAOImplStub implements UsuarioDAO{
	private UsuarioDAO userDAO;
	public void setUserDAO(UsuarioDAO userDAO){
		this.userDAO = userDAO;
	}
	public Usuario inserir(Usuario usuario) {
		return userDAO.inserir(usuario);
	}
	public Usuario buscarPorNome(String nome) {
		return userDAO.buscarPorNome(nome);
	}
	public List<Usuario> listarTodos() {
		return userDAO.listarTodos();
	}
}
