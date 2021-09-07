package demo1

class Teacher {
    String name
    int xpYears

    static belongsTo = [Subject]
    static hasMany = [subjects: Subject]
    static constraints = {
    }
}
