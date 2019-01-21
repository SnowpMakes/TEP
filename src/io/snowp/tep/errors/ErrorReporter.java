package io.snowp.tep.errors;

import io.snowp.tep.TEP;

/**
 * The class used to report errors created by the user and by the program.
 * Can print fatal and non-fatal errors.
 *
 * @author Snowp
 */
public class ErrorReporter
{
    public void report(String error)
    {
        this.report(error, false);
    }

    public void report(String error, boolean fatal)
    {
        this.report(new Throwable(error), fatal);
    }

    public void report(Throwable t)
    {
        this.report(t, false);
    }

    public void report(Throwable t, boolean fatal)
    {
        if(fatal)
        {
            if(TEP.getTep().getRunning())
            {
                TEP.getTep().exit();
            }
            System.err.println("\nA fatal error occurred:\n" + t.toString());
        }
        else
        {
            // TODO: If it is not a fatal error, then it will be shown in one of the UIElements. Will be implemented later.
        }
    }
}
