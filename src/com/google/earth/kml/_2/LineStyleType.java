//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.08.19 at 11:07:17 AM BST 
//

package com.google.earth.kml._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for LineStyleType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;LineStyleType&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base=&quot;{http://earth.google.com/kml/2.1}ColorStyleType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;width&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}float&quot; minOccurs=&quot;0&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineStyleType", propOrder = { "width" })
@SuppressWarnings("all")
public class LineStyleType extends ColorStyleType {

  @XmlElement(defaultValue = "1")
  protected Float width;

  /**
   * Gets the value of the width property.
   * 
   * @return possible object is {@link Float }
   * 
   */
  public Float getWidth() {
    return width;
  }

  /**
   * Sets the value of the width property.
   * 
   * @param value
   *          allowed object is {@link Float }
   * 
   */
  public void setWidth(Float value) {
    this.width = value;
  }

}
