package com.interfaz.Dashboard.controller;

import com.interfaz.Dashboard.model.ISO8583;
import com.interfaz.Dashboard.repository.ISO8583Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/iso-8583")
public class ISO8583Controller {

    private final ISO8583Repository iso8583Repository;

    public ISO8583Controller(ISO8583Repository iso8583Repository) {
        this.iso8583Repository = iso8583Repository;
    }

    @GetMapping
    public List<ISO8583> listarISO8583() {
        return iso8583Repository.findAll();
    }
}
