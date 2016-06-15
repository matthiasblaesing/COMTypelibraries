
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672DA-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672DA-0000-0000-C000-000000000046}")
public interface _OlkTextBox extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfffffe0c)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0xfffffe0c)
    Boolean getAutoSize();
            
    /**
     * <p>id(0xfffffe0c)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0xfffffe0c)
    void setAutoSize(Boolean param0);
            
    /**
     * <p>id(0xd9)</p>
     */
    @ComProperty(name = "AutoTab", dispId = 0xd9)
    Boolean getAutoTab();
            
    /**
     * <p>id(0xd9)</p>
     */
    @ComProperty(name = "AutoTab", dispId = 0xd9)
    void setAutoTab(Boolean param0);
            
    /**
     * <p>id(0xda)</p>
     */
    @ComProperty(name = "AutoWordSelect", dispId = 0xda)
    Boolean getAutoWordSelect();
            
    /**
     * <p>id(0xda)</p>
     */
    @ComProperty(name = "AutoWordSelect", dispId = 0xda)
    void setAutoWordSelect(Boolean param0);
            
    /**
     * <p>id(0xfffffe0b)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    Integer getBackColor();
            
    /**
     * <p>id(0xfffffe0b)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    void setBackColor(Integer param0);
            
    /**
     * <p>id(0xfffffe08)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0xfffffe08)
    OlBorderStyle getBorderStyle();
            
    /**
     * <p>id(0xfffffe08)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0xfffffe08)
    void setBorderStyle(OlBorderStyle param0);
            
    /**
     * <p>id(0xe1)</p>
     */
    @ComProperty(name = "DragBehavior", dispId = 0xe1)
    OlDragBehavior getDragBehavior();
            
    /**
     * <p>id(0xe1)</p>
     */
    @ComProperty(name = "DragBehavior", dispId = 0xe1)
    void setDragBehavior(OlDragBehavior param0);
            
    /**
     * <p>id(0xfffffdfe)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    Boolean getEnabled();
            
    /**
     * <p>id(0xfffffdfe)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xe0)</p>
     */
    @ComProperty(name = "EnterFieldBehavior", dispId = 0xe0)
    OlEnterFieldBehavior getEnterFieldBehavior();
            
    /**
     * <p>id(0xe0)</p>
     */
    @ComProperty(name = "EnterFieldBehavior", dispId = 0xe0)
    void setEnterFieldBehavior(OlEnterFieldBehavior param0);
            
    /**
     * <p>id(0xfffffde0)</p>
     */
    @ComProperty(name = "EnterKeyBehavior", dispId = 0xfffffde0)
    Boolean getEnterKeyBehavior();
            
    /**
     * <p>id(0xfffffde0)</p>
     */
    @ComProperty(name = "EnterKeyBehavior", dispId = 0xfffffde0)
    void setEnterKeyBehavior(Boolean param0);
            
    /**
     * <p>id(0xfffffe00)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    eu.doppel_helix.jna.tlb.stdole2.Font getFont();
            
    /**
     * <p>id(0xfffffdff)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    Integer getForeColor();
            
    /**
     * <p>id(0xfffffdff)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    void setForeColor(Integer param0);
            
    /**
     * <p>id(0xcf)</p>
     */
    @ComProperty(name = "HideSelection", dispId = 0xcf)
    Boolean getHideSelection();
            
    /**
     * <p>id(0xcf)</p>
     */
    @ComProperty(name = "HideSelection", dispId = 0xcf)
    void setHideSelection(Boolean param0);
            
    /**
     * <p>id(0x25c)</p>
     */
    @ComProperty(name = "IntegralHeight", dispId = 0x25c)
    Boolean getIntegralHeight();
            
    /**
     * <p>id(0x25c)</p>
     */
    @ComProperty(name = "IntegralHeight", dispId = 0x25c)
    void setIntegralHeight(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Locked", dispId = 0xa)
    Boolean getLocked();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Locked", dispId = 0xa)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0xfffffdeb)</p>
     */
    @ComProperty(name = "MaxLength", dispId = 0xfffffdeb)
    Integer getMaxLength();
            
    /**
     * <p>id(0xfffffdeb)</p>
     */
    @ComProperty(name = "MaxLength", dispId = 0xfffffdeb)
    void setMaxLength(Integer param0);
            
    /**
     * <p>id(0xfffffdf6)</p>
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    eu.doppel_helix.jna.tlb.stdole2.Picture getMouseIcon();
            
    /**
     * <p>id(0xfffffdf6)</p>
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    void setMouseIcon(eu.doppel_helix.jna.tlb.stdole2.Picture param0);
            
    /**
     * <p>id(0xfffffdf7)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    OlMousePointer getMousePointer();
            
    /**
     * <p>id(0xfffffdf7)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    void setMousePointer(OlMousePointer param0);
            
    /**
     * <p>id(0xfffffde7)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0xfffffde7)
    Boolean getMultiLine();
            
    /**
     * <p>id(0xfffffde7)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0xfffffde7)
    void setMultiLine(Boolean param0);
            
    /**
     * <p>id(0xfffffdea)</p>
     */
    @ComProperty(name = "PasswordChar", dispId = 0xfffffdea)
    String getPasswordChar();
            
    /**
     * <p>id(0xfffffdea)</p>
     */
    @ComProperty(name = "PasswordChar", dispId = 0xfffffdea)
    void setPasswordChar(String param0);
            
    /**
     * <p>id(0xfffffde9)</p>
     */
    @ComProperty(name = "Scrollbars", dispId = 0xfffffde9)
    OlScrollBars getScrollbars();
            
    /**
     * <p>id(0xfffffde9)</p>
     */
    @ComProperty(name = "Scrollbars", dispId = 0xfffffde9)
    void setScrollbars(OlScrollBars param0);
            
    /**
     * <p>id(0xdc)</p>
     */
    @ComProperty(name = "SelectionMargin", dispId = 0xdc)
    Boolean getSelectionMargin();
            
    /**
     * <p>id(0xdc)</p>
     */
    @ComProperty(name = "SelectionMargin", dispId = 0xdc)
    void setSelectionMargin(Boolean param0);
            
    /**
     * <p>id(0xfffffddf)</p>
     */
    @ComProperty(name = "TabKeyBehavior", dispId = 0xfffffddf)
    Boolean getTabKeyBehavior();
            
    /**
     * <p>id(0xfffffddf)</p>
     */
    @ComProperty(name = "TabKeyBehavior", dispId = 0xfffffddf)
    void setTabKeyBehavior(Boolean param0);
            
    /**
     * <p>id(0xfffffdfb)</p>
     */
    @ComProperty(name = "Text", dispId = 0xfffffdfb)
    String getText();
            
    /**
     * <p>id(0xfffffdfb)</p>
     */
    @ComProperty(name = "Text", dispId = 0xfffffdfb)
    void setText(String param0);
            
    /**
     * <p>id(0x2714)</p>
     */
    @ComProperty(name = "TextAlign", dispId = 0x2714)
    OlTextAlign getTextAlign();
            
    /**
     * <p>id(0x2714)</p>
     */
    @ComProperty(name = "TextAlign", dispId = 0x2714)
    void setTextAlign(OlTextAlign param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0xfffffde8)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0xfffffde8)
    Boolean getWordWrap();
            
    /**
     * <p>id(0xfffffde8)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0xfffffde8)
    void setWordWrap(Boolean param0);
            
    /**
     * <p>id(0xfffffddd)</p>
     */
    @ComProperty(name = "SelStart", dispId = 0xfffffddd)
    Integer getSelStart();
            
    /**
     * <p>id(0xfffffddd)</p>
     */
    @ComProperty(name = "SelStart", dispId = 0xfffffddd)
    void setSelStart(Integer param0);
            
    /**
     * <p>id(0xfffffddc)</p>
     */
    @ComProperty(name = "SelLength", dispId = 0xfffffddc)
    Integer getSelLength();
            
    /**
     * <p>id(0xfffffddc)</p>
     */
    @ComProperty(name = "SelLength", dispId = 0xfffffddc)
    void setSelLength(Integer param0);
            
    /**
     * <p>id(0xfffffdde)</p>
     */
    @ComProperty(name = "SelText", dispId = 0xfffffdde)
    String getSelText();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x15)
    void Cut();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x16)
    void Copy();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComMethod(name = "Paste", dispId = 0x18)
    void Paste();
            
    /**
     * <p>id(0xfffffdd6)</p>
     */
    @ComMethod(name = "Clear", dispId = 0xfffffdd6)
    void Clear();
            
    /**
     * <p>id(0xfc0c)</p>
     */
    @ComProperty(name = "EnableRichText", dispId = 0xfc0c)
    Boolean getEnableRichText();
            
    /**
     * <p>id(0xfc0c)</p>
     */
    @ComProperty(name = "EnableRichText", dispId = 0xfc0c)
    void setEnableRichText(Boolean param0);
            
    
}