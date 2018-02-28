package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sDataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="byteHTLoader" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="byteHTCorp" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="byteHTFixedCondition" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sDataType", "byteHTLoader", "byteHTCorp",
		"byteHTFixedCondition" })
@XmlRootElement(name = "getEAIWebDataQMYS")
public class GetEAIWebDataQMYS {

	protected String sDataType;
	protected byte[] byteHTLoader;
	protected byte[] byteHTCorp;
	protected byte[] byteHTFixedCondition;

	/**
	 * Gets the value of the sDataType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSDataType() {
		return sDataType;
	}

	/**
	 * Sets the value of the sDataType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSDataType(String value) {
		this.sDataType = value;
	}

	/**
	 * Gets the value of the byteHTLoader property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getByteHTLoader() {
		return byteHTLoader;
	}

	/**
	 * Sets the value of the byteHTLoader property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setByteHTLoader(byte[] value) {
		this.byteHTLoader = ((byte[]) value);
	}

	/**
	 * Gets the value of the byteHTCorp property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getByteHTCorp() {
		return byteHTCorp;
	}

	/**
	 * Sets the value of the byteHTCorp property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setByteHTCorp(byte[] value) {
		this.byteHTCorp = ((byte[]) value);
	}

	/**
	 * Gets the value of the byteHTFixedCondition property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getByteHTFixedCondition() {
		return byteHTFixedCondition;
	}

	/**
	 * Sets the value of the byteHTFixedCondition property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setByteHTFixedCondition(byte[] value) {
		this.byteHTFixedCondition = ((byte[]) value);
	}

}