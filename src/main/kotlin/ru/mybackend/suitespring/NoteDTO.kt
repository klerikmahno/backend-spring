package ru.mybackend.suitespring

data class NoteDTO(

    var id: Long,
    var name: String,
    var note: String,
    var data: Long,
    var ownerId: Int
)
