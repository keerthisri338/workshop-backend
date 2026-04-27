package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klu.entity.Workshop;
import com.klu.service.WorkshopService;

@CrossOrigin(origins = "https://workshop-frontend-dr0a.onrender.com")
@RestController
public class WorkshopController {

    @Autowired
    private WorkshopService service;

    @PostMapping("/workshops")
    public Workshop createWorkshop(@RequestBody Workshop workshop) {
        return service.saveWorkshop(workshop);
    }

    @GetMapping("/workshops")
    public List<Workshop> getAllWorkshops() {
        return service.getAllWorkshops();
    }
}
