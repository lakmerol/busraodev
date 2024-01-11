package Character;

import Equiments.*;

import javax.xml.namespace.QName;

public class Inventory {
   private Weapon weapon;
   private Armor armor;
   private Loot loot;

    public Inventory() {
        this.weapon = new Weapon("Yumruk " ,-1,0 ,0);
        this.armor = new Armor(-1,"Paçavra",0,0);
        this.loot = new Loot("ajhdjhasd", 5, 3);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void addItem(Loot loot) {
        this.loot = loot;
    }
}
