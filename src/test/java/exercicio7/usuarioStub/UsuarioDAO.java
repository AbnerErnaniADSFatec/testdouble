package exercicio7.usuarioStub;
import java.util.List;
public interface UsuarioDAO {
	public Usuario inserir(Usuario usario);
	public Usuario buscarPorNome(String nome);
	public List<Usuario> listarTodos();
}
