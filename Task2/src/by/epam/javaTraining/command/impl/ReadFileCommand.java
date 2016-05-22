package by.epam.javaTraining.command.impl;

import by.epam.javaTraining.command.CommandException;
import by.epam.javaTraining.service.ServiceException;
import by.epam.javaTraining.bean.Request;
import by.epam.javaTraining.bean.Response;
import by.epam.javaTraining.command.Command;
import by.epam.javaTraining.service.ServiceFactory;



public class ReadFileCommand implements Command {

    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        try {
            ServiceFactory.getInstance().getNoteBookService().readFile(request.getParameter1());
            response.setMessage("File was read");
            return response;
        } catch (ServiceException e) {
            throw new CommandException("File was not read",e);
        }

    }
}

