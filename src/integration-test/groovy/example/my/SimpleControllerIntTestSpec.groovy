package example.my

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.*
import spock.lang.Specification

@Integration
@Rollback
class SimpleControllerIntTestSpec extends Specification {

    MyService myService

    void "test something"() {
        expect:"fix me"
            true == true
    }

    void "test myService"() {
        when:
        String text = myService.hello()

        then:
        text == "did it"
    }

}
