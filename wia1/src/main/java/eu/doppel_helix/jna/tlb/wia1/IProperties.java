
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({40571E58-A308-470A-80AA-FA10F88793A0})</p>
 */
@ComInterface(iid="{40571E58-A308-470A-80AA-FA10F88793A0}")
public interface IProperties {
    /**
     * Returns the specified item in the collection either by position or name.
     *
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    IProperty getItem(Object Index);
            
    /**
     * Returns the number of members in the collection
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * Indicates whether the specified Property exists in the collection
     *
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Exists", dispId = 0x2)
    Boolean Exists(Object Index);
            
    
}