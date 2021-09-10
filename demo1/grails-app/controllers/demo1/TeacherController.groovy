package demo1

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_TEACHER')
class TeacherController {
    def teacherService = new TeacherService()
    def springSecurityService


    def index(){
        def username = ((User) springSecurityService.currentUser).username
        teacherService.setUsername(username)
        teacherService.allSubjectsName
//        [username:username]
    }

}
