package utils;

import model.ConstructionCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ConstructionCompanyRepository;
import repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConstructionCompanyService {
    @Autowired
    private ConstructionCompanyRepository constructionCompanyRepository;

    private final List<ConstructionCompany> companies = new ArrayList<>();

    public List<ConstructionCompany> getAllCompanies() {
        return companies;
    }

    public ConstructionCompany getCompanyById(String companyId) {
        return companies.stream()
                .filter(company -> company.getCompanyId().equals(companyId))
                .findFirst()
                .orElse(null);
    }

    public ConstructionCompany createCompany(ConstructionCompany company) {
        companies.add(company);
        return company;
    }

    public ConstructionCompany updateCompany(String companyId, ConstructionCompany updatedCompany) {
        ConstructionCompany existingCompany = getCompanyById(companyId);
        if (existingCompany != null) {
            existingCompany.setName(updatedCompany.getName());
        }
        return existingCompany;
    }

    public void deleteCompany(String companyId) {
        companies.removeIf(company -> company.getCompanyId().equals(companyId));
    }
}
