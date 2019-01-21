package io.snowp.tep.ui;

import java.io.PrintStream;

/**
 * The functional interface containing the {@link #render(PrintStream)} function.
 * Is extended or implemented by everything that can be rendered on the screen.
 *
 * @author Snowp
 */
@FunctionalInterface
public interface Renderable
{
    void render(PrintStream printStream);
}
