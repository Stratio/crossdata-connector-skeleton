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

import com.stratio.crossdata.common.connector.IMetadataEngine;
import com.stratio.crossdata.common.data.AlterOptions;
import com.stratio.crossdata.common.data.CatalogName;
import com.stratio.crossdata.common.data.ClusterName;
import com.stratio.crossdata.common.data.TableName;
import com.stratio.crossdata.common.exceptions.ConnectorException;
import com.stratio.crossdata.common.exceptions.UnsupportedException;
import com.stratio.crossdata.common.metadata.CatalogMetadata;
import com.stratio.crossdata.common.metadata.IndexMetadata;
import com.stratio.crossdata.common.metadata.TableMetadata;

/**
 * Skeleton metadata engine implementation.
 */
public class SkeletonMetadataEngine implements IMetadataEngine{

    @Override
    public void createCatalog(ClusterName targetCluster, CatalogMetadata catalogMetadata)
            throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override
    public void createTable(ClusterName targetCluster, TableMetadata tableMetadata)
            throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override
    public void dropCatalog(ClusterName targetCluster, CatalogName name) throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override
    public void dropTable(ClusterName targetCluster, TableName name) throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override
    public void alterTable(ClusterName targetCluster, TableName name, AlterOptions alterOptions)
            throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override
    public void createIndex(ClusterName targetCluster, IndexMetadata indexMetadata)
            throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override
    public void dropIndex(ClusterName targetCluster, IndexMetadata indexMetadata) throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }
}
