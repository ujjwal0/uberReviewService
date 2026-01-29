package uber.uberReviewService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uber.uberReviewService.models.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {

    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);

    List<Driver> findAllByIdIn(List<Long> driverIds);

}
