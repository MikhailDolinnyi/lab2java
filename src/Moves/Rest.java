package Moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,0);

    }
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        p.restore();
    }

    @Override
    protected String describe(){
        return "Юзает Rest";
    }

}
