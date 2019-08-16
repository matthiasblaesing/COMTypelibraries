
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002094F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002094F-0000-0000-C000-000000000046}")
public interface Column extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Width", dispId = 0x3)
    Float getWidth();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x3)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "IsFirst", dispId = 0x4)
    Boolean getIsFirst();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "IsLast", dispId = 0x5)
    Boolean getIsLast();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Index", dispId = 0x6)
    Integer getIndex();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Cells", dispId = 0x64)
    Cells getCells();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x66)
    Shading getShading();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Next", dispId = 0x67)
    Column getNext();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x68)
    Column getPrevious();
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(23)</p>
     * @param ColumnWidth [in] {@code Float}
     * @param RulerStyle [in] {@code WdRulerStyle}
     */
    @ComMethod(name = "SetWidth", dispId = 0xc9)
    void SetWidth(Float ColumnWidth,
            WdRulerStyle RulerStyle);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "AutoFit", dispId = 0xca)
    void AutoFit();
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(25)</p>
     * @param ExcludeHeader [in, optional] {@code Object}
     * @param SortFieldType [in, optional] {@code Object}
     * @param SortOrder [in, optional] {@code Object}
     * @param CaseSensitive [in, optional] {@code Object}
     * @param LanguageID [in, optional] {@code Object}
     */
    @ComMethod(name = "SortOld", dispId = 0xcb)
    void SortOld(Object ExcludeHeader,
            Object SortFieldType,
            Object SortOrder,
            Object CaseSensitive,
            Object LanguageID);
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(26)</p>
     * @param ExcludeHeader [in, optional] {@code Object}
     * @param SortFieldType [in, optional] {@code Object}
     * @param SortOrder [in, optional] {@code Object}
     * @param CaseSensitive [in, optional] {@code Object}
     * @param BidiSort [in, optional] {@code Object}
     * @param IgnoreThe [in, optional] {@code Object}
     * @param IgnoreKashida [in, optional] {@code Object}
     * @param IgnoreDiacritics [in, optional] {@code Object}
     * @param IgnoreHe [in, optional] {@code Object}
     * @param LanguageID [in, optional] {@code Object}
     */
    @ComMethod(name = "Sort", dispId = 0xcc)
    void Sort(Object ExcludeHeader,
            Object SortFieldType,
            Object SortOrder,
            Object CaseSensitive,
            Object BidiSort,
            Object IgnoreThe,
            Object IgnoreKashida,
            Object IgnoreDiacritics,
            Object IgnoreHe,
            Object LanguageID);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x69)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x6a)
    Float getPreferredWidth();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x6a)
    void setPreferredWidth(Float param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x6b)
    WdPreferredWidthType getPreferredWidthType();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code WdPreferredWidthType}
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x6b)
    void setPreferredWidthType(WdPreferredWidthType param0);
            
    
}