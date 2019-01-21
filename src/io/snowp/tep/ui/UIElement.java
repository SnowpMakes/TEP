package io.snowp.tep.ui;

/**
 * The interface representing a {@link Renderable} element.
 *
 * @see io.snowp.tep.ui.Renderable
 * @see TEPUI
 * @author Snowp
 */
public interface UIElement extends Renderable
{
    /**
     * Function returning the preferred location of this element.
     *
     * @// TODO: 2019-01-21 Add better location system.
     * @return The (preferred) location of this element.
     */
    public UILocation getLocation();
}
