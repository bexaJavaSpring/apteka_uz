package uz.pdp.apteka_uz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {
    private boolean active;
    private String message;
}
