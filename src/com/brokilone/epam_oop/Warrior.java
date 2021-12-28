package com.brokilone.epam_oop;

/**
 * @author Kseniia Ushakova
 */
public class Warrior extends Hero {

  public Warrior(String name, int damage) {
    super(name, damage);
  }

  @Override
  public void attackEnemy(Enemy enemy) {
    System.out.println(getName() + " took a knife and shoot " + enemy.getName());
    enemy.takeDamage(getDamage());
  }
}
