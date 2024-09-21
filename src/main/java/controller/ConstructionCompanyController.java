package controller;

import model.ConstructionCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;
import utils.ConstructionCompanyService;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class ConstructionCompanyController {
    private final ConstructionCompanyService companyService;

    @Autowired
    public ConstructionCompanyController(ConstructionCompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public Iterable<ConstructionCompany> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/{companyId}")
    public ConstructionCompany getCompanyById(@PathVariable Long companyId) {
        return companyService.getCompanyById(companyId);
    }

    @GetMapping("/{companyId}/houses")
    public ConstructionCompany getCompanyByHouses(@PathVariable Long companyId) {
        return companyService.getCompanyById(companyId);
    }

    @PostMapping
    public ConstructionCompany createCompany(@RequestBody ConstructionCompany company) {
        return companyService.createCompany(company);
    }

    @PutMapping("/{companyId}")
    public ConstructionCompany updateCompany(@PathVariable Long companyId, @RequestBody ConstructionCompany company) {
        return companyService.updateCompany(companyId, company);
    }

    @DeleteMapping("/{companyId}")
    public void deleteCompany(@PathVariable Long companyId) {
        companyService.deleteCompany(companyId);
    }
}
