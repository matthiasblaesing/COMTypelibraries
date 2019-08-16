
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({B4760F13-D9F3-4DF8-94B5-D225F86EE9A1})</p>
 */
@ComInterface(iid="{B4760F13-D9F3-4DF8-94B5-D225F86EE9A1}")
public interface ICommonDialog extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Launches the Windows Scanner and Camera Wizard and returns Nothing. Future versions may return a collection of ImageFile objects.
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param Device [in] {@code IDevice}
     */
    @ComMethod(name = "ShowAcquisitionWizard", dispId = 0x1)
    Object ShowAcquisitionWizard(IDevice Device);
            
    /**
     * Displays one or more dialog boxes that enable the user to acquire an image from a hardware device for image acquisition and returns an ImageFile object on success, otherwise Nothing
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     * @param DeviceType [in, optional] {@code WiaDeviceType}
     * @param Intent [in, optional] {@code WiaImageIntent}
     * @param Bias [in, optional] {@code WiaImageBias}
     * @param FormatID [in, optional] {@code String}
     * @param AlwaysSelectDevice [in, optional] {@code Boolean}
     * @param UseCommonUI [in, optional] {@code Boolean}
     * @param CancelError [in, optional] {@code Boolean}
     */
    @ComMethod(name = "ShowAcquireImage", dispId = 0x2)
    IImageFile ShowAcquireImage(WiaDeviceType DeviceType,
            WiaImageIntent Intent,
            WiaImageBias Bias,
            String FormatID,
            Boolean AlwaysSelectDevice,
            Boolean UseCommonUI,
            Boolean CancelError);
            
    /**
     * Displays a dialog box that enables the user to select a hardware device for image acquisition. Returns the selected Device object on success, otherwise Nothing
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     * @param DeviceType [in, optional] {@code WiaDeviceType}
     * @param AlwaysSelectDevice [in, optional] {@code Boolean}
     * @param CancelError [in, optional] {@code Boolean}
     */
    @ComMethod(name = "ShowSelectDevice", dispId = 0x3)
    IDevice ShowSelectDevice(WiaDeviceType DeviceType,
            Boolean AlwaysSelectDevice,
            Boolean CancelError);
            
    /**
     * Displays a dialog box that enables the user to select an item for transfer from a hardware device for image acquisition. Returns the selection as an Items collection on success, otherwise Nothing
     *
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param Device [in] {@code IDevice}
     * @param Intent [in, optional] {@code WiaImageIntent}
     * @param Bias [in, optional] {@code WiaImageBias}
     * @param SingleSelect [in, optional] {@code Boolean}
     * @param UseCommonUI [in, optional] {@code Boolean}
     * @param CancelError [in, optional] {@code Boolean}
     */
    @ComMethod(name = "ShowSelectItems", dispId = 0x4)
    IItems ShowSelectItems(IDevice Device,
            WiaImageIntent Intent,
            WiaImageBias Bias,
            Boolean SingleSelect,
            Boolean UseCommonUI,
            Boolean CancelError);
            
    /**
     * Displays the properties dialog box for the specified Device
     *
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     * @param Device [in] {@code IDevice}
     * @param CancelError [in, optional] {@code Boolean}
     */
    @ComMethod(name = "ShowDeviceProperties", dispId = 0x5)
    void ShowDeviceProperties(IDevice Device,
            Boolean CancelError);
            
    /**
     * Displays the properties dialog box for the specified Item
     *
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param Item [in] {@code IItem}
     * @param CancelError [in, optional] {@code Boolean}
     */
    @ComMethod(name = "ShowItemProperties", dispId = 0x6)
    void ShowItemProperties(IItem Item,
            Boolean CancelError);
            
    /**
     * Displays a progress dialog box while transferring the specified Item to the local machine. See Item.Transfer for additional information.
     *
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     * @param Item [in] {@code IItem}
     * @param FormatID [in, optional] {@code String}
     * @param CancelError [in, optional] {@code Boolean}
     */
    @ComMethod(name = "ShowTransfer", dispId = 0x7)
    Object ShowTransfer(IItem Item,
            String FormatID,
            Boolean CancelError);
            
    /**
     * Launches the Photo Printing Wizard with the absolute path of a specific file or Vector of absolute paths to files
     *
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param Files [in] {@code Object}
     */
    @ComMethod(name = "ShowPhotoPrintingWizard", dispId = 0x8)
    void ShowPhotoPrintingWizard(Object Files);
            
    
}