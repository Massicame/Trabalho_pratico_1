package Classes_Java;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class UsuarioService {

    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Usuario> getAllUsuarios() {
        TypedQuery<Usuario> query = entityManager.createQuery("SELECT u FROM Usuario u", Usuario.class);
        return query.getResultList();
    }
    
    public void cadastrarUsuario(Usuario usuario) {
        entityManager.persist(usuario);
    }
    
    public void atualizarUsuario(Usuario usuario) {
        entityManager.merge(usuario);
    }
    
    public void excluirUsuario(Usuario usuario) {
        entityManager.remove(entityManager.merge(usuario));
    }

    List<Usuario> getAllUsuaios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
