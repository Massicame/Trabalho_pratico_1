package Classes_Java;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class UsuarioBean {
    private Usuario usuario;
    private UsuarioDAO usuarioDAO;

    public UsuarioBean() {
        usuario = new Usuario();
        usuarioDAO = new UsuarioDAO();
    }

    public void cadastrarUsuario() {
        try {
            usuarioDAO.inserir(usuario);
            // Limpar os campos após a inserção bem-sucedida
            usuario = new Usuario();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Usuário cadastrado com sucesso."));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Ocorreu um erro ao cadastrar o usuário."));
            e.printStackTrace();
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
}