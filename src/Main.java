public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Рекс");
        Dog dog2 = new Dog("Not Identified");
        Cat cat1 = new Cat("Сильвер");
        Cat cat2 = new Cat("Бусинка");

        dog1.run(100);
        dog1.swim(7);

        dog2.run(500);
        dog2.swim(11);

        cat1.run(120);
        cat1.swim(20);

        cat2.run(201);

        System.out.println("\nЗадание ООП №1");
        System.out.println("Количество животных: " + Animals.animalsCount);
        System.out.println("Количество котов: " + Cat.catCount);
        System.out.println("Количество собак: " + Dog.dogCount);

        FoodBowl bowl = new FoodBowl(30);

        cat1.eat(bowl, 15);
        cat2.eat(bowl, 20);

        System.out.println("Количество еды в миске: " + bowl.getFoodAmount());

        if (cat1.isFull()){
            System.out.println(cat1.animalName + " накормлен и сыт.");
        }
        else{
            System.out.println(cat1.animalName + " голоден.");
        }

        if (cat2.isFull()){
            System.out.println(cat2.animalName + " накормлен и сыт.");
        }
        else{
            System.out.println(cat2.animalName + " голоден.");
        }

        bowl.addFood(10);
        System.out.println("10 единиц еды добавлено, текущее количество: " + bowl.getFoodAmount());

        cat2.eat(bowl,26);


    }




}