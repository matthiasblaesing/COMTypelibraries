
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672EF-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672EF-0000-0000-C000-000000000046}")
public interface _OlkTimeControl extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfffffe0a)</p>
     */
    @ComProperty(name = "BackStyle", dispId = 0xfffffe0a)
    OlBackStyle getBackStyle();
            
    /**
     * <p>id(0xfffffe0a)</p>
     */
    @ComProperty(name = "BackStyle", dispId = 0xfffffe0a)
    void setBackStyle(OlBackStyle param0);
            
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
     * <p>id(0xfbd4)</p>
     */
    @ComProperty(name = "ReferenceTime", dispId = 0xfbd4)
    java.util.Date getReferenceTime();
            
    /**
     * <p>id(0xfbd4)</p>
     */
    @ComProperty(name = "ReferenceTime", dispId = 0xfbd4)
    void setReferenceTime(java.util.Date param0);
            
    /**
     * <p>id(0xfbd5)</p>
     */
    @ComProperty(name = "Style", dispId = 0xfbd5)
    OlTimeStyle getStyle();
            
    /**
     * <p>id(0xfbd5)</p>
     */
    @ComProperty(name = "Style", dispId = 0xfbd5)
    void setStyle(OlTimeStyle param0);
            
    /**
     * <p>id(0xfbd2)</p>
     */
    @ComProperty(name = "Time", dispId = 0xfbd2)
    java.util.Date getTime();
            
    /**
     * <p>id(0xfbd2)</p>
     */
    @ComProperty(name = "Time", dispId = 0xfbd2)
    void setTime(java.util.Date param0);
            
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
     * <p>id(0xfbdb)</p>
     */
    @ComProperty(name = "IntervalTime", dispId = 0xfbdb)
    java.util.Date getIntervalTime();
            
    /**
     * <p>id(0xfbdb)</p>
     */
    @ComProperty(name = "IntervalTime", dispId = 0xfbdb)
    void setIntervalTime(java.util.Date param0);
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComMethod(name = "DropDown", dispId = 0x3e9)
    void DropDown();
            
    
}