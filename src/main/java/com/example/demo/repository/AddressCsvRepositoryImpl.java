package com.example.demo.repository;

import com.example.demo.dao.Address;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class AddressCsvRepositoryImpl implements AddressCsvRepository {

    private final static String separator = ",";

    private final static String filePath = "src/main/resources/utf_ken_all.csv";

    private final static int columnSize = 15;

    private final List<String> addressLines;

    public AddressCsvRepositoryImpl() {
        this.addressLines = loadAddressFile();
    }

    @Override
    public List<Address> findAll() {
        List<Address> addresses = new ArrayList<>();
        for (int i = 1; i < addressLines.size(); i++) {
            String[] data = addressLines.get(i).split(separator);
            if (data.length == columnSize) {
                Address address = getAddress(i, data);
                addresses.add(address);
            }
        }
        return addresses;
    }

    private List<String> loadAddressFile() {
        try {
            Path path = Paths.get(filePath);
            return Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

    private Address getAddress(int i, String[] data) {
        Address address = new Address();
        address.setId(Integer.toUnsignedLong(i));
        address.setJlgCode(data[0]);
        address.setOldPostalCode(data[1]);
        address.setPostalCode(data[2]);
        address.setPrefectureKana(data[3]);
        address.setCityKana(data[4]);
        address.setTownKana(data[5]);
        address.setPrefecture(data[6]);
        address.setCity(data[7]);
        address.setTown(data[8]);
        address.setMultiplePostalCodes(data[9].charAt(0));
        address.setSpecialTownName(data[10].charAt(0));
        address.setHasChome(data[11].charAt(0));
        address.setMultipleTowns(data[12].charAt(0));
        address.setUpdateStatus(data[13].charAt(0));
        address.setUpdateReason(data[14].charAt(0));
        return address;
    }

}
