
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetClassDescriptionsResult" type="{http://clients.mindbodyonline.com/api/0_5}GetClassDescriptionsResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getClassDescriptionsResult"
})
@XmlRootElement(name = "GetClassDescriptionsResponse")
@Entity(name = "GetClassDescriptionsResponse")
@Table(name = "GETCLASSDESCRIPTIONSRESPONSE")
@Inheritance(strategy = InheritanceType.JOINED)
public class GetClassDescriptionsResponse
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GetClassDescriptionsResult")
    protected GetClassDescriptionsResult getClassDescriptionsResult;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the getClassDescriptionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClassDescriptionsResult }
     *     
     */
    @Transient
    public GetClassDescriptionsResult getGetClassDescriptionsResult() {
        return getClassDescriptionsResult;
    }

    /**
     * Sets the value of the getClassDescriptionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClassDescriptionsResult }
     *     
     */
    public void setGetClassDescriptionsResult(GetClassDescriptionsResult value) {
        this.getClassDescriptionsResult = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            GetClassDescriptionsResult theGetClassDescriptionsResult;
            theGetClassDescriptionsResult = this.getGetClassDescriptionsResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "getClassDescriptionsResult", theGetClassDescriptionsResult), currentHashCode, theGetClassDescriptionsResult);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetClassDescriptionsResponse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GetClassDescriptionsResponse that = ((GetClassDescriptionsResponse) object);
        {
            GetClassDescriptionsResult lhsGetClassDescriptionsResult;
            lhsGetClassDescriptionsResult = this.getGetClassDescriptionsResult();
            GetClassDescriptionsResult rhsGetClassDescriptionsResult;
            rhsGetClassDescriptionsResult = that.getGetClassDescriptionsResult();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "getClassDescriptionsResult", lhsGetClassDescriptionsResult), LocatorUtils.property(thatLocator, "getClassDescriptionsResult", rhsGetClassDescriptionsResult), lhsGetClassDescriptionsResult, rhsGetClassDescriptionsResult)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            GetClassDescriptionsResult theGetClassDescriptionsResult;
            theGetClassDescriptionsResult = this.getGetClassDescriptionsResult();
            strategy.appendField(locator, this, "getClassDescriptionsResult", buffer, theGetClassDescriptionsResult);
        }
        return buffer;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
