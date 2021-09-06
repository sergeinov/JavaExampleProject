package qa.guru;

public class Robot {

    private String modelName;
    private String status;
    private String os;
    private float height;
    private float weight;
    private int speed;
    private int strange;
    private int armor;

    public Robot(String modelName, String status, String os, float height, float weight, int speed, int strange, int armor) {
        this.modelName = modelName;
        this.status = status;
        this.os = os;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strange = strange;
        this.armor = armor;
    }

    // Getters
    public String getModelName() {
        return modelName;
    }

    public String getStatus() {
        return status;
    }

    public String getOs() {
        return os;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrange() {
        return strange;
    }

    public int getArmor() {
        return armor;
    }

    // METHODS
    public void move() {
        System.out.println("The robot is moving...");
    }

    public void jump() {
        System.out.println("The robot is jumping...");
    }

    public void displayInfo() {
        System.out.println("Robot: '" + modelName + '\'' + "\n"  +
                "status:'" + status + '\'' + "\n"  +
                "os:'" + os + '\'' + "\n"  +
                "height: '" + '\'' + "\n"  +
                "weight: '" + weight + '\'' + "\n"  +
                "speed: '" + speed + '\'' + "\n"  +
                "strange: '" + strange + '\'' + "\n"  +
                "armor:" + armor );
    }

}
