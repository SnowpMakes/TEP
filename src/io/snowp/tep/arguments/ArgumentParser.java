package io.snowp.tep.arguments;

import io.snowp.tep.TEP;

import java.util.HashMap;
import java.util.Map;

/**
 * The class parsing the arguments of the program
 *
 * @author Snowp
 */
public class ArgumentParser
{
    public static Map<Argument, String> parse(String[] args)
    {
        Map<Argument, String> returnMap = new HashMap<>();
        String[] parseArgs = args;

        if(args[0].startsWith("-")) parseArgs = parseDashes(args, returnMap);
        else parseArgs = args;

        if(parseArgs.length != 1)
        {
            TEP.getTep().getErrorReporter().report("Wrong number of arguments! Check the command syntax", true); // TODO: Add command syntax.
        }
        else returnMap.putIfAbsent(Argument.FILE, parseArgs[0]);

        return returnMap;
    }

    private static String[] parseDashes(String[] args, Map<Argument, String> map)
    {
        // TODO: Add dash parser, there are no dashes to parse at the moment as we only want to be able to read a file. The rest will come later.
        return args;
    }
}
