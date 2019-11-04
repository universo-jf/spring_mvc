package spring_webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")                             //Refactor: Dentro do @RequestMapping("form") deve ter uma / antes da rota especificada
public class FormController {

	@RequestMapping("/hello")
	public String hello() {
		String message = "hello"; 
		return message;								//Refactor: O return deve sempre retornar uma variavel e nao um texto
	}
}
