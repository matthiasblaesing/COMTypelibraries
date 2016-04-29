
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208DB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208DB-0000-0000-C000-000000000046}")
public interface Workbooks {
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
     * <p>id(0xb5)</p>
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    Workbook Add(Object Template);
            
    /**
     * <p>id(0x115)</p>
     */
    @ComMethod(name = "Close", dispId = 0x115)
    void Close();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    Workbook getItem(Object Index);
            
    /**
     * <p>id(0x2aa)</p>
     */
    @ComMethod(name = "_Open", dispId = 0x2aa)
    Workbook _Open(String Filename,
            Object UpdateLinks,
            Object ReadOnly,
            Object Format,
            Object Password,
            Object WriteResPassword,
            Object IgnoreReadOnlyRecommended,
            Object Origin,
            Object Delimiter,
            Object Editable,
            Object Notify,
            Object Converter,
            Object AddToMru);
            
    /**
     * <p>id(0x2ab)</p>
     */
    @ComMethod(name = "__OpenText", dispId = 0x2ab)
    void __OpenText(String Filename,
            Object Origin,
            Object StartRow,
            Object DataType,
            XlTextQualifier TextQualifier,
            Object ConsecutiveDelimiter,
            Object Tab,
            Object Semicolon,
            Object Comma,
            Object Space,
            Object Other,
            Object OtherChar,
            Object FieldInfo,
            Object TextVisualLayout);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Workbook get_Default(Object Index);
            
    /**
     * <p>id(0x6ed)</p>
     */
    @ComMethod(name = "_OpenText", dispId = 0x6ed)
    void _OpenText(String Filename,
            Object Origin,
            Object StartRow,
            Object DataType,
            XlTextQualifier TextQualifier,
            Object ConsecutiveDelimiter,
            Object Tab,
            Object Semicolon,
            Object Comma,
            Object Space,
            Object Other,
            Object OtherChar,
            Object FieldInfo,
            Object TextVisualLayout,
            Object DecimalSeparator,
            Object ThousandsSeparator);
            
    /**
     * <p>id(0x783)</p>
     */
    @ComMethod(name = "Open", dispId = 0x783)
    Workbook Open(String Filename,
            Object UpdateLinks,
            Object ReadOnly,
            Object Format,
            Object Password,
            Object WriteResPassword,
            Object IgnoreReadOnlyRecommended,
            Object Origin,
            Object Delimiter,
            Object Editable,
            Object Notify,
            Object Converter,
            Object AddToMru,
            Object Local,
            Object CorruptLoad);
            
    /**
     * <p>id(0x784)</p>
     */
    @ComMethod(name = "OpenText", dispId = 0x784)
    void OpenText(String Filename,
            Object Origin,
            Object StartRow,
            Object DataType,
            XlTextQualifier TextQualifier,
            Object ConsecutiveDelimiter,
            Object Tab,
            Object Semicolon,
            Object Comma,
            Object Space,
            Object Other,
            Object OtherChar,
            Object FieldInfo,
            Object TextVisualLayout,
            Object DecimalSeparator,
            Object ThousandsSeparator,
            Object TrailingMinusNumbers,
            Object Local);
            
    /**
     * <p>id(0x813)</p>
     */
    @ComMethod(name = "OpenDatabase", dispId = 0x813)
    Workbook OpenDatabase(String Filename,
            Object CommandText,
            Object CommandType,
            Object BackgroundQuery,
            Object ImportDataAs);
            
    /**
     * <p>id(0x815)</p>
     */
    @ComMethod(name = "CheckOut", dispId = 0x815)
    void CheckOut(String Filename);
            
    /**
     * <p>id(0x816)</p>
     */
    @ComMethod(name = "CanCheckOut", dispId = 0x816)
    Boolean CanCheckOut(String Filename);
            
    /**
     * <p>id(0x817)</p>
     */
    @ComMethod(name = "_OpenXML", dispId = 0x817)
    Workbook _OpenXML(String Filename,
            Object Stylesheets);
            
    /**
     * <p>id(0x8e8)</p>
     */
    @ComMethod(name = "OpenXML", dispId = 0x8e8)
    Workbook OpenXML(String Filename,
            Object Stylesheets,
            Object LoadOption);
            
    
}