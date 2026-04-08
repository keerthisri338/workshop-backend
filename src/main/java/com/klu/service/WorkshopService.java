package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.klu.entity.Workshop;
import com.klu.repository.WorkshopRepository;

@Service
public class WorkshopService {

    @Autowired
    private WorkshopRepository repo;

    public Workshop saveWorkshop(Workshop workshop) {
        return repo.save(workshop);
    }

    public List<Workshop> getAllWorkshops() {
        return repo.findAll();
    }
}