package Pokemons;

import Moves.Rest;
import Moves.Moonblast;
import Moves.Confide;
import Moves.ThunderWave;

public class Clefable extends Clefairy {
    public Clefable(String name, int level){
        super(name,level);
        setStats(95,70,73,95,90,60);
        setMove(new ThunderWave(),new Confide(),new Moonblast(),new Rest());


    }
}
