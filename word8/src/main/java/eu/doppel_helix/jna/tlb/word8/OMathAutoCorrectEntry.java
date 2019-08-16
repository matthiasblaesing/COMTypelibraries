
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D8779F01-4869-4403-B334-D60C5F9C9175})</p>
 */
@ComInterface(iid="{D8779F01-4869-4403-B334-D60C5F9C9175}")
public interface OMathAutoCorrectEntry extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Index", dispId = 0x67)
    Integer getIndex();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x68)
    String getName();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x68)
    void setName(String param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Value", dispId = 0x69)
    String getValue();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x69)
    void setValue(String param0);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete();
            
    
}