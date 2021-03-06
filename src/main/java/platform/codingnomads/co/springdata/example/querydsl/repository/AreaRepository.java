package platform.codingnomads.co.springdata.example.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import platform.codingnomads.co.springdata.example.querydsl.domain.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
    Area findByCode(String code);
}
