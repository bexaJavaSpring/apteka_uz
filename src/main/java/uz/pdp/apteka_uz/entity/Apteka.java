package uz.pdp.apteka_uz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Apteka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private  String name;

    @OneToOne
    private Address address;

    @ManyToMany
    private List<Category> categories;

    public Apteka(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
