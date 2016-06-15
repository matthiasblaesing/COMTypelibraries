
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209A9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209A9-0000-0000-C000-000000000046}")
public interface InlineShapes extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    InlineShape Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "AddPicture", dispId = 0x64)
    InlineShape AddPicture(String FileName,
            Object LinkToFile,
            Object SaveWithDocument,
            Object Range);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComMethod(name = "AddOLEObject", dispId = 0x18)
    InlineShape AddOLEObject(Object ClassType,
            Object FileName,
            Object LinkToFile,
            Object DisplayAsIcon,
            Object IconFileName,
            Object IconIndex,
            Object IconLabel,
            Object Range);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "AddOLEControl", dispId = 0x66)
    InlineShape AddOLEControl(Object ClassType,
            Object Range);
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComMethod(name = "New", dispId = 0xc8)
    InlineShape New(Range Range);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "AddHorizontalLine", dispId = 0x68)
    InlineShape AddHorizontalLine(String FileName,
            Object Range);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "AddHorizontalLineStandard", dispId = 0x69)
    InlineShape AddHorizontalLineStandard(Object Range);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "AddPictureBullet", dispId = 0x6a)
    InlineShape AddPictureBullet(String FileName,
            Object Range);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComMethod(name = "AddChart", dispId = 0x6b)
    InlineShape AddChart(eu.doppel_helix.jna.tlb.office2.XlChartType Type,
            Object Range);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComMethod(name = "AddSmartArt", dispId = 0x6c)
    InlineShape AddSmartArt(eu.doppel_helix.jna.tlb.office2.SmartArtLayout Layout,
            Object Range);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComMethod(name = "AddWebVideo", dispId = 0x6d)
    InlineShape AddWebVideo(String EmbedCode,
            Object VideoWidth,
            Object VideoHeight,
            Object PosterFrameImage,
            Object Url,
            Object Range);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComMethod(name = "AddChart2", dispId = 0x6e)
    InlineShape AddChart2(Integer Style,
            eu.doppel_helix.jna.tlb.office2.XlChartType Type,
            Object Range,
            Object NewLayout);
            
    
}