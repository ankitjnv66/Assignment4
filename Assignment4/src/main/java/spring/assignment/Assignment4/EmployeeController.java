package spring.assignment.Assignment4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/index")
	public String showIndexPAge(Model model) {
		model.addAttribute("employee",new Employee());
		return "index";
	}
	
	@PostMapping("/saveEmp")
	public String saveEmployee(@ModelAttribute Employee employee) {
		return "saved";
	}

}
