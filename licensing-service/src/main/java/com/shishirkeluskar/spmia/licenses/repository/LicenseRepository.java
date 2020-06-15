package com.shishirkeluskar.spmia.licenses.repository;

import com.shishirkeluskar.spmia.licenses.model.License;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {
  public List<License> findByOrganizationId(String organizationId);

  public License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}
