
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
     */
    @ComProperty(name = "Application", dispId = 0x1f40)
    Application getApplication();
            
    /**
     * <p>id(0x1f41)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x1f41)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Shape Item(Object Index);
            
    /**
     * <p>id(0xa)</p>
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
     */
    @ComMethod(name = "AddConnector", dispId = 0xb)
    Shape AddConnector(eu.doppel_helix.jna.tlb.office2.MsoConnectorType Type,
            Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "AddCurve", dispId = 0xc)
    Shape AddCurve(Object SafeArrayOfPoints,
            Object Anchor);
            
    /**
     * <p>id(0xd)</p>
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
     */
    @ComMethod(name = "AddLine", dispId = 0xe)
    Shape AddLine(Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY,
            Object Anchor);
            
    /**
     * <p>id(0xf)</p>
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
     */
    @ComMethod(name = "AddPolyline", dispId = 0x10)
    Shape AddPolyline(Object SafeArrayOfPoints,
            Object Anchor);
            
    /**
     * <p>id(0x11)</p>
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
     */
    @ComMethod(name = "BuildFreeform", dispId = 0x14)
    FreeformBuilder BuildFreeform(eu.doppel_helix.jna.tlb.office2.MsoEditingType EditingType,
            Float X1,
            Float Y1);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComMethod(name = "Range", dispId = 0x15)
    ShapeRange Range(Object Index);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComMethod(name = "SelectAll", dispId = 0x16)
    void SelectAll();
            
    /**
     * <p>id(0x18)</p>
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
     */
    @ComMethod(name = "AddCanvas", dispId = 0x19)
    Shape AddCanvas(Float Left,
            Float Top,
            Float Width,
            Float Height,
            Object Anchor);
            
    /**
     * <p>id(0x67)</p>
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