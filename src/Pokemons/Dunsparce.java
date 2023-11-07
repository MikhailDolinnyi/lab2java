package Pokemons;

import Moves.Blizzard;
import Moves.Bulldoze;
import Moves.DoubleTeam;
import Moves.Screech;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dunsparce extends Pokemon {
    public Dunsparce(String name, int level){
        super (name,level);
        setType(Type.NORMAL);
        setStats(100,70,70,65,65,45);
        setMove(new Screech(),new DoubleTeam(),new Blizzard(), new Bulldoze());


        }

    }


