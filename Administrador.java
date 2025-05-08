package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
    private List<Usuario> usuarios;

    public Administrador(int id, String nombre, String email) {
        super(id, nombre, email);
        this.usuarios = new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

}

