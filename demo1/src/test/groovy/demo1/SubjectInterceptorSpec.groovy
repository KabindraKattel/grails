package demo1

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class SubjectInterceptorSpec extends Specification implements InterceptorUnitTest<SubjectInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test student interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"student")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
