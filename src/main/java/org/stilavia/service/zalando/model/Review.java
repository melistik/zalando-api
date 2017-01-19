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
public class Review implements Serializable {

    private String reviewId;
    private String articleId;
    private String articleModelId;
    private String customerNickname;
    private String customerCity;
    private String customerCountry;
    private String language;
    private String title;
    private String description;
    private Date created;
    private Integer  rating;
    private boolean recommend;
    private Integer helpfulCount;
    private Integer unhelpfulCount;
    private Map<String, Integer> articleSizeRatings;

}
