package demo1

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic

@CompileStatic
@Service(Subject)
interface SubjectService {

    Subject get(Serializable id)

    List<Subject> list(Map args)

    Long count()

    void delete(Serializable id)

    Subject save(Subject student)

}