package uz.pdp.apteka_uz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AptekaDto {
    private String name;
    private  String city;
    private  String district;
    private  String street;
    private  String home;
}
