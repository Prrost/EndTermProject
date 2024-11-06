package Model.Flyweight;

public class CellFlyweight {
    private String state;  // Состояние клетки (X или O)

    public CellFlyweight(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
