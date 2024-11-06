package Model.Flyweight;

public class Cell {
    private String state;  // Состояние клетки (X или O), которое возвращает фабрика

    // В конструктор передаём только состояние
    public Cell(CellFlyweight state) {
        this.state = String.valueOf(state);
    }

    // Метод для получения состояния клетки
    public String getState() {
        return state;
    }

    // Метод для изменения состояния клетки
    public void setState(String state) {
        this.state = state;
    }
}
