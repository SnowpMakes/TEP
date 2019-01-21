package io.snowp.tep.ui;

/**
 * A class containing the location of a {@link UIElement}.
 *
 * At this moment only contains a number of the element index it prefers to be in.
 *
 * @see UIElement
 * @author Snowp
 */
public class UILocation
{
    int distFromTop = 0;

    public UILocation(int distFromTop)
    {
        this.distFromTop = distFromTop;
    }

    /**
     * @return the {@code int} representing the preferred index of the holding {@link UIElement} counted from the top.
     */
    public int getDistanceFromTop()
    {
        return this.distFromTop;
    }

    @Override
    public boolean equals(Object obj)
    {
        UILocation uiLocation = null;
        try
        {
            uiLocation = (UILocation) obj;
        } catch (ClassCastException e)
        {
            return false;
        }
        if(uiLocation != null)
        {
            if(this.getDistanceFromTop() == uiLocation.getDistanceFromTop()) return true;
        }
        return false;
    }
}
