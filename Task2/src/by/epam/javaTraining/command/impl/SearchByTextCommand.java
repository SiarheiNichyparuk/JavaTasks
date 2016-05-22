package by.epam.javaTraining.command.impl;

import by.epam.javaTraining.bean.Note;
import by.epam.javaTraining.bean.Request;
import by.epam.javaTraining.bean.Response;
import by.epam.javaTraining.command.Command;
import by.epam.javaTraining.command.CommandException;
import by.epam.javaTraining.service.ServiceException;
import by.epam.javaTraining.service.ServiceFactory;
import by.epam.javaTraining.view.NoteBookConsoleView;

import java.util.List;

public class SearchByTextCommand implements Command {
    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        try{
        List<Note> listNote = ServiceFactory.getInstance().getNoteBookService().searchByText(request.getParameter1());
        if (listNote.size() > 0) {
            NoteBookConsoleView.print(listNote);
            response.setMessage("Note found");
            return response;
        }else{
            response.setMessage("Note did not find");
            return response;
        }
        }catch (ServiceException e){
            throw new CommandException("ServiceException",e);
        }
    }
}
