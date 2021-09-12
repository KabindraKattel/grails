package demo1

import grails.gorm.transactions.Transactional

import java.util.stream.Collectors

@Transactional
class TeacherService {
    String username

    List<Teacher> getPagedTeacherResults(int offset) {
        Teacher.list(offset: offset, max: 10)
    }

    Teacher getLoggedInTeacher() {
        username == null ? null : Teacher.findByUser_name(username)
    }

    List<Subject> getAllSubjects() {
        Long teacherId = loggedInTeacher.id
        Subject.createCriteria().list {
            teachers {
                eq("id", teacherId)
            }
        } as List<Subject>
    }

    private List<Stream> getAllStreams() {
        def subjectIds = allSubjects.stream().map({ subject -> subject.id }).collect(Collectors.toList())
        Stream.withCriteria {
            subjectIds.each {
                id -> eq("id", id)
            }
        } as List<Stream>
    }

    List<Student> getAllStudents() {
        def streamIds = allStreams.stream().map({ stream -> stream.id }).collect(Collectors.toList())
        Student.createCriteria().list {
            streamIds.each { id -> eq("id", id) }
        } as List<Student>
    }

}