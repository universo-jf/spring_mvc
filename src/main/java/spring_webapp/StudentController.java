package spring_webapp;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForms")
	public String showForm(Model studentModel) {
		
		
		Student student = new Student();
		studentModel.addAttribute("student", student);
		System.out.println(" Studente " + student);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student studentModel, 
			BindingResult bindingResult) {
		
		System.out.print("Name " + studentModel.getFirstName() + " " +  bindingResult.hasErrors());

		if(bindingResult.hasErrors())
			return "student-form";
		
		return "student-confirmation";
	}
}
