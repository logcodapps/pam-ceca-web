package org.logcodapps.pamcecaweb.repository;

import org.logcodapps.pamcecaweb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findUsuarioByLogin(String login);

}
