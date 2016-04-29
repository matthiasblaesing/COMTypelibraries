
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024455-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024455-0001-0000-C000-000000000046}")
public interface ICalculatedMember {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0x88b)</p>
     */
    @ComProperty(name = "SolveOrder", dispId = 0x88b)
    com.sun.jna.platform.win32.WinNT.HRESULT getSolveOrder(VARIANT RHS);
            
    /**
     * <p>id(0x88c)</p>
     */
    @ComProperty(name = "IsValid", dispId = 0x88c)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsValid(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0xb6e)</p>
     */
    @ComProperty(name = "Dynamic", dispId = 0xb6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getDynamic(VARIANT RHS);
            
    /**
     * <p>id(0xb6f)</p>
     */
    @ComProperty(name = "DisplayFolder", dispId = 0xb6f)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayFolder(VARIANT RHS);
            
    /**
     * <p>id(0xb6d)</p>
     */
    @ComProperty(name = "HierarchizeDistinct", dispId = 0xb6d)
    com.sun.jna.platform.win32.WinNT.HRESULT getHierarchizeDistinct(VARIANT RHS);
            
    /**
     * <p>id(0xb6d)</p>
     */
    @ComProperty(name = "HierarchizeDistinct", dispId = 0xb6d)
    com.sun.jna.platform.win32.WinNT.HRESULT setHierarchizeDistinct(Boolean RHS);
            
    /**
     * <p>id(0xb6c)</p>
     */
    @ComProperty(name = "FlattenHierarchies", dispId = 0xb6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getFlattenHierarchies(VARIANT RHS);
            
    /**
     * <p>id(0xb6c)</p>
     */
    @ComProperty(name = "FlattenHierarchies", dispId = 0xb6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setFlattenHierarchies(Boolean RHS);
            
    /**
     * <p>id(0xc14)</p>
     */
    @ComProperty(name = "MeasureGroup", dispId = 0xc14)
    com.sun.jna.platform.win32.WinNT.HRESULT getMeasureGroup(VARIANT RHS);
            
    /**
     * <p>id(0xc15)</p>
     */
    @ComProperty(name = "ParentHierarchy", dispId = 0xc15)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentHierarchy(VARIANT RHS);
            
    /**
     * <p>id(0xc16)</p>
     */
    @ComProperty(name = "ParentMember", dispId = 0xc16)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentMember(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    
}