package Repository;

import Entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DetailsRepository extends JpaRepository<Details, Long> {

    // Find details by email
    Details findByEmail(String email);

    // Find details by first name containing a substring
    List<Details> findByFirstNameContains(String name);

    // Find details by last name, case-insensitive
    List<Details> findByLastNameIgnoreCase(String lastName);
}
