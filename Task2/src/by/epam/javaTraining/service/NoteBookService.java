package by.epam.javaTraining.service;

import by.epam.javaTraining.bean.Note;


import java.util.Date;
import java.util.List;

public interface NoteBookService {
    void addNote(String text, Date date)throws ServiceException;
    void createNoteBook()throws ServiceException;
    List<Note> getNoteBook()throws ServiceException;
    void readFile(String path) throws ServiceException;
    List<Note> searchByText(String text)throws ServiceException;
    List<Note> searchByDate(Date date)throws ServiceException;
    void writeFile(String path) throws ServiceException;
}
