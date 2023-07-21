package arg.pildoras.pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		//Cargamos el XML de configuracion
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Leer el class de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//Pedimos un bean al contenedor
		/*
		Empleados antonio = contexto.getBean("directorFinanciero", Empleados.class);
		
		//Usar los beans
		System.out.println(antonio.getInforme());
		System.out.println(antonio.getTareas());
		*/
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println("Empresa: " + empleado.getNombreEmpresa());
		System.out.println("Email director: " + empleado.getEmail());
		
		
		//Cerramos el contexto
		contexto.close();
		
		
		
		
		
		
	}
	
}
