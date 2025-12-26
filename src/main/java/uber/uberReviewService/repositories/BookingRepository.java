package uber.uberReviewService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uber.uberReviewService.models.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}