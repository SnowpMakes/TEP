package io.snowp.tep.launch;

import io.snowp.tep.TEP;

/**
 * The class holding the {@code public static void main(String[] args)} function
 * and starting an {@link io.snowp.tep.TEP} instance.
 *
 * @author Snowp
 */
public class TEPLaunch
{
    public static void main(String[] args)
    {
        System.out.println("TEP " + TEP.version + ". Created by Snowp.");

        // TODO: Implement later:
        //ArgumentParser.parse(args);

        TEP mainTep = new TEP();
        try
        {
            mainTep.run();
        } catch (Throwable e)
        {
            mainTep.getErrorReporter().report("", true);
        }
    }
}
