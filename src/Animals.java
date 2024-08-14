public class Animals{
    protected static int animalsCount = 0;
    protected String animalName;

    public Animals(String animalName){
        this.animalName = animalName;
        animalsCount++;
    }
    public void runDistance (int distance){
        System.out.println(animalName + " пробежал " + distance + " метров.");

    }
    public void swimDistance (int distance){
        System.out.println(animalName + " проплыл " + distance + " метров.");
    }
    public static int allAnimalsCount(){
        return animalsCount;
    }

}

