package pe.edu.upeu.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.entity.Acceso;

public interface AccesoService {
	int create(Acceso a);
	int update(Acceso a);
	int update(int id);
	int delete(int id);
	List<Map<String, Object>> read(int iduser);
	List<Map<String, Object>> readAll();
	Map<String, Object> readAll(String username);
}
