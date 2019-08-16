
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244D1-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244D1-0000-0000-C000-000000000046}")
public interface ModelConnection extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x725)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    Object getCommandText();
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    void setCommandText(Object param0);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    XlCmdType getCommandType();
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    void setCommandType(XlCmdType param0);
            
    /**
     * <p>id(0x81a)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ADOConnection", dispId = 0x81a)
    com.sun.jna.platform.win32.COM.util.IDispatch getADOConnection();
            
    /**
     * <p>id(0x84d)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "CalculatedMembers", dispId = 0x84d)
    CalculatedMembers getCalculatedMembers();
            
    
}