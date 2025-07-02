package RestApi_Project2.com.mit.project.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestApi_Project2.com.mit.project.Entity.User;
import RestApi_Project2.com.mit.project.Service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> getUser() {
		return this.userService.getUsers();
	}
	
	@GetMapping("/user/me")
	public String getCurrentUser(Principal principal) {
		return principal.getName();
	}
}
