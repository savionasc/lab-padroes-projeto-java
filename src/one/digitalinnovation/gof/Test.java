package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

import one.digitalinnovation.gof.abstractfactory.AbstractFactory;
import one.digitalinnovation.gof.abstractfactory.FactoryProvider;
import one.digitalinnovation.gof.abstractfactory.pokemon.Charmander;
import one.digitalinnovation.gof.abstractfactory.pokemon.Bulbasaur;
import one.digitalinnovation.gof.abstractfactory.pokemon.Pikachu;
import one.digitalinnovation.gof.abstractfactory.pokemon.Squirtle;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");

		// Abstract Factory
		AbstractFactory abstractFactory;

		abstractFactory = FactoryProvider.getFactory("Pokemon");
		Pikachu pikachu = (Pikachu) abstractFactory.create("Pikachu");
		Charmander charmander = (Charmander) abstractFactory.create("Charmander");
		Squirtle squirtle = (Squirtle) abstractFactory.create("Squirtle");
		Bulbasaur bulbasaur = (Bulbasaur) abstractFactory.create("Bulbasaur");

		System.out.println("%s : Ataque: %s e Especial: %s", pikachu.getName(), pikachu.attack(), pikachu.special());
		System.out.println("%s : Ataque: %s e Especial: %s", charmander.getName(), charmander.attack(), charmander.special());
		System.out.println("%s : Ataque: %s e Especial: %s", squirtle.getName(), squirtle.attack(), squirtle.special());
		System.out.println("%s : Ataque: %s e Especial: %s", bulbasaur.getName(), bulbasaur.attack(), bulbasaur.special());
	}

}
