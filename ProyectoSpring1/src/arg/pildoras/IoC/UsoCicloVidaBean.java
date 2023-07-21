package arg.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cargo el XML de configuracion applicationContext3
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//Le pido el bean al contendor de Spring
		Empleados director = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(director.getInforme());
		
		contexto.close();
	}

}
