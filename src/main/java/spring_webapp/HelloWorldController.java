package spring_webapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {


//	
//	@RequestMapping("/processFormV2")
//	public String upperCaseStudentName(HttpServletRequest request, Model model) {
//		String studentName = request.getParameter("studentName").toUpperCase();
//		System.out.println(request.getParameter("studentName"));
//		model.addAttribute("message", studentName);
//		return "showForm";
//	}
//	
//	@RequestMapping("/processFormV3")
//	public String processFormV3(
//			@RequestParam("studentName") String studentName, 
//			Model model) {
//		
//		studentName = studentName.toUpperCase();
//		
//		model.addAttribute("message", "Hello " + studentName);
//		return "showForm";
//	}
}
