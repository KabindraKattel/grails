package demo1

import grails.gorm.transactions.Transactional

import java.sql.Date

class BootStrap {

    StreamService streamService
    StudentService studentService
    SubjectService subjectService
    TeacherService teacherService

    def init = { servletContext ->
        addTestUser()
       /* def stream01 = new Stream(name: "Stream-01")
        def stream02 = new Stream(name: "Stream-02")

        def student01 = new Student(name: "Student-01", dob: new Date(29, 12, 11),
                stream: stream01, address: new Address(primary: "Village-01", secondary: "Town-01"))
        def student02 = new Student(name: "Student-02", dob: new Date(25, 12, 11),
                stream: stream01, address: new Address(primary: "Village-02", secondary: "Town-02"))

        def subject01 = new Subject(name: "Subject-01", stream: stream01)
        def subject02 = new Subject(name: "Subject-02", stream: stream01)
        def subject03 = new Subject(name: "Subject-03", stream: stream02)
        def subject04 = new Subject(name: "Subject-04", stream: stream02)


        def teacher01 = new Teacher(name: "Teacher1", xpYears: 1)
        def teacher02 = new Teacher(name: "Teacher2", xpYears: 2)
        def teacher03 = new Teacher(name: "Teacher3", xpYears: 3)
        def teacher04 = new Teacher(name: "Teacher4", xpYears: 4)

        subject01.addToTeachers(teacher01)
        subject01.addToTeachers(teacher02)

        subject02.addToTeachers(teacher04)
        subject03.addToTeachers(teacher04)
        subject04.addToTeachers(teacher03)
        stream01.save(flush:true, failOnError:true)*/

        /*streamService.save(stream01).save( failOnError:true)
        streamService.save(stream02).save(failOnError:true)

        studentService.save(student01).save(failOnError:true)
        studentService.save(student02).save(failOnError:true)

        subjectService.save(subject01).save(failOnError:true)
        subjectService.save(subject02).save(failOnError:true)
        subjectService.save(subject03).save(failOnError:true)
        subjectService.save(subject04).save(failOnError:true)

        teacherService.save(teacher01).save(failOnError:true)
        teacherService.save(teacher02).save(failOnError:true)
        teacherService.save(teacher03).save(failOnError:true)
        teacherService.save(teacher04).save(failOnError:true)*/
    }
    def destroy = {
    }

    @Transactional
    void addTestUser() {
        def studentRole = Role.findOrCreateWhere(authority: 'ROLE_STUDENT').save(flush:true, failOnError:true)
        def teacherRole = Role.findOrCreateWhere(authority: 'ROLE_TEACHER').save(flush:true, failOnError:true)


        def studentUser = User.findByUsername'student1'
        if (studentUser == null) {
            studentUser = new User(username: 'student1', password: 'student1').save(flush: true, failOnError: true)
        } else {
            studentUser.password = 'student1'
            studentUser.save(flush: true, failOnError: true)
        }

        def teacherUser = User.findByUsername'teacher1'
        if (teacherUser == null) {
            teacherUser = new User(username: 'teacher1', password: 'teacher1').save(flush: true, failOnError: true)
        } else {
            teacherUser.password = 'teacher1'
            teacherUser.save(flush: true, failOnError: true)
        }

        UserRole.create studentUser, studentRole, true
        UserRole.create teacherUser, teacherRole, true

        UserRole.withSession {
            it.flush()
            it.clear()
        }

    }
    @Transactional
    def testSave(){
        def stream01 = new Stream(name: "Stream-01")
        stream01.save(flush:true, failOnError:true)
    }
}
