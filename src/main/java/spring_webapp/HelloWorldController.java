package spring_webapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
/* 
 * Adiciona um nível anterior ao path
 * Todas as rotas do controller terão o /hello/{rota}              //Refactor: Comentarios usando // s� devem ser usados para anota�oes na frente do codigo
 */

@RequestMapping("/hello")
public class HelloWorldController {

/*
 * Rota: /hello/hello 														
 */
	@RequestMapping("/hello")									   
	public String hello() {
		String message = "hello";								   
		return message;											   //Refactor: O return deve sempre retornar uma variavel e nao um texto			
	}

/*
 * Rota: /hello/processForm							           	   //Refactor: Comentarios usando // s� devem ser usados para anota�oes na frente do codigo
 */	
	@RequestMapping("/processForm")
	public String processForm() {
		System.out.println("show form");
		String message = "showForm";
		return message;      								  //Refactor: O return deve sempre retornar uma variavel e nao uma String
	}
	
	@RequestMapping("/processFormV2")
	public String upperCaseStudentName(HttpServletRequest request, Model model) {
		String studentName = request.getParameter("studentName").toUpperCase();
		System.out.println(request.getParameter("studentName"));
		model.addAttribute("message", studentName);
		String message = "showForm"; 
		return message;										 //Refactor: O return deve sempre retornar uma variavel e nao um texto
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(
			@RequestParam("studentName") String studentName, 
			Model model) {
		
		studentName = studentName.toUpperCase();
		System.out.println(studentName);
		model.addAttribute("message", "Hello " + studentName);
		String message = "showForm";
		return message;                                      //Refactor: O return deve sempre retornar uma variavel e nao um texto
	}
}
