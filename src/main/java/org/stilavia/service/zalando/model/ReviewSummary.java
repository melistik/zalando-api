package org.stilavia.service.zalando.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Created by marten on 19.01.17.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewSummary implements Serializable {

    private String articleModelId;
    private String averageStarRating;
    private String numberOfUserRecommendations;
    private String numberOfUserPositiveRecommendations;
    private Map<String, Integer> starRatingDistribution;

    private Map<String, Integer> articleSizeRatings;

}
