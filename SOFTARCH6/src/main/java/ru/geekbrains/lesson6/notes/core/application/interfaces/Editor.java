package ru.geekbrains.lesson6.notes.core.application.interfaces;

import ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.Collection;
import java.util.Optional;

public interface Editor<T, TId> {

    void add(T item);

    void edit(T item);

    void remove(T item);

    T getById(TId id);

    Collection<T> getAll();
}