
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024427-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024427-0000-0000-C000-000000000046}")
public interface Comment extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x23e)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Author", dispId = 0x23e)
    String getAuthor();
            
    /**
     * <p>id(0x62e)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x62e)
    Shape getShape();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(14)</p>
     * @param Text [in, optional] {@code Object}
     * @param Start [in, optional] {@code Object}
     * @param Overwrite [in, optional] {@code Object}
     */
    @ComMethod(name = "Text", dispId = 0x8a)
    String Text(Object Text,
            Object Start,
            Object Overwrite);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Next", dispId = 0x1f6)
    Comment Next();
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "Previous", dispId = 0x1f7)
    Comment Previous();
            
    
}