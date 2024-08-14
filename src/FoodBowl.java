public class FoodBowl{
    private int foodAmount;

    public FoodBowl(int foodAmount){
        this.foodAmount = foodAmount;
    }

    public void deleteFood(int amount){
        if (foodAmount >= amount){
            foodAmount -= amount;
        }
    }

    public void addFood(int amount){
        foodAmount += amount;
    }

    public int getFoodAmount(){
        return foodAmount;
    }

}