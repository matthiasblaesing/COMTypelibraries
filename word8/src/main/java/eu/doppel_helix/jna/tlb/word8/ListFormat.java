
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209C0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209C0-0000-0000-C000-000000000046}")
public interface ListFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "ListLevelNumber", dispId = 0x44)
    Integer getListLevelNumber();
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ListLevelNumber", dispId = 0x44)
    void setListLevelNumber(Integer param0);
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "List", dispId = 0x45)
    List getList();
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ListTemplate", dispId = 0x46)
    ListTemplate getListTemplate();
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ListValue", dispId = 0x47)
    Integer getListValue();
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "SingleList", dispId = 0x48)
    Boolean getSingleList();
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "SingleListTemplate", dispId = 0x49)
    Boolean getSingleListTemplate();
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ListType", dispId = 0x4a)
    WdListType getListType();
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ListString", dispId = 0x4b)
    String getListString();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xb8)</p>
     * <p>vtableId(19)</p>
     * @param ListTemplate [in] {@code ListTemplate}
     */
    @ComMethod(name = "CanContinuePreviousList", dispId = 0xb8)
    WdContinue CanContinuePreviousList(ListTemplate ListTemplate);
            
    /**
     * <p>id(0xb9)</p>
     * <p>vtableId(20)</p>
     * @param NumberType [in, optional] {@code Object}
     */
    @ComMethod(name = "RemoveNumbers", dispId = 0xb9)
    void RemoveNumbers(Object NumberType);
            
    /**
     * <p>id(0xba)</p>
     * <p>vtableId(21)</p>
     * @param NumberType [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertNumbersToText", dispId = 0xba)
    void ConvertNumbersToText(Object NumberType);
            
    /**
     * <p>id(0xbb)</p>
     * <p>vtableId(22)</p>
     * @param NumberType [in, optional] {@code Object}
     * @param Level [in, optional] {@code Object}
     */
    @ComMethod(name = "CountNumberedItems", dispId = 0xbb)
    Integer CountNumberedItems(Object NumberType,
            Object Level);
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "ApplyBulletDefaultOld", dispId = 0xbc)
    void ApplyBulletDefaultOld();
            
    /**
     * <p>id(0xbd)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "ApplyNumberDefaultOld", dispId = 0xbd)
    void ApplyNumberDefaultOld();
            
    /**
     * <p>id(0xbe)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "ApplyOutlineNumberDefaultOld", dispId = 0xbe)
    void ApplyOutlineNumberDefaultOld();
            
    /**
     * <p>id(0xbf)</p>
     * <p>vtableId(26)</p>
     * @param ListTemplate [in] {@code ListTemplate}
     * @param ContinuePreviousList [in, optional] {@code Object}
     * @param ApplyTo [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyListTemplateOld", dispId = 0xbf)
    void ApplyListTemplateOld(ListTemplate ListTemplate,
            Object ContinuePreviousList,
            Object ApplyTo);
            
    /**
     * <p>id(0xd2)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "ListOutdent", dispId = 0xd2)
    void ListOutdent();
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "ListIndent", dispId = 0xd3)
    void ListIndent();
            
    /**
     * <p>id(0xd4)</p>
     * <p>vtableId(29)</p>
     * @param DefaultListBehavior [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyBulletDefault", dispId = 0xd4)
    void ApplyBulletDefault(Object DefaultListBehavior);
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(30)</p>
     * @param DefaultListBehavior [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyNumberDefault", dispId = 0xd5)
    void ApplyNumberDefault(Object DefaultListBehavior);
            
    /**
     * <p>id(0xd6)</p>
     * <p>vtableId(31)</p>
     * @param DefaultListBehavior [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyOutlineNumberDefault", dispId = 0xd6)
    void ApplyOutlineNumberDefault(Object DefaultListBehavior);
            
    /**
     * <p>id(0xd7)</p>
     * <p>vtableId(32)</p>
     * @param ListTemplate [in] {@code ListTemplate}
     * @param ContinuePreviousList [in, optional] {@code Object}
     * @param ApplyTo [in, optional] {@code Object}
     * @param DefaultListBehavior [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyListTemplate", dispId = 0xd7)
    void ApplyListTemplate(ListTemplate ListTemplate,
            Object ContinuePreviousList,
            Object ApplyTo,
            Object DefaultListBehavior);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "ListPictureBullet", dispId = 0x4c)
    InlineShape getListPictureBullet();
            
    /**
     * <p>id(0xd8)</p>
     * <p>vtableId(34)</p>
     * @param ListTemplate [in] {@code ListTemplate}
     * @param ContinuePreviousList [in, optional] {@code Object}
     * @param ApplyTo [in, optional] {@code Object}
     * @param DefaultListBehavior [in, optional] {@code Object}
     * @param ApplyLevel [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyListTemplateWithLevel", dispId = 0xd8)
    void ApplyListTemplateWithLevel(ListTemplate ListTemplate,
            Object ContinuePreviousList,
            Object ApplyTo,
            Object DefaultListBehavior,
            Object ApplyLevel);
            
    
}