package Moves;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave(){
        super(Type.ELECTRIC,0,90);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().condition(Status.PARALYZE).turns(1).stat(Stat.SPEED, -3).attack(0.75));

    }

    @Override
    protected String describe() {
        return "Юзает ThunderWave";
    }

}
/*Effect eff = new Effect();
        eff = eff.condition(Status.PARALYZE);
        eff= eff.stat(Stat.SPEED, -3);
        eff = eff.attack(0.75);*/
