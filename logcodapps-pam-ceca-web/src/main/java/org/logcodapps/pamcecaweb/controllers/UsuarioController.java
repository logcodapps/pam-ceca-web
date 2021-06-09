package org.logcodapps.pamcecaweb.controllers;

import java.util.List;

import org.logcodapps.pamcecaweb.model.Usuario;
import org.logcodapps.pamcecaweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	public Usuario usuarioEnviado(@RequestBody Usuario usuario) {
		return usuarioService.enviandoUsuario(usuario);
	}
	@GetMapping
	public List<Usuario> catalogoUsuarios(){
		return usuarioService.catalogoUsuarios();
	}
	@GetMapping("/{chave}")
	public Usuario findUsuarioByLogin(@PathVariable Long chave) {
		return usuarioService.findByUsuario(chave);
	}
	
	@GetMapping("/especifico/{login}")
	public Usuario usuarioEspecefico(@PathVariable String login) {
		return usuarioService.findUsuarioByLogin(login);
	}

}
