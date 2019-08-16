
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020899-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020899-0000-0000-C000-000000000046}")
public interface GroupObjects extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1001b)</p>
     * <p>vtableId(44)</p>
     */
    @ComMethod(name = "_Dummy27", dispId = 0x1001b)
    void _Dummy27();
            
    /**
     * <p>id(0x1001c)</p>
     * <p>vtableId(45)</p>
     */
    @ComMethod(name = "_Dummy28", dispId = 0x1001c)
    void _Dummy28();
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    Boolean getAddIndent();
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    void setAddIndent(Boolean param0);
            
    /**
     * <p>id(0x1001e)</p>
     * <p>vtableId(48)</p>
     */
    @ComMethod(name = "_Dummy30", dispId = 0x1001e)
    void _Dummy30();
            
    /**
     * <p>id(0x263)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "ArrowHeadLength", dispId = 0x263)
    Object getArrowHeadLength();
            
    /**
     * <p>id(0x263)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ArrowHeadLength", dispId = 0x263)
    void setArrowHeadLength(Object param0);
            
    /**
     * <p>id(0x264)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "ArrowHeadStyle", dispId = 0x264)
    Object getArrowHeadStyle();
            
    /**
     * <p>id(0x264)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ArrowHeadStyle", dispId = 0x264)
    void setArrowHeadStyle(Object param0);
            
    /**
     * <p>id(0x265)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "ArrowHeadWidth", dispId = 0x265)
    Object getArrowHeadWidth();
            
    /**
     * <p>id(0x265)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ArrowHeadWidth", dispId = 0x265)
    void setArrowHeadWidth(Object param0);
            
    /**
     * <p>id(0x266)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    Boolean getAutoSize();
            
    /**
     * <p>id(0x266)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    void setAutoSize(Boolean param0);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x10024)</p>
     * <p>vtableId(58)</p>
     */
    @ComMethod(name = "_Dummy36", dispId = 0x10024)
    void _Dummy36();
            
    /**
     * <p>id(0x10025)</p>
     * <p>vtableId(59)</p>
     */
    @ComMethod(name = "_Dummy37", dispId = 0x10025)
    void _Dummy37();
            
    /**
     * <p>id(0x10026)</p>
     * <p>vtableId(60)</p>
     */
    @ComMethod(name = "_Dummy38", dispId = 0x10026)
    void _Dummy38();
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(61)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param AlwaysSuggest [in, optional] {@code Object}
     * @param SpellLang [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    Object CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Integer get_Default();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(Integer param0);
            
    /**
     * <p>id(0x10029)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "_Dummy41", dispId = 0x10029)
    void _Dummy41();
            
    /**
     * <p>id(0x1002a)</p>
     * <p>vtableId(65)</p>
     */
    @ComMethod(name = "_Dummy42", dispId = 0x1002a)
    void _Dummy42();
            
    /**
     * <p>id(0x1002b)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "_Dummy43", dispId = 0x1002b)
    void _Dummy43();
            
    /**
     * <p>id(0x1002c)</p>
     * <p>vtableId(67)</p>
     */
    @ComMethod(name = "_Dummy44", dispId = 0x1002c)
    void _Dummy44();
            
    /**
     * <p>id(0x1002d)</p>
     * <p>vtableId(68)</p>
     */
    @ComMethod(name = "_Dummy45", dispId = 0x1002d)
    void _Dummy45();
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x1002f)</p>
     * <p>vtableId(70)</p>
     */
    @ComMethod(name = "_Dummy47", dispId = 0x1002f)
    void _Dummy47();
            
    /**
     * <p>id(0x10030)</p>
     * <p>vtableId(71)</p>
     */
    @ComMethod(name = "_Dummy48", dispId = 0x10030)
    void _Dummy48();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    Object getHorizontalAlignment();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    void setHorizontalAlignment(Object param0);
            
    /**
     * <p>id(0x10032)</p>
     * <p>vtableId(74)</p>
     */
    @ComMethod(name = "_Dummy50", dispId = 0x10032)
    void _Dummy50();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x10034)</p>
     * <p>vtableId(76)</p>
     */
    @ComMethod(name = "_Dummy52", dispId = 0x10034)
    void _Dummy52();
            
    /**
     * <p>id(0x10035)</p>
     * <p>vtableId(77)</p>
     */
    @ComMethod(name = "_Dummy53", dispId = 0x10035)
    void _Dummy53();
            
    /**
     * <p>id(0x10036)</p>
     * <p>vtableId(78)</p>
     */
    @ComMethod(name = "_Dummy54", dispId = 0x10036)
    void _Dummy54();
            
    /**
     * <p>id(0x10037)</p>
     * <p>vtableId(79)</p>
     */
    @ComMethod(name = "_Dummy55", dispId = 0x10037)
    void _Dummy55();
            
    /**
     * <p>id(0x10038)</p>
     * <p>vtableId(80)</p>
     */
    @ComMethod(name = "_Dummy56", dispId = 0x10038)
    void _Dummy56();
            
    /**
     * <p>id(0x10039)</p>
     * <p>vtableId(81)</p>
     */
    @ComMethod(name = "_Dummy57", dispId = 0x10039)
    void _Dummy57();
            
    /**
     * <p>id(0x1003a)</p>
     * <p>vtableId(82)</p>
     */
    @ComMethod(name = "_Dummy58", dispId = 0x1003a)
    void _Dummy58();
            
    /**
     * <p>id(0x1003b)</p>
     * <p>vtableId(83)</p>
     */
    @ComMethod(name = "_Dummy59", dispId = 0x1003b)
    void _Dummy59();
            
    /**
     * <p>id(0x1003c)</p>
     * <p>vtableId(84)</p>
     */
    @ComMethod(name = "_Dummy60", dispId = 0x1003c)
    void _Dummy60();
            
    /**
     * <p>id(0x1003d)</p>
     * <p>vtableId(85)</p>
     */
    @ComMethod(name = "_Dummy61", dispId = 0x1003d)
    void _Dummy61();
            
    /**
     * <p>id(0x1003e)</p>
     * <p>vtableId(86)</p>
     */
    @ComMethod(name = "_Dummy62", dispId = 0x1003e)
    void _Dummy62();
            
    /**
     * <p>id(0x1003f)</p>
     * <p>vtableId(87)</p>
     */
    @ComMethod(name = "_Dummy63", dispId = 0x1003f)
    void _Dummy63();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    Object getOrientation();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(89)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(Object param0);
            
    /**
     * <p>id(0x10041)</p>
     * <p>vtableId(90)</p>
     */
    @ComMethod(name = "_Dummy65", dispId = 0x10041)
    void _Dummy65();
            
    /**
     * <p>id(0x10042)</p>
     * <p>vtableId(91)</p>
     */
    @ComMethod(name = "_Dummy66", dispId = 0x10042)
    void _Dummy66();
            
    /**
     * <p>id(0x10043)</p>
     * <p>vtableId(92)</p>
     */
    @ComMethod(name = "_Dummy67", dispId = 0x10043)
    void _Dummy67();
            
    /**
     * <p>id(0x10044)</p>
     * <p>vtableId(93)</p>
     */
    @ComMethod(name = "_Dummy68", dispId = 0x10044)
    void _Dummy68();
            
    /**
     * <p>id(0x26b)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "RoundedCorners", dispId = 0x26b)
    Boolean getRoundedCorners();
            
    /**
     * <p>id(0x26b)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RoundedCorners", dispId = 0x26b)
    void setRoundedCorners(Boolean param0);
            
    /**
     * <p>id(0x10046)</p>
     * <p>vtableId(96)</p>
     */
    @ComMethod(name = "_Dummy70", dispId = 0x10046)
    void _Dummy70();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Boolean getShadow();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x10048)</p>
     * <p>vtableId(99)</p>
     */
    @ComMethod(name = "_Dummy72", dispId = 0x10048)
    void _Dummy72();
            
    /**
     * <p>id(0x10049)</p>
     * <p>vtableId(100)</p>
     */
    @ComMethod(name = "_Dummy73", dispId = 0x10049)
    void _Dummy73();
            
    /**
     * <p>id(0xf4)</p>
     * <p>vtableId(101)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    com.sun.jna.platform.win32.COM.util.IDispatch Ungroup();
            
    /**
     * <p>id(0x1004b)</p>
     * <p>vtableId(102)</p>
     */
    @ComMethod(name = "_Dummy75", dispId = 0x1004b)
    void _Dummy75();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    Object getVerticalAlignment();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    void setVerticalAlignment(Object param0);
            
    /**
     * <p>id(0x1004d)</p>
     * <p>vtableId(105)</p>
     */
    @ComMethod(name = "_Dummy77", dispId = 0x1004d)
    void _Dummy77();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(106)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(107)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(108)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(109)</p>
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    GroupObject Group();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(110)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Object Index);
            
    
}