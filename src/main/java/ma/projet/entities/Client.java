package ma.projet.entities;

import lombok.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;

    @OneToMany(mappedBy = "client")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Compte>comptes;
}
