package com.shishirkeluskar.spmia.licenses.controllers;

import com.shishirkeluskar.spmia.licenses.model.License;
import com.shishirkeluskar.spmia.licenses.services.LicenseService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {
  private final LicenseService licenseService;

  public LicenseServiceController(LicenseService licenseService) {
    this.licenseService = licenseService;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<License> getLicenses(@PathVariable("organizationId") String organizationId) {
    return licenseService.getLicensesByOrg(organizationId);
  }

  @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
  public License getLicenses(
      @PathVariable("organizationId") String organizationId,
      @PathVariable("licenseId") String licenseId) {
    return licenseService.getLicense(organizationId, licenseId);
  }

  @RequestMapping(value = "{licenseId}", method = RequestMethod.PUT)
  public String updateLicenses(@PathVariable("licenseId") String licenseId) {
    return String.format("This is the put");
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public void saveLicenses(@RequestBody License license) {
    licenseService.saveLicense(license);
  }

  @RequestMapping(value = "{licenseId}", method = RequestMethod.DELETE)
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public String deleteLicenses(@PathVariable("licenseId") String licenseId) {
    return String.format("This is the Delete");
  }
}
