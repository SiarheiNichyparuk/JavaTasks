package by.epam.javaTraining.command;

import by.epam.javaTraining.bean.Request;
import by.epam.javaTraining.bean.Response;
import by.epam.javaTraining.service.ServiceException;

public interface Command {
    Response execute(Request request) throws CommandException;
}
