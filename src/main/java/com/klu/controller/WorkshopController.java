package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.klu.entity.Workshop;
import com.klu.service.WorkshopService;

@RestController
@RequestMapping("/workshops")
@CrossOrigin(origins = "*")
public class WorkshopController {

    @Autowired
    private WorkshopService service;

    @PostMapping
    public Workshop addWorkshop(@RequestBody Workshop workshop) {
        return service.saveWorkshop(workshop);
    }

    @GetMapping
    public List<Workshop> getWorkshops() {
        return service.getAllWorkshops();
    }
}