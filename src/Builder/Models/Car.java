package Builder.Models;

public class Car {

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format(
                        "---------------------------\n" +
                        "Car: %s \n" +
                        "Engine: %s W, %s fuel \n" +
                        "Body: %s doors, %s color \n" +
                        "---------------------------",
                        this.getName(),
                        this.getEngine().getPower(),
                        this.getEngine().getFuel(),
                        this.getBody().getDoorsCount(),
                        this.getBody().getColor());
    }

    private String name;
    private Engine engine;
    private Body body;

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
