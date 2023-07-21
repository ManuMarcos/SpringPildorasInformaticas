package arg.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		//Cargo el Xml de configuracion applicationContext2
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		//Peticion de Beans al contenedor de Spring
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		System.out.println(maria);
		System.out.println(pedro);
		
	}
	

	
	
	
}
