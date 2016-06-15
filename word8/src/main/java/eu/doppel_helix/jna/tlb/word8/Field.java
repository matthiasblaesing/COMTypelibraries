
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
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Code", dispId = 0x0)
    Range getCode();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Code", dispId = 0x0)
    void setCode(Range param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Type", dispId = 0x1)
    WdFieldType getType();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x2)
    Boolean getLocked();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x2)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Kind", dispId = 0x3)
    WdFieldKind getKind();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Result", dispId = 0x4)
    Range getResult();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Result", dispId = 0x4)
    void setResult(Range param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Data", dispId = 0x5)
    String getData();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Data", dispId = 0x5)
    void setData(String param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Next", dispId = 0x6)
    Field getNext();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x7)
    Field getPrevious();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Index", dispId = 0x8)
    Integer getIndex();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ShowCodes", dispId = 0x9)
    Boolean getShowCodes();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ShowCodes", dispId = 0x9)
    void setShowCodes(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "LinkFormat", dispId = 0xa)
    LinkFormat getLinkFormat();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "OLEFormat", dispId = 0xb)
    OLEFormat getOLEFormat();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "InlineShape", dispId = 0xc)
    InlineShape getInlineShape();
            
    /**
     * <p>id(0xffff)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Update", dispId = 0x65)
    Boolean Update();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Unlink", dispId = 0x66)
    void Unlink();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "UpdateSource", dispId = 0x67)
    void UpdateSource();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "DoClick", dispId = 0x68)
    void DoClick();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x69)
    void Copy();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x6a)
    void Cut();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6b)
    void Delete();
            
    
}