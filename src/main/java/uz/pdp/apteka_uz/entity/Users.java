package uz.pdp.apteka_uz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String email;

}
