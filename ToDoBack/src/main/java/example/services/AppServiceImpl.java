package example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.dao.AppDao;
import example.models.UserModel;

@Service
public class AppServiceImpl implements AppService {
	
	@Autowired
	private AppDao dao;

	@Override
	public UserModel serviceRegistration(UserModel user) {
		return dao.save(user);
	}

	@Override
	public List<UserModel> serviceAll() {
		return dao.findAll();
	}

}
