package com.example.demo.repository;

import com.example.demo.dao.Address;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AddressCsvRepositoryTest {

    @Autowired
    private AddressCsvRepository addressCsvRepository;

    @Test
    public void findAll() {
        List<Address> addressList = addressCsvRepository.findAll();
        Assertions.assertThat(addressList).isNotEmpty();
        Assertions.assertThat(addressList).hasSize(124379);
    }
}
