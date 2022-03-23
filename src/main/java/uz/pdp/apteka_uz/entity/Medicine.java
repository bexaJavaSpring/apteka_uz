package uz.pdp.apteka_uz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private  String name;

    private UUID code = UUID.randomUUID();

    private Double price;

    @ManyToOne
    private Category category;
}
