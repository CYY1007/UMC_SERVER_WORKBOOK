package umc.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.Review;
import umc.study.domain.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
