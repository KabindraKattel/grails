package demo1


import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_STUDENT')
class StudentController {
    final def studentService = new StudentService()
    def springSecurityService
    static allowedMethods = [index: 'GET']


    def index() {

        def username = ((User) springSecurityService.currentUser).username
        studentService.setUsername(username)
        final def stream = studentService.streamName
        final def subjects = studentService.allSubjectsName
        final def teachers =
                studentService.allTeachersName
        println("stream is ${stream}")
        println("subject is ${subjects}")
        println("stream is ${teachers}")
        [username: username, stream: stream, subjects: subjects, teachers: teachers]
    }
}
