package com.example.oauth.service;

import com.example.usuarioscommons.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);

}
