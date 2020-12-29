package pl.konradchrzanowski.scaffolding.log.scaffolding.properties;

public class Properties {
    private Long id;
    private String scaffoldingNumber;
    private String scaffoldingType;
    private String scaffoldingLocalisation;
    private Short foundationLevel;
    private String foreman;

    public Properties(Long id, String scaffoldingNumber, String scaffoldingType, String scaffoldingLocalisation, Short foundationLevel, String foreman) {
        this.id = id;
        this.scaffoldingNumber = scaffoldingNumber;
        this.scaffoldingType = scaffoldingType;
        this.scaffoldingLocalisation = scaffoldingLocalisation;
        this.foundationLevel = foundationLevel;
        this.foreman = foreman;
    }

    public Long getId() {
        return id;
    }

    public String getScaffoldingNumber() {
        return scaffoldingNumber;
    }

    public String getScaffoldingType() {
        return scaffoldingType;
    }

    public String getScaffoldingLocalisation() {
        return scaffoldingLocalisation;
    }

    public Short getFoundationLevel() {
        return foundationLevel;
    }

    public String getForeman() {
        return foreman;
    }
}
