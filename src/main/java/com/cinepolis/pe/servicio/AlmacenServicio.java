package com.cinepolis.pe.servicio;

import java.nio.file.Path;

import org.springframework.web.multipart.MultipartFile;

public interface AlmacenServicio {
	public void iniciarAlmacenDeArchivos();
	
	public String almacenarArchivo(MultipartFile archivo);
	
	public Path cargarArchivo(String nombreArchivo);
	
	public org.springframework.core.io.Resource cargarComoRecurso(String nombreArchivo);
	
	public void eliminarArchivo(String nombreArchivo);
}
