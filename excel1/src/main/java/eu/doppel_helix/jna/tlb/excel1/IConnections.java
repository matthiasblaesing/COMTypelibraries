
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024486-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024486-0001-0000-C000-000000000046}")
public interface IConnections extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x76)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xa8c)</p>
     * <p>vtableId(11)</p>
     * @param Filename [in] {@code String}
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComMethod(name = "_AddFromFile", dispId = 0xa8c)
    com.sun.jna.platform.win32.WinNT.HRESULT _AddFromFile(String Filename,
            VARIANT RHS);
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(12)</p>
     * @param Name [in] {@code String}
     * @param Description [in] {@code String}
     * @param ConnectionString [in] {@code Object}
     * @param CommandText [in] {@code Object}
     * @param lCmdtype [in, optional] {@code Object}
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(String Name,
            String Description,
            Object ConnectionString,
            Object CommandText,
            Object lCmdtype,
            VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT Item(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0xbee)</p>
     * <p>vtableId(16)</p>
     * @param Name [in] {@code String}
     * @param Description [in] {@code String}
     * @param ConnectionString [in] {@code Object}
     * @param CommandText [in] {@code Object}
     * @param lCmdtype [in, optional] {@code Object}
     * @param CreateModelConnection [in, optional] {@code Object}
     * @param ImportRelationships [in, optional] {@code Object}
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComMethod(name = "Add2", dispId = 0xbee)
    com.sun.jna.platform.win32.WinNT.HRESULT Add2(String Name,
            String Description,
            Object ConnectionString,
            Object CommandText,
            Object lCmdtype,
            Object CreateModelConnection,
            Object ImportRelationships,
            VARIANT RHS);
            
    /**
     * <p>id(0xc23)</p>
     * <p>vtableId(17)</p>
     * @param Filename [in] {@code String}
     * @param CreateModelConnection [in, optional] {@code Object}
     * @param ImportRelationships [in, optional] {@code Object}
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComMethod(name = "AddFromFile", dispId = 0xc23)
    com.sun.jna.platform.win32.WinNT.HRESULT AddFromFile(String Filename,
            Object CreateModelConnection,
            Object ImportRelationships,
            VARIANT RHS);
            
    
}