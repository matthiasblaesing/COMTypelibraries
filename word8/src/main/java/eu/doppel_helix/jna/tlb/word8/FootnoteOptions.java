
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({BEA85A24-D7DA-4F3D-B58C-ED90FB01D615})</p>
 */
@ComInterface(iid="{BEA85A24-D7DA-4F3D-B58C-ED90FB01D615}")
public interface FootnoteOptions extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Location", dispId = 0x64)
    WdFootnoteLocation getLocation();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code WdFootnoteLocation}
     */
    @ComProperty(name = "Location", dispId = 0x64)
    void setLocation(WdFootnoteLocation param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "NumberStyle", dispId = 0x65)
    WdNoteNumberStyle getNumberStyle();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdNoteNumberStyle}
     */
    @ComProperty(name = "NumberStyle", dispId = 0x65)
    void setNumberStyle(WdNoteNumberStyle param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "StartingNumber", dispId = 0x66)
    Integer getStartingNumber();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "StartingNumber", dispId = 0x66)
    void setStartingNumber(Integer param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "NumberingRule", dispId = 0x67)
    WdNumberingRule getNumberingRule();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code WdNumberingRule}
     */
    @ComProperty(name = "NumberingRule", dispId = 0x67)
    void setNumberingRule(WdNumberingRule param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "LayoutColumns", dispId = 0x68)
    Integer getLayoutColumns();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LayoutColumns", dispId = 0x68)
    void setLayoutColumns(Integer param0);
            
    
}