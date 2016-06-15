
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002088F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002088F-0000-0000-C000-000000000046}")
public interface DialogFrame extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x10003)</p>
     */
    @ComMethod(name = "_Dummy3", dispId = 0x10003)
    void _Dummy3();
            
    /**
     * <p>id(0x10004)</p>
     */
    @ComMethod(name = "_Dummy4", dispId = 0x10004)
    void _Dummy4();
            
    /**
     * <p>id(0x10005)</p>
     */
    @ComMethod(name = "_Dummy5", dispId = 0x10005)
    void _Dummy5();
            
    /**
     * <p>id(0xd5)</p>
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    Object CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format);
            
    /**
     * <p>id(0x10007)</p>
     */
    @ComMethod(name = "_Dummy7", dispId = 0x10007)
    void _Dummy7();
            
    /**
     * <p>id(0x10008)</p>
     */
    @ComMethod(name = "_Dummy8", dispId = 0x10008)
    void _Dummy8();
            
    /**
     * <p>id(0x10009)</p>
     */
    @ComMethod(name = "_Dummy9", dispId = 0x10009)
    void _Dummy9();
            
    /**
     * <p>id(0x1000a)</p>
     */
    @ComMethod(name = "_Dummy10", dispId = 0x1000a)
    void _Dummy10();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x1000c)</p>
     */
    @ComMethod(name = "_Dummy12", dispId = 0x1000c)
    void _Dummy12();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Boolean getLocked();
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    String getOnAction();
            
    /**
     * <p>id(0x254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    void setOnAction(String param0);
            
    /**
     * <p>id(0x10011)</p>
     */
    @ComMethod(name = "_Dummy17", dispId = 0x10011)
    void _Dummy17();
            
    /**
     * <p>id(0x10012)</p>
     */
    @ComMethod(name = "_Dummy18", dispId = 0x10012)
    void _Dummy18();
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select(Object Replace);
            
    /**
     * <p>id(0x10014)</p>
     */
    @ComMethod(name = "_Dummy20", dispId = 0x10014)
    void _Dummy20();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x10016)</p>
     */
    @ComMethod(name = "_Dummy22", dispId = 0x10016)
    void _Dummy22();
            
    /**
     * <p>id(0x10017)</p>
     */
    @ComMethod(name = "_Dummy23", dispId = 0x10017)
    void _Dummy23();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x10019)</p>
     */
    @ComMethod(name = "_Dummy25", dispId = 0x10019)
    void _Dummy25();
            
    /**
     * <p>id(0x5f8)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x5f8)
    ShapeRange getShapeRange();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x25b)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    Characters getCharacters(Object Start,
            Object Length);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    Object CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang);
            
    /**
     * <p>id(0x268)</p>
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    Boolean getLockedText();
            
    /**
     * <p>id(0x268)</p>
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    void setLockedText(Boolean param0);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    String getText();
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    void setText(String param0);
            
    
}