package one.digitalinnovation.gof.abstractfactory.pokemon;

public class Pikachu implements Pokemon {
    @Override
    public String getName() {
        return "Pikachu";
    }

    @Override
    public String attack() {
        return "Thundershock / Raio de Trovão";
    }

    @Override
    public String special() {
        return "Volt Tackle / Investida Trovão";
    }
}