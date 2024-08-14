public class Cat extends Animals{
    private final int MAX_RUN_DISTANCE = 200;
    private boolean isFull = false;
    protected static int catCount = 0;

    public Cat(String animalName){
        super(animalName);
        catCount++;
    }

    public void run (int distance){
        if (distance <= MAX_RUN_DISTANCE){
            super.runDistance(distance);
        }
        else{
            System.out.println(super.animalName + " не может пробежать " + " метров.");
        }
    }

    public void swim (int distance){
        System.out.println(super.animalName + " не умеет плавать.");
    }

    public void eat(FoodBowl bowl, int foodAmount){
        if (bowl.getFoodAmount() >= foodAmount){
            bowl.deleteFood(foodAmount);
            isFull = true;
            System.out.println(super.animalName + " поел, сыт.");
        }
        else{
            System.out.println(super.animalName + " недостаточно еды в миске");
        }
    }

    public boolean isFull(){
        return isFull;
    }
}