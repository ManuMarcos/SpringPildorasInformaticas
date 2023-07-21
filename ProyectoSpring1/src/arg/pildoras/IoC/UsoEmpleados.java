package arg.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*
		//Creacion de objetos de tipo empleado
		
			Empleados empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos creados
			
			System.out.println(empleado1.getTareas());
		*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Empleados juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		*/
		
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
	
		System.out.println(maria.getTareas());
		System.out.println(maria.getInforme());
		System.out.println("Email: " + maria.getEmail());
		System.out.println("Nombre empresa: " + maria.getNombreEmpresa());
		
		if (pablo.equals(maria)){
			System.out.println("Son el mismo objeto");
		}
		else {
			System.out.println("Son objetos diferentes");
		}
		
		
		contexto.close();
		
	}
	
}
