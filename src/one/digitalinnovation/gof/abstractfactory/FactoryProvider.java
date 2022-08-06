package one.digitalinnovation.gof.abstractfactory;

import one.digitalinnovation.gof.abstractfactory.pokemon.PokemonFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Pokemon".equalsIgnoreCase(choice)){
            return new PokemonFactory();
        }
+//        else if("Outro".equalsIgnoreCase(choice)){

        return null;
    }
}