package pe.edu.upeu.daoImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.dao.VentasDao;
@Repository
public class VentasDaoImpl implements VentasDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PK_VENTAS")
				.withProcedureName("SP_LISTAR_VENTAS")
				.declareParameters(new SqlOutParameter("CURSOR_VENTAS", OracleTypes.CURSOR, new ColumnMapRowMapper()));
			return simpleJdbcCall.execute();
	}

}
