package Builder.Models;

public class Body {
    public Body() {}

    public Body(Integer doorsCount) {
        this.setDoorsCount(doorsCount);
    }

    public Integer getDoorsCount() {
        return this.doorsCount;
    }
    public String getColor() {
        return this.color;
    }

    public void setDoorsCount(Integer doorsCount) {
        this.doorsCount = doorsCount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private Integer doorsCount;
    private String color;
}
