package demo1

import grails.gorm.transactions.Transactional

import java.util.stream.Collectors

@Transactional
class TeacherService {
    String username

    Student getLoggedInTeacher(){
        return username==null?null:Student.findByUser_name(username)
    }

    private Stream getStream() {
        Stream.findById(getLoggedInStudent().streamId)
    }

    private List<Subject> getAllSubjects() {
        def stream = getStream()
        stream == null?[]: Subject.findAllByStream(stream)
    }

    private List<Teacher> getAllTeachers(){
        def teacherCriteria = Teacher.createCriteria()
        def subjectIds = allSubjects == []?[]:allSubjects.stream().map({ subject -> subject.id }).collect(Collectors.toList())
        subjectIds.each {id-> println(id)}
        def teachers = teacherCriteria.list {
            subjects {
                subjectIds.each {id -> eq("id",id)}
            }
        } as List<Teacher>
        subjectIds==[]?[]:teachers
    }

    String getStreamName(){
        def stream = getStream()
        stream == null?null:stream.name
    }

    List<String> getAllSubjectsName(){
        allSubjects.stream().map({ subject -> subject.name }).collect(Collectors.toList())
    }

    List<String> getAllTeachersName(){
        allTeachers.stream().map({ teacher -> teacher.name }).collect(Collectors.toList())
    }

}