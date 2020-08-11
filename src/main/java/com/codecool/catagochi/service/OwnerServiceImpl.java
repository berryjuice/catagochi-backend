package com.codecool.catagochi.service;

import com.codecool.catagochi.entity.Owner;
import com.codecool.catagochi.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "ownerImpl")
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public List<Owner> listAllOwner() {
        return ownerRepository.listAllOwner();
    }
}
