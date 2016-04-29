
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB04-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB04-0000-0000-C000-000000000046}")
public interface CustomXMLNode {
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
     * <p>id(0x60030000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Attributes", dispId = 0x60030001)
    CustomXMLNodes getAttributes();
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComProperty(name = "BaseName", dispId = 0x60030002)
    String getBaseName();
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComProperty(name = "ChildNodes", dispId = 0x60030003)
    CustomXMLNodes getChildNodes();
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComProperty(name = "FirstChild", dispId = 0x60030004)
    CustomXMLNode getFirstChild();
            
    /**
     * <p>id(0x60030005)</p>
     */
    @ComProperty(name = "LastChild", dispId = 0x60030005)
    CustomXMLNode getLastChild();
            
    /**
     * <p>id(0x60030006)</p>
     */
    @ComProperty(name = "NamespaceURI", dispId = 0x60030006)
    String getNamespaceURI();
            
    /**
     * <p>id(0x60030007)</p>
     */
    @ComProperty(name = "NextSibling", dispId = 0x60030007)
    CustomXMLNode getNextSibling();
            
    /**
     * <p>id(0x60030008)</p>
     */
    @ComProperty(name = "NodeType", dispId = 0x60030008)
    MsoCustomXMLNodeType getNodeType();
            
    /**
     * <p>id(0x60030009)</p>
     */
    @ComProperty(name = "NodeValue", dispId = 0x60030009)
    String getNodeValue();
            
    /**
     * <p>id(0x60030009)</p>
     */
    @ComProperty(name = "NodeValue", dispId = 0x60030009)
    void setNodeValue(String param0);
            
    /**
     * <p>id(0x6003000b)</p>
     */
    @ComProperty(name = "OwnerDocument", dispId = 0x6003000b)
    com.sun.jna.platform.win32.COM.util.IDispatch getOwnerDocument();
            
    /**
     * <p>id(0x6003000c)</p>
     */
    @ComProperty(name = "OwnerPart", dispId = 0x6003000c)
    CustomXMLPart getOwnerPart();
            
    /**
     * <p>id(0x6003000d)</p>
     */
    @ComProperty(name = "PreviousSibling", dispId = 0x6003000d)
    CustomXMLNode getPreviousSibling();
            
    /**
     * <p>id(0x6003000e)</p>
     */
    @ComProperty(name = "ParentNode", dispId = 0x6003000e)
    CustomXMLNode getParentNode();
            
    /**
     * <p>id(0x6003000f)</p>
     */
    @ComProperty(name = "Text", dispId = 0x6003000f)
    String getText();
            
    /**
     * <p>id(0x6003000f)</p>
     */
    @ComProperty(name = "Text", dispId = 0x6003000f)
    void setText(String param0);
            
    /**
     * <p>id(0x60030011)</p>
     */
    @ComProperty(name = "XPath", dispId = 0x60030011)
    String getXPath();
            
    /**
     * <p>id(0x60030012)</p>
     */
    @ComProperty(name = "XML", dispId = 0x60030012)
    String getXML();
            
    /**
     * <p>id(0x60030013)</p>
     */
    @ComMethod(name = "AppendChildNode", dispId = 0x60030013)
    void AppendChildNode(String Name,
            String NamespaceURI,
            MsoCustomXMLNodeType NodeType,
            String NodeValue);
            
    /**
     * <p>id(0x60030014)</p>
     */
    @ComMethod(name = "AppendChildSubtree", dispId = 0x60030014)
    void AppendChildSubtree(String XML);
            
    /**
     * <p>id(0x60030015)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60030015)
    void Delete();
            
    /**
     * <p>id(0x60030016)</p>
     */
    @ComMethod(name = "HasChildNodes", dispId = 0x60030016)
    Boolean HasChildNodes();
            
    /**
     * <p>id(0x60030017)</p>
     */
    @ComMethod(name = "InsertNodeBefore", dispId = 0x60030017)
    void InsertNodeBefore(String Name,
            String NamespaceURI,
            MsoCustomXMLNodeType NodeType,
            String NodeValue,
            CustomXMLNode NextSibling);
            
    /**
     * <p>id(0x60030018)</p>
     */
    @ComMethod(name = "InsertSubtreeBefore", dispId = 0x60030018)
    void InsertSubtreeBefore(String XML,
            CustomXMLNode NextSibling);
            
    /**
     * <p>id(0x60030019)</p>
     */
    @ComMethod(name = "RemoveChild", dispId = 0x60030019)
    void RemoveChild(CustomXMLNode Child);
            
    /**
     * <p>id(0x6003001a)</p>
     */
    @ComMethod(name = "ReplaceChildNode", dispId = 0x6003001a)
    void ReplaceChildNode(CustomXMLNode OldNode,
            String Name,
            String NamespaceURI,
            MsoCustomXMLNodeType NodeType,
            String NodeValue);
            
    /**
     * <p>id(0x6003001b)</p>
     */
    @ComMethod(name = "ReplaceChildSubtree", dispId = 0x6003001b)
    void ReplaceChildSubtree(String XML,
            CustomXMLNode OldNode);
            
    /**
     * <p>id(0x6003001c)</p>
     */
    @ComMethod(name = "SelectNodes", dispId = 0x6003001c)
    CustomXMLNodes SelectNodes(String XPath);
            
    /**
     * <p>id(0x6003001d)</p>
     */
    @ComMethod(name = "SelectSingleNode", dispId = 0x6003001d)
    CustomXMLNode SelectSingleNode(String XPath);
            
    
}