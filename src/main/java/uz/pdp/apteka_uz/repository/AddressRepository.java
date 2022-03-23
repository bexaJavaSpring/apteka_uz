package uz.pdp.apteka_uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apteka_uz.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
