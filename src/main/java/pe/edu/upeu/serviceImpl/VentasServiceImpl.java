package pe.edu.upeu.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.VentasDao;
import pe.edu.upeu.service.VentasService;
@Service
public class VentasServiceImpl implements VentasService{
	@Autowired
	private VentasDao ventasDao;
	@Override
	public Map<String, Object> readAll() {
		return ventasDao.readAll();
	}

}
