package pl.konradchrzanowski.scaffolding.log.scaffolding.dimensions;

import javax.persistence.*;

@Entity
@Table(name = "quantity_survey")
public class QuantitySurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quantity_survey_id")
    private Long quantitySurveyId;
    @Column(name = "length")
    private Float length;
    @Column(name = "width")
    private Float width;
    @Column(name = "height")
    private Float height;

    public QuantitySurvey(Float length, Float width, Float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Long getQuantitySurveyId() {
        return quantitySurveyId;
    }

    public Float getLength() {
        return length;
    }

    public Float getWidth() {
        return width;
    }

    public Float getHeight() {
        return height;
    }
}
