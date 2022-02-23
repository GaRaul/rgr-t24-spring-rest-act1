package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listarEmpleados(); // Lista todos los empleados
	
	public Empleado guardarEmpleado(Empleado empleado); // Guarda un empleado
	
	public Empleado empleadoXID(Long id); // Lee los datos de un empleado
	
	public List<Empleado> listarEmpleadoNombre(String nombre); // Lista empleados buscando por nombre
	
	public Empleado actualizarEmpleado(Empleado empleado); // Actualiza los datos de un empleado
	
	public void eliminarEmpleado(Long id); // Elimina empleado
	
}
