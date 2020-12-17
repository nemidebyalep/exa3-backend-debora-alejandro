package pe.edu.upeu.service;

import java.util.Map;

import pe.edu.upeu.entity.Rol;

public interface RolService {
	int create(Rol r);
	int update(Rol r);
	int update(int id);
	int delete(int id);
    Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
