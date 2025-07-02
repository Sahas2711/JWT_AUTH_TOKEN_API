package RestApi_Project2.com.mit.project.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import RestApi_Project2.com.mit.project.Entity.User;

@Service
public class UserService {
	private List<User> users = new ArrayList<>();
	
	public UserService() {
		users.add(new User(UUID.randomUUID().toString(),"abc@gmail.com","Pass"));
		users.add(new User(UUID.randomUUID().toString(),"def@gmail.com","Pass"));
		users.add(new User(UUID.randomUUID().toString(),"ghi@gmail.com","Pass"));
		users.add(new User(UUID.randomUUID().toString(),"klm@gmail.com","Pass"));
		
	}
	
	public List<User> getUsers(){
		return users;
	}
}
