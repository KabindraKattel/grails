package demo1

class SimpleTagLib {
//    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
    static namespace = "custom"

    def emoticon = { attrs, body ->
            out << body() << (attrs.happy == 'true' ? ':-)' : ':-(')
    }

    def note = { attrs->
        out <<'<h3>Note:'+attrs.message+'</h3>'
    }

    def fillSharedDiv = { attrs->
        out <<render(template:attrs.template, model: attrs.model)
    }
}
