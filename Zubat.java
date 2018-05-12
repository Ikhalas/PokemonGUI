package pokemonmaster;

class Zubat extends Pokemon {
    private static final int maxHealth = 400;
    private static final int weight = 100;
    
	public Zubat(){
		super("Zubat", 
                        (Math.random()*1000) % (maxHealth+1),
                        (Math.random()*1000) % (weight+1));
	}

   

}

