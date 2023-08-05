package prototype;

public class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Motorcycle started...");

    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped...");
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
