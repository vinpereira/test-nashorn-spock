package test.spock.nashorn

import spock.lang.Unroll

/**
 * Created by Vinicius on 08/06/2016.
 */
class CalculatorSpec extends BaseSpec {
    def setup() {
        loadJS("/calculator.js")
    }

    @Unroll
    def "add of #a and #b is #expected"() {
        when:
            def result = nashorn.invokeFunction('add',a,b)
        then:
            result == expected
        where:
            a | b | expected
            1 | 1 | 2
            2 | 1 | 3
            3 | 1 | 4
            4 | 1 | 5
    }

    @Unroll
    def "sub of #a and #b is #expected"() {
        when:
        def result = nashorn.invokeFunction('sub',a,b)
        then:
        result == expected
        where:
            a | b | expected
            1 | 1 | 0
            2 | 1 | 1
            3 | 1 | 2
            4 | 1 | 3
    }

    @Unroll
    def "div of #a and #b is #expected"() {
        when:
        def result = nashorn.invokeFunction('div',a,b)
        then:
        result == expected
        where:
            a | b | expected
            1 | 1 | 1
            2 | 1 | 2
            3 | 1 | 3
            4 | 1 | 4
    }

    @Unroll
    def "mult of #a and #b is #expected"() {
        when:
        def result = nashorn.invokeFunction('mult',a,b)
        then:
        result == expected
        where:
            a | b | expected
            1 | 1 | 1
            2 | 1 | 2
            3 | 1 | 3
            4 | 1 | 4
    }

    @Unroll
    def "square of #a is #expected"() {
        when:
            def result = nashorn.invokeFunction('square',a)
        then:
            result == expected
        where:
            a | expected
            1 | 1
            2 | 4
            3 | 9
            4 | 16
    }

}
