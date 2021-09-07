package demo1

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class StreamInterceptorSpec extends Specification implements InterceptorUnitTest<StreamInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test stream interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"stream")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
