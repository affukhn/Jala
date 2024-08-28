package interfaces;

public interface Engine {
    int piston=8;

    String typeOfEngine();
    static String EngineType()
    {
        return "hybrid engine";
    }

}
