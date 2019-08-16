
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208B1-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208B1-0000-0000-C000-000000000046}")
public interface Worksheets extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.COM.util.IDispatch Add(Object Before,
            Object After,
            Object Count,
            Object Type);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(11)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    void Copy(Object Before,
            Object After);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x1d5)</p>
     * <p>vtableId(14)</p>
     * @param Range [in] {@code Range}
     * @param Type [in, optional] {@code XlFillWith}
     */
    @ComMethod(name = "FillAcrossSheets", dispId = 0x1d5)
    void FillAcrossSheets(Range Range,
            XlFillWith Type);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(15)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.COM.util.IDispatch getItem(Object Index);
            
    /**
     * <p>id(0x27d)</p>
     * <p>vtableId(16)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     */
    @ComMethod(name = "Move", dispId = 0x27d)
    void Move(Object Before,
            Object After);
            
    /**
     * <p>id(0x389)</p>
     * <p>vtableId(18)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     */
    @ComMethod(name = "__PrintOut", dispId = 0x389)
    void __PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate);
            
    /**
     * <p>id(0x119)</p>
     * <p>vtableId(19)</p>
     * @param EnableChanges [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    void PrintPreview(Object EnableChanges);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(20)</p>
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    void Select(Object Replace);
            
    /**
     * <p>id(0x58a)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "HPageBreaks", dispId = 0x58a)
    HPageBreaks getHPageBreaks();
            
    /**
     * <p>id(0x58b)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "VPageBreaks", dispId = 0x58b)
    VPageBreaks getVPageBreaks();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Object getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Object param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(25)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.COM.util.IDispatch get_Default(Object Index);
            
    /**
     * <p>id(0x6ec)</p>
     * <p>vtableId(26)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
     */
    @ComMethod(name = "_PrintOut", dispId = 0x6ec)
    void _PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName);
            
    /**
     * <p>id(0x939)</p>
     * <p>vtableId(27)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
     * @param IgnorePrintAreas [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut", dispId = 0x939)
    void PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName,
            Object IgnorePrintAreas);
            
    /**
     * <p>id(0xbee)</p>
     * <p>vtableId(28)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     * @param NewLayout [in, optional] {@code Object}
     */
    @ComMethod(name = "Add2", dispId = 0xbee)
    com.sun.jna.platform.win32.COM.util.IDispatch Add2(Object Before,
            Object After,
            Object Count,
            Object NewLayout);
            
    
}