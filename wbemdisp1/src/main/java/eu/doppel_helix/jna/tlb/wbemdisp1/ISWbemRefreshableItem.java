
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A single item in a Refresher
 *
 * <p>uuid({5AD4BF92-DAAB-11D3-B38F-00105A1F473A})</p>
 */
@ComInterface(iid="{5AD4BF92-DAAB-11D3-B38F-00105A1F473A}")
public interface ISWbemRefreshableItem extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * The index of this item in the parent refresher
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * The parent refresher
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Refresher", dispId = 0x2)
    ISWbemRefresher getRefresher();
            
    /**
     * Whether this item represents a single object or an object set
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "IsSet", dispId = 0x3)
    Boolean getIsSet();
            
    /**
     * The object
     *
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Object", dispId = 0x4)
    ISWbemObjectEx getObject();
            
    /**
     * The object set
     *
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ObjectSet", dispId = 0x5)
    ISWbemObjectSet getObjectSet();
            
    /**
     * Remove this item from the parent refresher
     *
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Remove", dispId = 0x6)
    void Remove(Object iFlags);
            
    
}