package Locations;

import Creatures.Bear;
import Character.Player;
import Actions.Battle;

public class River extends Battle {
    public River(Player player) {
        super(player, "Nehir", new Bear(),"water",2);
    }
}
