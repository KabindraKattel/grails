package demo1

import grails.plugin.springsecurity.annotation.Secured

class StudentMarksController {
    def springSecurityService

    //for student--only marks
    //for teacher--group By Student marks and can edit
    @Secured(['ROLE_STUDENT','ROLE_TEACHER'])
    def index() {
        def username = ((User) springSecurityService.currentUser).username
        int offset = params.offset ? params.offset.toInteger() : 0
        def subjects = Subject.findByObtainedMark(obtainedMark.student.user_name: username).list(max:10, offset:offset){
        }
        [subjects: subjects]
    }
}
