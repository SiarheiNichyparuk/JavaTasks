package by.epam.javaTraining.service;

import by.epam.javaTraining.service.impl.NoteBookServiceImpl;

public class ServiceFactory {
    private static ServiceFactory factory = new ServiceFactory();

    private final NoteBookService noteBookService = new NoteBookServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return factory;
    }

    public NoteBookService getNoteBookService(){
        return noteBookService;
    }
}
