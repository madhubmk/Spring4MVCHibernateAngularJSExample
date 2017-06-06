<h1>Courses we offer</h1>
<div class="generic-container">
	<div class="panel panel-default">
		<!-- Default panel contents -->
	    <div class="panel-heading"><span class="lead">List of Phones</span></div>
	    <div class="tablecontainer">
	    	<table class="table table-hover" border="1">
	            <thead>
	                <tr>
	                    <th>ID</th>
	                    <th>Course</th>
	                    <th>Version</th>
	                    <th>Contact email</th>
	                </tr>
	            </thead>
	            <tbody>
	                <tr ng-repeat="item in coursesController.items">
	                    <td>{{item.id}}</td>
	                    <td>{{item.courseName}}</td>
	                    <td>{{item.version}}</a></td>
	                    <td>{{item.email}}</td>
	                </tr>
	            </tbody>
			</table>
		</div>
	</div>
</div>
