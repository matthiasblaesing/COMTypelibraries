
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208DB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208DB-0000-0000-C000-000000000046}")
public interface Workbooks extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xb5)</p>
     * <p>vtableId(10)</p>
     * @param Template [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    Workbook Add(Object Template);
            
    /**
     * <p>id(0x115)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Close", dispId = 0x115)
    void Close();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    Workbook getItem(Object Index);
            
    /**
     * <p>id(0x2aa)</p>
     * <p>vtableId(15)</p>
     * @param Filename [in] {@code String}
     * @param UpdateLinks [in, optional] {@code Object}
     * @param ReadOnly [in, optional] {@code Object}
     * @param Format [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param WriteResPassword [in, optional] {@code Object}
     * @param IgnoreReadOnlyRecommended [in, optional] {@code Object}
     * @param Origin [in, optional] {@code Object}
     * @param Delimiter [in, optional] {@code Object}
     * @param Editable [in, optional] {@code Object}
     * @param Notify [in, optional] {@code Object}
     * @param Converter [in, optional] {@code Object}
     * @param AddToMru [in, optional] {@code Object}
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
     * <p>vtableId(16)</p>
     * @param Filename [in] {@code String}
     * @param Origin [in, optional] {@code Object}
     * @param StartRow [in, optional] {@code Object}
     * @param DataType [in, optional] {@code Object}
     * @param TextQualifier [in, optional] {@code XlTextQualifier}
     * @param ConsecutiveDelimiter [in, optional] {@code Object}
     * @param Tab [in, optional] {@code Object}
     * @param Semicolon [in, optional] {@code Object}
     * @param Comma [in, optional] {@code Object}
     * @param Space [in, optional] {@code Object}
     * @param Other [in, optional] {@code Object}
     * @param OtherChar [in, optional] {@code Object}
     * @param FieldInfo [in, optional] {@code Object}
     * @param TextVisualLayout [in, optional] {@code Object}
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
     * <p>vtableId(17)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Workbook get_Default(Object Index);
            
    /**
     * <p>id(0x6ed)</p>
     * <p>vtableId(18)</p>
     * @param Filename [in] {@code String}
     * @param Origin [in, optional] {@code Object}
     * @param StartRow [in, optional] {@code Object}
     * @param DataType [in, optional] {@code Object}
     * @param TextQualifier [in, optional] {@code XlTextQualifier}
     * @param ConsecutiveDelimiter [in, optional] {@code Object}
     * @param Tab [in, optional] {@code Object}
     * @param Semicolon [in, optional] {@code Object}
     * @param Comma [in, optional] {@code Object}
     * @param Space [in, optional] {@code Object}
     * @param Other [in, optional] {@code Object}
     * @param OtherChar [in, optional] {@code Object}
     * @param FieldInfo [in, optional] {@code Object}
     * @param TextVisualLayout [in, optional] {@code Object}
     * @param DecimalSeparator [in, optional] {@code Object}
     * @param ThousandsSeparator [in, optional] {@code Object}
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
     * <p>vtableId(19)</p>
     * @param Filename [in] {@code String}
     * @param UpdateLinks [in, optional] {@code Object}
     * @param ReadOnly [in, optional] {@code Object}
     * @param Format [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param WriteResPassword [in, optional] {@code Object}
     * @param IgnoreReadOnlyRecommended [in, optional] {@code Object}
     * @param Origin [in, optional] {@code Object}
     * @param Delimiter [in, optional] {@code Object}
     * @param Editable [in, optional] {@code Object}
     * @param Notify [in, optional] {@code Object}
     * @param Converter [in, optional] {@code Object}
     * @param AddToMru [in, optional] {@code Object}
     * @param Local [in, optional] {@code Object}
     * @param CorruptLoad [in, optional] {@code Object}
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
     * <p>vtableId(20)</p>
     * @param Filename [in] {@code String}
     * @param Origin [in, optional] {@code Object}
     * @param StartRow [in, optional] {@code Object}
     * @param DataType [in, optional] {@code Object}
     * @param TextQualifier [in, optional] {@code XlTextQualifier}
     * @param ConsecutiveDelimiter [in, optional] {@code Object}
     * @param Tab [in, optional] {@code Object}
     * @param Semicolon [in, optional] {@code Object}
     * @param Comma [in, optional] {@code Object}
     * @param Space [in, optional] {@code Object}
     * @param Other [in, optional] {@code Object}
     * @param OtherChar [in, optional] {@code Object}
     * @param FieldInfo [in, optional] {@code Object}
     * @param TextVisualLayout [in, optional] {@code Object}
     * @param DecimalSeparator [in, optional] {@code Object}
     * @param ThousandsSeparator [in, optional] {@code Object}
     * @param TrailingMinusNumbers [in, optional] {@code Object}
     * @param Local [in, optional] {@code Object}
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
     * <p>vtableId(21)</p>
     * @param Filename [in] {@code String}
     * @param CommandText [in, optional] {@code Object}
     * @param CommandType [in, optional] {@code Object}
     * @param BackgroundQuery [in, optional] {@code Object}
     * @param ImportDataAs [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenDatabase", dispId = 0x813)
    Workbook OpenDatabase(String Filename,
            Object CommandText,
            Object CommandType,
            Object BackgroundQuery,
            Object ImportDataAs);
            
    /**
     * <p>id(0x815)</p>
     * <p>vtableId(22)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "CheckOut", dispId = 0x815)
    void CheckOut(String Filename);
            
    /**
     * <p>id(0x816)</p>
     * <p>vtableId(23)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "CanCheckOut", dispId = 0x816)
    Boolean CanCheckOut(String Filename);
            
    /**
     * <p>id(0x817)</p>
     * <p>vtableId(24)</p>
     * @param Filename [in] {@code String}
     * @param Stylesheets [in, optional] {@code Object}
     */
    @ComMethod(name = "_OpenXML", dispId = 0x817)
    Workbook _OpenXML(String Filename,
            Object Stylesheets);
            
    /**
     * <p>id(0x8e8)</p>
     * <p>vtableId(25)</p>
     * @param Filename [in] {@code String}
     * @param Stylesheets [in, optional] {@code Object}
     * @param LoadOption [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenXML", dispId = 0x8e8)
    Workbook OpenXML(String Filename,
            Object Stylesheets,
            Object LoadOption);
            
    
}