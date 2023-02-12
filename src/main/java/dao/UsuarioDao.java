package dao;

import models.Usuario;

import java.util.List;

public class UsuarioDao {
    List <Usuario> getUsuarios();

    void eliminar(Long id);
}
