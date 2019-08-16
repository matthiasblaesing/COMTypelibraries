
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E598E358-2852-42D4-8775-160BD91B7244})</p>
 */
@ComInterface(iid="{E598E358-2852-42D4-8775-160BD91B7244}")
public interface UndoRecord extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param Name [in, optional] {@code String}
     */
    @ComMethod(name = "StartCustomRecord", dispId = 0x1)
    void StartCustomRecord(String Name);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "EndCustomRecord", dispId = 0x2)
    void EndCustomRecord();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "IsRecordingCustomRecord", dispId = 0x3)
    Boolean getIsRecordingCustomRecord();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "CustomRecordName", dispId = 0x4)
    String getCustomRecordName();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "CustomRecordLevel", dispId = 0x5)
    Integer getCustomRecordLevel();
            
    
}