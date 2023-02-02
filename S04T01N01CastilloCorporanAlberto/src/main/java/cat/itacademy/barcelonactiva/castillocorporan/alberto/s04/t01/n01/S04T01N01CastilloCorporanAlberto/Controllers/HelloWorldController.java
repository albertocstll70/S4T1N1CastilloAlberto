package cat.itacademy.barcelonactiva.castillocorporan.alberto.s04.t01.n01.S04T01N01CastilloCorporanAlberto.Controllers;

import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ch.qos.logback.core.joran.action.AppenderAction;

@RestController
@RequestMapping("/")

public class HelloWorldController extends AppenderAction {
	

	@GetMapping("/HelloWorld")
	@ResponseBody
	public String saluda(@RequestParam(value="nombre",required=false, defaultValue="UNKNOWN") String nombre) {
		return "Hola," + nombre + " Estás ejecutando un proyecto Maven";
	}

	@GetMapping(value ={"/HelloWorld2","/HelloWorld2/{nombre}"})
	@ResponseBody
	public String saluda2(@PathVariable(required=false) Optional<String> nombre) {
		
		return "Hola," + nombre.orElse("UNKNOWN") + " Estás ejecutando un proyecto Maven";
		
	}
}
