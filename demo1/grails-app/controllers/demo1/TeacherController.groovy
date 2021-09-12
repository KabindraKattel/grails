package demo1

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_TEACHER')
class TeacherController {
    def teacherService = new TeacherService()
    def springSecurityService
    static allowedMethods = [index: 'GET']


    def index() {
        def username = ((User) springSecurityService.currentUser).username
        teacherService.setUsername(username)
        [username: username, subjects: teacherService.allSubjects, students: teacherService.allStudents]
    }

}
