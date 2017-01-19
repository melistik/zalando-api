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

package org.stilavia.service.zalando;

import org.springframework.core.ParameterizedTypeReference;
import org.stilavia.service.zalando.model.Article;
import org.stilavia.service.zalando.model.ReviewSummary;

/**
 * Created by guillermoblascojimenez on 15/06/15.
 */
public class GetArticleModelReviewsSummary extends ExecutableRequestChain<ReviewSummary> {

    private static final String PATH = "/article-reviews-summaries/%s";
    private static final ParameterizedTypeReference<ReviewSummary> TYPE_REFERENCE = new ParameterizedTypeReference<ReviewSummary>() {
    };

    private final String articleModelId;

    GetArticleModelReviewsSummary(RequestContext context, String articleModelId) {
        super(context, getPath(articleModelId), TYPE_REFERENCE);
        this.articleModelId = articleModelId;
    }

    private static String getPath(String articleId) {
        return String.format(PATH, articleId);
    }

}
