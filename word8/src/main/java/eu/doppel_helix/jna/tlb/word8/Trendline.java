
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({91C46192-3124-4346-A815-10B8873F5A06})</p>
 */
@ComInterface(iid="{91C46192-3124-4346-A815-10B8873F5A06}")
public interface Trendline extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xb9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Backward", dispId = 0xb9)
    Double getBackward();
            
    /**
     * <p>id(0xb9)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Backward", dispId = 0xb9)
    void setBackward(Double param0);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0x9e)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DataLabel", dispId = 0x9e)
    DataLabel getDataLabel();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0xbe)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "DisplayEquation", dispId = 0xbe)
    Boolean getDisplayEquation();
            
    /**
     * <p>id(0xbe)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayEquation", dispId = 0xbe)
    void setDisplayEquation(Boolean param0);
            
    /**
     * <p>id(0xbd)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "DisplayRSquared", dispId = 0xbd)
    Boolean getDisplayRSquared();
            
    /**
     * <p>id(0xbd)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRSquared", dispId = 0xbd)
    void setDisplayRSquared(Boolean param0);
            
    /**
     * <p>id(0xbf)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Forward", dispId = 0xbf)
    Double getForward();
            
    /**
     * <p>id(0xbf)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Forward", dispId = 0xbf)
    void setForward(Double param0);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0xba)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Intercept", dispId = 0xba)
    Double getIntercept();
            
    /**
     * <p>id(0xba)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Intercept", dispId = 0xba)
    void setIntercept(Double param0);
            
    /**
     * <p>id(0xbb)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "InterceptIsAuto", dispId = 0xbb)
    Boolean getInterceptIsAuto();
            
    /**
     * <p>id(0xbb)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InterceptIsAuto", dispId = 0xbb)
    void setInterceptIsAuto(Boolean param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "NameIsAuto", dispId = 0xbc)
    Boolean getNameIsAuto();
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NameIsAuto", dispId = 0xbc)
    void setNameIsAuto(Boolean param0);
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    Integer getOrder();
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    void setOrder(Integer param0);
            
    /**
     * <p>id(0xb8)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Period", dispId = 0xb8)
    Integer getPeriod();
            
    /**
     * <p>id(0xb8)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Period", dispId = 0xb8)
    void setPeriod(Integer param0);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlTrendlineType getType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code XlTrendlineType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(XlTrendlineType param0);
            
    /**
     * <p>id(0x6002001d)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Format", dispId = 0x6002001d)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0xa5a)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Backward2", dispId = 0xa5a)
    Double getBackward2();
            
    /**
     * <p>id(0xa5a)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Backward2", dispId = 0xa5a)
    void setBackward2(Double param0);
            
    /**
     * <p>id(0xa5b)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Forward2", dispId = 0xa5b)
    Double getForward2();
            
    /**
     * <p>id(0xa5b)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Forward2", dispId = 0xa5b)
    void setForward2(Double param0);
            
    
}