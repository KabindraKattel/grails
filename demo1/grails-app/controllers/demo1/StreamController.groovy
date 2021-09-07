package demo1

import grails.gorm.transactions.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_STUDENT')
class StreamController {
    static allowedMethods = [index:'GET', create: ['GET', 'POST'], read: ['GET'], pre_update: ['GET'], update: ['GET','POST'], pre_delete: ['GET'], delete: ['GET']]

    def index(){

    }

    def create(){
        if (request.method == "POST") {
            new Stream(params).save(flush:true, failOnError:true)
            render "Success"
        }
    }

    def read(){
        def records = Stream.list()
        [streamRecords:records]
    }

    def pre_update(){
        def records = Stream.list()
        [streamRecords:records]
    }

    @Transactional
    def update(){
        if (request.method == "GET") {
            def streamRecord = Stream.get(params.id)
            [streamRecord: streamRecord, id:params.id]
        }
        else {
            def streamRecord = Stream.get(Integer.parseInt(params.id))
            if (!streamRecord.name.equals(params.name)) {
                streamRecord.name = params.name
                streamRecord.save()
                render "Success"
            } else {
                render "Same value.. No need to update"
            }
        }
    }

    def pre_delete(){
        def records = Stream.list()
        [streamRecords:records]
    }

    @Transactional
    def delete(){
        def streamRecord = Stream.get(params.id.toInteger())
        streamRecord.delete(flush:true, failOnError:true)
//        streamRecord.delete(name:streamRecord.name)
        render "Success"
    }
}
