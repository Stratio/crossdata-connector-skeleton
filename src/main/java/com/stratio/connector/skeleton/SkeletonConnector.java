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

package com.stratio.connector.skeleton;

import org.apache.log4j.Logger;

import com.stratio.connector.skeleton.engine.SkeletonMetadataEngine;
import com.stratio.connector.skeleton.engine.SkeletonQueryEngine;
import com.stratio.connector.skeleton.engine.SkeletonStorageEngine;
import com.stratio.crossdata.common.connector.ConnectorClusterConfig;
import com.stratio.crossdata.common.connector.IConfiguration;
import com.stratio.crossdata.common.connector.IConnector;
import com.stratio.crossdata.common.connector.IMetadataEngine;
import com.stratio.crossdata.common.connector.IQueryEngine;
import com.stratio.crossdata.common.connector.IStorageEngine;
import com.stratio.crossdata.common.data.ClusterName;
import com.stratio.crossdata.common.exceptions.ConnectionException;
import com.stratio.crossdata.common.exceptions.ExecutionException;
import com.stratio.crossdata.common.exceptions.InitializationException;
import com.stratio.crossdata.common.exceptions.UnsupportedException;
import com.stratio.crossdata.common.security.ICredentials;
import com.stratio.crossdata.connectors.ConnectorApp;

/**
 * Connector main class that launches the connector actor wrapper and implements the
 * {@link com.stratio.crossdata.common.connector.IConnector} interface.
 */
public class SkeletonConnector implements IConnector{

    /**
     * Class logger.
     */
    private static final Logger LOG = Logger.getLogger(SkeletonConnector.class);

    @Override
    public String getConnectorName() {
        return "SkeletonConnector";
    }

    @Override
    public String[] getDatastoreName() {
        return new String[]{"SkeletonDatastore"};
    }

    @Override
    public void init(IConfiguration configuration) throws InitializationException {
        //TODO Add init functionality. This method will be called once when the connector is launched.
        //IConfiguration currently does not provide any external information.
    }

    @Override public void connect(ICredentials credentials, ConnectorClusterConfig config) throws ConnectionException {
        //TODO Add connect functionality. The connector should establish the connection with the underlying
        //datastore. ICredentials is currently not supported.
        throw new ConnectionException("Method not implemented");
    }

    @Override public void close(ClusterName name) throws ConnectionException {
        //TODO Add close functionality. The connector should close the connection with the given cluster.
        throw new ConnectionException("Method not implemented");
    }

    @Override public void shutdown() throws ExecutionException {
        //This method is called when the user decides to stop the connector service.
        throw new ExecutionException("Method not implemented");
    }

    @Override public boolean isConnected(ClusterName name) {
        //TODO Add isConnected funcionality to determine whether the connector has access to a given cluster.
        return false;
    }

    @Override
    public IStorageEngine getStorageEngine() throws UnsupportedException {
        return new SkeletonStorageEngine();
    }

    @Override
    public IQueryEngine getQueryEngine() throws UnsupportedException {
        return new SkeletonQueryEngine();
    }

    @Override
    public IMetadataEngine getMetadataEngine() throws UnsupportedException {
        return new SkeletonMetadataEngine();
    }

    /**
     * Run a Skeleton Connector using a {@link com.stratio.crossdata.connectors.ConnectorApp}.
     * @param args The arguments.
     */
    public static void main(String [] args){
        SkeletonConnector skeletonConnector = new SkeletonConnector();
        ConnectorApp connectorApp = new ConnectorApp();
        connectorApp.startup(skeletonConnector);
    }

}
