package example.services;

import java.util.List;

import example.models.UserModel;

public interface AppService {
	/**
	 * services user registration
	 * @param user
	 * @return
	 */
	public UserModel serviceRegistration(UserModel user);
	
	public List<UserModel> serviceAll();

}
