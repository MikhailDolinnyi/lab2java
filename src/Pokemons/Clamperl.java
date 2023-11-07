package Pokemons;

import Moves.Rest;
import Moves.Scald;
import Moves.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Clamperl extends Pokemon {

    public Clamperl(String name, int level){
        super (name,level);
        setType(Type.WATER);
        setStats(35,64,85,74,55,32);
        setMove(new Rest(), new DoubleTeam(), new Scald());


    }

}
