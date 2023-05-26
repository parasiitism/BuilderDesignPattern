package BuilderDesignPattern;

public class Client {
    public static void main(String[] args){
        Car car1=new Car.CarBuilder("SW","M", "B").build();
        System.out.println(car1);

        Car car2=new Car.CarBuilder("SW", "M", "B").setAc("AC").build();
        System.out.println(car2);

        Car car3=new Car.CarBuilder("SW", "M", "B").setAc("AC").setSeatCover("SC").setMusicSystem("MS").build();
        System.out.println(car3);
    }    
}
