
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for RemoveFromWaitlistRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveFromWaitlistRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="WaitlistEntryIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveFromWaitlistRequest", propOrder = {
    "waitlistEntryIDs"
})
@Entity(name = "RemoveFromWaitlistRequest")
@Table(name = "REMOVE_FROM_WAITLIST_REQUEST")
public class RemoveFromWaitlistRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "WaitlistEntryIDs")
    protected ArrayOfInt waitlistEntryIDs;

    /**
     * Gets the value of the waitlistEntryIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfInt.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WAITLIST_ENTRY_IDS_REMOVE_FR_0")
    public ArrayOfInt getWaitlistEntryIDs() {
        return waitlistEntryIDs;
    }

    /**
     * Sets the value of the waitlistEntryIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setWaitlistEntryIDs(ArrayOfInt value) {
        this.waitlistEntryIDs = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfInt theWaitlistEntryIDs;
            theWaitlistEntryIDs = this.getWaitlistEntryIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waitlistEntryIDs", theWaitlistEntryIDs), currentHashCode, theWaitlistEntryIDs);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RemoveFromWaitlistRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RemoveFromWaitlistRequest that = ((RemoveFromWaitlistRequest) object);
        {
            ArrayOfInt lhsWaitlistEntryIDs;
            lhsWaitlistEntryIDs = this.getWaitlistEntryIDs();
            ArrayOfInt rhsWaitlistEntryIDs;
            rhsWaitlistEntryIDs = that.getWaitlistEntryIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waitlistEntryIDs", lhsWaitlistEntryIDs), LocatorUtils.property(thatLocator, "waitlistEntryIDs", rhsWaitlistEntryIDs), lhsWaitlistEntryIDs, rhsWaitlistEntryIDs)) {
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
        super.appendFields(locator, buffer, strategy);
        {
            ArrayOfInt theWaitlistEntryIDs;
            theWaitlistEntryIDs = this.getWaitlistEntryIDs();
            strategy.appendField(locator, this, "waitlistEntryIDs", buffer, theWaitlistEntryIDs);
        }
        return buffer;
    }

}
