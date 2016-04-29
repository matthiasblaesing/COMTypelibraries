
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002447B-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002447B-0001-0000-C000-000000000046}")
public interface IXmlMap {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x91e)</p>
     */
    @ComProperty(name = "IsExportable", dispId = 0x91e)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsExportable(VARIANT RHS);
            
    /**
     * <p>id(0x91f)</p>
     */
    @ComProperty(name = "ShowImportExportValidationErrors", dispId = 0x91f)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowImportExportValidationErrors(VARIANT RHS);
            
    /**
     * <p>id(0x91f)</p>
     */
    @ComProperty(name = "ShowImportExportValidationErrors", dispId = 0x91f)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowImportExportValidationErrors(Boolean RHS);
            
    /**
     * <p>id(0x920)</p>
     */
    @ComProperty(name = "SaveDataSourceDefinition", dispId = 0x920)
    com.sun.jna.platform.win32.WinNT.HRESULT getSaveDataSourceDefinition(VARIANT RHS);
            
    /**
     * <p>id(0x920)</p>
     */
    @ComProperty(name = "SaveDataSourceDefinition", dispId = 0x920)
    com.sun.jna.platform.win32.WinNT.HRESULT setSaveDataSourceDefinition(Boolean RHS);
            
    /**
     * <p>id(0x74c)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    com.sun.jna.platform.win32.WinNT.HRESULT getAdjustColumnWidth(VARIANT RHS);
            
    /**
     * <p>id(0x74c)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    com.sun.jna.platform.win32.WinNT.HRESULT setAdjustColumnWidth(Boolean RHS);
            
    /**
     * <p>id(0x921)</p>
     */
    @ComProperty(name = "PreserveColumnFilter", dispId = 0x921)
    com.sun.jna.platform.win32.WinNT.HRESULT getPreserveColumnFilter(VARIANT RHS);
            
    /**
     * <p>id(0x921)</p>
     */
    @ComProperty(name = "PreserveColumnFilter", dispId = 0x921)
    com.sun.jna.platform.win32.WinNT.HRESULT setPreserveColumnFilter(Boolean RHS);
            
    /**
     * <p>id(0x922)</p>
     */
    @ComProperty(name = "PreserveNumberFormatting", dispId = 0x922)
    com.sun.jna.platform.win32.WinNT.HRESULT getPreserveNumberFormatting(VARIANT RHS);
            
    /**
     * <p>id(0x922)</p>
     */
    @ComProperty(name = "PreserveNumberFormatting", dispId = 0x922)
    com.sun.jna.platform.win32.WinNT.HRESULT setPreserveNumberFormatting(Boolean RHS);
            
    /**
     * <p>id(0x923)</p>
     */
    @ComProperty(name = "AppendOnImport", dispId = 0x923)
    com.sun.jna.platform.win32.WinNT.HRESULT getAppendOnImport(VARIANT RHS);
            
    /**
     * <p>id(0x923)</p>
     */
    @ComProperty(name = "AppendOnImport", dispId = 0x923)
    com.sun.jna.platform.win32.WinNT.HRESULT setAppendOnImport(Boolean RHS);
            
    /**
     * <p>id(0x924)</p>
     */
    @ComProperty(name = "RootElementName", dispId = 0x924)
    com.sun.jna.platform.win32.WinNT.HRESULT getRootElementName(VARIANT RHS);
            
    /**
     * <p>id(0x925)</p>
     */
    @ComProperty(name = "RootElementNamespace", dispId = 0x925)
    com.sun.jna.platform.win32.WinNT.HRESULT getRootElementNamespace(VARIANT RHS);
            
    /**
     * <p>id(0x926)</p>
     */
    @ComProperty(name = "Schemas", dispId = 0x926)
    com.sun.jna.platform.win32.WinNT.HRESULT getSchemas(VARIANT RHS);
            
    /**
     * <p>id(0x927)</p>
     */
    @ComProperty(name = "DataBinding", dispId = 0x927)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataBinding(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x395)</p>
     */
    @ComMethod(name = "Import", dispId = 0x395)
    com.sun.jna.platform.win32.WinNT.HRESULT Import(String Url,
            Object Overwrite,
            VARIANT RHS);
            
    /**
     * <p>id(0x928)</p>
     */
    @ComMethod(name = "ImportXml", dispId = 0x928)
    com.sun.jna.platform.win32.WinNT.HRESULT ImportXml(String XmlData,
            Object Overwrite,
            VARIANT RHS);
            
    /**
     * <p>id(0x586)</p>
     */
    @ComMethod(name = "Export", dispId = 0x586)
    com.sun.jna.platform.win32.WinNT.HRESULT Export(String Url,
            Object Overwrite,
            VARIANT RHS);
            
    /**
     * <p>id(0x92a)</p>
     */
    @ComMethod(name = "ExportXml", dispId = 0x92a)
    com.sun.jna.platform.win32.WinNT.HRESULT ExportXml(VARIANT Data,
            VARIANT RHS);
            
    /**
     * <p>id(0x9f0)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbookConnection(VARIANT RHS);
            
    
}