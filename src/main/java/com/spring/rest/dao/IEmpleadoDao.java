package com.spring.rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.dto.Empleado;

public interface IEmpleadoDao extends JpaRepository<Empleado, Long>  {

	// Lista los empleados buscando por nombre
	public List<Empleado> findByNombre(String nombre);
	
}
