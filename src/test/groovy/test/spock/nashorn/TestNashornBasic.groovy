package test.spock.nashorn

/**
 * Created by Vinicius on 08/06/2016.
 */
class TestNashornBasic extends BaseSpec {
    def setup() {
        loadJS('/test-nashorn-Basic.js')
    }

    def "printString"() {
        when:
        def result = nashorn.invokeFunction('print',"Vinicius")
        then:
        result == "Vinícius"
    }
}
