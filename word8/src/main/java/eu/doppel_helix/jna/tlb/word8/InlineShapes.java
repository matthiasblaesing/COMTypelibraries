
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
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    InlineShape Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(13)</p>
     * @param FileName [in] {@code String}
     * @param LinkToFile [in, optional] {@code Object}
     * @param SaveWithDocument [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     */
    @ComMethod(name = "AddPicture", dispId = 0x64)
    InlineShape AddPicture(String FileName,
            Object LinkToFile,
            Object SaveWithDocument,
            Object Range);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(14)</p>
     * @param ClassType [in, optional] {@code Object}
     * @param FileName [in, optional] {@code Object}
     * @param LinkToFile [in, optional] {@code Object}
     * @param DisplayAsIcon [in, optional] {@code Object}
     * @param IconFileName [in, optional] {@code Object}
     * @param IconIndex [in, optional] {@code Object}
     * @param IconLabel [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
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
     * <p>vtableId(15)</p>
     * @param ClassType [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     */
    @ComMethod(name = "AddOLEControl", dispId = 0x66)
    InlineShape AddOLEControl(Object ClassType,
            Object Range);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(16)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "New", dispId = 0xc8)
    InlineShape New(Range Range);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(17)</p>
     * @param FileName [in] {@code String}
     * @param Range [in, optional] {@code Object}
     */
    @ComMethod(name = "AddHorizontalLine", dispId = 0x68)
    InlineShape AddHorizontalLine(String FileName,
            Object Range);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(18)</p>
     * @param Range [in, optional] {@code Object}
     */
    @ComMethod(name = "AddHorizontalLineStandard", dispId = 0x69)
    InlineShape AddHorizontalLineStandard(Object Range);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(19)</p>
     * @param FileName [in] {@code String}
     * @param Range [in, optional] {@code Object}
     */
    @ComMethod(name = "AddPictureBullet", dispId = 0x6a)
    InlineShape AddPictureBullet(String FileName,
            Object Range);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(20)</p>
     * @param Type [in, optional] {@code eu.doppel_helix.jna.tlb.office2.XlChartType}
     * @param Range [in, optional] {@code Object}
     */
    @ComMethod(name = "AddChart", dispId = 0x6b)
    InlineShape AddChart(eu.doppel_helix.jna.tlb.office2.XlChartType Type,
            Object Range);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(21)</p>
     * @param Layout [in] {@code eu.doppel_helix.jna.tlb.office2.SmartArtLayout}
     * @param Range [in, optional] {@code Object}
     */
    @ComMethod(name = "AddSmartArt", dispId = 0x6c)
    InlineShape AddSmartArt(eu.doppel_helix.jna.tlb.office2.SmartArtLayout Layout,
            Object Range);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(22)</p>
     * @param EmbedCode [in] {@code String}
     * @param VideoWidth [in] {@code Object}
     * @param VideoHeight [in] {@code Object}
     * @param PosterFrameImage [in, optional] {@code Object}
     * @param Url [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
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
     * <p>vtableId(23)</p>
     * @param Style [in, optional] {@code Integer}
     * @param Type [in, optional] {@code eu.doppel_helix.jna.tlb.office2.XlChartType}
     * @param Range [in, optional] {@code Object}
     * @param NewLayout [in, optional] {@code Object}
     */
    @ComMethod(name = "AddChart2", dispId = 0x6e)
    InlineShape AddChart2(Integer Style,
            eu.doppel_helix.jna.tlb.office2.XlChartType Type,
            Object Range,
            Object NewLayout);
            
    
}