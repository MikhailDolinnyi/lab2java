import Pokemons.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Type;

/*
https://pokemondb.net/pokedex/dunsparce
https://pokemondb.net/pokedex/clamperl
https://pokemondb.net/pokedex/gorebyss
https://pokemondb.net/pokedex/cleffa
https://pokemondb.net/pokedex/clefairy
https://pokemondb.net/pokedex/clefable
 */


class Main {
    public static void main(String[]args){
        Battle b = new Battle();
        Dunsparce dunsparce = new Dunsparce("Жидкий",1);
        Clamperl clamperl = new Clamperl("Костыльный самурай", 1);
        Gorebyss gorebyss = new Gorebyss("Лютик",1);
        Cleffa cleffa = new Cleffa("Опер",1);
        Clefairy clefairy= new Clefairy("Оффник",1);
        Clefable clefable= new Clefable("Редан",1);
        b.addAlly(dunsparce);
        b.addAlly(gorebyss);
        b.addAlly(clefairy);
        b.addFoe(clamperl);
        b.addFoe(cleffa);
        b.addFoe(clefable);
        b.go();




    }

}