
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002099F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002099F-0000-0000-C000-000000000046}")
public interface Shapes extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1f40)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1f40)
    Application getApplication();
            
    /**
     * <p>id(0x1f41)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x1f41)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Shape Item(Object Index);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(13)</p>
     * @param Type [in] {@code eu.doppel_helix.jna.tlb.office2.MsoCalloutType}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddCallout", dispId = 0xa)
    Shape AddCallout(eu.doppel_helix.jna.tlb.office2.MsoCalloutType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            Object Anchor);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(14)</p>
     * @param Type [in] {@code eu.doppel_helix.jna.tlb.office2.MsoConnectorType}
     * @param BeginX [in] {@code Float}
     * @param BeginY [in] {@code Float}
     * @param EndX [in] {@code Float}
     * @param EndY [in] {@code Float}
     */
    @ComMethod(name = "AddConnector", dispId = 0xb)
    Shape AddConnector(eu.doppel_helix.jna.tlb.office2.MsoConnectorType Type,
            Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(15)</p>
     * @param SafeArrayOfPoints [in] {@code Object}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddCurve", dispId = 0xc)
    Shape AddCurve(Object SafeArrayOfPoints,
            Object Anchor);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(16)</p>
     * @param Orientation [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTextOrientation}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddLabel", dispId = 0xd)
    Shape AddLabel(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation Orientation,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            Object Anchor);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(17)</p>
     * @param BeginX [in] {@code Float}
     * @param BeginY [in] {@code Float}
     * @param EndX [in] {@code Float}
     * @param EndY [in] {@code Float}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddLine", dispId = 0xe)
    Shape AddLine(Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY,
            Object Anchor);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(18)</p>
     * @param FileName [in] {@code String}
     * @param LinkToFile [in, optional] {@code Object}
     * @param SaveWithDocument [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddPicture", dispId = 0xf)
    Shape AddPicture(String FileName,
            Object LinkToFile,
            Object SaveWithDocument,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            Object Anchor);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(19)</p>
     * @param SafeArrayOfPoints [in] {@code Object}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddPolyline", dispId = 0x10)
    Shape AddPolyline(Object SafeArrayOfPoints,
            Object Anchor);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(20)</p>
     * @param Type [in] {@code Integer}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddShape", dispId = 0x11)
    Shape AddShape(Integer Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            Object Anchor);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(21)</p>
     * @param PresetTextEffect [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPresetTextEffect}
     * @param Text [in] {@code String}
     * @param FontName [in] {@code String}
     * @param FontSize [in] {@code Float}
     * @param FontBold [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param FontItalic [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddTextEffect", dispId = 0x12)
    Shape AddTextEffect(eu.doppel_helix.jna.tlb.office2.MsoPresetTextEffect PresetTextEffect,
            String Text,
            String FontName,
            Float FontSize,
            eu.doppel_helix.jna.tlb.office2.MsoTriState FontBold,
            eu.doppel_helix.jna.tlb.office2.MsoTriState FontItalic,
            Float Left,
            Float Top,
            Object Anchor);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(22)</p>
     * @param Orientation [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTextOrientation}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddTextbox", dispId = 0x13)
    Shape AddTextbox(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation Orientation,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            Object Anchor);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(23)</p>
     * @param EditingType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEditingType}
     * @param X1 [in] {@code Float}
     * @param Y1 [in] {@code Float}
     */
    @ComMethod(name = "BuildFreeform", dispId = 0x14)
    FreeformBuilder BuildFreeform(eu.doppel_helix.jna.tlb.office2.MsoEditingType EditingType,
            Float X1,
            Float Y1);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(24)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Range", dispId = 0x15)
    ShapeRange Range(Object Index);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "SelectAll", dispId = 0x16)
    void SelectAll();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(26)</p>
     * @param ClassType [in, optional] {@code Object}
     * @param FileName [in, optional] {@code Object}
     * @param LinkToFile [in, optional] {@code Object}
     * @param DisplayAsIcon [in, optional] {@code Object}
     * @param IconFileName [in, optional] {@code Object}
     * @param IconIndex [in, optional] {@code Object}
     * @param IconLabel [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddOLEObject", dispId = 0x18)
    Shape AddOLEObject(Object ClassType,
            Object FileName,
            Object LinkToFile,
            Object DisplayAsIcon,
            Object IconFileName,
            Object IconIndex,
            Object IconLabel,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            Object Anchor);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(27)</p>
     * @param ClassType [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddOLEControl", dispId = 0x66)
    Shape AddOLEControl(Object ClassType,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            Object Anchor);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(28)</p>
     * @param Type [in] {@code eu.doppel_helix.jna.tlb.office2.MsoDiagramType}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddDiagram", dispId = 0x17)
    Shape AddDiagram(eu.doppel_helix.jna.tlb.office2.MsoDiagramType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            Object Anchor);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(29)</p>
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddCanvas", dispId = 0x19)
    Shape AddCanvas(Float Left,
            Float Top,
            Float Width,
            Float Height,
            Object Anchor);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(30)</p>
     * @param Type [in, optional] {@code eu.doppel_helix.jna.tlb.office2.XlChartType}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddChart", dispId = 0x67)
    Shape AddChart(eu.doppel_helix.jna.tlb.office2.XlChartType Type,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            Object Anchor);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(31)</p>
     * @param Layout [in] {@code eu.doppel_helix.jna.tlb.office2.SmartArtLayout}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddSmartArt", dispId = 0x1c)
    Shape AddSmartArt(eu.doppel_helix.jna.tlb.office2.SmartArtLayout Layout,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            Object Anchor);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(32)</p>
     * @param EmbedCode [in] {@code String}
     * @param VideoWidth [in] {@code Object}
     * @param VideoHeight [in] {@code Object}
     * @param PosterFrameImage [in, optional] {@code Object}
     * @param Url [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Anchor [in, optional] {@code Object}
     */
    @ComMethod(name = "AddWebVideo", dispId = 0x68)
    Shape AddWebVideo(String EmbedCode,
            Object VideoWidth,
            Object VideoHeight,
            Object PosterFrameImage,
            Object Url,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            Object Anchor);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(33)</p>
     * @param Style [in, optional] {@code Integer}
     * @param Type [in, optional] {@code eu.doppel_helix.jna.tlb.office2.XlChartType}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Anchor [in, optional] {@code Object}
     * @param NewLayout [in, optional] {@code Object}
     */
    @ComMethod(name = "AddChart2", dispId = 0x69)
    Shape AddChart2(Integer Style,
            eu.doppel_helix.jna.tlb.office2.XlChartType Type,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            Object Anchor,
            Object NewLayout);
            
    
}