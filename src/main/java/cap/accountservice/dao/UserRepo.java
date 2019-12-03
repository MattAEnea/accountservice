package cap.accountservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cap.accountservice.beans.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>
{
	User findByUsername(String username);
}
