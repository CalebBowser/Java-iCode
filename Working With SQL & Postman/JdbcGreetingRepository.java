package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JdbcGreetingRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Greeting> getAllGreetings() {
        String sql = "SELECT id, message FROM greetings";
        return jdbcTemplate.query(sql, new GreetingRowMapper());

    }

    private static class GreetingRowMapper implements RowMapper<Greeting> {
        @Override
        public Greeting mapRow(ResultSet rs, int rowNum) throws SQLException {
            Greeting greeting = new Greeting();
            greeting.setId(rs.getLong("id"));
            greeting.setMessage(rs.getString("message"));
            return greeting;
        }
    }
}