
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244AB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244AB-0000-0000-C000-000000000046}")
public interface Sort {
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
     * <p>id(0xabc)</p>
     */
    @ComProperty(name = "Rng", dispId = 0xabc)
    Range getRng();
            
    /**
     * <p>id(0x37f)</p>
     */
    @ComProperty(name = "Header", dispId = 0x37f)
    XlYesNoGuess getHeader();
            
    /**
     * <p>id(0x37f)</p>
     */
    @ComProperty(name = "Header", dispId = 0x37f)
    void setHeader(XlYesNoGuess param0);
            
    /**
     * <p>id(0x1aa)</p>
     */
    @ComProperty(name = "MatchCase", dispId = 0x1aa)
    Boolean getMatchCase();
            
    /**
     * <p>id(0x1aa)</p>
     */
    @ComProperty(name = "MatchCase", dispId = 0x1aa)
    void setMatchCase(Boolean param0);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    XlSortOrientation getOrientation();
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(XlSortOrientation param0);
            
    /**
     * <p>id(0x381)</p>
     */
    @ComProperty(name = "SortMethod", dispId = 0x381)
    XlSortMethod getSortMethod();
            
    /**
     * <p>id(0x381)</p>
     */
    @ComProperty(name = "SortMethod", dispId = 0x381)
    void setSortMethod(XlSortMethod param0);
            
    /**
     * <p>id(0xabd)</p>
     */
    @ComProperty(name = "SortFields", dispId = 0xabd)
    SortFields getSortFields();
            
    /**
     * <p>id(0xabe)</p>
     */
    @ComMethod(name = "SetRange", dispId = 0xabe)
    void SetRange(Range Rng);
            
    /**
     * <p>id(0x68b)</p>
     */
    @ComMethod(name = "Apply", dispId = 0x68b)
    void Apply();
            
    
}