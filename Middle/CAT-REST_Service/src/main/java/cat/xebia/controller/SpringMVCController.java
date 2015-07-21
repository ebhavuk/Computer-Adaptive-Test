package cat.xebia.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cat.xebia.services.CATService;

@Controller
public class SpringMVCController {

	@Autowired
	CATService restService;

	// private static final Logger logger =
	// Logger.getLogger(SpringMVCController.class);

	@RequestMapping(value = "/firstPage")
	public String firstPage(ModelMap model) {
		model.addAttribute("message", "Xebia CAT project");

		return "index";
	}



	@RequestMapping(value = "/getpassword/{username}")
	public @ResponseBody List<Map<String, Object>> Login(@PathVariable String username) {
		return restService.getPassword(username);

	}

	@RequestMapping(value = "/signup/{name}/{username}/{email}/{organisation}/{password}")
	public @ResponseBody String signUp(@PathVariable String name, @PathVariable String username,
			@PathVariable String email, @PathVariable String password, @PathVariable String organisation) {
		return restService.signUp(name, username, email, password, organisation);

	}

	@RequestMapping(value = "/insertques/{question}/{questionlevel}/{option1}/{option2}/{option3}/{option4}/{answer}/{category}")
	public @ResponseBody String enterques(@PathVariable String question, @PathVariable String questionlevel,
			@PathVariable String option1, @PathVariable String option2, @PathVariable String option3, @PathVariable String option4, @PathVariable String answer ,@PathVariable String category) {
		return restService.insertques(question, questionlevel, option1, option2, option3,option4,answer,category);

	}

}
