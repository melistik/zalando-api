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
import lombok.*;

import java.io.Serializable;

/**
 * Created by guillermoblascojimenez on 04/07/15.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageMedia implements Serializable {

    public enum Type {
        MODEL,
        NON_MODEL,
        PREMIUM,
        STYLE,
        MANUFACTURER,
        UNSPECIFIED
    }

    private int orderNumber;
    private Type type;
    private String thumbnailHdUrl;
    private String smallUrl;
    private String smallHdUrl;
    private String mediumUrl;
    private String mediumHdUrl;
    private String largeUrl;
    private String largeHdUrl;

}
