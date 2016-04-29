
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002443A-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002443A-0001-0000-C000-000000000046}")
public interface IShapes {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT Item(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT _Default(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x6b1)</p>
     */
    @ComMethod(name = "AddCallout", dispId = 0x6b1)
    com.sun.jna.platform.win32.WinNT.HRESULT AddCallout(eu.doppel_helix.jna.tlb.office2.MsoCalloutType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            VARIANT RHS);
            
    /**
     * <p>id(0x6b2)</p>
     */
    @ComMethod(name = "AddConnector", dispId = 0x6b2)
    com.sun.jna.platform.win32.WinNT.HRESULT AddConnector(eu.doppel_helix.jna.tlb.office2.MsoConnectorType Type,
            Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY,
            VARIANT RHS);
            
    /**
     * <p>id(0x6b7)</p>
     */
    @ComMethod(name = "AddCurve", dispId = 0x6b7)
    com.sun.jna.platform.win32.WinNT.HRESULT AddCurve(Object SafeArrayOfPoints,
            VARIANT RHS);
            
    /**
     * <p>id(0x6b9)</p>
     */
    @ComMethod(name = "AddLabel", dispId = 0x6b9)
    com.sun.jna.platform.win32.WinNT.HRESULT AddLabel(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation Orientation,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            VARIANT RHS);
            
    /**
     * <p>id(0x6ba)</p>
     */
    @ComMethod(name = "AddLine", dispId = 0x6ba)
    com.sun.jna.platform.win32.WinNT.HRESULT AddLine(Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY,
            VARIANT RHS);
            
    /**
     * <p>id(0x6bb)</p>
     */
    @ComMethod(name = "AddPicture", dispId = 0x6bb)
    com.sun.jna.platform.win32.WinNT.HRESULT AddPicture(String Filename,
            eu.doppel_helix.jna.tlb.office2.MsoTriState LinkToFile,
            eu.doppel_helix.jna.tlb.office2.MsoTriState SaveWithDocument,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            VARIANT RHS);
            
    /**
     * <p>id(0x6be)</p>
     */
    @ComMethod(name = "AddPolyline", dispId = 0x6be)
    com.sun.jna.platform.win32.WinNT.HRESULT AddPolyline(Object SafeArrayOfPoints,
            VARIANT RHS);
            
    /**
     * <p>id(0x6bf)</p>
     */
    @ComMethod(name = "AddShape", dispId = 0x6bf)
    com.sun.jna.platform.win32.WinNT.HRESULT AddShape(eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            VARIANT RHS);
            
    /**
     * <p>id(0x6c0)</p>
     */
    @ComMethod(name = "AddTextEffect", dispId = 0x6c0)
    com.sun.jna.platform.win32.WinNT.HRESULT AddTextEffect(eu.doppel_helix.jna.tlb.office2.MsoPresetTextEffect PresetTextEffect,
            String Text,
            String FontName,
            Float FontSize,
            eu.doppel_helix.jna.tlb.office2.MsoTriState FontBold,
            eu.doppel_helix.jna.tlb.office2.MsoTriState FontItalic,
            Float Left,
            Float Top,
            VARIANT RHS);
            
    /**
     * <p>id(0x6c6)</p>
     */
    @ComMethod(name = "AddTextbox", dispId = 0x6c6)
    com.sun.jna.platform.win32.WinNT.HRESULT AddTextbox(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation Orientation,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            VARIANT RHS);
            
    /**
     * <p>id(0x6c7)</p>
     */
    @ComMethod(name = "BuildFreeform", dispId = 0x6c7)
    com.sun.jna.platform.win32.WinNT.HRESULT BuildFreeform(eu.doppel_helix.jna.tlb.office2.MsoEditingType EditingType,
            Float X1,
            Float Y1,
            VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x6c9)</p>
     */
    @ComMethod(name = "SelectAll", dispId = 0x6c9)
    com.sun.jna.platform.win32.WinNT.HRESULT SelectAll();
            
    /**
     * <p>id(0x6ca)</p>
     */
    @ComMethod(name = "AddFormControl", dispId = 0x6ca)
    com.sun.jna.platform.win32.WinNT.HRESULT AddFormControl(XlFormControl Type,
            Integer Left,
            Integer Top,
            Integer Width,
            Integer Height,
            VARIANT RHS);
            
    /**
     * <p>id(0x6cb)</p>
     */
    @ComMethod(name = "AddOLEObject", dispId = 0x6cb)
    com.sun.jna.platform.win32.WinNT.HRESULT AddOLEObject(Object ClassType,
            Object Filename,
            Object Link,
            Object DisplayAsIcon,
            Object IconFileName,
            Object IconIndex,
            Object IconLabel,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            VARIANT RHS);
            
    /**
     * <p>id(0x880)</p>
     */
    @ComMethod(name = "AddDiagram", dispId = 0x880)
    com.sun.jna.platform.win32.WinNT.HRESULT AddDiagram(eu.doppel_helix.jna.tlb.office2.MsoDiagramType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            VARIANT RHS);
            
    /**
     * <p>id(0x881)</p>
     */
    @ComMethod(name = "AddCanvas", dispId = 0x881)
    com.sun.jna.platform.win32.WinNT.HRESULT AddCanvas(Float Left,
            Float Top,
            Float Width,
            Float Height,
            VARIANT RHS);
            
    /**
     * <p>id(0xa69)</p>
     */
    @ComMethod(name = "AddChart", dispId = 0xa69)
    com.sun.jna.platform.win32.WinNT.HRESULT AddChart(Object XlChartType,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            VARIANT RHS);
            
    /**
     * <p>id(0xb68)</p>
     */
    @ComMethod(name = "AddSmartArt", dispId = 0xb68)
    com.sun.jna.platform.win32.WinNT.HRESULT AddSmartArt(eu.doppel_helix.jna.tlb.office2.SmartArtLayout Layout,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            VARIANT RHS);
            
    /**
     * <p>id(0xc10)</p>
     */
    @ComMethod(name = "AddChart2", dispId = 0xc10)
    com.sun.jna.platform.win32.WinNT.HRESULT AddChart2(Object Style,
            Object XlChartType,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            Object NewLayout,
            VARIANT RHS);
            
    /**
     * <p>id(0xc57)</p>
     */
    @ComMethod(name = "AddPicture2", dispId = 0xc57)
    com.sun.jna.platform.win32.WinNT.HRESULT AddPicture2(String Filename,
            eu.doppel_helix.jna.tlb.office2.MsoTriState LinkToFile,
            eu.doppel_helix.jna.tlb.office2.MsoTriState SaveWithDocument,
            Float Left,
            Float Top,
            Float Width,
            Float Height,
            eu.doppel_helix.jna.tlb.office2.MsoPictureCompress Compress,
            VARIANT RHS);
            
    
}