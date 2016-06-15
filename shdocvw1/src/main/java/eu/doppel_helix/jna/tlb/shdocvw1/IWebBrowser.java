
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Web Browser interface
 *
 * <p>uuid({EAB22AC1-30C1-11CF-A7EB-0000C05BAE0B})</p>
 */
@ComInterface(iid="{EAB22AC1-30C1-11CF-A7EB-0000C05BAE0B}")
public interface IWebBrowser extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Navigates to the previous item in the history list.
     *
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "GoBack", dispId = 0x64)
    void GoBack();
            
    /**
     * Navigates to the next item in the history list.
     *
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "GoForward", dispId = 0x65)
    void GoForward();
            
    /**
     * Go home/start page.
     *
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "GoHome", dispId = 0x66)
    void GoHome();
            
    /**
     * Go Search Page.
     *
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "GoSearch", dispId = 0x67)
    void GoSearch();
            
    /**
     * Navigates to a URL or file.
     *
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "Navigate", dispId = 0x68)
    void Navigate(String URL,
            Object Flags,
            Object TargetFrameName,
            Object PostData,
            Object Headers);
            
    /**
     * Refresh the currently viewed page.
     *
     * <p>id(0xfffffdda)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0xfffffdda)
    void Refresh();
            
    /**
     * Refresh the currently viewed page.
     *
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "Refresh2", dispId = 0x69)
    void Refresh2(Object Level);
            
    /**
     * Stops opening a file.
     *
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "Stop", dispId = 0x6a)
    void Stop();
            
    /**
     * Returns the application automation object if accessible, this automation object otherwise..
     *
     * <p>id(0xc8)</p>
     */
    @ComProperty(name = "Application", dispId = 0xc8)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * Returns the automation object of the container/parent if one exists or this automation object.
     *
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xc9)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * Returns the container/parent automation object, if any.
     *
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "Container", dispId = 0xca)
    com.sun.jna.platform.win32.COM.util.IDispatch getContainer();
            
    /**
     * Returns the active Document automation object, if any.
     *
     * <p>id(0xcb)</p>
     */
    @ComProperty(name = "Document", dispId = 0xcb)
    com.sun.jna.platform.win32.COM.util.IDispatch getDocument();
            
    /**
     * Returns True if this is the top level object.
     *
     * <p>id(0xcc)</p>
     */
    @ComProperty(name = "TopLevelContainer", dispId = 0xcc)
    Boolean getTopLevelContainer();
            
    /**
     * Returns the type of the contained document object.
     *
     * <p>id(0xcd)</p>
     */
    @ComProperty(name = "Type", dispId = 0xcd)
    String getType();
            
    /**
     * The horizontal position (pixels) of the frame window relative to the screen/container.
     *
     * <p>id(0xce)</p>
     */
    @ComProperty(name = "Left", dispId = 0xce)
    Integer getLeft();
            
    /**
     * The horizontal position (pixels) of the frame window relative to the screen/container.
     *
     * <p>id(0xce)</p>
     */
    @ComProperty(name = "Left", dispId = 0xce)
    void setLeft(Integer param0);
            
    /**
     * The vertical position (pixels) of the frame window relative to the screen/container.
     *
     * <p>id(0xcf)</p>
     */
    @ComProperty(name = "Top", dispId = 0xcf)
    Integer getTop();
            
    /**
     * The vertical position (pixels) of the frame window relative to the screen/container.
     *
     * <p>id(0xcf)</p>
     */
    @ComProperty(name = "Top", dispId = 0xcf)
    void setTop(Integer param0);
            
    /**
     * The horizontal dimension (pixels) of the frame window/object.
     *
     * <p>id(0xd0)</p>
     */
    @ComProperty(name = "Width", dispId = 0xd0)
    Integer getWidth();
            
    /**
     * The horizontal dimension (pixels) of the frame window/object.
     *
     * <p>id(0xd0)</p>
     */
    @ComProperty(name = "Width", dispId = 0xd0)
    void setWidth(Integer param0);
            
    /**
     * The vertical dimension (pixels) of the frame window/object.
     *
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "Height", dispId = 0xd1)
    Integer getHeight();
            
    /**
     * The vertical dimension (pixels) of the frame window/object.
     *
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "Height", dispId = 0xd1)
    void setHeight(Integer param0);
            
    /**
     * Gets the short (UI-friendly) name of the URL/file currently viewed.
     *
     * <p>id(0xd2)</p>
     */
    @ComProperty(name = "LocationName", dispId = 0xd2)
    String getLocationName();
            
    /**
     * Gets the full URL/path currently viewed.
     *
     * <p>id(0xd3)</p>
     */
    @ComProperty(name = "LocationURL", dispId = 0xd3)
    String getLocationURL();
            
    /**
     * Query to see if something is still in progress.
     *
     * <p>id(0xd4)</p>
     */
    @ComProperty(name = "Busy", dispId = 0xd4)
    Boolean getBusy();
            
    
}