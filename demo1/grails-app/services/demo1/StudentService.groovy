package demo1

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional
import grails.plugin.springsecurity.SpringSecurityService

import java.util.stream.Collectors

@Transactional
class StudentService {
   String username

   Student getLoggedInStudent(){
      return username==null?null:Student.findByUser_name(username)
   }

   private Stream getStream() {
      Stream.findById(getLoggedInStudent().streamId)
   }

   private List<Subject> getSubjects() {
      def stream = getStream()
      stream == null?[]: Subject.findAllByStream(stream)
   }

   private List<Teacher> getTeachers(){
      def subjects = getSubjects()
      subjects==[]?[]:Teacher.findAllBySubjects(subjects.toSet())
   }

   String getStreamName(){
      def stream = getStream()
      stream == null?null:stream.name
   }

   List<String> getAllSubjectsName(){
      getSubjects().stream().map({ subject -> subject.name }).collect(Collectors.toList())
   }

   List<String> getAllTeachersName(){
      getTeachers().stream().map({ teacher -> teacher.name }).collect(Collectors.toList())
   }

}