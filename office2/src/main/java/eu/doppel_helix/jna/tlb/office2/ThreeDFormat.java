
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0321-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0321-0000-0000-C000-000000000046}")
public interface ThreeDFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "IncrementRotationX", dispId = 0xa)
    void IncrementRotationX(Float Increment);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "IncrementRotationY", dispId = 0xb)
    void IncrementRotationY(Float Increment);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "ResetRotation", dispId = 0xc)
    void ResetRotation();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "SetThreeDFormat", dispId = 0xd)
    void SetThreeDFormat(MsoPresetThreeDFormat PresetThreeDFormat);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "SetExtrusionDirection", dispId = 0xe)
    void SetExtrusionDirection(MsoPresetExtrusionDirection PresetExtrusionDirection);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Depth", dispId = 0x64)
    Float getDepth();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Depth", dispId = 0x64)
    void setDepth(Float param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "ExtrusionColor", dispId = 0x65)
    ColorFormat getExtrusionColor();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "ExtrusionColorType", dispId = 0x66)
    MsoExtrusionColorType getExtrusionColorType();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "ExtrusionColorType", dispId = 0x66)
    void setExtrusionColorType(MsoExtrusionColorType param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Perspective", dispId = 0x67)
    MsoTriState getPerspective();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Perspective", dispId = 0x67)
    void setPerspective(MsoTriState param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "PresetExtrusionDirection", dispId = 0x68)
    MsoPresetExtrusionDirection getPresetExtrusionDirection();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "PresetLightingDirection", dispId = 0x69)
    MsoPresetLightingDirection getPresetLightingDirection();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "PresetLightingDirection", dispId = 0x69)
    void setPresetLightingDirection(MsoPresetLightingDirection param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "PresetLightingSoftness", dispId = 0x6a)
    MsoPresetLightingSoftness getPresetLightingSoftness();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "PresetLightingSoftness", dispId = 0x6a)
    void setPresetLightingSoftness(MsoPresetLightingSoftness param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "PresetMaterial", dispId = 0x6b)
    MsoPresetMaterial getPresetMaterial();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "PresetMaterial", dispId = 0x6b)
    void setPresetMaterial(MsoPresetMaterial param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "PresetThreeDFormat", dispId = 0x6c)
    MsoPresetThreeDFormat getPresetThreeDFormat();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "RotationX", dispId = 0x6d)
    Float getRotationX();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "RotationX", dispId = 0x6d)
    void setRotationX(Float param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "RotationY", dispId = 0x6e)
    Float getRotationY();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "RotationY", dispId = 0x6e)
    void setRotationY(Float param0);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6f)
    MsoTriState getVisible();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6f)
    void setVisible(MsoTriState param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "SetPresetCamera", dispId = 0xf)
    void SetPresetCamera(MsoPresetCamera PresetCamera);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "IncrementRotationZ", dispId = 0x10)
    void IncrementRotationZ(Float Increment);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "IncrementRotationHorizontal", dispId = 0x11)
    void IncrementRotationHorizontal(Float Increment);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "IncrementRotationVertical", dispId = 0x12)
    void IncrementRotationVertical(Float Increment);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "PresetLighting", dispId = 0x70)
    MsoLightRigType getPresetLighting();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "PresetLighting", dispId = 0x70)
    void setPresetLighting(MsoLightRigType param0);
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "Z", dispId = 0x71)
    Float getZ();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "Z", dispId = 0x71)
    void setZ(Float param0);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "BevelTopType", dispId = 0x72)
    MsoBevelType getBevelTopType();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "BevelTopType", dispId = 0x72)
    void setBevelTopType(MsoBevelType param0);
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "BevelTopInset", dispId = 0x73)
    Float getBevelTopInset();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "BevelTopInset", dispId = 0x73)
    void setBevelTopInset(Float param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "BevelTopDepth", dispId = 0x74)
    Float getBevelTopDepth();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "BevelTopDepth", dispId = 0x74)
    void setBevelTopDepth(Float param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "BevelBottomType", dispId = 0x75)
    MsoBevelType getBevelBottomType();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "BevelBottomType", dispId = 0x75)
    void setBevelBottomType(MsoBevelType param0);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "BevelBottomInset", dispId = 0x76)
    Float getBevelBottomInset();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "BevelBottomInset", dispId = 0x76)
    void setBevelBottomInset(Float param0);
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "BevelBottomDepth", dispId = 0x77)
    Float getBevelBottomDepth();
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "BevelBottomDepth", dispId = 0x77)
    void setBevelBottomDepth(Float param0);
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "PresetCamera", dispId = 0x78)
    MsoPresetCamera getPresetCamera();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "RotationZ", dispId = 0x79)
    Float getRotationZ();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "RotationZ", dispId = 0x79)
    void setRotationZ(Float param0);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "ContourWidth", dispId = 0x7a)
    Float getContourWidth();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "ContourWidth", dispId = 0x7a)
    void setContourWidth(Float param0);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "ContourColor", dispId = 0x7b)
    ColorFormat getContourColor();
            
    /**
     * <p>id(0x7c)</p>
     */
    @ComProperty(name = "FieldOfView", dispId = 0x7c)
    Float getFieldOfView();
            
    /**
     * <p>id(0x7c)</p>
     */
    @ComProperty(name = "FieldOfView", dispId = 0x7c)
    void setFieldOfView(Float param0);
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComProperty(name = "ProjectText", dispId = 0x7d)
    MsoTriState getProjectText();
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComProperty(name = "ProjectText", dispId = 0x7d)
    void setProjectText(MsoTriState param0);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "LightAngle", dispId = 0x7e)
    Float getLightAngle();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "LightAngle", dispId = 0x7e)
    void setLightAngle(Float param0);
            
    
}