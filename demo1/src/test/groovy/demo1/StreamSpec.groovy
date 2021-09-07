package demo1

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class StreamSpec extends Specification implements DomainUnitTest<Stream> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
