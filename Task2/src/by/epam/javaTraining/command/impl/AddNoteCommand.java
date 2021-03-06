package by.epam.javaTraining.command.impl;

import by.epam.javaTraining.command.CommandException;
import by.epam.javaTraining.bean.Request;
import by.epam.javaTraining.bean.Response;
import by.epam.javaTraining.command.Command;
import by.epam.javaTraining.service.NoteBookService;
import by.epam.javaTraining.service.ServiceException;
import by.epam.javaTraining.service.ServiceFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddNoteCommand implements Command {
    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();

        Date date = new Date();
        if (request.getParameter2() != null) {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = format.parse(request.getParameter2());
            } catch (ParseException e) {
                throw new CommandException("Date is wrong",e);
            }
        }
        NoteBookService service = ServiceFactory.getInstance().getNoteBookService();
        try {
            service.addNote(request.getParameter1(), date);
        }catch (ServiceException e){
            throw new CommandException("ServiceException",e);
        }
        response.setMessage("Note added");
        return response;
    }
}
