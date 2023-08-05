package prototype;

public interface Vehicle extends Cloneable{
    void start();
    void stop();
    Vehicle clone();
}
