package utils;

import model.ConstructionCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import repository.ConstructionCompanyRepository;

import java.util.List;

@Service
public class ConstructionCompanyService {


    private ConstructionCompanyRepository constructionCompanyRepository;

    // Получить все компании
    public List<ConstructionCompany> getAllCompanies() {
        return constructionCompanyRepository.findAll();
    }

    // Получить компанию по ID
    public ConstructionCompany getCompanyById(Long companyId) {
        return constructionCompanyRepository.findById(companyId)
                .orElseThrow(() -> new ResourceNotFoundException("Компания не найдена с id " + companyId));
    }

    // Создать новую компанию
    public ConstructionCompany createCompany(ConstructionCompany company) {
        return constructionCompanyRepository.save(company);
    }

    // Обновить существующую компанию
    public ConstructionCompany updateCompany(Long companyId, ConstructionCompany updatedCompany) {
        ConstructionCompany existingCompany = constructionCompanyRepository.findById(companyId)
                .orElseThrow(() -> new ResourceNotFoundException("Компания не найдена с id " + companyId));
        existingCompany.setName(updatedCompany.getName());
        return constructionCompanyRepository.save(existingCompany);
    }

    // Удалить компанию по ID
    public void deleteCompany(Long companyId) {
        ConstructionCompany existingCompany = constructionCompanyRepository.findById(companyId)
                .orElseThrow(() -> new ResourceNotFoundException("Компания не найдена с id " + companyId));
        constructionCompanyRepository.delete(existingCompany);
    }
}