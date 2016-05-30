
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({41506929-7855-4392-9E6F-98D88513E55D})</p>
 */
@ComInterface(iid="{41506929-7855-4392-9E6F-98D88513E55D}")
public interface IImageProcess {
    /**
     * A collection of all available filters
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "FilterInfos", dispId = 0x1)
    IFilterInfos getFilterInfos();
            
    /**
     * A collection of the filters to be applied in this process
     *
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Filters", dispId = 0x2)
    IFilters getFilters();
            
    /**
     * Takes the specified ImageFile and returns the new ImageFile with all the filters applied on success
     *
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "Apply", dispId = 0x4)
    IImageFile Apply(IImageFile Source);
            
    
}