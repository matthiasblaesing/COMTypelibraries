
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0324-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0324-0000-0000-C000-000000000046}")
public interface Balloon extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Checkboxes", dispId = 0x60030001)
    com.sun.jna.platform.win32.COM.util.IDispatch getCheckboxes();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Labels", dispId = 0x60030002)
    com.sun.jna.platform.win32.COM.util.IDispatch getLabels();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code MsoBalloonType}
     */
    @ComProperty(name = "BalloonType", dispId = 0x60030003)
    void setBalloonType(MsoBalloonType param0);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "BalloonType", dispId = 0x60030003)
    MsoBalloonType getBalloonType();
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code MsoIconType}
     */
    @ComProperty(name = "Icon", dispId = 0x60030005)
    void setIcon(MsoIconType param0);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Icon", dispId = 0x60030005)
    MsoIconType getIcon();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Heading", dispId = 0x60030007)
    void setHeading(String param0);
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Heading", dispId = 0x60030007)
    String getHeading();
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x60030009)
    void setText(String param0);
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Text", dispId = 0x60030009)
    String getText();
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code MsoModeType}
     */
    @ComProperty(name = "Mode", dispId = 0x6003000b)
    void setMode(MsoModeType param0);
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Mode", dispId = 0x6003000b)
    MsoModeType getMode();
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code MsoAnimationType}
     */
    @ComProperty(name = "Animation", dispId = 0x6003000d)
    void setAnimation(MsoAnimationType param0);
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Animation", dispId = 0x6003000d)
    MsoAnimationType getAnimation();
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code MsoButtonSetType}
     */
    @ComProperty(name = "Button", dispId = 0x6003000f)
    void setButton(MsoButtonSetType param0);
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Button", dispId = 0x6003000f)
    MsoButtonSetType getButton();
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Callback", dispId = 0x60030011)
    void setCallback(String param0);
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Callback", dispId = 0x60030011)
    String getCallback();
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Private", dispId = 0x60030013)
    void set_Private(Integer param0);
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Private", dispId = 0x60030013)
    Integer get_Private();
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(30)</p>
     * @param Left [in] {@code Integer}
     * @param Top [in] {@code Integer}
     * @param Right [in] {@code Integer}
     * @param Bottom [in] {@code Integer}
     */
    @ComMethod(name = "SetAvoidRectangle", dispId = 0x60030015)
    void SetAvoidRectangle(Integer Left,
            Integer Top,
            Integer Right,
            Integer Bottom);
            
    /**
     * <p>id(0x60030016)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60030016)
    String getName();
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "Show", dispId = 0x60030017)
    MsoBalloonButtonType Show();
            
    /**
     * <p>id(0x60030018)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Close", dispId = 0x60030018)
    void Close();
            
    
}