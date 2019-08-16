
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020867-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020867-0001-0000-C000-000000000046}")
public interface IMenuItems extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(10)</p>
     * @param Caption [in] {@code String}
     * @param OnAction [in, optional] {@code Object}
     * @param ShortcutKey [in, optional] {@code Object}
     * @param Before [in, optional] {@code Object}
     * @param Restore [in, optional] {@code Object}
     * @param StatusBar [in, optional] {@code Object}
     * @param HelpFile [in, optional] {@code Object}
     * @param HelpContextID [in, optional] {@code Object}
     * @param RHS [out] {@code MenuItem}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(String Caption,
            Object OnAction,
            Object ShortcutKey,
            Object Before,
            Object Restore,
            Object StatusBar,
            Object HelpFile,
            Object HelpContextID,
            VARIANT RHS);
            
    /**
     * <p>id(0x256)</p>
     * <p>vtableId(11)</p>
     * @param Caption [in] {@code String}
     * @param Before [in, optional] {@code Object}
     * @param Restore [in, optional] {@code Object}
     * @param RHS [out] {@code Menu}
     */
    @ComMethod(name = "AddMenu", dispId = 0x256)
    com.sun.jna.platform.win32.WinNT.HRESULT AddMenu(String Caption,
            Object Before,
            Object Restore,
            VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object Index,
            VARIANT RHS);
            
    
}