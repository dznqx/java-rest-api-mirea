package com.aori.main.util;

import com.aori.main.model.ConstructionCompany;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import com.aori.main.repository.ConstructionCompanyRepository;

@Service
public class ConstructionCompanyService {

    private final ConstructionCompanyRepository constructionCompanyRepository;

    public ConstructionCompanyService(ConstructionCompanyRepository constructionCompanyRepository) {
        this.constructionCompanyRepository = constructionCompanyRepository;
    }


    // Получить все компании
    public Iterable<ConstructionCompany> getAllCompanies() {
        assert constructionCompanyRepository != null;
        return constructionCompanyRepository.findAll();
    }

    // Получить компанию по ID
    public ConstructionCompany getCompanyById(Long companyId) {
        assert constructionCompanyRepository != null;
        return constructionCompanyRepository.findById(companyId)
                .orElseThrow(() -> new ResourceNotFoundException("Компания не найдена с id " + companyId));
    }

    // Создать новую компанию
    public ConstructionCompany createCompany(ConstructionCompany company) {
        assert constructionCompanyRepository != null;
        return constructionCompanyRepository.save(company);
    }

    // Обновить существующую компанию
    public ConstructionCompany updateCompany(Long companyId, ConstructionCompany updatedCompany) {
        assert constructionCompanyRepository != null;
        ConstructionCompany existingCompany = constructionCompanyRepository.findById(companyId)
                .orElseThrow(() -> new ResourceNotFoundException("Компания не найдена с id " + companyId));
        existingCompany.setName(updatedCompany.getName());
        return constructionCompanyRepository.save(existingCompany);
    }

    // Удалить компанию по ID
    public void deleteCompany(Long companyId) {
        assert constructionCompanyRepository != null;
        ConstructionCompany existingCompany = constructionCompanyRepository.findById(companyId)
                .orElseThrow(() -> new ResourceNotFoundException("Компания не найдена с id " + companyId));
        constructionCompanyRepository.delete(existingCompany);
    }
}