function showStreamSubjectsView() {
    const streamSubjects = document.getElementById('streamSubjects');
    const teachers = document.getElementById('teachers');
    if (teachers.style.display === "block") {
        teachers.style.display = "none";
    }
    if (streamSubjects.style.display === "none") {
        streamSubjects.style.display = "block";
    }
}

function showTeachersView() {
    const streamSubjects = document.getElementById('streamSubjects');
    const teachers = document.getElementById('teachers');
    console.log(teachers.style.display+streamSubjects.style.display)
    if (streamSubjects.style.display === "block") {
        streamSubjects.style.display = "none";
    }
    if (teachers.style.display === "none") {
        teachers.style.display = "block";
    }
}