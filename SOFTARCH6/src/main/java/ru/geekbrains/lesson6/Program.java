package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.database.NotesDatabase;
import ru.geekbrains.lesson6.notes.core.application.ConcreteNoteEditor;
import ru.geekbrains.lesson6.notes.core.domain.Note;
import ru.geekbrains.lesson6.notes.infrastructure.persistance.NotesDbContext;
import ru.geekbrains.lesson6.notes.presentation.queries.controllers.NotesController;
import ru.geekbrains.lesson6.notes.presentation.queries.views.NotesConsolePresenter;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        // данные для проверки
        Note note1 = new Note(1, 1, "1", "1", new Date());
        Note note2 = new Note(2, 2, "2", "2", new Date());
        Note note3 = new Note(3, 3, "3", "3", new Date());
        Note note4 = new Note(4, 4, "4", "4", new Date());
        Note note5 = new Note(5, 5, "5", "5", new Date());

        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        // добавляем заметки
        controller.routeAddNote(note1);
        controller.routeAddNote(note2);
        controller.routeAddNote(note3);
        controller.routeAddNote(note4);
        controller.routeAddNote(note5);

        // проверяем доабвление
        controller.routeGetAll();

        // удаляем заметку
        controller.routeRemoveNote(note3);

        // проверяем удаление
        controller.routeGetAll();
    }
}