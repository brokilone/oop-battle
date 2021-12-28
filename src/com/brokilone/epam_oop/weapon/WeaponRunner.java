package com.brokilone.epam_oop.weapon;

import com.brokilone.epam_oop.Archer;
import com.brokilone.epam_oop.Hero;
import com.brokilone.epam_oop.Warrior;


/**
 * @author Kseniia Ushakova
 */
public class WeaponRunner {
  public static void main(String[] args) {
    var archer = new Archer("Леголас", 15);
    archer.setWeapon(new Bow());

    var warrior = new Warrior("Боромир", 10);
    warrior.setWeapon(new Sword());
    printWeaponDamage(warrior);
  }

  public static void printWeaponDamage(Hero hero) {
    System.out.println(hero.getWeapon().getDamage());
  }
}
