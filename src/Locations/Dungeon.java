package Locations;

import Actions.Battle;
import Character.Player;
import Creatures.Spider;
import Creatures.Zombie;

public class Dungeon extends Battle {

    public Dungeon(Player player) {
        super(player, "Zindan", new Spider(), "Key",3);
    }
}
