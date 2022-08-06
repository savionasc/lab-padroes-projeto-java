package one.digitalinnovation.gof.abstractfactory.pokemon;

public class Charmander implements Pokemon {
    @Override
    public String getName() {
        return "Charmander";
    }

    @Override
    public String attack() {
        return "Flamethrower / Lança-Chamas";
    }

    @Override
    public String special() {
        return "Flame Burst / Explosão de Fogo";
    }
}