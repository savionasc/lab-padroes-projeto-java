package one.digitalinnovation.gof.abstractfactory.pokemon;

import one.digitalinnovation.gof.abstractfactory.AbstractFactory;

public class PokemonFactory implements AbstractFactory<Pokemon> {

    @Override
    public Pokemon create(String pokemonName) {
        
        if ("Pikachu".equalsIgnoreCase(pokemonName)) {
            return new Pikachu();
        } else if ("Bulbasaur".equalsIgnoreCase(pokemonName)) {
            return new Bulbasaur();
        }else if ("Squirtle".equalsIgnoreCase(pokemonName)) {
            return new Squirtle();
        }else if ("Charmander".equalsIgnoreCase(pokemonName)) {
            return new Charmander();
        }

        return null;
    }

}