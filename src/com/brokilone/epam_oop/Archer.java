package com.brokilone.epam_oop;

/**
 * @author Kseniia Ushakova
 */
public class Archer extends Hero {

  public Archer(String name, int damage) {
    super(name, damage);
  }

  @Override
  public void attackEnemy(Enemy enemy) {
    System.out.println(getName() + " shoot in " + enemy.getName());
    enemy.takeDamage(getDamage());
  }
}
