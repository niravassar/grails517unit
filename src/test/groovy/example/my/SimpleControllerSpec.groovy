package example.my

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class SimpleControllerSpec extends Specification implements ControllerUnitTest<SimpleController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }

    void "test action which renders text"() {
        when:
        controller.hello()

        then:
        status == 200
        response.text == 'Nirav'
    }
}
