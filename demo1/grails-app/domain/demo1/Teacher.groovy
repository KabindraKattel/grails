package demo1

class Teacher {
    String user_name
    String name
    int xpYears

    static belongsTo = [Subject]
    static hasMany = [subjects: Subject]

    static constraints = {
        user_name nullable: false, blank: false, unique: true
    }
}
