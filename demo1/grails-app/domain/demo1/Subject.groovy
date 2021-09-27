package demo1

class Subject {
    String name
    ObtainedMark obtainedMark
    Stream stream

    static embedded = ['obtainedMark']

    static hasMany = [teachers: Teacher]
//    String code
//
//
//    static mapping = {
//        id name: 'code', generator: 'assigned'
//    }

    static class ObtainedMark {
        Student student
        int obtainedMarks

        static constraints = {
            obtainedMarks nullable:false, blank:false, min: 0, max: 100
        }
    }

}

/**
 * Don't declare class with static field outside because it creates another table ObtainedMark
 */
//class ObtainedMark {
//    Student student
//    int obtainedMarks
//
//    static constraints = {
//        obtainedMarks nullable:false, blank:false, min: 0, max: 100
//    }
//}

