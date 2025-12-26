package uber.uberReviewService.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uber.uberReviewService.models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}