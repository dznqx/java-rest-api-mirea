package repository;

import model.ConstructionCompany;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionCompanyRepository extends CrudRepository<ConstructionCompany, Long> {
}