package Pokemons;

import Moves.Rest;
import Moves.Scald;
import Moves.DoubleTeam;
import Moves.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gorebyss extends Pokemon {
    public Gorebyss(String name, int level){
        super(name,level);
        setType(Type.WATER);
        setStats(55,84,105,114,75,52);
        setMove(new Rest(), new DoubleTeam(), new Scald(), new ShadowBall());

    }

}
