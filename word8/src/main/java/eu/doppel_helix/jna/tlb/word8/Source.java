
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({4A6AE865-199D-4EA3-9F6B-125BD9C40EDF})</p>
 */
@ComInterface(iid="{4A6AE865-199D-4EA3-9F6B-125BD9C40EDF}")
public interface Source extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Tag", dispId = 0x67)
    String getTag();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     * @param Name [in] {@code String}
     */
    @ComProperty(name = "Field", dispId = 0x68)
    String getField(String Name);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     * @param Name [in] {@code String}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "Field", dispId = 0x68)
    void setField(String Name,
            String param1);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "XML", dispId = 0x69)
    String getXML();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Cited", dispId = 0x6b)
    Boolean getCited();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6a)
    void Delete();
            
    
}