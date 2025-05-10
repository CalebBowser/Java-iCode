package com.example.demo;

public class Pokemon {

    private int idpokemon;
    private String pokemon_name;
    private String pokemon_type_1;
    private String pokemon_type_2;
    private boolean evolve;
    //private serialblob picture;

    public int getId(){
        return idpokemon;
    }

    public void setId(int id){
        idpokemon = id;
    }

    public String getPokemonName(){
        return pokemon_name;
    }

    public void setPokemonName(String name){
        pokemon_name = name;
    }

    public String getPokemonType_1(){
        return pokemon_type_1;
    }

    public void setPokemonType_1(String type){
        pokemon_type_1 = type;
    }

    public String getPokemonType_2(){
        return pokemon_type_2;
    }

    public void setPokemonType_2(String type){
        pokemon_type_2 = type;
    }

    public boolean doesEvolve(){
        return evolve;
    }

    
}
