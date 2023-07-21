package arg.pildoras.pruebaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("arg.pildoras.pruebaAnnotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	//Definir el bean para informe InformeFinancieroDtoCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { //Sera el id del bean inyectado
		return new InformeFinancieroDtoCompras();
	}
	
	//Definir el bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
	
	
}
