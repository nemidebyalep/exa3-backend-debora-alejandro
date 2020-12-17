package pe.edu.upeu.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.PersonaDao;
import pe.edu.upeu.entity.Persona;
import pe.edu.upeu.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	@Autowired
	private PersonaDao personaDao;
		@Override
		public int create(Persona r) {
			// TODO Auto-generated method stub
			return personaDao.create(r);
		}

		@Override
		public int update(Persona r) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int update(int id) {
			// TODO Auto-generated method stub
			return personaDao.update(id);
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			return personaDao.delete(id);
		}

		@Override
		public Persona read(int id) {
			// TODO Auto-generated method stub
			return personaDao.read(id);
		}

		@Override
		public Map<String, Object> readAll() {
			// TODO Auto-generated method stub
			return personaDao.readAll();
		}
}
