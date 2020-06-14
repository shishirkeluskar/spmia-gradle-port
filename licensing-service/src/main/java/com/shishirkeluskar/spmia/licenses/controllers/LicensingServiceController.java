package com.shishirkeluskar.spmia.licenses.controllers;

import com.shishirkeluskar.spmia.licenses.model.License;
import com.shishirkeluskar.spmia.licenses.services.LicensingService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/organizations/{organization-id}/licenses")
public class LicensingServiceController {

  private LicensingService licensingService;

  public LicensingServiceController(LicensingService licensingService) {
    this.licensingService = licensingService;
  }

  @GetMapping(value = "{license-id}")
  public License getLicenses(
      @PathVariable("organization-id") String organizationId,
      @PathVariable("license-id") String licenseId) {
    return new License()
        .withId(licenseId)
        .withOrganizationId(organizationId)
        .withProductName("Telco")
        .withLicenseType("Seat");
  }

  @PutMapping(value = "{license-id}")
  public String updateLicenses(@PathVariable("license-id") String licenseId) {
    return String.format("This is the put");
  }

  @PostMapping(value = "{license-id}")
  public String saveLicenses(@PathVariable("license-id") String licenseId) {
    return String.format("This is the post");
  }

  @DeleteMapping(value = "{license-id}")
  public String deleteLicenses(@PathVariable("license-id") String licenseId) {
    return String.format("This is the delete");
  }
}
