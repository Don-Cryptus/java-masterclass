public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setEngine(String engine) {
        String validEngine = engine.toLowerCase();
        if (validEngine.equals("v8") || validEngine.equals("v6")) {
            this.engine = engine;
        } else {
            this.engine = "Unknown";
        }
    }

    public String getEngine() {
        return this.engine;
    }

    public void setColor(String color) {
        String validColor = color.toLowerCase();
        if (validColor.equals("red") || validColor.equals("blue") || validColor.equals("green")) {
            this.color = color;
        } else {
            this.color = "Unknown";
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setDoors(int doors) {
        if (doors == 2 || doors == 4) {
            this.doors = doors;
        } else {
            this.doors = 0;
        }
    }

    public int getDoors() {
        return this.doors;
    }

    public void setWheels(int wheels) {
        if (wheels == 4 || wheels == 6) {
            this.wheels = wheels;
        } else {
            this.wheels = 0;
        }
    }

    public int getWheels() {
        return this.wheels;
    }

    public void printStates() {
        System.out.println("Model: " + this.model);
        System.out.println("Engine: " + this.engine);
        System.out.println("Color: " + this.color);
        System.out.println("Doors: " + this.doors);
        System.out.println("Wheels: " + this.wheels);
    }
}
