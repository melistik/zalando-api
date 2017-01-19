package org.stilavia.service.zalando.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * Created by marten on 19.01.17.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewSummary implements Serializable {

    private String articleModelId;
    private BigDecimal averageStarRating;
    private Integer numberOfUserRecommendations;
    private Integer numberOfUserPositiveRecommendations;
    private Map<String, Integer> starRatingDistribution;

    private Map<String, Integer> articleSizeRatings;

}
