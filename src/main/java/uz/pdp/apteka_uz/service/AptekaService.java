package uz.pdp.apteka_uz.service;

import org.springframework.stereotype.Service;
import uz.pdp.apteka_uz.dto.AptekaDto;
import uz.pdp.apteka_uz.dto.Response;
import uz.pdp.apteka_uz.entity.Address;
import uz.pdp.apteka_uz.entity.Apteka;
import uz.pdp.apteka_uz.repository.AddressRepository;
import uz.pdp.apteka_uz.repository.AptekaRepository;

import java.util.List;
import java.util.Objects;

@Service
public class AptekaService {

    final AptekaRepository aptekaRepository;
    final AddressRepository addressRepository;

    public AptekaService(AptekaRepository aptekaRepository, AddressRepository addressRepository) {
        this.aptekaRepository = aptekaRepository;
        this.addressRepository = addressRepository;
    }

    public List<Apteka> getAll() {
        return aptekaRepository.findAll();
    }

    public Response save(AptekaDto aptekaDTO) {
        Response response = new Response();
        final Apteka allByNameEquals = aptekaRepository.findAllByNameEquals(aptekaDTO.getName());
        if (Objects.isNull(allByNameEquals)) {
            Address address = new Address(aptekaDTO.getCity(), aptekaDTO.getDistrict(), aptekaDTO.getStreet(), aptekaDTO.getHome());
            Address save = addressRepository.save(address);
            Apteka apteka = new Apteka(aptekaDTO.getName(), save);
            aptekaRepository.save(apteka);
            response.setActive(true);
            response.setMessage("Add apteka");
            return response;
        }
        response.setMessage("This name already exist");
        return response;
    }
}
