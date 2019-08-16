
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244E4-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244E4-0001-0000-C000-000000000046}")
public interface IModelChanges extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc49)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code ModelTableNames}
     */
    @ComProperty(name = "TablesAdded", dispId = 0xc49)
    com.sun.jna.platform.win32.WinNT.HRESULT getTablesAdded(VARIANT RHS);
            
    /**
     * <p>id(0xc4a)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code ModelTableNames}
     */
    @ComProperty(name = "TablesDeleted", dispId = 0xc4a)
    com.sun.jna.platform.win32.WinNT.HRESULT getTablesDeleted(VARIANT RHS);
            
    /**
     * <p>id(0xc4b)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code ModelTableNames}
     */
    @ComProperty(name = "TablesModified", dispId = 0xc4b)
    com.sun.jna.platform.win32.WinNT.HRESULT getTablesModified(VARIANT RHS);
            
    /**
     * <p>id(0xc4c)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code ModelTableNameChanges}
     */
    @ComProperty(name = "TableNamesChanged", dispId = 0xc4c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTableNamesChanged(VARIANT RHS);
            
    /**
     * <p>id(0xc4d)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RelationshipChange", dispId = 0xc4d)
    com.sun.jna.platform.win32.WinNT.HRESULT getRelationshipChange(VARIANT RHS);
            
    /**
     * <p>id(0xc4e)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code ModelColumnNames}
     */
    @ComProperty(name = "ColumnsAdded", dispId = 0xc4e)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnsAdded(VARIANT RHS);
            
    /**
     * <p>id(0xc4f)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code ModelColumnNames}
     */
    @ComProperty(name = "ColumnsDeleted", dispId = 0xc4f)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnsDeleted(VARIANT RHS);
            
    /**
     * <p>id(0xc50)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code ModelColumnChanges}
     */
    @ComProperty(name = "ColumnsChanged", dispId = 0xc50)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnsChanged(VARIANT RHS);
            
    /**
     * <p>id(0xc51)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code ModelMeasureNames}
     */
    @ComProperty(name = "MeasuresAdded", dispId = 0xc51)
    com.sun.jna.platform.win32.WinNT.HRESULT getMeasuresAdded(VARIANT RHS);
            
    /**
     * <p>id(0xc52)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "UnknownChange", dispId = 0xc52)
    com.sun.jna.platform.win32.WinNT.HRESULT getUnknownChange(VARIANT RHS);
            
    /**
     * <p>id(0xde)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code XlModelChangeSource}
     */
    @ComProperty(name = "Source", dispId = 0xde)
    com.sun.jna.platform.win32.WinNT.HRESULT getSource(VARIANT RHS);
            
    
}