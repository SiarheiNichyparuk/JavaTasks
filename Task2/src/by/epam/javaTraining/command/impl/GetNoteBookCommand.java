package by.epam.javaTraining.command.impl;

import by.epam.javaTraining.bean.Request;
import by.epam.javaTraining.bean.Response;
import by.epam.javaTraining.command.Command;
import by.epam.javaTraining.command.CommandException;
import by.epam.javaTraining.service.ServiceException;
import by.epam.javaTraining.service.ServiceFactory;
import by.epam.javaTraining.view.NoteBookConsoleView;

public class GetNoteBookCommand implements Command {
    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        try {
            NoteBookConsoleView.print(ServiceFactory.getInstance().getNoteBookService().getNoteBook());
        }catch (ServiceException e){
            throw new CommandException("ServiceException",e);
        }
        response.setMessage("NoteBook is shown on console");
        return response;
    }
}
