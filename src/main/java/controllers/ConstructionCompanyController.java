package controllers;

import model.ConstructionCompany;
import org.springframework.web.bind.annotation.*;
import utils.ConstructionCompanyService;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class ConstructionCompanyController {
    private final ConstructionCompanyService companyService;

    public ConstructionCompanyController(ConstructionCompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<ConstructionCompany> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/{companyId}")
    public ConstructionCompany getCompanyById(@PathVariable String companyId) {
        return companyService.getCompanyById(companyId);
    }

    @PostMapping
    public ConstructionCompany createCompany(@RequestBody ConstructionCompany company) {
        return companyService.createCompany(company);
    }

    @PutMapping("/{companyId}")
    public ConstructionCompany updateCompany(@PathVariable String companyId, @RequestBody ConstructionCompany company) {
        return companyService.updateCompany(companyId, company);
    }

    @DeleteMapping("/{companyId}")
    public void deleteCompany(@PathVariable String companyId) {
        companyService.deleteCompany(companyId);
    }
}
