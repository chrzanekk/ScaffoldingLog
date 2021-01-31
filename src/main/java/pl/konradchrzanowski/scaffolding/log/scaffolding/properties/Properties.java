package pl.konradchrzanowski.scaffolding.log.scaffolding.properties;

import javax.persistence.*;

@Entity
@Table(name = "properties")
public class Properties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "properties_id")
    private Long propertiesId;
    @Column(name = "scaffolding_number")
    private String scaffoldingNumber;
    @Column(name = "scaffolding_type")
    private String scaffoldingType;
    @Column(name = "scaffolding_location")
    private String scaffoldingLocation;
    @Column(name = "foundation_level")
    private Short foundationLevel;
    @Column(name = "foreman")
    private String foreman;



    public Properties(String scaffoldingNumber, String scaffoldingType, String scaffoldingLocation, Short foundationLevel, String foreman) {
        this.scaffoldingNumber = scaffoldingNumber;
        this.scaffoldingType = scaffoldingType;
        this.scaffoldingLocation = scaffoldingLocation;
        this.foundationLevel = foundationLevel;
        this.foreman = foreman;
    }


    public String getScaffoldingNumber() {
        return scaffoldingNumber;
    }

    public String getScaffoldingType() {
        return scaffoldingType;
    }

    public String getScaffoldingLocation() {
        return scaffoldingLocation;
    }

    public Short getFoundationLevel() {
        return foundationLevel;
    }

    public String getForeman() {
        return foreman;
    }
}
