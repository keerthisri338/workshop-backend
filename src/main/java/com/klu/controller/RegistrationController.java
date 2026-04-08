package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.klu.entity.Registration;
import com.klu.service.RegistrationService;

@RestController
@RequestMapping("/registrations")
@CrossOrigin(origins = "*")
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @PostMapping
    public Registration register(@RequestBody Registration reg) {
        return service.saveRegistration(reg);
    }

    @GetMapping
    public List<Registration> getRegistrations() {
        return service.getAllRegistrations();
    }
}