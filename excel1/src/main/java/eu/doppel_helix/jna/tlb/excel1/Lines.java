
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002089B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002089B-0000-0000-C000-000000000046}")
public interface Lines extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x10003)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "_Dummy3", dispId = 0x10003)
    void _Dummy3();
            
    /**
     * <p>id(0x25a)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "BringToFront", dispId = 0x25a)
    Object BringToFront();
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    Object Copy();
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(13)</p>
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param Format [in, optional] {@code XlCopyPictureFormat}
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    Object CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format);
            
    /**
     * <p>id(0x235)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    Object Cut();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x40f)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0x40f)
    com.sun.jna.platform.win32.COM.util.IDispatch Duplicate();
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    Boolean getEnabled();
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x1000c)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "_Dummy12", dispId = 0x1000c)
    void _Dummy12();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Boolean getLocked();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x1000f)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "_Dummy15", dispId = 0x1000f)
    void _Dummy15();
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    String getOnAction();
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    void setOnAction(String param0);
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    Object getPlacement();
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    void setPlacement(Object param0);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    Boolean getPrintObject();
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    void setPrintObject(Boolean param0);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(33)</p>
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select(Object Replace);
            
    /**
     * <p>id(0x25d)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "SendToBack", dispId = 0x25d)
    Object SendToBack();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x10016)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "_Dummy22", dispId = 0x10016)
    void _Dummy22();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x26e)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "ZOrder", dispId = 0x26e)
    Integer getZOrder();
            
    /**
     * <p>id(0x5f8)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x5f8)
    ShapeRange getShapeRange();
            
    /**
     * <p>id(0x263)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "ArrowHeadLength", dispId = 0x263)
    Object getArrowHeadLength();
            
    /**
     * <p>id(0x263)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ArrowHeadLength", dispId = 0x263)
    void setArrowHeadLength(Object param0);
            
    /**
     * <p>id(0x264)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "ArrowHeadStyle", dispId = 0x264)
    Object getArrowHeadStyle();
            
    /**
     * <p>id(0x264)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ArrowHeadStyle", dispId = 0x264)
    void setArrowHeadStyle(Object param0);
            
    /**
     * <p>id(0x265)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "ArrowHeadWidth", dispId = 0x265)
    Object getArrowHeadWidth();
            
    /**
     * <p>id(0x265)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ArrowHeadWidth", dispId = 0x265)
    void setArrowHeadWidth(Object param0);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(51)</p>
     * @param X1 [in] {@code Double}
     * @param Y1 [in] {@code Double}
     * @param X2 [in] {@code Double}
     * @param Y2 [in] {@code Double}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    Line Add(Double X1,
            Double Y1,
            Double X2,
            Double Y2);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(53)</p>
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    GroupObject Group();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(54)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Object Index);
            
    
}