package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.klu.entity.Registration;
import com.klu.repository.RegistrationRepository;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository repo;

    public Registration saveRegistration(Registration reg) {
        return repo.save(reg);
    }

    public List<Registration> getAllRegistrations() {
        return repo.findAll();
    }
}