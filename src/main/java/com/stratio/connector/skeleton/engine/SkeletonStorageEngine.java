/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Stratio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.stratio.connector.skeleton.engine;

import java.util.Collection;

import com.stratio.crossdata.common.connector.IStorageEngine;
import com.stratio.crossdata.common.data.ClusterName;
import com.stratio.crossdata.common.data.Row;
import com.stratio.crossdata.common.data.TableName;
import com.stratio.crossdata.common.exceptions.ConnectorException;
import com.stratio.crossdata.common.exceptions.UnsupportedException;
import com.stratio.crossdata.common.logicalplan.Filter;
import com.stratio.crossdata.common.metadata.TableMetadata;
import com.stratio.crossdata.common.statements.structures.Relation;

/**
 * Skeleton storage engine.
 */
public class SkeletonStorageEngine implements IStorageEngine{



    @Override public void insert(ClusterName targetCluster, TableMetadata targetTable, Row row, boolean isNotExists)
            throws ConnectorException {
        throw new UnsupportedException("Method not implemented");

    }

    @Override public void insert(ClusterName targetCluster, TableMetadata targetTable, Collection<Row> rows,
            boolean isNotExists) throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override public void delete(ClusterName targetCluster, TableName tableName, Collection<Filter> whereClauses)
            throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override public void update(ClusterName targetCluster, TableName tableName, Collection<Relation> assignments,
            Collection<Filter> whereClauses) throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override public void truncate(ClusterName targetCluster, TableName tableName) throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }
}
