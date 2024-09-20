package Repository;

import Entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    // Find user by username
    AppUser findByUsername(String username);

    // Find users registered between two dates
    List<AppUser> findByRegistrationDateBetween(LocalDate startDate, LocalDate endDate);

    // Find user by Details ID
    AppUser findByDetails_Id(Long detailsId);

    // Find user by email, case-insensitive
    AppUser findByDetails_EmailIgnoreCase(String email);
}
