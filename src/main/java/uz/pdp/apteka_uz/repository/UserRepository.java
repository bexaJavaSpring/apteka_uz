package uz.pdp.apteka_uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apteka_uz.entity.Users;

public interface UserRepository extends JpaRepository<Users,Long> {

}
