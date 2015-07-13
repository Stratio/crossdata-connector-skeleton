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

import com.stratio.crossdata.common.connector.IQueryEngine;
import com.stratio.crossdata.common.connector.IResultHandler;
import com.stratio.crossdata.common.exceptions.ConnectorException;
import com.stratio.crossdata.common.exceptions.UnsupportedException;
import com.stratio.crossdata.common.logicalplan.LogicalWorkflow;
import com.stratio.crossdata.common.result.QueryResult;

/**
 * Skeleton query engine
 */
public class SkeletonQueryEngine implements IQueryEngine{


    @Override public QueryResult execute(String queryId, LogicalWorkflow workflow) throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override
    public void asyncExecute(String queryId, LogicalWorkflow workflow, IResultHandler resultHandler)
            throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override public void pagedExecute(String queryId, LogicalWorkflow workflow, IResultHandler resultHandler,
            int pageSize) throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }

    @Override
    public void stop(String queryId) throws ConnectorException {
        throw new UnsupportedException("Method not implemented");
    }
}
