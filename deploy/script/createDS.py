"""
This script configures a JDBC data source as a System Module and deploys it
to the server
"""
url='t3://' + sys.argv[1] + ':' + sys.argv[2]
username = sys.argv[3]
password = sys.argv[4]
dbuser = sys.argv[5]
dbpass = sys.argv[6]

connect(username,password,url)
edit()

# Change these names as necessary
dsname="EmcDataSource"
server='AdminServer'
cd("Servers/"+server)
target=cmo
cd("../..")

startEdit()
# start creation
print 'Creating JDBCSystemResource with name '+dsname
jdbcSR = create(dsname,"JDBCSystemResource")
theJDBCResource = jdbcSR.getJDBCResource()
theJDBCResource.setName("emcDataSource")

connectionPoolParams = theJDBCResource.getJDBCConnectionPoolParams()
connectionPoolParams.setConnectionReserveTimeoutSeconds(25)
connectionPoolParams.setMaxCapacity(100)
connectionPoolParams.setTestTableName("SYSTABLES")

dsParams = theJDBCResource.getJDBCDataSourceParams()
dsParams.addJNDIName("ds.emcJDBCDataSource")

driverParams = theJDBCResource.getJDBCDriverParams()
driverParams.setUrl("jdbc:oracle:thin:@localhost:1521:hui")
driverParams.setDriverName("oracle.jdbc.driver.OracleDriver")

driverParams.setPassword(dbpass)
driverProperties = driverParams.getProperties()

proper = driverProperties.createProperty("user")
proper.setValue(dbuser )

proper1 = driverProperties.createProperty("DatabaseName")
proper1.setValue("EMC")

jdbcSR.addTarget(target)

save()
activate(block="true")

print 'Done configuring the data source'

