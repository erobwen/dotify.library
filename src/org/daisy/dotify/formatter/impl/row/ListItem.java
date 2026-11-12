package org.daisy.dotify.formatter.impl.row;

import org.daisy.dotify.api.formatter.FormattingTypes;

/**
 * Provides a list item. List items are immutable.
 *
 * @author Joel Håkansson
 */
public final class ListItem {
    private final String label;
    private final FormattingTypes.ListStyle type;
    private final int labelIndent;

    /**
     * Creates a list item.
     *
     * @param label the resolved list item label, typically a number or a bullet
     * @param type  the type of list
     */
    public ListItem(String label, FormattingTypes.ListStyle type) {
        this(label, type, 0);
    }

    /**
     * Creates a list item.
     *
     * @param label       the resolved list item label, typically a number or a bullet
     * @param type        the type of list
     * @param labelIndent the column the label is placed at: the accumulated block-indent of the list, i.e. the
     *                    indent of the list's own content
     */
    public ListItem(String label, FormattingTypes.ListStyle type, int labelIndent) {
        this.label = label;
        this.type = type;
        this.labelIndent = labelIndent;
    }

    /**
     * Gets the column the label is placed at.
     *
     * @return the label indent
     */
    public int getLabelIndent() {
        return labelIndent;
    }

    /**
     * Gets the resolved list item label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Gets the type of list.
     *
     * @return the type of list
     */
    public FormattingTypes.ListStyle getType() {
        return type;
    }

}
