package pe.edu.upeu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import pe.edu.upeu.dao.RolDao;

@SpringBootTest
class Exa3BackendNemiAlejandroApplicationTests {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	RolDao rolDao;
	@Test
	void contextLoads() {
		System.out.println(rolDao.buscarRolUser(1));
		System.out.println(passwordEncoder.encode("123"));
	}

}
