package uz.pdp.apteka_uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apteka_uz.entity.Apteka;

public interface AptekaRepository extends JpaRepository<Apteka, Integer> {
    Apteka findAllByNameEquals(String name);
}
