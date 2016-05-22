package by.epam.javaTraining.command.impl;

import by.epam.javaTraining.command.CommandException;
import by.epam.javaTraining.service.ServiceException;
import by.epam.javaTraining.bean.Request;
import by.epam.javaTraining.bean.Response;
import by.epam.javaTraining.command.Command;
import by.epam.javaTraining.service.ServiceFactory;



public class WriteFileCommand implements Command {

    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        try {
            ServiceFactory.getInstance().getNoteBookService().writeFile(request.getParameter1());
            response.setMessage("File was written");
            return response;
        } catch (ServiceException e) {
            throw new CommandException("File was not found",e);
        }
    }
}
