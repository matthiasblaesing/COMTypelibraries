
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * An Item's type is composed of bits from the WiaItemFlags enumeration. You can test an Item's type by using the AND operation with Item.Properties("Item Flags") and a member from the WiaItemFlags enumeration.
 *
 * <p>uuid({7F17D8AE-01D7-4C01-B341-096607BE3ECF})</p>
 */
public enum WiaItemFlag implements IComEnum {
    
    /**
     * The item is uninitialized or has been deleted. (0)
     */
    FreeItemFlag(0),
    
    /**
     * The item is an image file. Only valid for items that also have the FileItemFlag flag set. (1)
     */
    ImageItemFlag(1),
    
    /**
     * The item is a file. (2)
     */
    FileItemFlag(2),
    
    /**
     * The item is a folder. (4)
     */
    FolderItemFlag(4),
    
    /**
     * Identifies the root item in the device. (8)
     */
    RootItemFlag(8),
    
    /**
     * This item supports the Analyze method. (16)
     */
    AnalyzeItemFlag(16),
    
    /**
     * The item is an audio file. Only valid for items that also have the FileItemFlag flag set. (32)
     */
    AudioItemFlag(32),
    
    /**
     * The item represents a connected device. (64)
     */
    DeviceItemFlag(64),
    
    /**
     * The item is marked as deleted. (128)
     */
    DeletedItemFlag(128),
    
    /**
     * The item represents a disconnected device. (256)
     */
    DisconnectedItemFlag(256),
    
    /**
     * The item represents a horizontal panoramic image. (512)
     */
    HPanoramaItemFlag(512),
    
    /**
     * The item represents a vertical panoramic image. (1024)
     */
    VPanoramaItemFlag(1024),
    
    /**
     * Images in this folder were taken in a continuous time sequence. Only valid for items that also have the FolderItemFlag flag set. (2048)
     */
    BurstItemFlag(2048),
    
    /**
     * The item represents a storage medium. (4096)
     */
    StorageItemFlag(4096),
    
    /**
     * The item can be transferred. (8192)
     */
    TransferItemFlag(8192),
    
    /**
     * This item was created, and does not correspond to an item in a device. (16384)
     */
    GeneratedItemFlag(16384),
    
    /**
     * The item has file attachments. (32768)
     */
    HasAttachmentsItemFlag(32768),
    
    /**
     * The item represents streaming video. (65536)
     */
    VideoItemFlag(65536),
    
    /**
     * The item has been removed from the device. (-2147483648)
     */
    RemovedItemFlag(-2147483648),
    ;

    private WiaItemFlag(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}