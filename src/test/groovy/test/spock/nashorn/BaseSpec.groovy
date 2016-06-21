package test.spock.nashorn

import spock.lang.Shared
import spock.lang.Specification

import javax.script.ScriptEngine
import javax.script.ScriptEngineManager

/**
 * Created by Vinicius on 08/06/2016.
 */
abstract class BaseSpec extends Specification {
    @Shared ScriptEngine nashorn = new ScriptEngineManager().getEngineByName("nashorn")

    def loadJS(String path) {
        return nashorn.eval(this.class.getResource(path).text)
    }
}
