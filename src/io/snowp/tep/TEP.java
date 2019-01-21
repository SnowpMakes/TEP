package io.snowp.tep;

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
    public static final String version = "0.1.1";

    boolean exit = false;

    TEPUI ui;

    public TEP()
    {
        ui = new TEPUI();
    }

    private void startup()
    {
        this.ui.addElement(new SimpleUIElement(0, (PrintStream printStream) -> {
            printStream.print("Content will go here");
        }));
        this.ui.addElement(new SimpleUIElement(0, (PrintStream printStream) -> {
            printStream.print("Press ctrl+C to exit.");
        }));
    }

    /**
     * The function called by {@link io.snowp.tep.launch.TEPLaunch} to start TEP.
     */
    public void run()
    {
        this.startup();
        while (!this.exit)
        {
            this.loop();
        }
    }

    private void loop()
    {
        // TODO: Create loop code. As the commit you are looking at at the moment only is for the creation of the rendering system, this function will actually be coded later on.
    }
}
