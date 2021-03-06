
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({497142A4-16FD-42C6-BC58-15D89345FC21})</p>
 */
@ComInterface(iid="{497142A4-16FD-42C6-BC58-15D89345FC21}")
public interface OMathFunctions extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x67)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    OMathFunction Item(Integer Index);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(13)</p>
     * @param Range [in] {@code Range}
     * @param Type [in] {@code WdOMathFunctionType}
     * @param NumArgs [in, optional] {@code Object}
     * @param NumCols [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x68)
    OMathFunction Add(Range Range,
            WdOMathFunctionType Type,
            Object NumArgs,
            Object NumCols);
            
    
}