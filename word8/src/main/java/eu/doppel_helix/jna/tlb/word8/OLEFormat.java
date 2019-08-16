
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020933-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020933-0000-0000-C000-000000000046}")
public interface OLEFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ClassType", dispId = 0x2)
    String getClassType();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ClassType", dispId = 0x2)
    void setClassType(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DisplayAsIcon", dispId = 0x3)
    Boolean getDisplayAsIcon();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAsIcon", dispId = 0x3)
    void setDisplayAsIcon(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IconName", dispId = 0x7)
    String getIconName();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "IconName", dispId = 0x7)
    void setIconName(String param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "IconPath", dispId = 0x8)
    String getIconPath();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "IconIndex", dispId = 0x9)
    Integer getIconIndex();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "IconIndex", dispId = 0x9)
    void setIconIndex(Integer param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "IconLabel", dispId = 0xa)
    String getIconLabel();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "IconLabel", dispId = 0xa)
    void setIconLabel(String param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Label", dispId = 0xc)
    String getLabel();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Object", dispId = 0xe)
    com.sun.jna.platform.win32.COM.util.IDispatch getObject();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ProgID", dispId = 0x16)
    String getProgID();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x68)
    void Activate();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "Edit", dispId = 0x6a)
    void Edit();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "Open", dispId = 0x6b)
    void Open();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(27)</p>
     * @param VerbIndex [in, optional] {@code Object}
     */
    @ComMethod(name = "DoVerb", dispId = 0x6d)
    void DoVerb(Object VerbIndex);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(28)</p>
     * @param ClassType [in, optional] {@code Object}
     * @param DisplayAsIcon [in, optional] {@code Object}
     * @param IconFileName [in, optional] {@code Object}
     * @param IconIndex [in, optional] {@code Object}
     * @param IconLabel [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertTo", dispId = 0x6e)
    void ConvertTo(Object ClassType,
            Object DisplayAsIcon,
            Object IconFileName,
            Object IconIndex,
            Object IconLabel);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(29)</p>
     * @param ClassType [in] {@code String}
     */
    @ComMethod(name = "ActivateAs", dispId = 0x6f)
    void ActivateAs(String ClassType);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "PreserveFormattingOnUpdate", dispId = 0x70)
    Boolean getPreserveFormattingOnUpdate();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveFormattingOnUpdate", dispId = 0x70)
    void setPreserveFormattingOnUpdate(Boolean param0);
            
    
}