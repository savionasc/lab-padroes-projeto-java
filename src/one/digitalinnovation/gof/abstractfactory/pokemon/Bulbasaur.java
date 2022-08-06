package one.digitalinnovation.gof.abstractfactory.pokemon;

public class Bulbasaur implements Pokemon {
    @Override
    public String getName() {
        return "Bulbasaur";
    }

    @Override
    public String attack() {
        return "Razor leaf / Folha navalha";
    }

    @Override
    public String special() {
        return "Solar Beam / Raio solar";
    }
}