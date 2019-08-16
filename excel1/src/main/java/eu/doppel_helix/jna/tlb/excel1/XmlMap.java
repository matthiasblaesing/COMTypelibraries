
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002447B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002447B-0000-0000-C000-000000000046}")
public interface XmlMap extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x91e)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "IsExportable", dispId = 0x91e)
    Boolean getIsExportable();
            
    /**
     * <p>id(0x91f)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ShowImportExportValidationErrors", dispId = 0x91f)
    Boolean getShowImportExportValidationErrors();
            
    /**
     * <p>id(0x91f)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowImportExportValidationErrors", dispId = 0x91f)
    void setShowImportExportValidationErrors(Boolean param0);
            
    /**
     * <p>id(0x920)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "SaveDataSourceDefinition", dispId = 0x920)
    Boolean getSaveDataSourceDefinition();
            
    /**
     * <p>id(0x920)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SaveDataSourceDefinition", dispId = 0x920)
    void setSaveDataSourceDefinition(Boolean param0);
            
    /**
     * <p>id(0x74c)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    Boolean getAdjustColumnWidth();
            
    /**
     * <p>id(0x74c)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    void setAdjustColumnWidth(Boolean param0);
            
    /**
     * <p>id(0x921)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "PreserveColumnFilter", dispId = 0x921)
    Boolean getPreserveColumnFilter();
            
    /**
     * <p>id(0x921)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveColumnFilter", dispId = 0x921)
    void setPreserveColumnFilter(Boolean param0);
            
    /**
     * <p>id(0x922)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "PreserveNumberFormatting", dispId = 0x922)
    Boolean getPreserveNumberFormatting();
            
    /**
     * <p>id(0x922)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveNumberFormatting", dispId = 0x922)
    void setPreserveNumberFormatting(Boolean param0);
            
    /**
     * <p>id(0x923)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "AppendOnImport", dispId = 0x923)
    Boolean getAppendOnImport();
            
    /**
     * <p>id(0x923)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AppendOnImport", dispId = 0x923)
    void setAppendOnImport(Boolean param0);
            
    /**
     * <p>id(0x924)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "RootElementName", dispId = 0x924)
    String getRootElementName();
            
    /**
     * <p>id(0x925)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "RootElementNamespace", dispId = 0x925)
    XmlNamespace getRootElementNamespace();
            
    /**
     * <p>id(0x926)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Schemas", dispId = 0x926)
    XmlSchemas getSchemas();
            
    /**
     * <p>id(0x927)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "DataBinding", dispId = 0x927)
    XmlDataBinding getDataBinding();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x395)</p>
     * <p>vtableId(31)</p>
     * @param Url [in] {@code String}
     * @param Overwrite [in, optional] {@code Object}
     */
    @ComMethod(name = "Import", dispId = 0x395)
    XlXmlImportResult Import(String Url,
            Object Overwrite);
            
    /**
     * <p>id(0x928)</p>
     * <p>vtableId(32)</p>
     * @param XmlData [in] {@code String}
     * @param Overwrite [in, optional] {@code Object}
     */
    @ComMethod(name = "ImportXml", dispId = 0x928)
    XlXmlImportResult ImportXml(String XmlData,
            Object Overwrite);
            
    /**
     * <p>id(0x586)</p>
     * <p>vtableId(33)</p>
     * @param Url [in] {@code String}
     * @param Overwrite [in, optional] {@code Object}
     */
    @ComMethod(name = "Export", dispId = 0x586)
    XlXmlExportResult Export(String Url,
            Object Overwrite);
            
    /**
     * <p>id(0x92a)</p>
     * <p>vtableId(34)</p>
     * @param Data [out] {@code String}
     */
    @ComMethod(name = "ExportXml", dispId = 0x92a)
    XlXmlExportResult ExportXml(VARIANT Data);
            
    /**
     * <p>id(0x9f0)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    WorkbookConnection getWorkbookConnection();
            
    
}