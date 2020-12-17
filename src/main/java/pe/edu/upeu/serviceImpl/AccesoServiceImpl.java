package pe.edu.upeu.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.AccesosDao;
import pe.edu.upeu.entity.Acceso;
import pe.edu.upeu.service.AccesoService;
@Service
public class AccesoServiceImpl implements AccesoService{
	@Autowired
	private AccesosDao accesosDao;
	@Override
	public int create(Acceso a) {
		// TODO Auto-generated method stub
		return accesosDao.create(a);
	}

	@Override
	public int update(Acceso a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return accesosDao.update(id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return accesosDao.delete(id);
	}

	@Override
	public List<Map<String, Object>> read(int iduser) {
		// TODO Auto-generated method stub
		return accesosDao.read(iduser);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return accesosDao.readAll();
	}

	@Override
	public Map<String, Object> readAll(String username) {
		// TODO Auto-generated method stub
		return accesosDao.readAll(username);
	}
}
