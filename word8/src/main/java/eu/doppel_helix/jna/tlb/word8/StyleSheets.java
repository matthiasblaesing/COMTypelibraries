
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({07B7CC7E-E66C-11D3-9454-00105AA31A08})</p>
 */
@ComInterface(iid="{07B7CC7E-E66C-11D3-9454-00105AA31A08}")
public interface StyleSheets extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    StyleSheet Item(Object Index);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param FileName [in] {@code String}
     * @param LinkType [in] {@code WdStyleSheetLinkType}
     * @param Title [in] {@code String}
     * @param Precedence [in] {@code WdStyleSheetPrecedence}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    StyleSheet Add(String FileName,
            WdStyleSheetLinkType LinkType,
            String Title,
            WdStyleSheetPrecedence Precedence);
            
    
}