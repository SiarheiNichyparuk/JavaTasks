package by.epam.javaTraining.command.impl;

import by.epam.javaTraining.bean.Request;
import by.epam.javaTraining.bean.Response;
import by.epam.javaTraining.command.Command;
import by.epam.javaTraining.command.CommandException;
import by.epam.javaTraining.service.ServiceException;
import by.epam.javaTraining.service.ServiceFactory;

public class CreateNoteBookCommand implements Command {
    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        try {
            ServiceFactory.getInstance().getNoteBookService().createNoteBook();
        } catch (ServiceException e) {
            throw new CommandException("ServiceException", e);
        }
        response.setMessage("Notebook created");
        return response;
    }
}
