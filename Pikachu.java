package pokemonmaster;

class Pikachu extends Pokemon {
    private static final int maxHealth = 500;
    private static final int weight = 100;
    
	public Pikachu(){
		super("Diglett", 
                        (Math.random()*1000) % (maxHealth+1),
                        (Math.random()*1000) % (weight+1));
	}

   
}

    

