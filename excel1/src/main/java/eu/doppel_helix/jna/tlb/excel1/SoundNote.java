
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002087B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002087B-0000-0000-C000-000000000046}")
public interface SoundNote extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x395)</p>
     * <p>vtableId(11)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "Import", dispId = 0x395)
    Object Import(String Filename);
            
    /**
     * <p>id(0x396)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Play", dispId = 0x396)
    Object Play();
            
    /**
     * <p>id(0x397)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Record", dispId = 0x397)
    Object Record();
            
    
}