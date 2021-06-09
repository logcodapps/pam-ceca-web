package org.logcodapps.pamcecaweb.service;

import java.util.List;

import org.logcodapps.pamcecaweb.model.Usuario;
import org.logcodapps.pamcecaweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario enviandoUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public List<Usuario> catalogoUsuarios(){
		return usuarioRepository.findAll();
	}
	
	public Usuario findUsuarioByLogin(String login) {
		return usuarioRepository.findUsuarioByLogin(login) ;
	}
	
	public Usuario findByUsuario(Long chave) {
		return usuarioRepository.findById(chave).get();
	}

}
