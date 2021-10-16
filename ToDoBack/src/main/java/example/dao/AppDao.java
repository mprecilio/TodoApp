package example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.models.UserModel;

@Repository
public interface AppDao extends JpaRepository<UserModel, Integer> {

	

}
