
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002088C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002088C-0000-0000-C000-000000000046}")
public interface DropDowns extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x353)</p>
     * <p>vtableId(44)</p>
     * @param Text [in] {@code Object}
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "AddItem", dispId = 0x353)
    Object AddItem(Object Text,
            Object Index);
            
    /**
     * <p>id(0x462)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Display3DShading", dispId = 0x462)
    Boolean getDisplay3DShading();
            
    /**
     * <p>id(0x462)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Display3DShading", dispId = 0x462)
    void setDisplay3DShading(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Integer get_Default();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(Integer param0);
            
    /**
     * <p>id(0x422)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    String getLinkedCell();
            
    /**
     * <p>id(0x422)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    void setLinkedCell(String param0);
            
    /**
     * <p>id(0x1001f)</p>
     * <p>vtableId(51)</p>
     */
    @ComMethod(name = "_Dummy31", dispId = 0x1001f)
    void _Dummy31();
            
    /**
     * <p>id(0x35d)</p>
     * <p>vtableId(52)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "List", dispId = 0x35d)
    Object getList(Object Index);
            
    /**
     * <p>id(0x35d)</p>
     * <p>vtableId(53)</p>
     * @param Index [in, optional] {@code Object}
     * @param param1 [in] {@code Object}
     */
    @ComProperty(name = "List", dispId = 0x35d)
    void setList(Object Index,
            Object param1);
            
    /**
     * <p>id(0x10021)</p>
     * <p>vtableId(54)</p>
     */
    @ComMethod(name = "_Dummy33", dispId = 0x10021)
    void _Dummy33();
            
    /**
     * <p>id(0x34f)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    String getListFillRange();
            
    /**
     * <p>id(0x34f)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    void setListFillRange(String param0);
            
    /**
     * <p>id(0x352)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    Integer getListIndex();
            
    /**
     * <p>id(0x352)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    void setListIndex(Integer param0);
            
    /**
     * <p>id(0x10024)</p>
     * <p>vtableId(59)</p>
     */
    @ComMethod(name = "_Dummy36", dispId = 0x10024)
    void _Dummy36();
            
    /**
     * <p>id(0x355)</p>
     * <p>vtableId(60)</p>
     */
    @ComMethod(name = "RemoveAllItems", dispId = 0x355)
    Object RemoveAllItems();
            
    /**
     * <p>id(0x354)</p>
     * <p>vtableId(61)</p>
     * @param Index [in] {@code Integer}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "RemoveItem", dispId = 0x354)
    Object RemoveItem(Integer Index,
            Object Count);
            
    /**
     * <p>id(0x463)</p>
     * <p>vtableId(62)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "Selected", dispId = 0x463)
    Object getSelected(Object Index);
            
    /**
     * <p>id(0x463)</p>
     * <p>vtableId(63)</p>
     * @param Index [in, optional] {@code Object}
     * @param param1 [in] {@code Object}
     */
    @ComProperty(name = "Selected", dispId = 0x463)
    void setSelected(Object Index,
            Object param1);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Integer getValue();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(Integer param0);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(68)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    Characters getCharacters(Object Start,
            Object Length);
            
    /**
     * <p>id(0x350)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    Integer getDropDownLines();
            
    /**
     * <p>id(0x350)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    void setDropDownLines(Integer param0);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    String getText();
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    void setText(String param0);
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(73)</p>
     * @param Left [in] {@code Double}
     * @param Top [in] {@code Double}
     * @param Width [in] {@code Double}
     * @param Height [in] {@code Double}
     * @param Editable [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    DropDown Add(Double Left,
            Double Top,
            Double Width,
            Double Height,
            Object Editable);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    GroupObject Group();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(76)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Object Index);
            
    
}