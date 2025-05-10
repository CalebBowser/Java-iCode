package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Blob;
import java.util.List;

@Repository
public class JdbcPokemonRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Pokemon> getAllPokemon() {
        String sql = "SELECT idpokemon, pokemon_name, pokemon_type_1, pokemon_type_2 FROM pokemon";
        return jdbcTemplate.query(sql, new PokemonRowMapper());

    }

    private static class PokemonRowMapper implements RowMapper<Pokemon> {
        @Override
        public Pokemon mapRow(ResultSet rs, int rowNum) throws SQLException {
            Pokemon pokemon = new Pokemon();
            pokemon.setId(rs.getInt("idpokemon"));
            pokemon.setPokemonName(rs.getString("pokemon_name"));
            pokemon.setPokemonType_1(rs.getString("pokemon_type_1"));
            pokemon.setPokemonType_2(rs.getString("pokemon_type_2"));
            return pokemon;
        }
    }
}
