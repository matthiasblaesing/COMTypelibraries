
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002443A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002443A-0000-0000-C000-000000000046}")
public interface Shapes extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    Shape Item(Object Index);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "_Default", dispId = 0x0)
    Shape _Default(Object Index);
            
    /**
     * <p>id(0x6b1)</p>
     * <p>vtableId(14)</p>
     * @param Type [in] {@code eu.doppel_helix.jna.tlb.office2.MsoCalloutType}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     */
    @ComMethod(name = "AddCallout", dispId = 0x6b1)
    Shape AddCallout(eu.doppel_helix.jna.tlb.office2.MsoCalloutType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x6b2)</p>
     * <p>vtableId(15)</p>
     * @param Type [in] {@code eu.doppel_helix.jna.tlb.office2.MsoConnectorType}
     * @param BeginX [in] {@code Float}
     * @param BeginY [in] {@code Float}
     * @param EndX [in] {@code Float}
     * @param EndY [in] {@code Float}
     */
    @ComMethod(name = "AddConnector", dispId = 0x6b2)
    Shape AddConnector(eu.doppel_helix.jna.tlb.office2.MsoConnectorType Type,
            Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY);
            
    /**
     * <p>id(0x6b7)</p>
     * <p>vtableId(16)</p>
     * @param SafeArrayOfPoints [in] {@code Object}
     */
    @ComMethod(name = "AddCurve", dispId = 0x6b7)
    Shape AddCurve(Object SafeArrayOfPoints);
            
    /**
     * <p>id(0x6b9)</p>
     * <p>vtableId(17)</p>
     * @param Orientation [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTextOrientation}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     */
    @ComMethod(name = "AddLabel", dispId = 0x6b9)
    Shape AddLabel(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation Orientation,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x6ba)</p>
     * <p>vtableId(18)</p>
     * @param BeginX [in] {@code Float}
     * @param BeginY [in] {@code Float}
     * @param EndX [in] {@code Float}
     * @param EndY [in] {@code Float}
     */
    @ComMethod(name = "AddLine", dispId = 0x6ba)
    Shape AddLine(Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY);
            
    /**
     * <p>id(0x6bb)</p>
     * <p>vtableId(19)</p>
     * @param Filename [in] {@code String}
     * @param LinkToFile [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param SaveWithDocument [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     */
    @ComMethod(name = "AddPicture", dispId = 0x6bb)
    Shape AddPicture(String Filename,
            eu.doppel_helix.jna.tlb.office2.MsoTriState LinkToFile,
            eu.doppel_helix.jna.tlb.office2.MsoTriState SaveWithDocument,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x6be)</p>
     * <p>vtableId(20)</p>
     * @param SafeArrayOfPoints [in] {@code Object}
     */
    @ComMethod(name = "AddPolyline", dispId = 0x6be)
    Shape AddPolyline(Object SafeArrayOfPoints);
            
    /**
     * <p>id(0x6bf)</p>
     * <p>vtableId(21)</p>
     * @param Type [in] {@code eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     */
    @ComMethod(name = "AddShape", dispId = 0x6bf)
    Shape AddShape(eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x6c0)</p>
     * <p>vtableId(22)</p>
     * @param PresetTextEffect [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPresetTextEffect}
     * @param Text [in] {@code String}
     * @param FontName [in] {@code String}
     * @param FontSize [in] {@code Float}
     * @param FontBold [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param FontItalic [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     */
    @ComMethod(name = "AddTextEffect", dispId = 0x6c0)
    Shape AddTextEffect(eu.doppel_helix.jna.tlb.office2.MsoPresetTextEffect PresetTextEffect,
            String Text,
            String FontName,
            Float FontSize,
            eu.doppel_helix.jna.tlb.office2.MsoTriState FontBold,
            eu.doppel_helix.jna.tlb.office2.MsoTriState FontItalic,
            Float Left,
            Float Top);
            
    /**
     * <p>id(0x6c6)</p>
     * <p>vtableId(23)</p>
     * @param Orientation [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTextOrientation}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     */
    @ComMethod(name = "AddTextbox", dispId = 0x6c6)
    Shape AddTextbox(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation Orientation,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x6c7)</p>
     * <p>vtableId(24)</p>
     * @param EditingType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEditingType}
     * @param X1 [in] {@code Float}
     * @param Y1 [in] {@code Float}
     */
    @ComMethod(name = "BuildFreeform", dispId = 0x6c7)
    FreeformBuilder BuildFreeform(eu.doppel_helix.jna.tlb.office2.MsoEditingType EditingType,
            Float X1,
            Float Y1);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(25)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    ShapeRange getRange(Object Index);
            
    /**
     * <p>id(0x6c9)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "SelectAll", dispId = 0x6c9)
    void SelectAll();
            
    /**
     * <p>id(0x6ca)</p>
     * <p>vtableId(27)</p>
     * @param Type [in] {@code XlFormControl}
     * @param Left [in] {@code Integer}
     * @param Top [in] {@code Integer}
     * @param Width [in] {@code Integer}
     * @param Height [in] {@code Integer}
     */
    @ComMethod(name = "AddFormControl", dispId = 0x6ca)
    Shape AddFormControl(XlFormControl Type,
            Integer Left,
            Integer Top,
            Integer Width,
            Integer Height);
            
    /**
     * <p>id(0x6cb)</p>
     * <p>vtableId(28)</p>
     * @param ClassType [in, optional] {@code Object}
     * @param Filename [in, optional] {@code Object}
     * @param Link [in, optional] {@code Object}
     * @param DisplayAsIcon [in, optional] {@code Object}
     * @param IconFileName [in, optional] {@code Object}
     * @param IconIndex [in, optional] {@code Object}
     * @param IconLabel [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "AddOLEObject", dispId = 0x6cb)
    Shape AddOLEObject(Object ClassType,
            Object Filename,
            Object Link,
            Object DisplayAsIcon,
            Object IconFileName,
            Object IconIndex,
            Object IconLabel,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0x880)</p>
     * <p>vtableId(29)</p>
     * @param Type [in] {@code eu.doppel_helix.jna.tlb.office2.MsoDiagramType}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     */
    @ComMethod(name = "AddDiagram", dispId = 0x880)
    Shape AddDiagram(eu.doppel_helix.jna.tlb.office2.MsoDiagramType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0x881)</p>
     * <p>vtableId(30)</p>
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     */
    @ComMethod(name = "AddCanvas", dispId = 0x881)
    Shape AddCanvas(Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0xa69)</p>
     * <p>vtableId(31)</p>
     * @param XlChartType [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "AddChart", dispId = 0xa69)
    Shape AddChart(Object XlChartType,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0xb68)</p>
     * <p>vtableId(32)</p>
     * @param Layout [in] {@code eu.doppel_helix.jna.tlb.office2.SmartArtLayout}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "AddSmartArt", dispId = 0xb68)
    Shape AddSmartArt(eu.doppel_helix.jna.tlb.office2.SmartArtLayout Layout,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0xc10)</p>
     * <p>vtableId(33)</p>
     * @param Style [in, optional] {@code Object}
     * @param XlChartType [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param NewLayout [in, optional] {@code Object}
     */
    @ComMethod(name = "AddChart2", dispId = 0xc10)
    Shape AddChart2(Object Style,
            Object XlChartType,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            Object NewLayout);
            
    /**
     * <p>id(0xc57)</p>
     * <p>vtableId(34)</p>
     * @param Filename [in] {@code String}
     * @param LinkToFile [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param SaveWithDocument [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     * @param Compress [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPictureCompress}
     */
    @ComMethod(name = "AddPicture2", dispId = 0xc57)
    Shape AddPicture2(String Filename,
            eu.doppel_helix.jna.tlb.office2.MsoTriState LinkToFile,
            eu.doppel_helix.jna.tlb.office2.MsoTriState SaveWithDocument,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            eu.doppel_helix.jna.tlb.office2.MsoPictureCompress Compress);
            
    
}