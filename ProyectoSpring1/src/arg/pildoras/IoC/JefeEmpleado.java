package arg.pildoras.IoC;

public class JefeEmpleado implements Empleados {

	private CreacionInformes informeNuevo;
	
	
	//Inyeccion de dependencia con Constructor
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}

}
