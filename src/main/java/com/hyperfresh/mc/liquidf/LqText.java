package com.hyperfresh.mc.liquidf;

import com.hyperfresh.mc.liquidf.enums.*;

/**
 * @author octopod
 */
public class LqText extends LqRawText
{
    /**
     * The text mode which tells you how the text will be used.
     */
    final LqTextMode mode;

    /**
     * The click event of this text.
     */
    final LqClickEvent click;

    /**
     * The hover event of this text.
     */
    final LqHoverEvent hover;

    /**
     * The amount of space, in pixels, that this text will take.
     * If set to -1, there will be no margins.
     */
    final int margins;

    public LqText(String text)
    {
        super(text, LqColor.WHITE, LqFormat.NO_FORMATS);
        this.mode = LqTextMode.TEXT;
        this.click = null;
        this.hover = null;
        this.margins = -1;
    }
}
