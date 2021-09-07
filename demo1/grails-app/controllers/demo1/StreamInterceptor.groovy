package demo1


class StreamInterceptor {

    StreamInterceptor(){
        match(controllerName:"Stream")
    }

    boolean before() {
//        def streamOne = Stream.find("from Stream as stream where stream.name=:name",
//                [name: "Stream-01"])
//        streamOne.name = "Stream-Updated"
//        if (streamOne.isDirty('name')){
//            streamOne.two++
//        }
//        streamOne.save(flush:true, failOnError:true)
        return true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
