public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза обычкновенная ","Голландия", 35.59, 0);
        Flower chrys = new Flower("Хризантема",null, 15, 5);
        Flower peony = new Flower("Пион","Англия", 69.9, 1);
        Flower gyps = new Flower("Гипсофила","Турция", 19.5, 10);

        rose.flowerInfo();
        chrys.flowerInfo();
        peony.flowerInfo();
        gyps.flowerInfo();

    }
}