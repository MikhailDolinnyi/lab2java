package Moves;

import ru.ifmo.se.pokemon.*;

public class Screech extends StatusMove {

    public Screech(){
        super(Type.NORMAL,0,85);

    }

    @Override
    protected void applyOppEffects(Pokemon p){p.setMod(Stat.DEFENSE, -2);}

    @Override
    protected String describe(){
        return "Юзает Screech";
    }

}
