
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002092F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002092F-0000-0000-C000-000000000046}")
public interface Field extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Code", dispId = 0x0)
    Range getCode();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Range}
     */
    @ComProperty(name = "Code", dispId = 0x0)
    void setCode(Range param0);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x1)
    WdFieldType getType();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x2)
    Boolean getLocked();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x2)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Kind", dispId = 0x3)
    WdFieldKind getKind();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Result", dispId = 0x4)
    Range getResult();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Range}
     */
    @ComProperty(name = "Result", dispId = 0x4)
    void setResult(Range param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Data", dispId = 0x5)
    String getData();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Data", dispId = 0x5)
    void setData(String param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Next", dispId = 0x6)
    Field getNext();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x7)
    Field getPrevious();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Index", dispId = 0x8)
    Integer getIndex();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ShowCodes", dispId = 0x9)
    Boolean getShowCodes();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowCodes", dispId = 0x9)
    void setShowCodes(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "LinkFormat", dispId = 0xa)
    LinkFormat getLinkFormat();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "OLEFormat", dispId = 0xb)
    OLEFormat getOLEFormat();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "InlineShape", dispId = 0xc)
    InlineShape getInlineShape();
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(29)</p>
     */
    @ComMethod(name = "Update", dispId = 0x65)
    Boolean Update();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "Unlink", dispId = 0x66)
    void Unlink();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "UpdateSource", dispId = 0x67)
    void UpdateSource();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "DoClick", dispId = 0x68)
    void DoClick();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x69)
    void Copy();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x6a)
    void Cut();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6b)
    void Delete();
            
    
}