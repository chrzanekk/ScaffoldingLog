package pl.konradchrzanowski.scaffolding.log.scaffolding.scaffolding;

import javax.persistence.*;

@Entity
@Table(name = "scaffolding")
public class Scaffolding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scaffolding_id")
    private Long scaffoldingId;
    @Column(name = "properties_id")
    private Long propertiesId;
    @Column(name = "quantity_survey_id")
    private Long quantitySurveyId;
    @Column(name = "construction_date_id")
    private Long constructionDateId;
    @Column(name = "review_id")
    private Long reviewId;

    public Scaffolding(Long propertiesId, Long quantitySurveyId, Long constructionDateId, Long reviewId) {
        this.propertiesId = propertiesId;
        this.quantitySurveyId = quantitySurveyId;
        this.reviewId = reviewId;
        this.constructionDateId = constructionDateId;
    }

    public Long getScaffoldingId() {
        return scaffoldingId;
    }

    public Long getPropertiesId() {
        return propertiesId;
    }

    public Long getQuantitySurveyId() {
        return quantitySurveyId;
    }

    public Long getReviewId() {
        return reviewId;
    }
}
