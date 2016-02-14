I. Creation of EMC Data Source in WLS
----------------------------------
1. set located in [Oracle_Home]\wlserver\server\bin
2. add [Oracle_Home]\wlserver\common\bin to path path variable
3. execute wlst.cmd createDS.py [host] [port] [wls_user] [wls_pass] [db_user] [db_pass]

II. Deletion of EMC Data Source
----------------------------------
1. set located in [Oracle_Home]\wlserver\server\bin
2. add [Oracle_Home]\wlserver\common\bin to path path variable
3. execute wlst.cmd deleteDS.py [host] [port] [wls_user] [wls_pass]