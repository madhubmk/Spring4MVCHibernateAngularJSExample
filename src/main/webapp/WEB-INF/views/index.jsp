<!DOCTYPE html>
<html ng-app="Demo">
<head>

<meta charset="ISO-8859-1">
<title>AngularJS</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-route.js"></script>
<script src="resources/js/app.js"></script>
<script src="resources/js/service/ItemService.js"></script>
<script src="resources/js/controller/CustomListController.js"></script>

<style>
.mainContent {
	width: 650px;
	height: 500px;
	border: 1px solid gray;
	background-color: #E6E6E6;
}

.header{
   height: 80px;
   width: 800px;
   text-align: center;
   background: #BDBDBD;
}

a{
   display: block;
   padding: 5px;
}

.footer {
	background-color: #BDBDBD;
	text-align: center;
}

.leftMenu {
	height : 500px;
	background-color: #D8D8D8;
	width: 150px;
}


</style>

</head>
<body>

	<table style="font-family: Arial">
		<tr>
			<td colspan="2" class="header">
				<h1>Website Header</h1>
			</td>
		</tr>
		<tr>
			<td class="leftMenu">
				<a href="#/item/home">Home</a>
				<a href="#/item/courses">Courses</a>
				<a href="#/item/students">Students</a>
			</td>
			<td class="mainContent">
				<ng-view></ng-view>
			</td>
		</tr>
		<tr>
			<td colspan="2" class="footer">
				<b>Website Footer</b>
			</td>
		</tr>
	</table>

</body>
</html>
