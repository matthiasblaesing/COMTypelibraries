
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F4243B65-3F63-4D99-93CD-86B6D62C5EB2})</p>
 */
@ComInterface(iid="{F4243B65-3F63-4D99-93CD-86B6D62C5EB2}")
public interface IImageFile extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the FormatID for this file type
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "FormatID", dispId = 0x1)
    String getFormatID();
            
    /**
     * Returns the file extension for this image file type
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "FileExtension", dispId = 0x2)
    String getFileExtension();
            
    /**
     * Returns the raw image file as a Vector of Bytes
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "FileData", dispId = 0x3)
    IVector getFileData();
            
    /**
     * Returns the raw image bits as a Vector of Long values
     *
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ARGBData", dispId = 0x4)
    IVector getARGBData();
            
    /**
     * Returns the Height of the image in pixels
     *
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5)
    Integer getHeight();
            
    /**
     * Returns the Width of the image in pixels
     *
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    Integer getWidth();
            
    /**
     * Returns the Horizontal pixels per inch of the image
     *
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "HorizontalResolution", dispId = 0x7)
    Double getHorizontalResolution();
            
    /**
     * Returns the Vertical pixels per inch of the image
     *
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "VerticalResolution", dispId = 0x8)
    Double getVerticalResolution();
            
    /**
     * Returns the depth of the pixels of the image in bits per pixel
     *
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "PixelDepth", dispId = 0x9)
    Integer getPixelDepth();
            
    /**
     * Indicates if the pixel data is an index into a palette or the actual color data
     *
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "IsIndexedPixelFormat", dispId = 0xa)
    Boolean getIsIndexedPixelFormat();
            
    /**
     * Indicates if the pixel format has an alpha component
     *
     * <p>id(0xb)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "IsAlphaPixelFormat", dispId = 0xb)
    Boolean getIsAlphaPixelFormat();
            
    /**
     * Indicates if the pixel format is extended (16 bits/channel)
     *
     * <p>id(0xc)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "IsExtendedPixelFormat", dispId = 0xc)
    Boolean getIsExtendedPixelFormat();
            
    /**
     * Indicates whether the image is animated
     *
     * <p>id(0xd)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "IsAnimated", dispId = 0xd)
    Boolean getIsAnimated();
            
    /**
     * Returns the number of frames in the image
     *
     * <p>id(0xe)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "FrameCount", dispId = 0xe)
    Integer getFrameCount();
            
    /**
     * Returns/Sets the current frame in the image
     *
     * <p>id(0xf)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ActiveFrame", dispId = 0xf)
    Integer getActiveFrame();
            
    /**
     * Returns/Sets the current frame in the image
     *
     * <p>id(0xf)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ActiveFrame", dispId = 0xf)
    void setActiveFrame(Integer param0);
            
    /**
     * A collection of all properties for this image
     *
     * <p>id(0x10)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x10)
    IProperties getProperties();
            
    /**
     * Loads the ImageFile object with the specified File
     *
     * <p>id(0x11)</p>
     * <p>vtableId(24)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "LoadFile", dispId = 0x11)
    void LoadFile(String Filename);
            
    /**
     * Save the ImageFile object to the specified File
     *
     * <p>id(0x12)</p>
     * <p>vtableId(25)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "SaveFile", dispId = 0x12)
    void SaveFile(String Filename);
            
    
}