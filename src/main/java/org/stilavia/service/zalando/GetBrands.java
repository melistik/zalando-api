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

import org.codehaus.jackson.type.TypeReference;
import org.stilavia.service.zalando.model.Brand;
import org.stilavia.service.zalando.model.PaginableResult;

/**
 * Created by guillermoblascojimenez on 16/06/15.
 */
public class GetBrands extends ExecutableRequestChain<PaginableResult<Brand>> {

    private static final String PATH = "/brands";
    private static final TypeReference<PaginableResult<Brand>> TYPE_REFERENCE = new TypeReference<PaginableResult<Brand>>() {
    };

    public GetBrands(RequestContext context) {
        super(context, PATH, TYPE_REFERENCE);
    }

    public GetBrands page(int pageIndex) {
        super.getUriBuilder().addParameter("page", String.valueOf(pageIndex));
        return this;
    }

    public GetBrands pageSize(int pageSize) {
        super.getUriBuilder().addParameter("pageSize", String.valueOf(pageSize));
        return this;
    }

    public GetBrands name(String name) {
        super.getUriBuilder().addParameter("name", name);
        return this;
    }
}