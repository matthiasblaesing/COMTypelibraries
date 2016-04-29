
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C031E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C031E-0000-0000-C000-000000000046}")
public interface Shapes {
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
    Shape AddCallout(MsoCalloutType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "AddConnector", dispId = 0xb)
    Shape AddConnector(MsoConnectorType Type,
            Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "AddCurve", dispId = 0xc)
    Shape AddCurve(Object SafeArrayOfPoints);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "AddLabel", dispId = 0xd)
    Shape AddLabel(MsoTextOrientation Orientation,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "AddLine", dispId = 0xe)
    Shape AddLine(Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "AddPicture", dispId = 0xf)
    Shape AddPicture(String FileName,
            MsoTriState LinkToFile,
            MsoTriState SaveWithDocument,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "AddPolyline", dispId = 0x10)
    Shape AddPolyline(Object SafeArrayOfPoints);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "AddShape", dispId = 0x11)
    Shape AddShape(MsoAutoShapeType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "AddTextEffect", dispId = 0x12)
    Shape AddTextEffect(MsoPresetTextEffect PresetTextEffect,
            String Text,
            String FontName,
            Float FontSize,
            MsoTriState FontBold,
            MsoTriState FontItalic,
            Float Left,
            Float Top);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComMethod(name = "AddTextbox", dispId = 0x13)
    Shape AddTextbox(MsoTextOrientation Orientation,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComMethod(name = "BuildFreeform", dispId = 0x14)
    FreeformBuilder BuildFreeform(MsoEditingType EditingType,
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
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Background", dispId = 0x64)
    Shape getBackground();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Default", dispId = 0x65)
    Shape get_Default();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComMethod(name = "AddDiagram", dispId = 0x17)
    Shape AddDiagram(MsoDiagramType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComMethod(name = "AddCanvas", dispId = 0x19)
    Shape AddCanvas(Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComMethod(name = "AddChart", dispId = 0x1a)
    Shape AddChart(XlChartType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComMethod(name = "AddTable", dispId = 0x1b)
    Shape AddTable(Integer NumRows,
            Integer NumColumns,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComMethod(name = "AddSmartArt", dispId = 0x1c)
    Shape AddSmartArt(SmartArtLayout Layout,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComMethod(name = "AddChart2", dispId = 0x1d)
    Shape AddChart2(Integer Style,
            XlChartType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            Boolean NewLayout);
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComMethod(name = "AddPicture2", dispId = 0x1e)
    Shape AddPicture2(String FileName,
            MsoTriState LinkToFile,
            MsoTriState SaveWithDocument,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            MsoPictureCompress Compress);
            
    
}