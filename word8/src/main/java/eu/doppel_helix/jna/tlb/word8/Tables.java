
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002094D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002094D-0000-0000-C000-000000000046}")
public interface Tables extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Table Item(Integer Index);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     * @param Range [in] {@code Range}
     * @param NumRows [in] {@code Integer}
     * @param NumColumns [in] {@code Integer}
     */
    @ComMethod(name = "AddOld", dispId = 0x4)
    Table AddOld(Range Range,
            Integer NumRows,
            Integer NumColumns);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(14)</p>
     * @param Range [in] {@code Range}
     * @param NumRows [in] {@code Integer}
     * @param NumColumns [in] {@code Integer}
     * @param DefaultTableBehavior [in, optional] {@code Object}
     * @param AutoFitBehavior [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xc8)
    Table Add(Range Range,
            Integer NumRows,
            Integer NumColumns,
            Object DefaultTableBehavior,
            Object AutoFitBehavior);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x64)
    Integer getNestingLevel();
            
    
}