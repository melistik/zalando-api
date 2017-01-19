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
import org.stilavia.service.zalando.model.PaginableResult;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by guillermoblascojimenez on 04/07/15.
 */
public class GetArticles extends ExecutableRequestChain<PaginableResult<Article>> {

    private static final String PATH = "/articles";
    private static final ParameterizedTypeReference<PaginableResult<Article>> TYPE_REFERENCE = new ParameterizedTypeReference<PaginableResult<Article>>() {
    };

    public GetArticles(RequestContext context) {
        super(context, PATH, TYPE_REFERENCE);
    }

    public GetArticles page(int pageIndex) {
        super.getUriBuilder().addParameter("page", String.valueOf(pageIndex));
        return this;
    }

    public GetArticles pageSize(int pageSize) {
        super.getUriBuilder().addParameter("pageSize", String.valueOf(pageSize));
        return this;
    }

    public GetArticles name(String name) {
        super.getUriBuilder().addParameter("name", name);
        return this;
    }

    public GetArticles articlesId(Collection<String> ids) {
        super.getUriBuilder().addParameters("articleId", ids);
        return this;
    }

    public GetArticles articlesId(String ... ids) {
        return this.articlesId(Arrays.asList(ids));
    }

    public GetArticles articleModelId(Collection<String> ids) {
        super.getUriBuilder().addParameters("articleModelId", ids);
        return this;
    }

    public GetArticles articleModelId(String... ids) {
        return this.articleModelId(Arrays.asList(ids));
    }

    public GetArticles articleUnitId(Collection<String> ids) {
        super.getUriBuilder().addParameters("articleUnitId", ids);
        return this;
    }

    public GetArticles articleUnitId(String... ids) {
        return this.articleUnitId(Arrays.asList(ids));
    }

    public GetArticles brand(Collection<String> brands) {
        super.getUriBuilder().addParameters("brand", brands);
        return this;
    }

    public GetArticles brand(String... ids) {
        return this.brand(Arrays.asList(ids));
    }

    public GetArticles brandfamily(Collection<String> brandfamilys) {
        super.getUriBuilder().addParameters("brandfamily", brandfamilys);
        return this;
    }

    public GetArticles brandfamily(String... ids) {
        return this.brandfamily(Arrays.asList(ids));
    }

    public GetArticles category(Collection<String> categories) {
        super.getUriBuilder().addParameters("category", categories);
        return this;
    }

    public GetArticles category(String... ids) {
        return this.category(Arrays.asList(ids));
    }

    public GetArticles fullText(String fullText) {
        super.getUriBuilder().addParameter("fullText", fullText);
        return this;
    }

}
