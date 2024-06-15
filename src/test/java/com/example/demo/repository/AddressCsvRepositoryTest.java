package com.example.demo.repository;

import com.example.demo.dao.Address;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AddressCsvRepositoryTest {

    private AddressCsvRepository addressCsvRepository;

    public AddressCsvRepositoryTest() {
        addressCsvRepository = new AddressCsvRepository();
    }

    @Test
    public void getAll() {
        List<Address> addressList = addressCsvRepository.getAll();
        Assertions.assertThat(addressList).isNotEmpty();
        Assertions.assertThat(addressList).hasSize(124379);
    }
}
