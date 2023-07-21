package arg.pildoras.pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cargar el XML de configuracion applicationContext.xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Pedir un bean al contenedor
		Empleados comercial = contexto.getBean("comercialExperimentado", Empleados.class);

		//Usar el bean
		System.out.println(comercial.getInforme());
		System.out.println(comercial.getTareas());
		
		//Cerrar el contexto
		contexto.close();
		
		
		
	}

}
