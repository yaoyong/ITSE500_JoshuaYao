/*
 * *Simulation of an orchard on harvesting program,
 *  get the final number of total fruit
 */
package edu.oit.lesson4.assignment.program2;
/**
 * @author JoshuaYao
 *
 */
public class FruitGarden {
	int totalHarvest;
	int harvestStra;
	int harvestApple;
	int harvestGrape;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitGarden fruitGarden = new FruitGarden();
		Strawberry strawberry = new Strawberry();
		Grape grape = new Grape();
		Apple apple = new Apple();
		fruitGarden.harvestStra = strawberry.harvest(1200);
		fruitGarden.harvestApple = apple.harvest(1000);
		fruitGarden.harvestGrape = grape.harvest(1500);
		fruitGarden.totalHarvest = fruitGarden.harvestApple
				+ fruitGarden.harvestGrape + fruitGarden.harvestStra;
		System.out.println("We harvest total fruit:" + fruitGarden.totalHarvest + "");

	}

}
