//package runtest.spock.nashorn
//
//@Grab('org.spockframework:spock-core:1.0-groovy-2.3')
//
//import org.junit.runner.*
//
//import spock.util.EmbeddedSpecRunner
//
//def runner = new EmbeddedSpecRunner(throwFailure: false)
//def result = runner.runSpecBody """
//	def setup() {
//        loadJS('/test-nashorn-Basic.js')
//    }
//
//    def "printString"() {
//        when:
//        def result = nashorn.invokeFunction('print',"Vinicius")
//        then:
//        result == "Vinícius"
//    }
//"""
//
//println "successful: ${result.wasSuccessful()}"
//println "failureCount: ${result.failureCount}"
//println "failures: ${result.failures}"
//println "ignoreCount: ${result.ignoreCount}"
//println "runCount: ${result.runCount}"
//println "runTime: ${result.runTime}"
//
//println 'done'