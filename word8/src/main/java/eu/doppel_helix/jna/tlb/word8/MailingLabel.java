
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020917-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020917-0000-0000-C000-000000000046}")
public interface MailingLabel extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "DefaultPrintBarCode", dispId = 0x2)
    Boolean getDefaultPrintBarCode();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DefaultPrintBarCode", dispId = 0x2)
    void setDefaultPrintBarCode(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DefaultLaserTray", dispId = 0x4)
    WdPaperTray getDefaultLaserTray();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdPaperTray}
     */
    @ComProperty(name = "DefaultLaserTray", dispId = 0x4)
    void setDefaultLaserTray(WdPaperTray param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "CustomLabels", dispId = 0x8)
    CustomLabels getCustomLabels();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "DefaultLabelName", dispId = 0x9)
    String getDefaultLabelName();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultLabelName", dispId = 0x9)
    void setDefaultLabelName(String param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(17)</p>
     * @param Name [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param ExtractAddress [in, optional] {@code Object}
     * @param LaserTray [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateNewDocument2000", dispId = 0x65)
    Document CreateNewDocument2000(Object Name,
            Object Address,
            Object AutoText,
            Object ExtractAddress,
            Object LaserTray);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(18)</p>
     * @param Name [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     * @param ExtractAddress [in, optional] {@code Object}
     * @param LaserTray [in, optional] {@code Object}
     * @param SingleLabel [in, optional] {@code Object}
     * @param Row [in, optional] {@code Object}
     * @param Column [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut2000", dispId = 0x66)
    void PrintOut2000(Object Name,
            Object Address,
            Object ExtractAddress,
            Object LaserTray,
            Object SingleLabel,
            Object Row,
            Object Column);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "LabelOptions", dispId = 0x67)
    void LabelOptions();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(20)</p>
     * @param Name [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param ExtractAddress [in, optional] {@code Object}
     * @param LaserTray [in, optional] {@code Object}
     * @param PrintEPostageLabel [in, optional] {@code Object}
     * @param Vertical [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateNewDocument", dispId = 0x68)
    Document CreateNewDocument(Object Name,
            Object Address,
            Object AutoText,
            Object ExtractAddress,
            Object LaserTray,
            Object PrintEPostageLabel,
            Object Vertical);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(21)</p>
     * @param Name [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     * @param ExtractAddress [in, optional] {@code Object}
     * @param LaserTray [in, optional] {@code Object}
     * @param SingleLabel [in, optional] {@code Object}
     * @param Row [in, optional] {@code Object}
     * @param Column [in, optional] {@code Object}
     * @param PrintEPostageLabel [in, optional] {@code Object}
     * @param Vertical [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut", dispId = 0x69)
    void PrintOut(Object Name,
            Object Address,
            Object ExtractAddress,
            Object LaserTray,
            Object SingleLabel,
            Object Row,
            Object Column,
            Object PrintEPostageLabel,
            Object Vertical);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Vertical", dispId = 0xa)
    Boolean getVertical();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Vertical", dispId = 0xa)
    void setVertical(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(24)</p>
     * @param LabelID [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param ExtractAddress [in, optional] {@code Object}
     * @param LaserTray [in, optional] {@code Object}
     * @param PrintEPostageLabel [in, optional] {@code Object}
     * @param Vertical [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateNewDocumentByID", dispId = 0x6a)
    Document CreateNewDocumentByID(Object LabelID,
            Object Address,
            Object AutoText,
            Object ExtractAddress,
            Object LaserTray,
            Object PrintEPostageLabel,
            Object Vertical);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(25)</p>
     * @param LabelID [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     * @param ExtractAddress [in, optional] {@code Object}
     * @param LaserTray [in, optional] {@code Object}
     * @param SingleLabel [in, optional] {@code Object}
     * @param Row [in, optional] {@code Object}
     * @param Column [in, optional] {@code Object}
     * @param PrintEPostageLabel [in, optional] {@code Object}
     * @param Vertical [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOutByID", dispId = 0x6b)
    void PrintOutByID(Object LabelID,
            Object Address,
            Object ExtractAddress,
            Object LaserTray,
            Object SingleLabel,
            Object Row,
            Object Column,
            Object PrintEPostageLabel,
            Object Vertical);
            
    
}