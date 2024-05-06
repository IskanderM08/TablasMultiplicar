package uv.mx.TablasMultiplicar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TablasMultiplicarApplication {

	public static void main(String[] args) {
		SpringApplication.run(TablasMultiplicarApplication.class, args);
		MetodoMenu.mostrarMenu();
	}

}
