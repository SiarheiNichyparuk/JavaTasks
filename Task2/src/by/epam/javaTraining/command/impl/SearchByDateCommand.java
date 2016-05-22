package by.epam.javaTraining.command.impl;

import by.epam.javaTraining.command.CommandException;
import by.epam.javaTraining.bean.Note;
import by.epam.javaTraining.bean.Request;
import by.epam.javaTraining.bean.Response;
import by.epam.javaTraining.command.Command;
import by.epam.javaTraining.service.ServiceException;
import by.epam.javaTraining.service.ServiceFactory;
import by.epam.javaTraining.view.NoteBookConsoleView;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class SearchByDateCommand implements Command {
    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        List<Note> listNote;
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            listNote = ServiceFactory.getInstance().getNoteBookService().searchByDate(format.parse(request.getParameter1()));
        } catch (ParseException e) {
            throw new CommandException("Date is wrong",e);
        }catch (ServiceException e){
            throw new CommandException("ServiceException",e);
        }
        if (listNote.size() > 0) {
            NoteBookConsoleView.print(listNote);
            response.setMessage("Note found");
            return response;
        }else{
            response.setMessage("Note did not find");
            return response;
        }
    }
}
