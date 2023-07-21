package arg.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo tipo CreacionInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	
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
