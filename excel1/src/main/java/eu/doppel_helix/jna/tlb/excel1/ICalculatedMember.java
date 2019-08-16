
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024455-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024455-0001-0000-C000-000000000046}")
public interface ICalculatedMember extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x2d1)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0x88b)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "SolveOrder", dispId = 0x88b)
    com.sun.jna.platform.win32.WinNT.HRESULT getSolveOrder(VARIANT RHS);
            
    /**
     * <p>id(0x88c)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "IsValid", dispId = 0x88c)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsValid(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code XlCalculatedMemberType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0xb6e)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Dynamic", dispId = 0xb6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getDynamic(VARIANT RHS);
            
    /**
     * <p>id(0xb6f)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "DisplayFolder", dispId = 0xb6f)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayFolder(VARIANT RHS);
            
    /**
     * <p>id(0xb6d)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HierarchizeDistinct", dispId = 0xb6d)
    com.sun.jna.platform.win32.WinNT.HRESULT getHierarchizeDistinct(VARIANT RHS);
            
    /**
     * <p>id(0xb6d)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HierarchizeDistinct", dispId = 0xb6d)
    com.sun.jna.platform.win32.WinNT.HRESULT setHierarchizeDistinct(Boolean RHS);
            
    /**
     * <p>id(0xb6c)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "FlattenHierarchies", dispId = 0xb6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getFlattenHierarchies(VARIANT RHS);
            
    /**
     * <p>id(0xb6c)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "FlattenHierarchies", dispId = 0xb6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setFlattenHierarchies(Boolean RHS);
            
    /**
     * <p>id(0xc14)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "MeasureGroup", dispId = 0xc14)
    com.sun.jna.platform.win32.WinNT.HRESULT getMeasureGroup(VARIANT RHS);
            
    /**
     * <p>id(0xc15)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ParentHierarchy", dispId = 0xc15)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentHierarchy(VARIANT RHS);
            
    /**
     * <p>id(0xc16)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ParentMember", dispId = 0xc16)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentMember(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code XlCalcMemNumberFormatType}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    
}