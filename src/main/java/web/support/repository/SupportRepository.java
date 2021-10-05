package web.support.repository;

import web.support.models.SupportInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupportRepository extends JpaRepository<SupportInfo, Integer> {
}
