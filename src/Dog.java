public class Dog extends Animals{
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;
    protected static int dogCount = 0;

    public Dog(String animalName){
        super(animalName);
        dogCount++;
    }


    public void run (int distance){
        if (distance <= MAX_RUN_DISTANCE){
            super.runDistance(distance);
        }
        else{
            System.out.println(super.animalName + " не может пробежать " + distance + " метров.");
        }
    }

    public void swim (int distance){
        if (distance <= MAX_SWIM_DISTANCE){
            super.swimDistance(distance);
        }
        else{
            System.out.println(super.animalName + " не может проплыть " + distance + " метров.");
        }
    }
}