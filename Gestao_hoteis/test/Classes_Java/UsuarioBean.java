package Classes_Java;

import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class UsuarioBean {

    @EJB
    private UsuarioService usuarioService;
    
    private Usuario usuario;
    
    private List<Usuario> usuarios;
    
    @PostConstruct
    public void init() {
        setUsuario(new Usuario());
        setUsuarios(getUsuarioService().getAllUsuarios());
    }
    
    public void cadastrarUsuario() {
        getUsuarioService().cadastrarUsuario(getUsuario());
        setUsuarios(getUsuarioService().getAllUsuaios());
        setUsuario(new Usuario());
    }
    
    public void editarUsuario(Usuario usuario) {
        this.setUsuario(usuario);
    }
    
    public void atualizarUsuario() {
        getUsuarioService().atualizarUsuario(getUsuario());
        setUsuarios(getUsuarioService().getAllUsuarios());
        setUsuario(new Usuario());
    }
    
    public void excluirUsuario(Usuario usuario) {
        getUsuarioService().excluirUsuario(usuario);
        setUsuarios(getUsuarioService().getAllUsuarios());
    }

    /**
     * @return the usuarioService
     */
    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    /**
     * @param usuarioService the usuarioService to set
     */
    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
  
}
