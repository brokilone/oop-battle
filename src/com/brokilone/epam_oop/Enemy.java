package com.brokilone.epam_oop;

/**
 * @author Kseniia Ushakova
 */
public class Enemy implements Mortal{

  private int health;
  private String name;

  public Enemy(int health, String name) {
    this.health = health;
    this.name = name;
  }

  public void takeDamage(int damage) {
    if (isAlive() && health <= damage) {
      this.health = 0;
      System.out.println(getName() + " is dead");
    } else {
      this.health -= Math.min(damage, health);
      System.out.println(name + " took damage " + damage + ", remaining health " + health);
    }
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean isAlive() {
    return health > 0;
  }
}
