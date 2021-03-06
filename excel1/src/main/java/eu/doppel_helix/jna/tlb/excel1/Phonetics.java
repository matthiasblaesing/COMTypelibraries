
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024447-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024447-0000-0000-C000-000000000046}")
public interface Phonetics extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x76)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0x260)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Start", dispId = 0x260)
    Integer getStart();
            
    /**
     * <p>id(0x261)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Length", dispId = 0x261)
    Integer getLength();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x68a)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "CharacterType", dispId = 0x68a)
    Integer getCharacterType();
            
    /**
     * <p>id(0x68a)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CharacterType", dispId = 0x68a)
    void setCharacterType(Integer param0);
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x1c5)
    Integer getAlignment();
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Alignment", dispId = 0x1c5)
    void setAlignment(Integer param0);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(20)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.COM.util.IDispatch getItem(Integer Index);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(22)</p>
     * @param Start [in] {@code Integer}
     * @param Length [in] {@code Integer}
     * @param Text [in] {@code String}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    void Add(Integer Start,
            Integer Length,
            String Text);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    String getText();
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    void setText(String param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(25)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.COM.util.IDispatch get_Default(Integer Index);
            
    
}