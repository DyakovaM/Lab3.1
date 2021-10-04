public class Bouquet {
    public static void main(String args[]){
        Flower flower1 = new Rose();
        System.out.println("Розы: " + flower1.getPrice());
        Flower flower2 = new Carnations();
        System.out.println("Гвоздики: " + flower2.getPrice());
        Flower flower3 = new Tulips();
        System.out.println("Тульпаны: " + flower3.getPrice());
        Flower flower4 = new Cymbidium();
        System.out.println("Ваксфлауэр: " + flower4.getPrice());
        Flower flower5 = new Waxflower();
        System.out.println("Цимбидиум: " + flower5.getPrice());

        Flower f1 = new Rose();
        Flower f2 = new Carnations();
        Flower f3 = new Waxflower();

        Flower f4 = new Rose();
        Flower f5 = new Carnations();
        Flower f6 = new Tulips();
        Flower f7 = new Cymbidium();
        Flower f8 = new Rose();

        Flower f9 = new Rose();
        Flower f10 = new Waxflower();
        Flower f11 = new Carnations();
        Flower f12 = new Tulips();
        Flower f13 = new Cymbidium();

        Flower[] bouquet1 = {f1,f2,f3};
        Flower[] bouquet2 = {f4,f5,f6,f7,f8};
        Flower[] bouquet3 = {f9,f10,f11,f12,f13};

        System.out.println("Букет №1: " + Flower.Price(bouquet1));
        System.out.println("Букет №2: " + Flower.Price(bouquet2));
        System.out.println("Букет №3: " + Flower.Price(bouquet3));

        Flower[][] bukets = {bouquet1, bouquet2, bouquet3};
        System.out.println("Общее кол-во цветов: " + Flower.Count(bukets));

    }
}
