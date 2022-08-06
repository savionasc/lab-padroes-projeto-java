package one.digitalinnovation.gof.abstractfactory.pokemon;

public class Squirtle implements Pokemon {
    @Override
    public String getName() {
        return "Squirtle";
    }

    @Override
    public String attack() {
        return "Water Gun / Jato D'Água";
    }

    @Override
    public String special() {
        return "Hydro Pump / Hidro Bomba";
    }
}