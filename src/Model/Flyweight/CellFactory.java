package Model.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CellFactory {
    private Map<String, CellFlyweight> cellFlyweights;  // Кэш для объектов CellFlyweight

    public CellFactory() {
        // Инициализация HashMap
        cellFlyweights = new HashMap<>();
    }

    // Возвращает объект CellFlyweight для указанного состояния
    public CellFlyweight getCellFlyweight(String state) {
        // Проверка, существует ли уже объект для указанного состояния
        if (!cellFlyweights.containsKey(state)) {
            // Если нет, создаем новый объект и сохраняем в кэш
            cellFlyweights.put(state, new CellFlyweight(state));
        }
        // Возвращаем существующий объект из кэша
        return cellFlyweights.get(state);
    }
}
