package com.emsi.customerservice.repositories;

import com.emsi.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
