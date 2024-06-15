package com.example.demo.repository;

import com.example.demo.dao.Address;

import java.util.List;

public interface AddressRepository {
    List<Address> getAll();
}
