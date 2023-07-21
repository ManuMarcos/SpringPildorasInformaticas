package arg.pildoras.pruebaAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
public class ComercialExperimentado implements Empleados {
	
	
	//Inyeccion con Annotation autowired en Atributo
	@Autowired
	@Qualifier("informeFinancieroTrim3") //bean id que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;
	
	//Ejecucion de codigo despues de la creacion del bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creacion de bean");
	}
	@PreDestroy
	//Ejecucion de codigo despues de apagado el contenedor Spring
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destruccion");
	}
	
	
	
	/*
	//Inyeccion con Annotation autowired en Constructor
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	*/
		
	/*
	//Inyeccion con Annotation autowired en Setter
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	*/
	
	
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender mas!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}

}
