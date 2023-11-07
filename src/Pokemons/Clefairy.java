package Pokemons;

import Moves.Moonblast;
import Moves.Confide;
import Moves.ThunderWave;

public class Clefairy extends Cleffa {
    public Clefairy(String name, int level){
        super(name,level);
        setStats(70,45,48,60,65,35);
        setMove(new ThunderWave(),new Confide(), new Moonblast());


    }
}
