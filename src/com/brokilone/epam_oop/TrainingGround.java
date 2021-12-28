package com.brokilone.epam_oop;

/**
 * @author Kseniia Ushakova
 */
public class TrainingGround {

  public static void main(String[] args) {
    var warrior = new Warrior("Boromir", 15);

    var mage = new Mage("Gendolf", 20);

    var archer = new Archer("Legolas", 10);


    var zombie = new Enemy(100, "Zombie");
    attackEnemy(zombie, warrior, mage, archer);
  }

  public static void attackEnemy(Enemy enemy, Hero... heroes) {
    while (true) {
      for (Hero hero : heroes) {
        if (enemy.isAlive()) {
          hero.attackEnemy(enemy);
        } else {
          return;
        }
      }
    }
  }
}
