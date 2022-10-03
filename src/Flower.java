public class Flower {
    private String flowerName;
    private String country;
    private double cost;
    private int lifeSpan;

    Flower(String flowerName,String country,double cost,int lifeSpan) {
        if (flowerName == null || flowerName.isBlank() || flowerName.isEmpty()) {
            this.flowerName = " ??Белый?? ";
        } else {
            this.flowerName = flowerName;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = " Россия ";
        } else {
            this.country = country;
        }
        if (cost <= 0 ) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0 ) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerColor) {
        this.flowerName = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    void flowerInfo() {
        System.out.println("");
        System.out.println("Название --> " +  flowerName );
        System.out.println("Страна --> " + country );
        System.out.println("Цена за штуку --> " + cost );
        System.out.println("Время жизни --> " + lifeSpan );
    }
}
