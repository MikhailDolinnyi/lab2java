package Moves;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {

    public Blizzard() {
        super(Type.ICE, 110, 70);

    }

    private boolean isFreezed = false;

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            isFreezed = true;
            Effect.freeze(p);

        }

    }

    @Override
    protected String describe() {
        return "Юзает Blizzard";
    }
}




