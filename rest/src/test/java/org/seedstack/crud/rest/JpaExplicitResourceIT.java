package org.seedstack.crud.rest;

import javax.inject.Inject;
import javax.transaction.Transactional;
import org.junit.After;
import org.junit.Before;
import org.seedstack.business.domain.Repository;
import org.seedstack.crud.rest.fixtures.model.customer.Customer;
import org.seedstack.crud.rest.fixtures.model.customer.CustomerId;
import org.seedstack.jpa.JpaUnit;
import org.seedstack.seed.Configuration;
import org.seedstack.seed.testing.ConfigurationProfiles;

@ConfigurationProfiles("jpa")
public class JpaExplicitResourceIT extends AbstractExplicitResourceIT {
    @Inject
    private Repository<Customer, CustomerId> customerRepository;
    @Configuration("runtime.web.baseUrl")
    private String url;

    @Before
    @Transactional
    @JpaUnit("unit1")
    public void setUp() {
        customerRepository.add(new Customer(new CustomerId("Robert", "SMITH")));
        customerRepository.add(new Customer(new CustomerId("Jeanne", "O'GRADY")));
        customerRepository.add(new Customer(new CustomerId("Michael", "JONES")));
    }

    @After
    @Transactional
    @JpaUnit("unit1")
    public void tearDown() {
        customerRepository.clear();
    }

    @Override
    protected String getResourcePath() {
        return url + "/jpa-customers";
    }
}
