package work4;

import java.util.HashMap;
import java.util.Map;

public class GraphicObjectsFactory {

    private Map<String, GraphicObject> objectCache = new HashMap<>();

    public GraphicObject getGraphicObject(String key) {
        if (!objectCache.containsKey(key)) {
            objectCache.put(key, new ConcreteGraphicObject(key));
        }
        return objectCache.get(key);
    }

}
