package pe.edu.upeu.dao;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import pe.edu.upeu.entity.Producto;

public interface ProductoDao {
	int create(Producto r);
	int update(Producto r);
	int update(int id);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
