package opony;

public class Wheel {
    private String id;
    private WheelType type;
    private int size;

    public Wheel(String id, WheelType type, int size) {
        this.id = id;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", size=" + size +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WheelType getType() {
        return type;
    }

    public void setType(WheelType type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
