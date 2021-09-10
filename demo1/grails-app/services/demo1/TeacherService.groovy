package demo1

import grails.gorm.transactions.Transactional

import java.util.stream.Collectors

@Transactional
class TeacherService {
    String username

    Teacher getLoggedInTeacher(){
        username==null?null:Teacher.findByUser_name(username)
    }

    private List<Subject> getAllSubjects() {
        Long teacherId = loggedInTeacher.id
        def subjects = Subject.createCriteria().list {
            teachers {
                eq("id", teacherId)
            }
        } as List<Subject>
        subjects == []?[]:subjects
//        def stream = getStream()
//        stream == null?[]: Subject.findAllByStream(stream)
    }

    private List<Stream> getAllStreams() {
        def subjectIds = allSubjects.stream().map({ subject -> subject.id }).collect(Collectors.toList())
        Stream.createCriteria().list {
            subjectIds.each {
                id -> eq("id", id)
            }
        } as List<Stream>
    }

    private List<Student> getAllStudents(){
        def streamIds = allStreams.stream().map({ stream -> stream.id }).collect(Collectors.toList())
        def subjects = Student.createCriteria().list {
                streamIds.each {id -> eq("id",id)}
        } as List<Subject>
    }

    String getAllStreamNames(){
        allStreams.stream().map({ stream -> stream.name }).collect(Collectors.toList())
    }

    List<String> getAllSubjectsName(){
        allSubjects.stream().map({ subject -> subject.name }).collect(Collectors.toList())
    }

}