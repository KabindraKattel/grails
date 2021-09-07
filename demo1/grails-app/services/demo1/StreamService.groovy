package demo1

import grails.events.annotation.Subscriber
import grails.gorm.services.Service
import org.hibernate.event.spi.PostUpdateEvent

@Service(Stream)
interface StreamService {

    Stream get(Serializable id)

    List<Stream> list(Map args)

    Long count()

    void delete(Serializable id)

    Stream save(Stream stream)

}