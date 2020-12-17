package pe.edu.upeu.daoImpl;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.dao.AccesosDao;
import pe.edu.upeu.entity.Acceso;

@Repository
public class AccesoDaoImpl implements AccesosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Acceso a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Acceso a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		String SQL ="select a.nomacceso, a.url, a.icono from acceso a " + 
				"INNER JOIN roles_acceso rc ON a.idacceso = rc.idacceso " + 
				"INNER JOIN roles r ON rc.idrol = r.idrol " + 
				"INNER JOIN usuarios_roles uc ON r.idrol = uc.idrol " + 
				"INNER JOIN usuarios u ON uc.idusuario = u.idusuario " + 
				"WHERE u.idusuario=?";
		return jdbcTemplate.queryForList(SQL,new Object[] {id});
	}

	@Override
	public Map<String, Object> readAll(String username) {
		String SQL = "select a.nomacceso, a.url, a.icono from acceso a " + 
				"INNER JOIN roles_acceso rc ON a.idacceso = rc.idacceso " + 
				"INNER JOIN roles r ON rc.idrol = r.idrol " + 
				"INNER JOIN usuarios_roles uc ON r.idrol = uc.idrol " + 
				"INNER JOIN usuarios u ON uc.idusuario = u.idusuario " + 
				"WHERE u.username=?";
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
