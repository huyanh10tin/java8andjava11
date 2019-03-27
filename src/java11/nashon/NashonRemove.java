package java11.nashon;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashonRemove {
    public static void main(String[] args) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        try {
            engine.eval("print('aplolo!');"); // alollo!
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
