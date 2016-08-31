package myapp.user.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository.
 */
public interface UserRepository extends JpaRepository<User, Integer>{
}
