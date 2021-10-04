public class Flower {
    double price;
    public double getPrice(){
        return price;
    }
    public static double Price(Flower[] bouquet){
        Double sum=0.0;
        for(Flower f:bouquet){
            sum+=f.getPrice();
        }
        return sum;
    }
    public static int Count(Flower[][] bouquets){
        int count=0;
        for (Flower[] bs:bouquets){
            for(Flower b:bs)
                count++;
        }
        return count;
    }
}
