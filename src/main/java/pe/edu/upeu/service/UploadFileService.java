package pe.edu.upeu.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;

public interface UploadFileService {
	public String copiar(MultipartFile archivo) throws IOException;
	public Resource cargar(String nombreFoto) throws MalformedURLException;	
	public boolean eliminar(String nombreFoto);
	public Path getPath(String nombreFoto);
}
