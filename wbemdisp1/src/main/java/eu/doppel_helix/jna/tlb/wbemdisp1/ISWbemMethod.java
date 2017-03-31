
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A Method
 *
 * <p>uuid({422E8E90-D955-11D1-8B09-00600806D9B6})</p>
 */
@ComInterface(iid="{422E8E90-D955-11D1-8B09-00600806D9B6}")
public interface ISWbemMethod extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * The name of this Method
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * The originating class of this Method
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Origin", dispId = 0x2)
    String getOrigin();
            
    /**
     * The in parameters for this Method.
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "InParameters", dispId = 0x3)
    ISWbemObject getInParameters();
            
    /**
     * The out parameters for this Method.
     *
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "OutParameters", dispId = 0x4)
    ISWbemObject getOutParameters();
            
    /**
     * The collection of Qualifiers of this Method.
     *
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Qualifiers_", dispId = 0x5)
    ISWbemQualifierSet getQualifiers_();
            
    
}