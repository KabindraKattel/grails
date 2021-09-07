package demo1


class SubjectInterceptor {

    SubjectInterceptor(){
        match(controllerName:"Subject")
    }
    boolean before() {
        def allResult = Subject.findAll("from Subject as sub where sub.name=:name",
                [name: "Subject-01"])

        def oneResult = Subject.find("from Subject as sub where sub.name=:name",
                [name: "Subject-01"])
        println("SUBJECT-01-ALL ${allResult}")
        println("SUBJECT-01-ONE ${oneResult}")

        if (oneResult !=null) {
            oneResult.name = "Subject-Updated"
            oneResult.save(flush: true, failOnError: true)
        }


//        def one2Result = Subject.find("from Subject as sub where sub.name=:name",
//                [name: "Subject-02"])
//        one2Result.delete(flush:true)
        return true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
