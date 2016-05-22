package by.epam.javaTraining.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import by.epam.javaTraining.bean.Request;
import by.epam.javaTraining.bean.Response;
import by.epam.javaTraining.command.Command;
import by.epam.javaTraining.command.CommandException;

public class Controller {
    private final static Logger LOG = LogManager.getLogger(Controller.class.getName());
    private final static Logger LOG1 = LogManager.getLogger("MyLogger");
    private final CommandHelper helper = new CommandHelper();

    public Controller() {
    }


    public Response doAction(Request request) {
        String commandName = request.getCommandName();
        Command command;
        Response response;
        try {
            command = helper.getCommand(commandName);
            response = command.execute(request);
            LOG.info(request.getCommandName() + "   is OK");
            LOG1.info(request.getCommandName() + "   is OK");
        } catch (CommandException e) {
            LOG.error("CommandException in Controller",e);
            LOG1.error("CommandException in Controller", e);
            Response responseHelp = new Response();
            responseHelp.setErrorMessage("Invalid command");
            return responseHelp;
        }
        return response;

    }
}
