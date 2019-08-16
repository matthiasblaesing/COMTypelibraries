
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020981-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020981-0000-0000-C000-000000000046}")
public interface Revision extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Author", dispId = 0x1)
    String getAuthor();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Date", dispId = 0x2)
    java.util.Date getDate();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Range", dispId = 0x3)
    Range getRange();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Type", dispId = 0x4)
    WdRevisionType getType();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Index", dispId = 0x5)
    Integer getIndex();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Accept", dispId = 0x65)
    void Accept();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Reject", dispId = 0x66)
    void Reject();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Style", dispId = 0x8)
    Style getStyle();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "FormatDescription", dispId = 0x9)
    String getFormatDescription();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "MovedRange", dispId = 0xa)
    Range getMovedRange();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Cells", dispId = 0xb)
    Cells getCells();
            
    
}