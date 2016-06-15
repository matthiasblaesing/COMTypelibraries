
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672DF-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672DF-0000-0000-C000-000000000046}")
public interface _OlkListBox extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1f8)</p>
     */
    @ComProperty(name = "MatchEntry", dispId = 0x1f8)
    OlMatchEntry getMatchEntry();
            
    /**
     * <p>id(0x1f8)</p>
     */
    @ComProperty(name = "MatchEntry", dispId = 0x1f8)
    void setMatchEntry(OlMatchEntry param0);
            
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
     * <p>id(0xfffffdec)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0xfffffdec)
    OlMultiSelect getMultiSelect();
            
    /**
     * <p>id(0xfffffdec)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0xfffffdec)
    void setMultiSelect(OlMultiSelect param0);
            
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
     * <p>id(0x263)</p>
     */
    @ComProperty(name = "TopIndex", dispId = 0x263)
    Integer getTopIndex();
            
    /**
     * <p>id(0x263)</p>
     */
    @ComProperty(name = "TopIndex", dispId = 0x263)
    void setTopIndex(Integer param0);
            
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
     * <p>id(0xfffffdf2)</p>
     */
    @ComProperty(name = "ListIndex", dispId = 0xfffffdf2)
    Integer getListIndex();
            
    /**
     * <p>id(0xfffffdf2)</p>
     */
    @ComProperty(name = "ListIndex", dispId = 0xfffffdf2)
    void setListIndex(Integer param0);
            
    /**
     * <p>id(0xfffffded)</p>
     */
    @ComProperty(name = "ListCount", dispId = 0xfffffded)
    Integer getListCount();
            
    /**
     * <p>id(0x2109)</p>
     */
    @ComMethod(name = "GetItem", dispId = 0x2109)
    String GetItem(Integer Index);
            
    /**
     * <p>id(0xfbde)</p>
     */
    @ComMethod(name = "SetItem", dispId = 0xfbde)
    void SetItem(Integer Index,
            String Item);
            
    /**
     * <p>id(0xfbdf)</p>
     */
    @ComMethod(name = "GetSelected", dispId = 0xfbdf)
    Boolean GetSelected(Integer Index);
            
    /**
     * <p>id(0xfbe0)</p>
     */
    @ComMethod(name = "SetSelected", dispId = 0xfbe0)
    void SetSelected(Integer Index,
            Boolean Selected);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x16)
    void Copy();
            
    /**
     * <p>id(0xfffffdd6)</p>
     */
    @ComMethod(name = "Clear", dispId = 0xfffffdd6)
    void Clear();
            
    /**
     * <p>id(0xfffffdd7)</p>
     */
    @ComMethod(name = "AddItem", dispId = 0xfffffdd7)
    void AddItem(String ItemText,
            Object Index);
            
    /**
     * <p>id(0xfffffdd5)</p>
     */
    @ComMethod(name = "RemoveItem", dispId = 0xfffffdd5)
    void RemoveItem(Integer Index);
            
    
}