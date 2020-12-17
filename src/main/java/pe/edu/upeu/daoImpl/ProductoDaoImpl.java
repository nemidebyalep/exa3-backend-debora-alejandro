package pe.edu.upeu.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.entity.Producto;
import pe.edu.upeu.dao.ProductoDao;
@Component
public class ProductoDaoImpl implements ProductoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Producto r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto r) {
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
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_productos") //nombre del paquete
				.withProcedureName("sp_listar_productos") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("cursor_productos", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));	
				return simpleJdbcCall.execute();
	}
}
