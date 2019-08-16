
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB04-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB04-0000-0000-C000-000000000046}")
public interface CustomXMLNode extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Attributes", dispId = 0x60030001)
    CustomXMLNodes getAttributes();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "BaseName", dispId = 0x60030002)
    String getBaseName();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ChildNodes", dispId = 0x60030003)
    CustomXMLNodes getChildNodes();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FirstChild", dispId = 0x60030004)
    CustomXMLNode getFirstChild();
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "LastChild", dispId = 0x60030005)
    CustomXMLNode getLastChild();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "NamespaceURI", dispId = 0x60030006)
    String getNamespaceURI();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "NextSibling", dispId = 0x60030007)
    CustomXMLNode getNextSibling();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "NodeType", dispId = 0x60030008)
    MsoCustomXMLNodeType getNodeType();
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "NodeValue", dispId = 0x60030009)
    String getNodeValue();
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NodeValue", dispId = 0x60030009)
    void setNodeValue(String param0);
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "OwnerDocument", dispId = 0x6003000b)
    com.sun.jna.platform.win32.COM.util.IDispatch getOwnerDocument();
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "OwnerPart", dispId = 0x6003000c)
    CustomXMLPart getOwnerPart();
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "PreviousSibling", dispId = 0x6003000d)
    CustomXMLNode getPreviousSibling();
            
    /**
     * <p>id(0x6003000e)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ParentNode", dispId = 0x6003000e)
    CustomXMLNode getParentNode();
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Text", dispId = 0x6003000f)
    String getText();
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x6003000f)
    void setText(String param0);
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "XPath", dispId = 0x60030011)
    String getXPath();
            
    /**
     * <p>id(0x60030012)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "XML", dispId = 0x60030012)
    String getXML();
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(28)</p>
     * @param Name [in, optional] {@code String}
     * @param NamespaceURI [in, optional] {@code String}
     * @param NodeType [in, optional] {@code MsoCustomXMLNodeType}
     * @param NodeValue [in, optional] {@code String}
     */
    @ComMethod(name = "AppendChildNode", dispId = 0x60030013)
    void AppendChildNode(String Name,
            String NamespaceURI,
            MsoCustomXMLNodeType NodeType,
            String NodeValue);
            
    /**
     * <p>id(0x60030014)</p>
     * <p>vtableId(29)</p>
     * @param XML [in] {@code String}
     */
    @ComMethod(name = "AppendChildSubtree", dispId = 0x60030014)
    void AppendChildSubtree(String XML);
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60030015)
    void Delete();
            
    /**
     * <p>id(0x60030016)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "HasChildNodes", dispId = 0x60030016)
    Boolean HasChildNodes();
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(32)</p>
     * @param Name [in, optional] {@code String}
     * @param NamespaceURI [in, optional] {@code String}
     * @param NodeType [in, optional] {@code MsoCustomXMLNodeType}
     * @param NodeValue [in, optional] {@code String}
     * @param NextSibling [in, optional] {@code CustomXMLNode}
     */
    @ComMethod(name = "InsertNodeBefore", dispId = 0x60030017)
    void InsertNodeBefore(String Name,
            String NamespaceURI,
            MsoCustomXMLNodeType NodeType,
            String NodeValue,
            CustomXMLNode NextSibling);
            
    /**
     * <p>id(0x60030018)</p>
     * <p>vtableId(33)</p>
     * @param XML [in] {@code String}
     * @param NextSibling [in, optional] {@code CustomXMLNode}
     */
    @ComMethod(name = "InsertSubtreeBefore", dispId = 0x60030018)
    void InsertSubtreeBefore(String XML,
            CustomXMLNode NextSibling);
            
    /**
     * <p>id(0x60030019)</p>
     * <p>vtableId(34)</p>
     * @param Child [in] {@code CustomXMLNode}
     */
    @ComMethod(name = "RemoveChild", dispId = 0x60030019)
    void RemoveChild(CustomXMLNode Child);
            
    /**
     * <p>id(0x6003001a)</p>
     * <p>vtableId(35)</p>
     * @param OldNode [in] {@code CustomXMLNode}
     * @param Name [in, optional] {@code String}
     * @param NamespaceURI [in, optional] {@code String}
     * @param NodeType [in, optional] {@code MsoCustomXMLNodeType}
     * @param NodeValue [in, optional] {@code String}
     */
    @ComMethod(name = "ReplaceChildNode", dispId = 0x6003001a)
    void ReplaceChildNode(CustomXMLNode OldNode,
            String Name,
            String NamespaceURI,
            MsoCustomXMLNodeType NodeType,
            String NodeValue);
            
    /**
     * <p>id(0x6003001b)</p>
     * <p>vtableId(36)</p>
     * @param XML [in] {@code String}
     * @param OldNode [in] {@code CustomXMLNode}
     */
    @ComMethod(name = "ReplaceChildSubtree", dispId = 0x6003001b)
    void ReplaceChildSubtree(String XML,
            CustomXMLNode OldNode);
            
    /**
     * <p>id(0x6003001c)</p>
     * <p>vtableId(37)</p>
     * @param XPath [in] {@code String}
     */
    @ComMethod(name = "SelectNodes", dispId = 0x6003001c)
    CustomXMLNodes SelectNodes(String XPath);
            
    /**
     * <p>id(0x6003001d)</p>
     * <p>vtableId(38)</p>
     * @param XPath [in] {@code String}
     */
    @ComMethod(name = "SelectSingleNode", dispId = 0x6003001d)
    CustomXMLNode SelectSingleNode(String XPath);
            
    
}