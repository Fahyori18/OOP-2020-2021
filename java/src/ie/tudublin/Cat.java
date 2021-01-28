package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;

    public Cat(String name)
    {
        super(name);
        numLives = 9; 
    }

    public void catKill() {

        if(numLives > 0){
            
            System.out.println("Ouch!");
        }
        else
        {
            System.out.println("I'm Dead!");
        }
        numLives--;
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }
}
