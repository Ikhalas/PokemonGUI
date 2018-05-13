package pokemonmaster;

class Diglett extends Pokemon  {
    private static final int maxHealth = 700;
    private static final int weight = 100;
    private static final int exp = 0;
    
	public Diglett(){
		super("Diglett", 
                        (Math.random()*1000) % (maxHealth+1),
                        (Math.random()*1000) % (weight+1),exp);
	}
}



