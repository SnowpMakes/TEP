package io.snowp.tep.ui;

import java.io.PrintStream;

/**
 * A basic implementation of {@link UIElement}
 *
 * @see io.snowp.tep.ui.UIElement
 * @author Snowp
 */
public class SimpleUIElement implements UIElement
{
    private UILocation location;
    private Renderable renderFunction;

    public SimpleUIElement(int distFromTop, Renderable render)
    {
        location = new UILocation(distFromTop);
        this.renderFunction = render;
    }

    @Override
    public UILocation getLocation()
    {
        return this.location;
    }

    @Override
    public void render(PrintStream printStream)
    {
        this.renderFunction.render(printStream);
    }

    @Override
    public boolean equals(Object obj)
    {
        UIElement uiElement = null;
        UILocation uiLocation = null;
        try
        {
            uiElement = (UIElement) obj;
            uiLocation = uiElement.getLocation();
        } catch (ClassCastException e)
        {
            return false;
        }
        if(uiElement != null && uiLocation != null)
        {
            if(this.location.equals(uiLocation))
            {
                return true;
            }
        }
        return false;
    }
}
