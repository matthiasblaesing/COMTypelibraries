
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020954-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020954-0000-0000-C000-000000000046}")
public interface TabStop extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Alignment", dispId = 0x64)
    WdTabAlignment getAlignment();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code WdTabAlignment}
     */
    @ComProperty(name = "Alignment", dispId = 0x64)
    void setAlignment(WdTabAlignment param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Leader", dispId = 0x65)
    WdTabLeader getLeader();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdTabLeader}
     */
    @ComProperty(name = "Leader", dispId = 0x65)
    void setLeader(WdTabLeader param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Position", dispId = 0x66)
    Float getPosition();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Position", dispId = 0x66)
    void setPosition(Float param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "CustomTab", dispId = 0x67)
    Boolean getCustomTab();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Next", dispId = 0x68)
    TabStop getNext();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x69)
    TabStop getPrevious();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Clear", dispId = 0xc8)
    void Clear();
            
    
}