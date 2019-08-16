
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0xfffffe0c)
    Boolean getAutoSize();
            
    /**
     * <p>id(0xfffffe0c)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoSize", dispId = 0xfffffe0c)
    void setAutoSize(Boolean param0);
            
    /**
     * <p>id(0xd9)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "AutoTab", dispId = 0xd9)
    Boolean getAutoTab();
            
    /**
     * <p>id(0xd9)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoTab", dispId = 0xd9)
    void setAutoTab(Boolean param0);
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "AutoWordSelect", dispId = 0xda)
    Boolean getAutoWordSelect();
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoWordSelect", dispId = 0xda)
    void setAutoWordSelect(Boolean param0);
            
    /**
     * <p>id(0xfffffe0b)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    Integer getBackColor();
            
    /**
     * <p>id(0xfffffe0b)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    void setBackColor(Integer param0);
            
    /**
     * <p>id(0xfffffe08)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0xfffffe08)
    OlBorderStyle getBorderStyle();
            
    /**
     * <p>id(0xfffffe08)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code OlBorderStyle}
     */
    @ComProperty(name = "BorderStyle", dispId = 0xfffffe08)
    void setBorderStyle(OlBorderStyle param0);
            
    /**
     * <p>id(0xe1)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "DragBehavior", dispId = 0xe1)
    OlDragBehavior getDragBehavior();
            
    /**
     * <p>id(0xe1)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code OlDragBehavior}
     */
    @ComProperty(name = "DragBehavior", dispId = 0xe1)
    void setDragBehavior(OlDragBehavior param0);
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    Boolean getEnabled();
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "EnterFieldBehavior", dispId = 0xe0)
    OlEnterFieldBehavior getEnterFieldBehavior();
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code OlEnterFieldBehavior}
     */
    @ComProperty(name = "EnterFieldBehavior", dispId = 0xe0)
    void setEnterFieldBehavior(OlEnterFieldBehavior param0);
            
    /**
     * <p>id(0xfffffde0)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "EnterKeyBehavior", dispId = 0xfffffde0)
    Boolean getEnterKeyBehavior();
            
    /**
     * <p>id(0xfffffde0)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnterKeyBehavior", dispId = 0xfffffde0)
    void setEnterKeyBehavior(Boolean param0);
            
    /**
     * <p>id(0xfffffe00)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    eu.doppel_helix.jna.tlb.stdole2.Font getFont();
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    Integer getForeColor();
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    void setForeColor(Integer param0);
            
    /**
     * <p>id(0xcf)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "HideSelection", dispId = 0xcf)
    Boolean getHideSelection();
            
    /**
     * <p>id(0xcf)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HideSelection", dispId = 0xcf)
    void setHideSelection(Boolean param0);
            
    /**
     * <p>id(0x25c)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "IntegralHeight", dispId = 0x25c)
    Boolean getIntegralHeight();
            
    /**
     * <p>id(0x25c)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IntegralHeight", dispId = 0x25c)
    void setIntegralHeight(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Locked", dispId = 0xa)
    Boolean getLocked();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0xa)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0xfffffdeb)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "MaxLength", dispId = 0xfffffdeb)
    Integer getMaxLength();
            
    /**
     * <p>id(0xfffffdeb)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MaxLength", dispId = 0xfffffdeb)
    void setMaxLength(Integer param0);
            
    /**
     * <p>id(0xfffffdf6)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    eu.doppel_helix.jna.tlb.stdole2.Picture getMouseIcon();
            
    /**
     * <p>id(0xfffffdf6)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.stdole2.Picture}
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    void setMouseIcon(eu.doppel_helix.jna.tlb.stdole2.Picture param0);
            
    /**
     * <p>id(0xfffffdf7)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    OlMousePointer getMousePointer();
            
    /**
     * <p>id(0xfffffdf7)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code OlMousePointer}
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    void setMousePointer(OlMousePointer param0);
            
    /**
     * <p>id(0xfffffde7)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0xfffffde7)
    Boolean getMultiLine();
            
    /**
     * <p>id(0xfffffde7)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MultiLine", dispId = 0xfffffde7)
    void setMultiLine(Boolean param0);
            
    /**
     * <p>id(0xfffffdea)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "PasswordChar", dispId = 0xfffffdea)
    String getPasswordChar();
            
    /**
     * <p>id(0xfffffdea)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PasswordChar", dispId = 0xfffffdea)
    void setPasswordChar(String param0);
            
    /**
     * <p>id(0xfffffde9)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Scrollbars", dispId = 0xfffffde9)
    OlScrollBars getScrollbars();
            
    /**
     * <p>id(0xfffffde9)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code OlScrollBars}
     */
    @ComProperty(name = "Scrollbars", dispId = 0xfffffde9)
    void setScrollbars(OlScrollBars param0);
            
    /**
     * <p>id(0xdc)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "SelectionMargin", dispId = 0xdc)
    Boolean getSelectionMargin();
            
    /**
     * <p>id(0xdc)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SelectionMargin", dispId = 0xdc)
    void setSelectionMargin(Boolean param0);
            
    /**
     * <p>id(0xfffffddf)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "TabKeyBehavior", dispId = 0xfffffddf)
    Boolean getTabKeyBehavior();
            
    /**
     * <p>id(0xfffffddf)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TabKeyBehavior", dispId = 0xfffffddf)
    void setTabKeyBehavior(Boolean param0);
            
    /**
     * <p>id(0xfffffdfb)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "Text", dispId = 0xfffffdfb)
    String getText();
            
    /**
     * <p>id(0xfffffdfb)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0xfffffdfb)
    void setText(String param0);
            
    /**
     * <p>id(0x2714)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "TextAlign", dispId = 0x2714)
    OlTextAlign getTextAlign();
            
    /**
     * <p>id(0x2714)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code OlTextAlign}
     */
    @ComProperty(name = "TextAlign", dispId = 0x2714)
    void setTextAlign(OlTextAlign param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0xfffffde8)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0xfffffde8)
    Boolean getWordWrap();
            
    /**
     * <p>id(0xfffffde8)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WordWrap", dispId = 0xfffffde8)
    void setWordWrap(Boolean param0);
            
    /**
     * <p>id(0xfffffddd)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "SelStart", dispId = 0xfffffddd)
    Integer getSelStart();
            
    /**
     * <p>id(0xfffffddd)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SelStart", dispId = 0xfffffddd)
    void setSelStart(Integer param0);
            
    /**
     * <p>id(0xfffffddc)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "SelLength", dispId = 0xfffffddc)
    Integer getSelLength();
            
    /**
     * <p>id(0xfffffddc)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SelLength", dispId = 0xfffffddc)
    void setSelLength(Integer param0);
            
    /**
     * <p>id(0xfffffdde)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "SelText", dispId = 0xfffffdde)
    String getSelText();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x15)
    void Cut();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x16)
    void Copy();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(65)</p>
     */
    @ComMethod(name = "Paste", dispId = 0x18)
    void Paste();
            
    /**
     * <p>id(0xfffffdd6)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "Clear", dispId = 0xfffffdd6)
    void Clear();
            
    /**
     * <p>id(0xfc0c)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "EnableRichText", dispId = 0xfc0c)
    Boolean getEnableRichText();
            
    /**
     * <p>id(0xfc0c)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableRichText", dispId = 0xfc0c)
    void setEnableRichText(Boolean param0);
            
    
}