package by.epam.javaTraining.dao;

import by.epam.javaTraining.bean.NoteBook;

public interface DaoNotebook {
    NoteBook readFile(String path) throws  DaoException;
    void writeFile(String path) throws  DaoException;
}
