package Moves;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald(){
        super(Type.WATER,80,100);
    }

    private boolean isBurned = false;

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            isBurned = true;
            Effect.burn(p);

        }

    }

    @Override
    protected String describe() {
        return "Юзает Scald";
    }

}
