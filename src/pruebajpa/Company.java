/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FiJus
 */
@Entity
@Table(name = "company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c")
    , @NamedQuery(name = "Company.findByCompanyId", query = "SELECT c FROM Company c WHERE c.companyId = :companyId")
    , @NamedQuery(name = "Company.findByName", query = "SELECT c FROM Company c WHERE c.name = :name")
    , @NamedQuery(name = "Company.findByPrimaryColor", query = "SELECT c FROM Company c WHERE c.primaryColor = :primaryColor")
    , @NamedQuery(name = "Company.findByAccentColor", query = "SELECT c FROM Company c WHERE c.accentColor = :accentColor")
    , @NamedQuery(name = "Company.findByLogo", query = "SELECT c FROM Company c WHERE c.logo = :logo")
    , @NamedQuery(name = "Company.findByEmail", query = "SELECT c FROM Company c WHERE c.email = :email")
    , @NamedQuery(name = "Company.findByPassword", query = "SELECT c FROM Company c WHERE c.password = :password")
    , @NamedQuery(name = "Company.findByBasicColor", query = "SELECT c FROM Company c WHERE c.basicColor = :basicColor")
    , @NamedQuery(name = "Company.findByCreationDate", query = "SELECT c FROM Company c WHERE c.creationDate = :creationDate")
    , @NamedQuery(name = "Company.findByModificationDate", query = "SELECT c FROM Company c WHERE c.modificationDate = :modificationDate")
    , @NamedQuery(name = "Company.findByDeleted", query = "SELECT c FROM Company c WHERE c.deleted = :deleted")})
public class Company implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "company_id")
    private Integer companyId;
    @Column(name = "name")
    private String name;
    @Column(name = "primary_color")
    private String primaryColor;
    @Column(name = "accent_color")
    private String accentColor;
    @Column(name = "logo")
    private String logo;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "basic_color")
    private Boolean basicColor;
    @Basic(optional = false)
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Basic(optional = false)
    @Column(name = "modification_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificationDate;
    @Column(name = "deleted")
    private Boolean deleted;
    @JoinColumn(name = "sector_id", referencedColumnName = "sector_id")
    @ManyToOne
    private Sector sectorId;

    public Company() {
    }

    public Company(Integer companyId) {
        this.companyId = companyId;
    }

    public Company(Integer companyId, Date creationDate, Date modificationDate) {
        this.companyId = companyId;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getAccentColor() {
        return accentColor;
    }

    public void setAccentColor(String accentColor) {
        this.accentColor = accentColor;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getBasicColor() {
        return basicColor;
    }

    public void setBasicColor(Boolean basicColor) {
        this.basicColor = basicColor;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Sector getSectorId() {
        return sectorId;
    }

    public void setSectorId(Sector sectorId) {
        this.sectorId = sectorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyId != null ? companyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.companyId == null && other.companyId != null) || (this.companyId != null && !this.companyId.equals(other.companyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebajpa.Company[ companyId=" + companyId + " ]";
    }
    
}
