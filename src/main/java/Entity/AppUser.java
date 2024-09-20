package Entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false, unique = true, length = 20)
    private String username;

    @Setter
    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false)
    private LocalDate regDate;

    @Setter
    @OneToOne
    @JoinColumn(name = "details_id", referencedColumnName = "id")
    private Details details;

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.regDate = LocalDate.now();
    }
}
