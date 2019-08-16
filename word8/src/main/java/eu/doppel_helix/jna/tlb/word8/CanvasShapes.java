
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({396F9073-F9FD-11D3-8EA0-0050049A1A01})</p>
 */
@ComInterface(iid="{396F9073-F9FD-11D3-8EA0-0050049A1A01}")
public interface CanvasShapes extends IUnknown, IRawDispatchHandle, IDispatch {
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
     */
    @ComMethod(name = "AddCallout", dispId = 0xa)
    Shape AddCallout(eu.doppel_helix.jna.tlb.office2.MsoCalloutType Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
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
     */
    @ComMethod(name = "AddCurve", dispId = 0xc)
    Shape AddCurve(Object SafeArrayOfPoints);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(16)</p>
     * @param Orientation [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTextOrientation}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     */
    @ComMethod(name = "AddLabel", dispId = 0xd)
    Shape AddLabel(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation Orientation,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(17)</p>
     * @param BeginX [in] {@code Float}
     * @param BeginY [in] {@code Float}
     * @param EndX [in] {@code Float}
     * @param EndY [in] {@code Float}
     */
    @ComMethod(name = "AddLine", dispId = 0xe)
    Shape AddLine(Float BeginX,
            Float BeginY,
            Float EndX,
            Float EndY);
            
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
     */
    @ComMethod(name = "AddPicture", dispId = 0xf)
    Shape AddPicture(String FileName,
            Object LinkToFile,
            Object SaveWithDocument,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(19)</p>
     * @param SafeArrayOfPoints [in] {@code Object}
     */
    @ComMethod(name = "AddPolyline", dispId = 0x10)
    Shape AddPolyline(Object SafeArrayOfPoints);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(20)</p>
     * @param Type [in] {@code Integer}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     */
    @ComMethod(name = "AddShape", dispId = 0x11)
    Shape AddShape(Integer Type,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
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
     */
    @ComMethod(name = "AddTextEffect", dispId = 0x12)
    Shape AddTextEffect(eu.doppel_helix.jna.tlb.office2.MsoPresetTextEffect PresetTextEffect,
            String Text,
            String FontName,
            Float FontSize,
            eu.doppel_helix.jna.tlb.office2.MsoTriState FontBold,
            eu.doppel_helix.jna.tlb.office2.MsoTriState FontItalic,
            Float Left,
            Float Top);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(22)</p>
     * @param Orientation [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTextOrientation}
     * @param Left [in] {@code Float}
     * @param Top [in] {@code Float}
     * @param Width [in] {@code Float}
     * @param Height [in] {@code Float}
     */
    @ComMethod(name = "AddTextbox", dispId = 0x13)
    Shape AddTextbox(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation Orientation,
            Float Left,
            Float Top,
            Float Width,
            Float Height);
            
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
            
    
}