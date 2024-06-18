package com.example.demo.repository;

import com.example.demo.dao.Address;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressCsvRepository implements AddressRepository {

    @Override
    public List<Address> getAll() {
        try {
            Path path = Paths.get("src/main/resources/utf_ken_all.csv");
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

            List<Address> addresses = new ArrayList<>();
            for (int i = 1; i < lines.size(); i++) {
                String[] data = lines.get(i).split(",");
                if (data.length == 15) {
                    Address address = new Address(
                        data[0],
                        data[1],
                        data[2],
                        data[3],
                        data[4],
                        data[5],
                        data[6],
                        data[7],
                        data[8],
                        data[9],
                        data[10],
                        data[11],
                        data[12],
                        data[13],
                        data[14]
                    );
                    addresses.add(address);
                }
            }
            return addresses;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

}
