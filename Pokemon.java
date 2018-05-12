package pokemonmaster;

import java.util.*;

public class Pokemon{
	public final double maxHealth;
	protected double health,weight;
	protected String name;
	

	public Pokemon(String name, double maxHealth,double weight){
		this.name      = name;
		this.health    = (int)maxHealth;
		this.maxHealth = (int)maxHealth;
                this.weight    = (int)weight;
	}
        
        public double getWeight(){
            return this.weight;
        }

	public double getHealth(){
		return this.health;
	}

	public String getName(){
		return this.name;
	}
        
        public void setName(String name){
                this.name = name;
        }
	
	public void eat(Foods berry){
		this.health += berry.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
                if(this.health <= 0)
                        this.health = 0;
                this.weight += berry.getRestoreValue();
                if(this.weight>100)
                    this.weight = 100;
	}

	public void reducedHealth(double value){
		this.health -= value;
		if(this.health <= 0)
			this.health = 0;
	}
        
        public void reducedWeight(double value){
		this.weight -= value;
		if(this.weight < 40)
			this.weight = 40;
	}

	


}





