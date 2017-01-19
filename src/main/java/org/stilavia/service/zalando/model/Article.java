/*
 * Copyright 2015 Stilavia S.L.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.stilavia.service.zalando.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by guillermoblascojimenez on 15/06/15.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article implements Serializable {

    private String id;
    private String modelId;
    private String name;
    private String shopUrl;
    private String color;
    private boolean available;
    private String season;
    private String seasonYear;
    private Date activationDate;
    private List<String> genders;
    private List<String> additionalInfos;
    private List<String> ageGroups;
    private Brand brand;
    private List<String> categoryKeys;
    private List<Unit> units;
    private Media media;
    private List<Attribute> attributes;

}
