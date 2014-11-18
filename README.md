Crossdata skeleton connector
============================

This project serves a starting point to develop a new Crossdata Connector.

## How to use this skeleton ##

In order to keep an updated development base, we recommend you to follow the next steps:

 1. Fork this repository to get the latest version
 
    > $ git clone https://github.com/Stratio/crossdata-connector-skeleton.git
 
 2. Open your IDE of choice (we usually employ IntelliJ) and import the project using its maven definition (pom.xml)
 3. Check the [Crossdata Tutorial](https://github.com/Stratio/crossdata/_doc/InMemory-Connector-Development-Tutorial.md)
  on building
  an in-memory storage connector and start developing your own.
 
### Compiling ###

A custom-made maven plugin is available to simplify the connector install and execution.
 
    $ mvn crossdata-connector:install
 
This plugin will compile the sources generating a directory structure with all the elements required to run 
your connector.

    [INFO] 
    [INFO] <<< crossdata-connector-maven-plugin:0.1.1-SNAPSHOT:install (default-cli) @ crossdata-connector-skeleton <<<
    [INFO] 
    [INFO] --- crossdata-connector-maven-plugin:0.1.1-SNAPSHOT:install (default-cli) @ crossdata-connector-skeleton ---
    [INFO] Recovering project JAR
    [INFO] Create TARGET directory.
    [INFO] Create LIB directory.
    [INFO] Create CONF directory.
    [INFO] Create BIN Directory
    [INFO] Launch template
    [INFO] Process complete: /.../crossdata-connector-skeleton/target/crossdata-connector-skeleton-0.0.1-SNAPSHOT

### Execution ###

 1. Start the crossdata server (https://github.com/Stratio/crossdata)
 2. Launch the connector

```

    $ target/crossdata-connector-skeleton-0.0.1-SNAPSHOT/bin/crossdata-connector-skeleton-0.0.1-SNAPSHOT start
    Starting crossdata-connector-skeleton-0.0.1-SNAPSHOT
    Launching service process: crossdata-connector-skeleton-0.0.1-SNAPSHOT
    Password: 
    PID: /home/dhiguero/development/stratio/crossdata-connector-skeleton/target/crossdata-connector-skeleton-0.0.1-SNAPSHOT/crossdata-connector-skeleton-0.0.1-SNAPSHOT.pid servicePid: 19085
```

   Notice that by default, the root user is the one which launches the service, 
   you can change the launching parameters in the maven plugin configuration or in the launching script.

### Using the connector from Crossdata ###

 Open the Crossdata Shell and execute the following steps. First, add the manifest defining the datastore and 
 the connector to the Crossdata metadata management system.
 

    xdsh:user> ADD DATASTORE "/.../crossdata-connector-skeleton-0.0.1-SNAPSHOT/conf/SkeletonDataStore.xml";
    xdsh:user> ADD CONNECTOR "/.../crossdata-connector-skeleton-0.0.1-SNAPSHOT/conf/SkeletonConnector.xml";

 Then, define the datastore cluster. A cluster contains the definition required to connect to an datastore 
 installation. In general, this information contains the set of servers the cluster is composed of and other 
 connection parameters. 


    xdsh:user> ATTACH CLUSTER test_cluster ON DATASTORE SkeletonDataStore WITH OPTIONS {'Option1': 'Value1', 
    'Option2': 'Value2'};


 Once the cluster is defined in Crossdata, we will define which connectors can be used to access the data stored in 
 that cluster.
 
    xdsh:user> ATTACH CONNECTOR SkeletonConnector TO test_cluster WITH OPTIONS {'Option1': 'Value1'};


 At this point you can create the catalog and tables required to start working. Notice that a table exists only in a 
 particular cluster.

    xdsh:user> CREATE CATALOG test;
    xdsh:user> CREATE TABLE test.table1 ON CLUSTER test_cluster (id int PRIMARY KEY, name text);
    xdsh:user> INSERT INTO test.table1(id, name) VALUES (1, 'data');
    xdsh:user> SELECT * FROM test.table1;


## Automatic tests ##

   To facilitate the development and testing of new connectors, we provide an automatic test suite in charge of 
   testing all defined operations. The type and number of test depends on the operations supported by the connector 
   as defined in its manifests. To test a new connector:
   
 1. Download the [stratio-connectors-test](https://github.com/Stratio/stratio-connectors-test/) project from Github.
 
    > $ git clone https://github.com/Stratio/stratio-connectors-test.git
    
    
    > $ git checkout develop
    
 2. Execute the tests

```

    $ mvn clean verify \
    -DconnectorJar="/.../target/crossdata-connector-skeleton-0.0.1-SNAPSHOT.jar" \
    -DconnectorDefinition="/.../target/crossdata-connector-skeleton-0.0.1-SNAPSHOT/conf/SkeletonConnector.xml"
    -DclusterOptions="[Hosts-[127.0.0.1]; Port-1234; ...]" \
    -DconnectorOptions="[ConnectorProperty-Value; ConnectorProperty-Value;...]" \
    -DconnectorCluster="TestClusterName" \
    -DconnectorMainClass="com.stratio.connectors.skeleton.SkeletonConnector"
```
    
 Where


| Option | Description |
|--------|------------|
| connectorJar | Path to the jar generated with the crossdata-connector:install goal |
| connectorDefinition | Path to the connector manifest |
| clusterOptions | List of cluster options |
| connectorOptions| List of connector properties |
| connectorCluster | ClusterName used in the tests |
| connectorMainClass | Class that implements the IConnector interface |


## Documentation ##

   For more information, please check the [Crossdata documentation](https://github.com/Stratio/crossdata).
   
   If you have found any problem, bug, or you have any doubt, please use [JIRA](https://crossdata.atlassian.net/) or [Google groups](https://groups.google.com/d/forum/crossdata-users). 
