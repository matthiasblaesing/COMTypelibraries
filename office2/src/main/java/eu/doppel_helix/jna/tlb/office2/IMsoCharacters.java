
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1731-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1731-0000-0000-C000-000000000046}")
public interface IMsoCharacters extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    ChartFont getFont();
            
    /**
     * <p>id(0xfc)</p>
     * <p>vtableId(13)</p>
     * @param bstr [in] {@code String}
     */
    @ComMethod(name = "Insert", dispId = 0xfc)
    Object Insert(String bstr);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    String getText();
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    void setText(String param0);
            
    /**
     * <p>id(0x5f2)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "PhoneticCharacters", dispId = 0x5f2)
    String getPhoneticCharacters();
            
    /**
     * <p>id(0x5f2)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PhoneticCharacters", dispId = 0x5f2)
    void setPhoneticCharacters(String param0);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    
}