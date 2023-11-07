package Moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST,80,100);

    }

    protected void ApplyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.2).turns(1).stat(Stat.SPECIAL_DEFENSE, -1));

    }
    @Override
    protected String describe() {
        return "Юзает Shadow Ball";
    }

}
