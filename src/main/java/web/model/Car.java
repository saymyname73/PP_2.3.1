package web.model;

public class Car {

    private int id;

    private String mark;

    private int model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Car() {
    }

    public Car(int id, String mark, int model) {
        this.id = id;
        this.mark = mark;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model=" + model +
                '}';
    }
}
