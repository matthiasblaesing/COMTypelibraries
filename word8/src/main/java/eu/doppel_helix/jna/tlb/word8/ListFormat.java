
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
     */
    @ComProperty(name = "ListLevelNumber", dispId = 0x44)
    Integer getListLevelNumber();
            
    /**
     * <p>id(0x44)</p>
     */
    @ComProperty(name = "ListLevelNumber", dispId = 0x44)
    void setListLevelNumber(Integer param0);
            
    /**
     * <p>id(0x45)</p>
     */
    @ComProperty(name = "List", dispId = 0x45)
    List getList();
            
    /**
     * <p>id(0x46)</p>
     */
    @ComProperty(name = "ListTemplate", dispId = 0x46)
    ListTemplate getListTemplate();
            
    /**
     * <p>id(0x47)</p>
     */
    @ComProperty(name = "ListValue", dispId = 0x47)
    Integer getListValue();
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "SingleList", dispId = 0x48)
    Boolean getSingleList();
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "SingleListTemplate", dispId = 0x49)
    Boolean getSingleListTemplate();
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "ListType", dispId = 0x4a)
    WdListType getListType();
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "ListString", dispId = 0x4b)
    String getListString();
            
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
     * <p>id(0xb8)</p>
     */
    @ComMethod(name = "CanContinuePreviousList", dispId = 0xb8)
    WdContinue CanContinuePreviousList(ListTemplate ListTemplate);
            
    /**
     * <p>id(0xb9)</p>
     */
    @ComMethod(name = "RemoveNumbers", dispId = 0xb9)
    void RemoveNumbers(Object NumberType);
            
    /**
     * <p>id(0xba)</p>
     */
    @ComMethod(name = "ConvertNumbersToText", dispId = 0xba)
    void ConvertNumbersToText(Object NumberType);
            
    /**
     * <p>id(0xbb)</p>
     */
    @ComMethod(name = "CountNumberedItems", dispId = 0xbb)
    Integer CountNumberedItems(Object NumberType,
            Object Level);
            
    /**
     * <p>id(0xbc)</p>
     */
    @ComMethod(name = "ApplyBulletDefaultOld", dispId = 0xbc)
    void ApplyBulletDefaultOld();
            
    /**
     * <p>id(0xbd)</p>
     */
    @ComMethod(name = "ApplyNumberDefaultOld", dispId = 0xbd)
    void ApplyNumberDefaultOld();
            
    /**
     * <p>id(0xbe)</p>
     */
    @ComMethod(name = "ApplyOutlineNumberDefaultOld", dispId = 0xbe)
    void ApplyOutlineNumberDefaultOld();
            
    /**
     * <p>id(0xbf)</p>
     */
    @ComMethod(name = "ApplyListTemplateOld", dispId = 0xbf)
    void ApplyListTemplateOld(ListTemplate ListTemplate,
            Object ContinuePreviousList,
            Object ApplyTo);
            
    /**
     * <p>id(0xd2)</p>
     */
    @ComMethod(name = "ListOutdent", dispId = 0xd2)
    void ListOutdent();
            
    /**
     * <p>id(0xd3)</p>
     */
    @ComMethod(name = "ListIndent", dispId = 0xd3)
    void ListIndent();
            
    /**
     * <p>id(0xd4)</p>
     */
    @ComMethod(name = "ApplyBulletDefault", dispId = 0xd4)
    void ApplyBulletDefault(Object DefaultListBehavior);
            
    /**
     * <p>id(0xd5)</p>
     */
    @ComMethod(name = "ApplyNumberDefault", dispId = 0xd5)
    void ApplyNumberDefault(Object DefaultListBehavior);
            
    /**
     * <p>id(0xd6)</p>
     */
    @ComMethod(name = "ApplyOutlineNumberDefault", dispId = 0xd6)
    void ApplyOutlineNumberDefault(Object DefaultListBehavior);
            
    /**
     * <p>id(0xd7)</p>
     */
    @ComMethod(name = "ApplyListTemplate", dispId = 0xd7)
    void ApplyListTemplate(ListTemplate ListTemplate,
            Object ContinuePreviousList,
            Object ApplyTo,
            Object DefaultListBehavior);
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "ListPictureBullet", dispId = 0x4c)
    InlineShape getListPictureBullet();
            
    /**
     * <p>id(0xd8)</p>
     */
    @ComMethod(name = "ApplyListTemplateWithLevel", dispId = 0xd8)
    void ApplyListTemplateWithLevel(ListTemplate ListTemplate,
            Object ContinuePreviousList,
            Object ApplyTo,
            Object DefaultListBehavior,
            Object ApplyLevel);
            
    
}