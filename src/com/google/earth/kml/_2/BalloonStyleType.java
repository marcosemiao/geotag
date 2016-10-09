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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for BalloonStyleType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;BalloonStyleType&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base=&quot;{http://earth.google.com/kml/2.1}ObjectType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name=&quot;color&quot; type=&quot;{http://earth.google.com/kml/2.1}color&quot; minOccurs=&quot;0&quot;/&gt;
 *           &lt;element name=&quot;bgColor&quot; type=&quot;{http://earth.google.com/kml/2.1}color&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name=&quot;textColor&quot; type=&quot;{http://earth.google.com/kml/2.1}color&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;text&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalloonStyleType", propOrder = { "color", "bgColor",
    "textColor", "text" })
@SuppressWarnings("all")
public class BalloonStyleType extends ObjectType {

  @XmlElement(type = String.class, defaultValue = "ffffffff")
  @XmlJavaTypeAdapter(HexBinaryAdapter.class)
  protected byte[] color;

  @XmlElement(type = String.class, defaultValue = "ffffffff")
  @XmlJavaTypeAdapter(HexBinaryAdapter.class)
  protected byte[] bgColor;

  @XmlElement(type = String.class, defaultValue = "ff000000")
  @XmlJavaTypeAdapter(HexBinaryAdapter.class)
  protected byte[] textColor;

  protected String text;

  /**
   * Gets the value of the color property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public byte[] getColor() {
    return color;
  }

  /**
   * Sets the value of the color property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setColor(byte[] value) {
    this.color = ((byte[]) value);
  }

  /**
   * Gets the value of the bgColor property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public byte[] getBgColor() {
    return bgColor;
  }

  /**
   * Sets the value of the bgColor property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setBgColor(byte[] value) {
    this.bgColor = ((byte[]) value);
  }

  /**
   * Gets the value of the textColor property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public byte[] getTextColor() {
    return textColor;
  }

  /**
   * Sets the value of the textColor property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setTextColor(byte[] value) {
    this.textColor = ((byte[]) value);
  }

  /**
   * Gets the value of the text property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getText() {
    return text;
  }

  /**
   * Sets the value of the text property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setText(String value) {
    this.text = value;
  }

}