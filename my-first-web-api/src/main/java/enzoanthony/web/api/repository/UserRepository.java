package enzoanthony.web.api.repository;

import enzoanthony.web.api.handler.BusinessException;
import enzoanthony.web.api.handler.CampoObrigatorioException;
import enzoanthony.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario) {
        if (usuario.getLogin()==null)
            throw new CampoObrigatorioException("Login");

        if (usuario.getLogin()==null)
            throw new CampoObrigatorioException(" password");


        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }

        System.out.println(usuario);
        System.out.println("Login: " + usuario.getLogin());
        System.out.println("Password: " + usuario.getPassword());
    }

    public void deleteById(Integer id) {
        System.out.println(
                String.format("DELETE/id - Recebendo o id: %d para excluir um", id)
        );
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do Sistema");

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("enzo", "password"));
        usuarios.add(new Usuario("lucas", "cristianoronaldo"));

        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(
                String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id)
        );
        return new Usuario("enzo", "password");
    }

    public Usuario findByUsername(String username) {
        System.out.println(
                String.format(
                        "FIND/username - Recebendo o username: %s para localizar um usuário",
                        username
                )
        );
        return new Usuario("enzo", "password");
    }
}
