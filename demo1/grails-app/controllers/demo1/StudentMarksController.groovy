package demo1

import grails.plugin.springsecurity.annotation.Secured

class StudentMarksController {
    //for student--only marks
    //for teacher--group By Student marks and can edit
    @Secured(['ROLE_STUDENT','ROLE_TEACHER'])
    def index() {
        int offset = params.offset ? params.offset.toInteger() : 0
        Subject.createCriteria().list(max:10, offset:offset){

        }
    }
}
