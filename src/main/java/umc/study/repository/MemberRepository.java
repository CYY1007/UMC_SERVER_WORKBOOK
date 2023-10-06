package umc.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
