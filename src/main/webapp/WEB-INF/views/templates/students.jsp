<h1>Students List</h1>
<div class="generic-container">
	<div class="panel panel-default">
		<!-- Default panel contents -->
	    <div class="panel-heading"><span class="lead">List of Phones</span></div>
	    <div class="tablecontainer">
	    	<table class="table table-hover" border="1">
	            <thead>
	                <tr>
	                    <th>ID</th>
	                    <th>Name</th>
	                    <th>Address</th>
	                    <th>Email</th>
	                </tr>
	            </thead>
	            <tbody>
	                <tr ng-repeat="item in studentsController.items">
	                    <td>{{item.id}}</td>
	                    <td>{{item.name}}</td>
	                    <td>{{item.address}}</a></td>
	                    <td>{{item.email}}</td>
	                </tr>
	            </tbody>
			</table>
		</div>
	</div>
</div>