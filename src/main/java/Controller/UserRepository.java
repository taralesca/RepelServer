package Controller;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsUserByUsername(String username);
    User findUserByUsername(String username);
}
