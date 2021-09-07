package demo1


class Student {
    String user_name
    String name
    Date dob
    Address address
    Stream stream

    static embedded = ['address']

    static constraints = {
        user_name nullable: false, blank: false, unique: true
    }
}

class Address {
    String primary
    String secondary
}
