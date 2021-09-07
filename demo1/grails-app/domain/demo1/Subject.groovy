package demo1

class Subject {
    String name
    Stream stream

    static hasMany = [teachers: Teacher]

//    String code
//
//
//    static mapping = {
//        id name: 'code', generator: 'assigned'
//    }

    static constraints = {
    }
}
