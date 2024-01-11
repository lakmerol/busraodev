package Locations;

import Creatures.Zombie;
import Character.Player;
import Actions.Battle;

public class Cave extends Battle {

    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), "food",3);
    }
}
