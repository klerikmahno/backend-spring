package ru.mybackend.suitespring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    var count: Long = 1

    @GetMapping("/add")
    fun getNumber(@RequestParam a: Int, @RequestParam b: Int): Int {
        return a + b
    }

    @GetMapping("/new_note")
    fun createNote(@RequestParam name: String, @RequestParam note: String): NoteDTO {
        var newNote = NoteDTO(count, name, note, System.currentTimeMillis())
        count = +1
        return newNote
    }

    @GetMapping("/notes")
    fun getNotes(): List<NoteDTO> {
        return listOf(
            NoteDTO(1, "Привет1", "Привет мир", System.currentTimeMillis()),
            NoteDTO(2, "Привет2", "Привет я", System.currentTimeMillis()),
            NoteDTO(3, "Привет3", "Привет моя страна", System.currentTimeMillis()),
        )
    }
}
