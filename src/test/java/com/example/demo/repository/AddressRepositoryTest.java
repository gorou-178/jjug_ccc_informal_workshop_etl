package com.example.demo.repository;

import com.example.demo.configuration.DataInitializerTest;
import com.example.demo.dao.Address;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@DataJpaTest
@Import(DataInitializerTest.class)
@Transactional
public class AddressRepositoryTest {

    @Autowired
    private AddressRepository repository;

    @Test
    public void findAll() {
        List<Address> addressList = repository.findAll();
        Assertions.assertThat(addressList).isNotEmpty();
        Assertions.assertThat(addressList).hasSize(2);
    }

    @Test
    public void findByPostalCode() {
        List<Address> addressList = repository.findByPostalCode("2345678");
        Assertions.assertThat(addressList).hasSize(1);
        Assertions.assertThat(addressList).extracting("postalCode").contains("2345678");
    }

}
