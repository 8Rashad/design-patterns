package prototype;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car started...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped...");
    }

    @Override
    public Vehicle clone() {
        try{
            return (Vehicle) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
