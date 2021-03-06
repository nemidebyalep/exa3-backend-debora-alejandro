package pe.edu.upeu.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.entity.Producto;
import pe.edu.upeu.service.ProductoService;
@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoDao productoDao;
	@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		return productoDao.create(p);
	}

	@Override
	public int update(Producto p) {
		// TODO Auto-generated method stub
		return productoDao.update(p);
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return productoDao.update(id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return productoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return productoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return productoDao.readAll();
	}
}
