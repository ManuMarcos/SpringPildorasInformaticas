package arg.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo tipo CreacionInforme (interfaz)
	private CreacionInformes informeNuevo;
	
	//metodo Init. Ejecutar tareas antes de que el bean este disponible
	public void metodoInicial() {
		System.out.println("Dentro del metodo init. Aqui irian las tareas a ejecutar antes"
				+ " de que el bean este listo");	
	}
	//metodo Destroy. Ejecutar tareas despues de que el bean haya sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del metodo Destroy. Aqui irian las tareas a ejecutar despues"
				+ " de utilizar el bean");
	}
	
	
	
	
	
	
	//Inyeccion de dependencia con Constructor
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
