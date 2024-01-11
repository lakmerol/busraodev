package Locations;

import Creatures.Vampire;
import Character.Player;
import Actions.Battle;

public class Forest extends Battle {
    public Forest(Player player) {
        super(player, "Orman",new Vampire(),"firewood",3);
    }
}
