package com.brokilone.epam_oop;

/**
 * @author Kseniia Ushakova
 */
public class Mage extends Hero {

  public Mage(String name, int damage) {
    super(name, damage);
  }

  @Override
  public void attackEnemy(Enemy enemy) {
    System.out.println(getName() + " did magic on " + enemy.getName());
    enemy.takeDamage(getDamage());
  }
}
