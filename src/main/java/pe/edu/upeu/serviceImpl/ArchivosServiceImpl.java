package pe.edu.upeu.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.ArchivosDao;
import pe.edu.upeu.entity.Archivos;
import pe.edu.upeu.service.ArchivosService;
@Service
public class ArchivosServiceImpl implements ArchivosService{
	@Autowired
	private ArchivosDao archivosDao;
		@Override
		public int create(Archivos a) {
			return archivosDao.create(a);
		}

		@Override
		public int update(Archivos a) {
			// TODO Auto-generated method stub
			return archivosDao.create(a);
		}

		@Override
		public int update(int id) {
			// TODO Auto-generated method stub
			return archivosDao.update(id);
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			return archivosDao.delete(id);
		}

		@Override
		public List<Map<String, Object>> read(int id) {
			// TODO Auto-generated method stub
			return archivosDao.read(id);
		}

		@Override
		public List<Map<String, Object>> readAll() {
			// TODO Auto-generated method stub
			return archivosDao.readAll()
					;
		}

}
