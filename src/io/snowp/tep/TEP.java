package io.snowp.tep;

import io.snowp.tep.errors.ErrorReporter;
import io.snowp.tep.ui.SimpleUIElement;
import io.snowp.tep.ui.TEPUI;

import java.io.PrintStream;

/**
 * The main TEP class. Will actually run the program.
 *
 * @author Snowp
 */
public class TEP
{
    private static TEP me = null;
    public static final String version = "0.1.1";

    private boolean exit = false;
    private boolean running = false;

    private TEPUI ui;
    private ErrorReporter errorReporter;

    public TEP()
    {
        if(me == null) me = this;
        ui = new TEPUI();
        errorReporter = new ErrorReporter();
    }

    private void startup()
    {
        this.ui.addElement(new SimpleUIElement(0, (PrintStream printStream) -> {
            printStream.print("Content will go here");
        }));
        this.ui.addElement(new SimpleUIElement(1, (PrintStream printStream) -> {
            printStream.print("Press ctrl+C to exit.");
        }));
    }

    /**
     * The function called by {@link io.snowp.tep.launch.TEPLaunch} to start TEP.
     */
    public void run()
    {
        this.running = true;
        this.startup();
        this.ui.repaint(); // TODO: Remove this function call when loop is implemented.
        while (!this.exit)
        {
            this.loop();
        }
        running = false;
    }

    private void loop()
    {
        // TODO: Create loop code. As the commit you are looking at at the moment only is for the creation of the rendering system, this function will actually be coded later on.
    }

    public void exit()
    {
        this.exit = true;
        while(this.running)
        {
            try
            {
                Thread.sleep(20);
            } catch (InterruptedException e) {}
        }
    }

    public ErrorReporter getErrorReporter() { return this.errorReporter; }
    public boolean getRunning() { return this.running; }

    public static TEP getTep() { return me; }
}
