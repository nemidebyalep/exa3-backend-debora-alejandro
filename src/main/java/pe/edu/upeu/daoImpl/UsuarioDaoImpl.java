package pe.edu.upeu.daoImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.entity.Usuario;
@Repository
public class UsuarioDaoImpl implements UsuarioDao{
	Gson g = new Gson();
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Usuario validarUsuario(String nomuser) {
		String SQL = "select *from usuarios where username=?";
		Usuario usuario = jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		return usuario;
	}
	@Override
	public Map<String, Object> datosUsuario(String username) {
		String SQL = "SELECT u.idusuario, r.nombre, p.nombres, u.username, r.nombre FROM persona p " + 
				"INNER JOIN usuarios u ON u.idpersona = p.idpersona " + 
				"INNER JOIN usuarios_roles ur ON u.idusuario = ur.idusuario " + 
				"INNER JOIN roles r ON r.idrol=ur.idrol "+
				"where u.username = ?";
		Map<String, Object> map= jdbcTemplate.queryForMap(SQL, username);
		return map;
	}
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select *from usuarios where idusuario=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}
	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String SQL = "SELECT *FROM usuarios WHERE username=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}
}
