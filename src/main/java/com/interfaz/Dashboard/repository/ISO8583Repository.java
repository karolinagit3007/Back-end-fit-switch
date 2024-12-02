package com.interfaz.Dashboard.repository;

import com.interfaz.Dashboard.model.ISO8583;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ISO8583Repository {

    private final JdbcTemplate jdbcTemplate;

    public ISO8583Repository(JdbcTemplate fitSwitchJdbcTemplate) {
        this.jdbcTemplate = fitSwitchJdbcTemplate;
    }

    public List<ISO8583> findAll() {
        String query = "SELECT WISO_000_MESSAGE_TYPE, WISO_003_PROCESSINGCODE, WISO_018_MERCHANTTYPE, " +
                "WISO_024_NETWORKID, WISO_007_TRANSDATETIME, WISO_002_PAN FROM ISO8583";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(ISO8583.class));
    }

}
