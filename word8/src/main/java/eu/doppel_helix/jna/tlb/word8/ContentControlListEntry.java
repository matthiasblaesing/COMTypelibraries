
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0C6FA8CA-E65F-4FC7-AB8F-20729EECBB14})</p>
 */
@ComInterface(iid="{0C6FA8CA-E65F-4FC7-AB8F-20729EECBB14}")
public interface ContentControlListEntry extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Text", dispId = 0x0)
    String getText();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x0)
    void setText(String param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Value", dispId = 0x68)
    String getValue();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x68)
    void setValue(String param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Index", dispId = 0x69)
    Integer getIndex();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x69)
    void setIndex(Integer param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6a)
    void Delete();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "MoveUp", dispId = 0x6b)
    void MoveUp();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "MoveDown", dispId = 0x6c)
    void MoveDown();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Select", dispId = 0x6d)
    void Select();
            
    
}