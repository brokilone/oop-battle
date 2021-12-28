package com.brokilone.epam_oop;

import com.brokilone.epam_oop.weapon.Weapon;

/**
 * @author Kseniia Ushakova
 */
public abstract class Hero {
  private String name;
  private int damage;
  private Weapon weapon;

  public Hero(String name, int damage) {
    this.name = name;
    this.damage = damage;
  }

  public abstract void attackEnemy(Enemy enemy);

  public String getName() {
    return name;
  }

  public int getDamage() {
    return damage;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }
}
