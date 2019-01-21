package io.snowp.tep.ui;

import java.io.PrintStream;
import java.util.*;

/**
 * The class rendering the screen and it's components, also known as {@link UIElement}s.
 *
 * @see UIElement
 * @see SimpleUIElement
 *
 * @author Snowp
 */
public class TEPUI
{
    private ArrayList<UIElement> uiElements = new ArrayList<>();
    private PrintStream printStream = new PrintStream(System.out, false);

    public TEPUI()
    {
    }

    /**
     * Remove all elements to be drawn and clear the screen.
     * Basically resets this {@link TEPUI} instance to a brand new one.
     */
    public void deleteAll()
    {
        uiElements.clear();
        repaint();
    }

    /**
     * Function called everytime when the screen needs to be repainted.
     */
    public void repaint()
    {
        this.printStream.print("\033[H\033[2J");

        Iterator<UIElement> iterator = this.uiElements.iterator();
        UIElement next;
        int num = 0;
        while(iterator.hasNext())
        {
            next = iterator.next();
            next.render(this.printStream);
            if(num < this.uiElements.size() - 1) this.printStream.println();
            num++;
        }

        this.printStream.flush();
    }

    /**
     * Function called to add an element to be drawn when {@link #repaint()} is called.
     *
     * @param element The element to add.
     */
    public void addElement(UIElement element)
    {
        this.uiElements.add(element.getLocation().getDistanceFromTop(), element);
    }
}
