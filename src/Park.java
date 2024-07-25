public class Park{
    String parkName;
    Attraction[] attractions;

    Park (String name){
        parkName = name;
        attractions = new Attraction[3];
    }
    class Attraction{
        String name;
        String openingTime;
        String closingTime;
        double cost;

        Attraction(String name, String openingTime, String closingTime, double cost){
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.cost = cost;
        }

        void attractionInfo(){
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время открытия: " + openingTime);
            System.out.println("Время закрытия: " + closingTime);
            System.out.println("Цена: $" + cost);
        }
    }

    void attractionAdd(String name, String openingTime, String closingTime, double cost) {
        for (int i = 0; i < attractions.length; i++){
            if (attractions[i] == null){
                attractions[i] = new Attraction(name, openingTime, closingTime, cost);
                break;
            }
        }
    }

    void parkInfo(){
        System.out.println("Название парка: " + parkName);
        System.out.println("Аттракционы:");
        for (Attraction attraction : attractions) {
            if (attraction != null){
                attraction.attractionInfo();
            }
        }
    }
}
