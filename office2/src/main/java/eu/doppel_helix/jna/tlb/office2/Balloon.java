
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
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Checkboxes", dispId = 0x60030001)
    com.sun.jna.platform.win32.COM.util.IDispatch getCheckboxes();
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComProperty(name = "Labels", dispId = 0x60030002)
    com.sun.jna.platform.win32.COM.util.IDispatch getLabels();
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComProperty(name = "BalloonType", dispId = 0x60030003)
    void setBalloonType(MsoBalloonType param0);
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComProperty(name = "BalloonType", dispId = 0x60030003)
    MsoBalloonType getBalloonType();
            
    /**
     * <p>id(0x60030005)</p>
     */
    @ComProperty(name = "Icon", dispId = 0x60030005)
    void setIcon(MsoIconType param0);
            
    /**
     * <p>id(0x60030005)</p>
     */
    @ComProperty(name = "Icon", dispId = 0x60030005)
    MsoIconType getIcon();
            
    /**
     * <p>id(0x60030007)</p>
     */
    @ComProperty(name = "Heading", dispId = 0x60030007)
    void setHeading(String param0);
            
    /**
     * <p>id(0x60030007)</p>
     */
    @ComProperty(name = "Heading", dispId = 0x60030007)
    String getHeading();
            
    /**
     * <p>id(0x60030009)</p>
     */
    @ComProperty(name = "Text", dispId = 0x60030009)
    void setText(String param0);
            
    /**
     * <p>id(0x60030009)</p>
     */
    @ComProperty(name = "Text", dispId = 0x60030009)
    String getText();
            
    /**
     * <p>id(0x6003000b)</p>
     */
    @ComProperty(name = "Mode", dispId = 0x6003000b)
    void setMode(MsoModeType param0);
            
    /**
     * <p>id(0x6003000b)</p>
     */
    @ComProperty(name = "Mode", dispId = 0x6003000b)
    MsoModeType getMode();
            
    /**
     * <p>id(0x6003000d)</p>
     */
    @ComProperty(name = "Animation", dispId = 0x6003000d)
    void setAnimation(MsoAnimationType param0);
            
    /**
     * <p>id(0x6003000d)</p>
     */
    @ComProperty(name = "Animation", dispId = 0x6003000d)
    MsoAnimationType getAnimation();
            
    /**
     * <p>id(0x6003000f)</p>
     */
    @ComProperty(name = "Button", dispId = 0x6003000f)
    void setButton(MsoButtonSetType param0);
            
    /**
     * <p>id(0x6003000f)</p>
     */
    @ComProperty(name = "Button", dispId = 0x6003000f)
    MsoButtonSetType getButton();
            
    /**
     * <p>id(0x60030011)</p>
     */
    @ComProperty(name = "Callback", dispId = 0x60030011)
    void setCallback(String param0);
            
    /**
     * <p>id(0x60030011)</p>
     */
    @ComProperty(name = "Callback", dispId = 0x60030011)
    String getCallback();
            
    /**
     * <p>id(0x60030013)</p>
     */
    @ComProperty(name = "Private", dispId = 0x60030013)
    void set_Private(Integer param0);
            
    /**
     * <p>id(0x60030013)</p>
     */
    @ComProperty(name = "Private", dispId = 0x60030013)
    Integer get_Private();
            
    /**
     * <p>id(0x60030015)</p>
     */
    @ComMethod(name = "SetAvoidRectangle", dispId = 0x60030015)
    void SetAvoidRectangle(Integer Left,
            Integer Top,
            Integer Right,
            Integer Bottom);
            
    /**
     * <p>id(0x60030016)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60030016)
    String getName();
            
    /**
     * <p>id(0x60030017)</p>
     */
    @ComMethod(name = "Show", dispId = 0x60030017)
    MsoBalloonButtonType Show();
            
    /**
     * <p>id(0x60030018)</p>
     */
    @ComMethod(name = "Close", dispId = 0x60030018)
    void Close();
            
    
}