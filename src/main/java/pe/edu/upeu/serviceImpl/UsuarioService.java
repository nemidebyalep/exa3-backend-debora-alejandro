package pe.edu.upeu.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import pe.edu.upeu.dao.RolDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.entity.Usuario;

@Service("userService")
public class UsuarioService implements UserDetailsService{
	Gson g = new Gson();
	   @Autowired
		private UsuarioDao usuarioDao;
	   @Autowired
		private RolDao rolDao;
	   
		@Override
		@Transactional(readOnly = true)
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
			Usuario usuario = usuarioDao.validarUsuario(username);
			System.out.println(g.toJson(usuario.getUsername()));
			//System.out.println(g.toJson(rolDao.buscarRolUser(usuario.getIdusuario())));
			UserDetails details = new User(usuario.getUsername(),usuario.getPassword(),rolDao.buscarRolUser(usuario.getIdusuario()));
			//System.out.println("hola: "+g.toJson(details));
			return details;
		}
		
}
