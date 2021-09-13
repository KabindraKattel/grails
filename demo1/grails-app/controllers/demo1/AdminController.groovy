package demo1

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_ADMIN')
class AdminController {
    static allowedMethods = [index: 'GET']

    def index() {
        [teachers: Teacher.list(params), teachersCount: Teacher.count()]
    }

}
