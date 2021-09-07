package demo1

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_TEACHER')
class TeacherController {
    def springSecurityService


    def index(){
        def username = ((User) springSecurityService.currentUser).username

        [username:username]
    }

}
