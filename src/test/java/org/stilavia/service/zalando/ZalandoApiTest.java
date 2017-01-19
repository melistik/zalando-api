package org.stilavia.service.zalando;

import lombok.SneakyThrows;
import org.junit.Test;
import org.stilavia.service.zalando.model.Article;
import org.stilavia.service.zalando.model.PaginableResult;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Created by marten on 19.01.17.
 */
public class ZalandoApiTest {

    @SneakyThrows
    @Test
    public void simpleTest() {
        ZalandoApi zalandoApi = new ZalandoApiBuilder()
                .setDomain(ZalandoApi.Domain.de_DE)
                .build();

        PaginableResult<Article> articlePaginableResult = zalandoApi.articles()
                .category("damenbekleidung-pullover-und-strickjacken")
                .get();

        assertThat(articlePaginableResult, notNullValue());

    }
}
