/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FiJus
 */
@Entity
@Table(name = "sector")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sector.findAll", query = "SELECT s FROM Sector s")
    , @NamedQuery(name = "Sector.findBySectorId", query = "SELECT s FROM Sector s WHERE s.sectorId = :sectorId")
    , @NamedQuery(name = "Sector.findByName", query = "SELECT s FROM Sector s WHERE s.name = :name")
    , @NamedQuery(name = "Sector.findByDeleted", query = "SELECT s FROM Sector s WHERE s.deleted = :deleted")})
public class Sector implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sector_id")
    private Integer sectorId;
    @Column(name = "name")
    private String name;
    @Column(name = "deleted")
    private Boolean deleted;
    @OneToMany(mappedBy = "sectorId")
    private Collection<Company> companyCollection;

    public Sector() {
    }

    public Sector(Integer sectorId) {
        this.sectorId = sectorId;
    }

    public Integer getSectorId() {
        return sectorId;
    }

    public void setSectorId(Integer sectorId) {
        this.sectorId = sectorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @XmlTransient
    public Collection<Company> getCompanyCollection() {
        return companyCollection;
    }

    public void setCompanyCollection(Collection<Company> companyCollection) {
        this.companyCollection = companyCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sectorId != null ? sectorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sector)) {
            return false;
        }
        Sector other = (Sector) object;
        if ((this.sectorId == null && other.sectorId != null) || (this.sectorId != null && !this.sectorId.equals(other.sectorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebajpa.Sector[ sectorId=" + sectorId + " ]";
    }
    
}
