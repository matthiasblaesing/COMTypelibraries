
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002093C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002093C-0000-0000-C000-000000000046}")
public interface Borders extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Enable", dispId = 0x2)
    Integer getEnable();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Enable", dispId = 0x2)
    void setEnable(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "DistanceFromTop", dispId = 0x4)
    Integer getDistanceFromTop();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DistanceFromTop", dispId = 0x4)
    void setDistanceFromTop(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x5)
    Boolean getShadow();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x5)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "InsideLineStyle", dispId = 0x6)
    WdLineStyle getInsideLineStyle();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code WdLineStyle}
     */
    @ComProperty(name = "InsideLineStyle", dispId = 0x6)
    void setInsideLineStyle(WdLineStyle param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "OutsideLineStyle", dispId = 0x7)
    WdLineStyle getOutsideLineStyle();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code WdLineStyle}
     */
    @ComProperty(name = "OutsideLineStyle", dispId = 0x7)
    void setOutsideLineStyle(WdLineStyle param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "InsideLineWidth", dispId = 0x8)
    WdLineWidth getInsideLineWidth();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code WdLineWidth}
     */
    @ComProperty(name = "InsideLineWidth", dispId = 0x8)
    void setInsideLineWidth(WdLineWidth param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "OutsideLineWidth", dispId = 0x9)
    WdLineWidth getOutsideLineWidth();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code WdLineWidth}
     */
    @ComProperty(name = "OutsideLineWidth", dispId = 0x9)
    void setOutsideLineWidth(WdLineWidth param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "InsideColorIndex", dispId = 0xa)
    WdColorIndex getInsideColorIndex();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "InsideColorIndex", dispId = 0xa)
    void setInsideColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "OutsideColorIndex", dispId = 0xb)
    WdColorIndex getOutsideColorIndex();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "OutsideColorIndex", dispId = 0xb)
    void setOutsideColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "DistanceFromLeft", dispId = 0x14)
    Integer getDistanceFromLeft();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DistanceFromLeft", dispId = 0x14)
    void setDistanceFromLeft(Integer param0);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "DistanceFromBottom", dispId = 0x15)
    Integer getDistanceFromBottom();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DistanceFromBottom", dispId = 0x15)
    void setDistanceFromBottom(Integer param0);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "DistanceFromRight", dispId = 0x16)
    Integer getDistanceFromRight();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DistanceFromRight", dispId = 0x16)
    void setDistanceFromRight(Integer param0);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "AlwaysInFront", dispId = 0x17)
    Boolean getAlwaysInFront();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlwaysInFront", dispId = 0x17)
    void setAlwaysInFront(Boolean param0);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "SurroundHeader", dispId = 0x18)
    Boolean getSurroundHeader();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SurroundHeader", dispId = 0x18)
    void setSurroundHeader(Boolean param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "SurroundFooter", dispId = 0x19)
    Boolean getSurroundFooter();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SurroundFooter", dispId = 0x19)
    void setSurroundFooter(Boolean param0);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "JoinBorders", dispId = 0x1a)
    Boolean getJoinBorders();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "JoinBorders", dispId = 0x1a)
    void setJoinBorders(Boolean param0);
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "HasHorizontal", dispId = 0x1b)
    Boolean getHasHorizontal();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "HasVertical", dispId = 0x1c)
    Boolean getHasVertical();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "DistanceFrom", dispId = 0x1d)
    WdBorderDistanceFrom getDistanceFrom();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code WdBorderDistanceFrom}
     */
    @ComProperty(name = "DistanceFrom", dispId = 0x1d)
    void setDistanceFrom(WdBorderDistanceFrom param0);
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "EnableFirstPageInSection", dispId = 0x1e)
    Boolean getEnableFirstPageInSection();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableFirstPageInSection", dispId = 0x1e)
    void setEnableFirstPageInSection(Boolean param0);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "EnableOtherPagesInSection", dispId = 0x1f)
    Boolean getEnableOtherPagesInSection();
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableOtherPagesInSection", dispId = 0x1f)
    void setEnableOtherPagesInSection(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(52)</p>
     * @param Index [in] {@code WdBorderType}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Border Item(WdBorderType Index);
            
    /**
     * <p>id(0x7d0)</p>
     * <p>vtableId(53)</p>
     */
    @ComMethod(name = "ApplyPageBordersToAllSections", dispId = 0x7d0)
    void ApplyPageBordersToAllSections();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "InsideColor", dispId = 0x20)
    WdColor getInsideColor();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code WdColor}
     */
    @ComProperty(name = "InsideColor", dispId = 0x20)
    void setInsideColor(WdColor param0);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "OutsideColor", dispId = 0x21)
    WdColor getOutsideColor();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code WdColor}
     */
    @ComProperty(name = "OutsideColor", dispId = 0x21)
    void setOutsideColor(WdColor param0);
            
    
}