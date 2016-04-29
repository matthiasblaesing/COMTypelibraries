
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002447B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002447B-0000-0000-C000-000000000046}")
public interface XmlMap {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x91e)</p>
     */
    @ComProperty(name = "IsExportable", dispId = 0x91e)
    Boolean getIsExportable();
            
    /**
     * <p>id(0x91f)</p>
     */
    @ComProperty(name = "ShowImportExportValidationErrors", dispId = 0x91f)
    Boolean getShowImportExportValidationErrors();
            
    /**
     * <p>id(0x91f)</p>
     */
    @ComProperty(name = "ShowImportExportValidationErrors", dispId = 0x91f)
    void setShowImportExportValidationErrors(Boolean param0);
            
    /**
     * <p>id(0x920)</p>
     */
    @ComProperty(name = "SaveDataSourceDefinition", dispId = 0x920)
    Boolean getSaveDataSourceDefinition();
            
    /**
     * <p>id(0x920)</p>
     */
    @ComProperty(name = "SaveDataSourceDefinition", dispId = 0x920)
    void setSaveDataSourceDefinition(Boolean param0);
            
    /**
     * <p>id(0x74c)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    Boolean getAdjustColumnWidth();
            
    /**
     * <p>id(0x74c)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    void setAdjustColumnWidth(Boolean param0);
            
    /**
     * <p>id(0x921)</p>
     */
    @ComProperty(name = "PreserveColumnFilter", dispId = 0x921)
    Boolean getPreserveColumnFilter();
            
    /**
     * <p>id(0x921)</p>
     */
    @ComProperty(name = "PreserveColumnFilter", dispId = 0x921)
    void setPreserveColumnFilter(Boolean param0);
            
    /**
     * <p>id(0x922)</p>
     */
    @ComProperty(name = "PreserveNumberFormatting", dispId = 0x922)
    Boolean getPreserveNumberFormatting();
            
    /**
     * <p>id(0x922)</p>
     */
    @ComProperty(name = "PreserveNumberFormatting", dispId = 0x922)
    void setPreserveNumberFormatting(Boolean param0);
            
    /**
     * <p>id(0x923)</p>
     */
    @ComProperty(name = "AppendOnImport", dispId = 0x923)
    Boolean getAppendOnImport();
            
    /**
     * <p>id(0x923)</p>
     */
    @ComProperty(name = "AppendOnImport", dispId = 0x923)
    void setAppendOnImport(Boolean param0);
            
    /**
     * <p>id(0x924)</p>
     */
    @ComProperty(name = "RootElementName", dispId = 0x924)
    String getRootElementName();
            
    /**
     * <p>id(0x925)</p>
     */
    @ComProperty(name = "RootElementNamespace", dispId = 0x925)
    XmlNamespace getRootElementNamespace();
            
    /**
     * <p>id(0x926)</p>
     */
    @ComProperty(name = "Schemas", dispId = 0x926)
    XmlSchemas getSchemas();
            
    /**
     * <p>id(0x927)</p>
     */
    @ComProperty(name = "DataBinding", dispId = 0x927)
    XmlDataBinding getDataBinding();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x395)</p>
     */
    @ComMethod(name = "Import", dispId = 0x395)
    XlXmlImportResult Import(String Url,
            Object Overwrite);
            
    /**
     * <p>id(0x928)</p>
     */
    @ComMethod(name = "ImportXml", dispId = 0x928)
    XlXmlImportResult ImportXml(String XmlData,
            Object Overwrite);
            
    /**
     * <p>id(0x586)</p>
     */
    @ComMethod(name = "Export", dispId = 0x586)
    XlXmlExportResult Export(String Url,
            Object Overwrite);
            
    /**
     * <p>id(0x92a)</p>
     */
    @ComMethod(name = "ExportXml", dispId = 0x92a)
    XlXmlExportResult ExportXml(VARIANT Data);
            
    /**
     * <p>id(0x9f0)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    WorkbookConnection getWorkbookConnection();
            
    
}