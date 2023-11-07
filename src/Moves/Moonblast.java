package Moves;

import ru.ifmo.se.pokemon.*;

public class Moonblast extends SpecialMove {
    public Moonblast() {
        super(Type.FAIRY, 95, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon p) { Effect e = new Effect().chance(0.3).turns(1).stat(Stat.ATTACK, -1);}

    @Override
    protected String describe() {
        return "Юзает Moonblast";
    }
}

/*if (Math.random() <= 0.3) {pokemon.setMod(Stat.SPECIAL_ATTACK, -1);*/