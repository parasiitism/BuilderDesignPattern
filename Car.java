package BuilderDesignPattern;

public class Car {
    // Mandatory attributes
    public String steeringWheel;
    public String mirror;
    public String brake;

    // Optional Attribute
    public String seatCover;
    public String musicSystem;
    public String ac;

    public Car(CarBuilder carBuilder){
        this.steeringWheel=carBuilder.steeringWheel;
        this.mirror=carBuilder.mirror;
        this.ac=carBuilder.ac;
        this.musicSystem=carBuilder.musicSystem;
        this.seatCover=carBuilder.seatCover;
        this.brake=carBuilder.brake;
    }

    @Override
    public String toString(){
        String str="Car details";
        str+="steering wheel:"+steeringWheel;
        str+=",mirror :"+mirror;
        str+=",ac :" + ac;
        str+=",music system :" + musicSystem;
        str+=",seat cover :"+ seatCover;
        str+=",brake:"+ brake;
        return str;
    }
    public static class CarBuilder{
        // Mandatory attribute
        public String steeringWheel;
        public String mirror;
        public String brake;

        // Optional Attribute

        public String seatCover;
        public String musicSystem;
        public String ac;
         // to setter mandatory attributes
         public CarBuilder(String steeringWheel,String mirror,String brake){
            this.steeringWheel=steeringWheel;
            this.mirror=mirror;
            this.brake=brake;
         }
         // create setter for the optional attributes
        public CarBuilder setAc(String ac){
            this.ac=ac;
            return this;
        }
        public CarBuilder setSeatCover(String seatCover){
            this.seatCover=seatCover;
            return this;
        }
        public CarBuilder setMusicSystem(String musicSystem){
            this.musicSystem=musicSystem;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
}
