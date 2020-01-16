/**
 * Copyright 2016-2019 Cloudera, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package com.hortonworks.registries.storage.impl.jdbc.provider.mysql.query;

import com.hortonworks.registries.storage.StorableKey;

public class MySqlSelectForUpdateQuery extends MySqlSelectQuery {

    public MySqlSelectForUpdateQuery(StorableKey storableKey) {
        super(storableKey);
    }

    @Override
    protected String getParameterizedSql() {
        String sql = super.getParameterizedSql();
        sql += " FOR UPDATE";

        LOG.debug(sql);
        return sql;
    }
}