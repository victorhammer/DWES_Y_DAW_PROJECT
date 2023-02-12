package com.s2daw.demo.controllers;

import dao.UsuarioDao;
import models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Víctor");
        usuario.setApellidos("Alonso");
        usuario.setEmail("alumno.53998@ies-azarquiel.es");
        usuario.setTelefono("648702241");
        return usuario;
    }

    @RequestMapping(value="usuario")
    public List<Usuario> getUsuario(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value="usuario45")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Víctor");
        usuario.setApellidos("Alonso");
        usuario.setEmail("alumno.53998@ies-azarquiel.es");
        usuario.setTelefono("648702241");
        return usuario;
    }

    @RequestMapping(value= "api/usuario/{id}", method = RequestMethod.DELETE)
    public void eliminar(PathVariable Long id){
        UsuarioDao.eliminar(id);
    }

    @RequestMapping(value="usuario123")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Víctor");
        usuario.setApellidos("Alonso");
        usuario.setEmail("alumno.53998@ies-azarquiel.es");
        usuario.setTelefono("648702241");
        return usuario;
    }
}
